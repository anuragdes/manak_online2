//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.24 at 10:22:41 AM IST 
//


package ipd.setup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPDReportDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPDReportDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dischargeSummaryReportAdvice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dischargeSummaryReportFooter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPDReportDetails", propOrder = {
    "dischargeSummaryReportAdvice",
    "dischargeSummaryReportFooter"
})
public class IPDReportDetails {

    @XmlElement(namespace = "http://www.cdacnoida.in/his/IpdConfig", required = true)
    protected String dischargeSummaryReportAdvice;
    @XmlElement(namespace = "http://www.cdacnoida.in/his/IpdConfig", required = true)
    protected String dischargeSummaryReportFooter;

    /**
     * Gets the value of the dischargeSummaryReportAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDischargeSummaryReportAdvice() {
        return dischargeSummaryReportAdvice;
    }

    /**
     * Sets the value of the dischargeSummaryReportAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDischargeSummaryReportAdvice(String value) {
        this.dischargeSummaryReportAdvice = value;
    }

    /**
     * Gets the value of the dischargeSummaryReportFooter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDischargeSummaryReportFooter() {
        return dischargeSummaryReportFooter;
    }

    /**
     * Sets the value of the dischargeSummaryReportFooter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDischargeSummaryReportFooter(String value) {
        this.dischargeSummaryReportFooter = value;
    }

}