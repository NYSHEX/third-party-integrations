
package com.nyshex.servcon.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldOrgNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldConNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newOrgNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newConNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmdNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fileData",
    "fileName",
    "oldOrgNum",
    "oldConNum",
    "newOrgNum",
    "newConNum",
    "changeFlag",
    "amdNum",
    "userName",
    "comments"
})
@XmlRootElement(name = "FileCorrectedCopy")
public class FileCorrectedCopy {

    @XmlElement(name = "FileData")
    protected byte[] fileData;
    @XmlElement(name = "FileName")
    protected String fileName;
    protected String oldOrgNum;
    protected String oldConNum;
    protected String newOrgNum;
    protected String newConNum;
    protected String changeFlag;
    @XmlElement(name = "AmdNum")
    protected String amdNum;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "Comments")
    protected String comments;

    /**
     * Gets the value of the fileData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFileData() {
        return fileData;
    }

    /**
     * Sets the value of the fileData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFileData(byte[] value) {
        this.fileData = value;
    }

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
     * Gets the value of the oldOrgNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldOrgNum() {
        return oldOrgNum;
    }

    /**
     * Sets the value of the oldOrgNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldOrgNum(String value) {
        this.oldOrgNum = value;
    }

    /**
     * Gets the value of the oldConNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldConNum() {
        return oldConNum;
    }

    /**
     * Sets the value of the oldConNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldConNum(String value) {
        this.oldConNum = value;
    }

    /**
     * Gets the value of the newOrgNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewOrgNum() {
        return newOrgNum;
    }

    /**
     * Sets the value of the newOrgNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewOrgNum(String value) {
        this.newOrgNum = value;
    }

    /**
     * Gets the value of the newConNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewConNum() {
        return newConNum;
    }

    /**
     * Sets the value of the newConNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewConNum(String value) {
        this.newConNum = value;
    }

    /**
     * Gets the value of the changeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeFlag() {
        return changeFlag;
    }

    /**
     * Sets the value of the changeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeFlag(String value) {
        this.changeFlag = value;
    }

    /**
     * Gets the value of the amdNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmdNum() {
        return amdNum;
    }

    /**
     * Sets the value of the amdNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmdNum(String value) {
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
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
