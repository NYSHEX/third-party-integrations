
package com.nyshex.servcon.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceContractFiling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceContractFiling">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrgNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmdNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="FMCNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EffDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfirmNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errCodeUserName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errCodeOrgNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errCodeConNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errCodeAmdNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errCodeEffDate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errCodeFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errMsgUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errMsgOrgNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errMsgConNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errMsgAmdNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errMsgEffDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errMsgFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceContractFiling", propOrder = {
    "fileName",
    "orgNum",
    "conNum",
    "amdNum",
    "userName",
    "sessionId",
    "fmcNum",
    "effDate",
    "confirmNum",
    "fileSize",
    "errCodeUserName",
    "errCodeOrgNum",
    "errCodeConNum",
    "errCodeAmdNum",
    "errCodeEffDate",
    "errCodeFile",
    "errMsgUserName",
    "errMsgOrgNum",
    "errMsgConNum",
    "errMsgAmdNum",
    "errMsgEffDate",
    "errMsgFile"
})
public class ServiceContractFiling {

    @XmlElement(name = "FileName")
    protected String fileName;
    @XmlElement(name = "OrgNum")
    protected String orgNum;
    @XmlElement(name = "ConNum")
    protected String conNum;
    @XmlElement(name = "AmdNum")
    protected int amdNum;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "SessionId")
    protected long sessionId;
    @XmlElement(name = "FMCNum")
    protected int fmcNum;
    @XmlElement(name = "EffDate")
    protected String effDate;
    @XmlElement(name = "ConfirmNum")
    protected String confirmNum;
    @XmlElement(name = "FileSize")
    protected int fileSize;
    protected int errCodeUserName;
    protected int errCodeOrgNum;
    protected int errCodeConNum;
    protected int errCodeAmdNum;
    protected int errCodeEffDate;
    protected int errCodeFile;
    protected String errMsgUserName;
    protected String errMsgOrgNum;
    protected String errMsgConNum;
    protected String errMsgAmdNum;
    protected String errMsgEffDate;
    protected String errMsgFile;

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the orgNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgNum() {
        return orgNum;
    }

    /**
     * Sets the value of the orgNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgNum(String value) {
        this.orgNum = value;
    }

    /**
     * Gets the value of the conNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConNum() {
        return conNum;
    }

    /**
     * Sets the value of the conNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConNum(String value) {
        this.conNum = value;
    }

    /**
     * Gets the value of the amdNum property.
     * 
     */
    public int getAmdNum() {
        return amdNum;
    }

    /**
     * Sets the value of the amdNum property.
     * 
     */
    public void setAmdNum(int value) {
        this.amdNum = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     */
    public long getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     */
    public void setSessionId(long value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the fmcNum property.
     * 
     */
    public int getFMCNum() {
        return fmcNum;
    }

    /**
     * Sets the value of the fmcNum property.
     * 
     */
    public void setFMCNum(int value) {
        this.fmcNum = value;
    }

    /**
     * Gets the value of the effDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffDate() {
        return effDate;
    }

    /**
     * Sets the value of the effDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffDate(String value) {
        this.effDate = value;
    }

    /**
     * Gets the value of the confirmNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmNum() {
        return confirmNum;
    }

    /**
     * Sets the value of the confirmNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmNum(String value) {
        this.confirmNum = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     */
    public int getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     */
    public void setFileSize(int value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the errCodeUserName property.
     * 
     */
    public int getErrCodeUserName() {
        return errCodeUserName;
    }

    /**
     * Sets the value of the errCodeUserName property.
     * 
     */
    public void setErrCodeUserName(int value) {
        this.errCodeUserName = value;
    }

    /**
     * Gets the value of the errCodeOrgNum property.
     * 
     */
    public int getErrCodeOrgNum() {
        return errCodeOrgNum;
    }

    /**
     * Sets the value of the errCodeOrgNum property.
     * 
     */
    public void setErrCodeOrgNum(int value) {
        this.errCodeOrgNum = value;
    }

    /**
     * Gets the value of the errCodeConNum property.
     * 
     */
    public int getErrCodeConNum() {
        return errCodeConNum;
    }

    /**
     * Sets the value of the errCodeConNum property.
     * 
     */
    public void setErrCodeConNum(int value) {
        this.errCodeConNum = value;
    }

    /**
     * Gets the value of the errCodeAmdNum property.
     * 
     */
    public int getErrCodeAmdNum() {
        return errCodeAmdNum;
    }

    /**
     * Sets the value of the errCodeAmdNum property.
     * 
     */
    public void setErrCodeAmdNum(int value) {
        this.errCodeAmdNum = value;
    }

    /**
     * Gets the value of the errCodeEffDate property.
     * 
     */
    public int getErrCodeEffDate() {
        return errCodeEffDate;
    }

    /**
     * Sets the value of the errCodeEffDate property.
     * 
     */
    public void setErrCodeEffDate(int value) {
        this.errCodeEffDate = value;
    }

    /**
     * Gets the value of the errCodeFile property.
     * 
     */
    public int getErrCodeFile() {
        return errCodeFile;
    }

    /**
     * Sets the value of the errCodeFile property.
     * 
     */
    public void setErrCodeFile(int value) {
        this.errCodeFile = value;
    }

    /**
     * Gets the value of the errMsgUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrMsgUserName() {
        return errMsgUserName;
    }

    /**
     * Sets the value of the errMsgUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrMsgUserName(String value) {
        this.errMsgUserName = value;
    }

    /**
     * Gets the value of the errMsgOrgNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrMsgOrgNum() {
        return errMsgOrgNum;
    }

    /**
     * Sets the value of the errMsgOrgNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrMsgOrgNum(String value) {
        this.errMsgOrgNum = value;
    }

    /**
     * Gets the value of the errMsgConNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrMsgConNum() {
        return errMsgConNum;
    }

    /**
     * Sets the value of the errMsgConNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrMsgConNum(String value) {
        this.errMsgConNum = value;
    }

    /**
     * Gets the value of the errMsgAmdNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrMsgAmdNum() {
        return errMsgAmdNum;
    }

    /**
     * Sets the value of the errMsgAmdNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrMsgAmdNum(String value) {
        this.errMsgAmdNum = value;
    }

    /**
     * Gets the value of the errMsgEffDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrMsgEffDate() {
        return errMsgEffDate;
    }

    /**
     * Sets the value of the errMsgEffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrMsgEffDate(String value) {
        this.errMsgEffDate = value;
    }

    /**
     * Gets the value of the errMsgFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrMsgFile() {
        return errMsgFile;
    }

    /**
     * Sets the value of the errMsgFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrMsgFile(String value) {
        this.errMsgFile = value;
    }

}
