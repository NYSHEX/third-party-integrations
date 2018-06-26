
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
 *         &lt;element name="FileNoticeResult" type="{http://www.fmc.gov/ServconWebServices/}ServiceContractFiling"/>
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
    "fileNoticeResult"
})
@XmlRootElement(name = "FileNoticeResponse")
public class FileNoticeResponse {

    @XmlElement(name = "FileNoticeResult", required = true)
    protected ServiceContractFiling fileNoticeResult;

    /**
     * Gets the value of the fileNoticeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceContractFiling }
     *     
     */
    public ServiceContractFiling getFileNoticeResult() {
        return fileNoticeResult;
    }

    /**
     * Sets the value of the fileNoticeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceContractFiling }
     *     
     */
    public void setFileNoticeResult(ServiceContractFiling value) {
        this.fileNoticeResult = value;
    }

}
