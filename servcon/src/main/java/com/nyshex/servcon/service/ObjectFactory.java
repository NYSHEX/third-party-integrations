
package com.nyshex.servcon.service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nyshex.servcon.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nyshex.servcon.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FileContractResponse }
     * 
     */
    public FileContractResponse createFileContractResponse() {
        return new FileContractResponse();
    }

    /**
     * Create an instance of {@link ServiceContractFiling }
     * 
     */
    public ServiceContractFiling createServiceContractFiling() {
        return new ServiceContractFiling();
    }

    /**
     * Create an instance of {@link FileContract }
     * 
     */
    public FileContract createFileContract() {
        return new FileContract();
    }

    /**
     * Create an instance of {@link FileCorrectedCopy }
     * 
     */
    public FileCorrectedCopy createFileCorrectedCopy() {
        return new FileCorrectedCopy();
    }

    /**
     * Create an instance of {@link FileCorrectedCopyResponse }
     * 
     */
    public FileCorrectedCopyResponse createFileCorrectedCopyResponse() {
        return new FileCorrectedCopyResponse();
    }

}
