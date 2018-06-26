
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
 *         &lt;element name="FileContractResult" type="{http://www.fmc.gov/ServconWebServices/}ServiceContractFiling" minOccurs="0"/>
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
    "fileContractResult"
})
@XmlRootElement(name = "FileContractResponse")
public class FileContractResponse {

    @XmlElement(name = "FileContractResult")
    protected ServiceContractFiling fileContractResult;

    /**
     * Gets the value of the fileContractResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceContractFiling }
     *     
     */
    public ServiceContractFiling getFileContractResult() {
        return fileContractResult;
    }

    /**
     * Sets the value of the fileContractResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceContractFiling }
     *     
     */
    public void setFileContractResult(ServiceContractFiling value) {
        this.fileContractResult = value;
    }

}
