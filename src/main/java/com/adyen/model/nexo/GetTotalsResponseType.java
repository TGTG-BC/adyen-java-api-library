
package com.adyen.model.nexo;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Definition: Content of the Reconciliation Response message. -- Usage: It conveys Information related to the Reconciliation transaction processed by the POI System
 * 
 * <p>Java class for GetTotalsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTotalsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{}ResponseType"/>
 *         &lt;element name="TransactionTotals" type="{}TransactionTotalsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="POIReconciliationID" use="required" type="{}POIReconciliationIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTotalsResponseType", propOrder = {
    "response",
    "transactionTotals"
})
public class GetTotalsResponseType {

    @XmlElement(name = "Response", required = true)
    protected ResponseType response;
    @XmlElement(name = "TransactionTotals")
    protected List<TransactionTotalsType> transactionTotals;
    @XmlAttribute(name = "POIReconciliationID", required = true)
    protected String poiReconciliationID;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType }
     *     
     */
    public ResponseType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *     
     */
    public void setResponse(ResponseType value) {
        this.response = value;
    }

    /**
     * Gets the value of the transactionTotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionTotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionTotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionTotalsType }
     * 
     * 
     */
    public List<TransactionTotalsType> getTransactionTotals() {
        if (transactionTotals == null) {
            transactionTotals = new ArrayList<TransactionTotalsType>();
        }
        return this.transactionTotals;
    }

    /**
     * Gets the value of the poiReconciliationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOIReconciliationID() {
        return poiReconciliationID;
    }

    /**
     * Sets the value of the poiReconciliationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOIReconciliationID(String value) {
        this.poiReconciliationID = value;
    }

}