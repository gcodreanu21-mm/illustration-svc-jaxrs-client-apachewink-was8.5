package com.example.client;

import com.example.data.SalesIllustrationInput;
import com.example.data.SalesIllustrationResult;
import org.apache.wink.client.ClientResponse;

import java.net.URI;
import java.net.URISyntaxException;

public class RestClient {

    public static void main(String[] args) {

        System.out.println("running JAX RS client.. \n");

        // By default, the Apache Wink client uses the java.net.HttpURLConnection class from the Java runtime environment for issuing requests
        // and processing responses. The Apache Wink client can also use Apache HttpClient 4.0 as the underlying client transport.
        org.apache.wink.client.ClientConfig clientConfig = new org.apache.wink.client.ClientConfig();

        // If you use an Apache HTTP client as the underlying transport, create and use an org.apache.wink.client.ApacheHttpClientConfig object instead
        // org.apache.wink.client.ClientConfig clientConfig = new org.apache.wink.client.ApacheHttpClientConfig();

        org.apache.wink.client.RestClient client = new org.apache.wink.client.RestClient(clientConfig);

        try {
            URI uri = new URI("http://blue-sky-docker-d3.private.massmutual.com:19690/IllustrationSvc/services/determineWhichApp");
            System.out.print("Target URI: "); System.out.println(uri);

            org.apache.wink.client.Resource resource = client.resource(uri);

            // HTTP POST request made with a Content-Type header value of application/json, an Accept header value of */* and
            // the request body
            SalesIllustrationInput inputObj = new SalesIllustrationInput();
            System.out.print("\nClient input: "); System.out.println(inputObj);

            ClientResponse response = resource.contentType("application/json").accept("*/*").post(inputObj);

            // deserialize response
            SalesIllustrationResult responseObj = response.getEntity(SalesIllustrationResult.class);

            System.out.print("\nServer response: "); System.out.println(responseObj);

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
