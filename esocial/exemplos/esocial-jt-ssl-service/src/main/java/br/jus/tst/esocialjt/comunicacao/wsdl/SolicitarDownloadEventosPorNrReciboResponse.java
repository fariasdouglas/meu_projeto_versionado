//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.01 at 05:32:53 PM BRT 
//


package br.jus.tst.esocialjt.comunicacao.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SolicitarDownloadEventosPorNrReciboResult" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "solicitarDownloadEventosPorNrReciboResult"
})
@XmlRootElement(name = "SolicitarDownloadEventosPorNrReciboResponse", namespace = "http://www.esocial.gov.br/servicos/empregador/download/solicitacao/v1_0_0")
public class SolicitarDownloadEventosPorNrReciboResponse {

    @XmlElement(name = "SolicitarDownloadEventosPorNrReciboResult", namespace = "http://www.esocial.gov.br/servicos/empregador/download/solicitacao/v1_0_0")
    protected SolicitarDownloadEventosPorNrReciboResponse.SolicitarDownloadEventosPorNrReciboResult solicitarDownloadEventosPorNrReciboResult;

    /**
     * Gets the value of the solicitarDownloadEventosPorNrReciboResult property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitarDownloadEventosPorNrReciboResponse.SolicitarDownloadEventosPorNrReciboResult }
     *     
     */
    public SolicitarDownloadEventosPorNrReciboResponse.SolicitarDownloadEventosPorNrReciboResult getSolicitarDownloadEventosPorNrReciboResult() {
        return solicitarDownloadEventosPorNrReciboResult;
    }

    /**
     * Sets the value of the solicitarDownloadEventosPorNrReciboResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitarDownloadEventosPorNrReciboResponse.SolicitarDownloadEventosPorNrReciboResult }
     *     
     */
    public void setSolicitarDownloadEventosPorNrReciboResult(SolicitarDownloadEventosPorNrReciboResponse.SolicitarDownloadEventosPorNrReciboResult value) {
        this.solicitarDownloadEventosPorNrReciboResult = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class SolicitarDownloadEventosPorNrReciboResult {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}