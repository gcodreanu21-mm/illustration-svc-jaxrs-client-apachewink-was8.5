package com.example.data;

import java.io.Serializable;

/**
 * A Sales Illustration Result object
 */
public class SalesIllustrationResult implements Serializable
{
    static final long serialVersionUID = -7761912791880913330L;
	private static final String INITS = "INITIALS: ";
	private static final String POL_NO = "POLICY NUMBER: ";
	private static final String ID = "PRODUCER ID: ";
	private static final String AGT_CODE = "AGENT CODE: ";
	private static final String FULL_NAME = "FULL NAME: ";
	private static final String LAST_NAME = "LAST NAME: ";
	private static final String APP = "SALES ILLUSTRATION APPLICATION: ";
	private static final String APPLINK = "LINK TO SALES ILLUSTRATION APPLICATION: ";
	private static final String MSG = "MESSAGE: ";
	private static final String MSG_2 = "MESSAGE 2: ";
	private static final String COMMA = ", ";

    /**
     * The requested producer's initials
     */
    private String initials = null;

    /**
     * Policy number
     */
    private String policyNumber = null;

	/**
	 * Producer ID - the requested producer ID
	 */
	private String producerID = null;
	
	/**
	 * Agent code - the last 4 digits of the requested producer ID
	 */
	private String agentCode = null;	
	
	/**
	 * Producer full name
	 */
	private String fullName = null;
	
	/**
	 * Insured last name
	 */
	private String lastName = null;		
	
	/**
	 * Name of the Sales Illustration Application this policy can be illustrated in
	 */
	 private String illustrationApp = null;
	 
	/**
	 * Link to the Sales Illustration Application this policy can be illustrated in
	 */
	 private String illustrationAppLink = null;	 
	 
	/**
	 * Message to display on the jsp indicating that an exising SI session will be lost if one
	 * exists, that they must use a desktop SI application or that the SI application needed
	 * to illustrate this policy is unknown.
	 */
	 private String message = null;	 	
	 
	/**
	 * Second half of the message to display on the jsp indicating that an exising SI session will be lost if one
	 * exists, that they must use a desktop SI application or that the SI application needed
	 * to illustrate this policy is unknown.
	 */
	 private String message2 = null;	 		  


    /**
     * Default Constructor.
     */
    public SalesIllustrationResult()
    {
    }

    /**
     * <p> Producer's Initials </p>
     * <p>
     *
     * @return the producer's initials or null if unavailable.
     * </p>
     */
    public String getInitials()
    {
        return initials;
    }

    /**
     * <p> Producer's initials </p>
     *
     * @param initials String
     */
    public void setInitials(String initials)
    {
        this.initials = initials;
    }

    /**
     * <p> Policy Number </p>
     * <p>
     *
     * @return the policy number or null if unavailable.
     * </p>
     */
    public String getPolicyNumber()
    {
        return policyNumber;
    }

    /**
     * <p> Policy Number </p>
     *
     * @param policyNumber String
     */
    public void setPolicyNumber(String policyNumber)
    {
        this.policyNumber = policyNumber;
    }
    
    /**
     * <p> Producer ID </p>
     * <p>
     *
     * @return the producer's ID or null if unavailable.
     * </p>
     */
    public String getProducerID()
    {
        return producerID;
    }

    /**
     * <p> Producer's ID </p>
     *
     * @param producerID String
     */
    public void setProducerID(String producerID)
    {
        this.producerID = producerID;
    }
    
    /**
     * <p> Agent Code - the last 4 digits of the producers ID </p>
     * <p>
     *
     * @return the agent code or null if unavailable.
     * </p>
     */
    public String getAgentCode()
    {
        return agentCode;
    }

    /**
     * <p> Agent Code - the last 4 digist of the producers ID </p>
     *
     * @param agentCode String
     */
    public void setAgentCode(String agentCode)
    {
        this.agentCode = agentCode;
    }
    
    /**
     * <p> Producer's Full Name </p>
     * <p>
     *
     * @return the producer's full name or null if unavailable.
     * </p>
     */
    public String getFullName()
    {
        return fullName;
    }

    /**
     * <p> Producer's Full Name </p>
     *
     * @param fullName String
     */
    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }
    
    /**
     * <p> Insured's Last Name </p>
     * <p>
     *
     * @return the insured's last name or null if unavailable.
     * </p>
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * <p> Insured's Last Name </p>
     *
     * @param lastName String
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }        
    
    /**
     * <p> Sales Illustration Application </p>
     * <p>
     *
     * @return the name of the sales illustration application this policy can be
     * illustrutated in or null if unavailable.
     *
     * </p>
     */
    public String getIllustrationApp()
    {
        return illustrationApp;
    }

    /**
     * <p> Illustration Application </p>
     *
     * @param illustrationApp String
     */
    public void setIllustrationApp(String illustrationApp)
    {
        this.illustrationApp = illustrationApp;
    }     
    
    /**
     * <p> Link to the Sales Illustration Application </p>
     * <p>
     *
     * @return the link to the sales illustration application this policy can be
     * illustrutated in.
     *
     * </p>
     */
    public String getIllustrationAppLink()
    {
        return illustrationAppLink;
    }

    /**
     * <p> Link to the Illustration Application </p>
     *
     * @param illustrationAppLink String
     */
    public void setIllustrationAppLink(String illustrationAppLink)
    {
        this.illustrationAppLink = illustrationAppLink;
    }    
    
    /**
     * <p> Message </p>
     * <p>
     *
     * @return the message that will be displayed on the jsp.
     *
     * </p>
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * <p> Message</p>
     *
     * @param message String
     */
    public void setMessage(String message)
    {
        this.message = message;
    }    
    
    /**
     * <p> Message2 </p>
     * <p>
     *
     * @return the second part of the message that will be displayed on the jsp.
     *
     * </p>
     */
    public String getMessage2()
    {
        return message2;
    }

    /**
     * <p> Message2</p>
     *
     * @param message2 String
     */
    public void setMessage2(String message2)
    {
        this.message2 = message2;
    }        
            


  	/**
     * String representation of this SalesIllustrationResult object
     *
     * @return String
     */
    public String toString()
    {
		StringBuilder sb = new StringBuilder();
        sb.append(INITS);
        sb.append(initials);
        sb.append(COMMA);
        sb.append(POL_NO);
       	sb.append(policyNumber);
        sb.append(COMMA);
        sb.append(ID);
        sb.append(producerID);
        sb.append(COMMA);
        sb.append(AGT_CODE);
        sb.append(agentCode);
        sb.append(COMMA); 
        sb.append(FULL_NAME);
        sb.append(fullName);
        sb.append(COMMA); 
        sb.append(LAST_NAME);
        sb.append(lastName);
        sb.append(COMMA);              
        sb.append(APP);
        sb.append(illustrationApp);       
        sb.append(COMMA);              
        sb.append(APPLINK);
        sb.append(illustrationAppLink);   
        sb.append(COMMA);
        sb.append(MSG);
        sb.append(message);     
        sb.append(COMMA);
        sb.append(MSG_2);
        sb.append(message2);            
		return sb.toString();
	}

}