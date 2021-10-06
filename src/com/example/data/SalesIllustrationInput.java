package com.example.data;

import java.io.Serializable;

/**
 * The SalesIllustrationInput object - a generic object
 * used as input when making the request
 *
 * Copyright (c) 2011 MassMutual Financial Group 
 * @author Mia Young
 *
 */
public class SalesIllustrationInput implements Serializable
{
    static final long serialVersionUID = 3280782809032319415L;
	private static final String POL_NO = "POLICY NUMBER: ";
	private static final String ADMIN = "PRODUCER ID: ";
	private static final String LOB = "LINE OF BUSINESS: ";
	private static final String PROD_TYPE = "PROD TYPE: ";
	private static final String KIND_CODE = "KIND CODE: ";
	private static final String BASIS = "BASIS: ";
	private static final String RATE = "RATE: ";
	private static final String SERIES_YEAR = "SERIES YEAR: ";
	private static final String INITS = "INITIALS: ";
	private static final String ID = "PRODUCER ID: ";
	private static final String AGT_CODE = "AGENT CODE: ";
	private static final String FULL_NAME = "FULL NAME: ";
	private static final String LAST_NAME = "LAST NAME: ";
	private static final String COMMA = ", ";	
	private static final String CONV_POL_TYPE = "CONVERTED POLICY TYPE";
	
	/**
	 * policy number
	 */
	private String policyNumber = "4746315";
	
	/**
	 * admin
	 */
	private String admin = "OPM";

	/**
	 * lineOfBusiness
	 */
	private String lineOfBusiness = "LIFE";

	/**
	 * prodType
	 */
	private String prodType = "LPL85";

	/**
	 * kindCode
	 */
	private String kindCode = "06085";

	/**
	 * basis
	 */
	private String basis = "64";

	/**
	 * rate
	 */
	private String rate = "0099";

	/**
	 * seriesYear
	 */
	private int seriesYear = 1999;
    /**
     * The requested producer's initials
     */
    private String initials = null;

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
	 * Converted Policy Type (DataLife)
	*/
	private String convPolType = null;	
	
	/**
	 * Default Constructor
	 */
	public SalesIllustrationInput() 
	{
	}

	/**
	 * <p>
	 * @return policy number
	 * </p>
	 */
	public String getPolicyNumber()
	{
		return policyNumber;
	}

	/**
	 * <p>
	 * @param policyNumber number
	 * </p>
	 */
	public void setPolicyNumber(String policyNumber)
	{
		this.policyNumber = policyNumber;
	}

	/**
	 * <p>
	 * @return admin
	 * </p>
	 */
	public String getAdmin()
	{
		return admin;
	}

	/**
	 * <p>
	 * @param admin
	 * </p>
	 */
	public void setAdmin(String admin)
	{
		this.admin = admin;
	}

	/**
	 * <p>
	 * @return lineOfBusiness
	 * </p>
	 */
	public String getLineOfBusiness()
	{
		return lineOfBusiness;
	}

	/**
	 * <p>
	 * @param lineOfBusiness
	 * </p>
	 */
	public void setLineOfBusiness(String lineOfBusiness)
	{
		this.lineOfBusiness = lineOfBusiness;
	}

	/**
	 * <p>
	 * @return prodType
	 * </p>
	 */
	public String getProdType()
	{
		return prodType;
	}

	/**
	 * <p>
	 * @param prodType
	 * </p>
	 */
	public void setProdType(String prodType)
	{
		this.prodType = prodType;
	}

	/**
	 * <p>
	 * @return kindCode
	 * </p>
	 */
	public String getKindCode()
	{
		return kindCode;
	}

	/**
	 * <p>
	 * @param kindCode
	 * </p>
	 */
	public void setKindCode(String kindCode)
	{
		this.kindCode = kindCode;
	}

	/**
	 * <p>
	 * @return basis
	 * </p>
	 */
	public String getBasis()
	{
		return basis;
	}

	/**
	 * <p>
	 * @param basis
	 * </p>
	 */
	public void setBasis(String basis)
	{
		this.basis = basis;
	}

	/**
	 * <p>
	 * @return rate
	 * </p>
	 */
	public String getRate()
	{
		return rate;
	}

	/**
	 * <p>
	 * @param rate
	 * </p>
	 */
	public void setRate(String rate)
	{
		this.rate = rate;
	}

	/**
	 * <p>
	 * @return seriesYear
	 * </p>
	 */
	public int getSeriesYear()
	{
		return seriesYear;
	}

	/**
	 * <p>
	 * @param seriesYear
	 * </p>
	 */
	public void setSeriesYear(int seriesYear)
	{
		this.seriesYear = seriesYear;
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
     * <p> Converted Policy Type (DataLife) </p>
     * <p>
     *
     * @return the converted policy type or null if unavailable.
     * </p>
     */
    public String getConvPolType()
    {
        return convPolType;
    }

    /**
     * <p> Converted Policy Type </p>
     *
     * @param convPolType String
     */
    public void setConvPolType(String convPolType)
    {
        this.convPolType = convPolType;
    }


  	/**
     * String representation of this SalesIllustrationInput object
     *
     * @return String
     */
    public String toString()
    {
		StringBuffer sb = new StringBuffer();
        sb.append(POL_NO);
        sb.append(policyNumber);
        sb.append(COMMA);
        sb.append(ADMIN);
       	sb.append(admin);
        sb.append(COMMA);
        sb.append(LOB);
        sb.append(lineOfBusiness);
        sb.append(COMMA);
        sb.append(PROD_TYPE);
        sb.append(prodType);
        sb.append(COMMA);               
        sb.append(KIND_CODE);
        sb.append(kindCode);       
        sb.append(COMMA);              
        sb.append(BASIS);
        sb.append(basis);   
        sb.append(COMMA);
        sb.append(RATE);
        sb.append(rate);   
        sb.append(SERIES_YEAR);
        sb.append(seriesYear);
        sb.append(COMMA);              
        sb.append(INITS);
        sb.append(initials);
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
	  sb.append(CONV_POL_TYPE);
	  sb.append(convPolType);             
 		return sb.toString();
	}

}