
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
 *         &lt;element name="FileCorrectedCopyResult" type="{http://www.fmc.gov/ServconWebServices/}ServiceContractFiling"/>
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
    "fileCorrectedCopyResult"
})
@XmlRootElement(name = "FileCorrectedCopyResponse")
public class FileCorrectedCopyResponse {

    @XmlElement(name = "FileCorrectedCopyResult", required = true)
    protected ServiceContractFiling fileCorrectedCopyResult;

    /**
     * Gets the value of the fileCorrectedCopyResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceContractFiling }
     *     
     */
    public ServiceContractFiling getFileCorrectedCopyResult() {
        return fileCorrectedCopyResult;
    }

    /**
     * Sets the value of the fileCorrectedCopyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceContractFiling }
     *     
     */
    public void setFileCorrectedCopyResult(ServiceContractFiling value) {
        this.fileCorrectedCopyResult = value;
    }

}