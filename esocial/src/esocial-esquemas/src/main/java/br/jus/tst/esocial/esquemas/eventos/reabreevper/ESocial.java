//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.02 at 02:45:27 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.reabreevper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="evtReabreEvPer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtReabreEvPer/v_S_01_01_00}T_ideEvento_folha_sem_retificacao"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtReabreEvPer/v_S_01_01_00}T_ideEmpregador"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtReabreEvPer/v_S_01_01_00}TS_Id" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
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
    "evtReabreEvPer",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtReabreEvPer evtReabreEvPer;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Gets the value of the evtReabreEvPer property.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtReabreEvPer }
     *     
     */
    public ESocial.EvtReabreEvPer getEvtReabreEvPer() {
        return evtReabreEvPer;
    }

    /**
     * Sets the value of the evtReabreEvPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtReabreEvPer }
     *     
     */
    public void setEvtReabreEvPer(ESocial.EvtReabreEvPer value) {
        this.evtReabreEvPer = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }


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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtReabreEvPer/v_S_01_01_00}T_ideEvento_folha_sem_retificacao"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtReabreEvPer/v_S_01_01_00}T_ideEmpregador"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtReabreEvPer/v_S_01_01_00}TS_Id" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ideEvento",
        "ideEmpregador"
    })
    public static class EvtReabreEvPer {

        @XmlElement(required = true)
        protected TIdeEventoFolhaSemRetificacao ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Gets the value of the ideEvento property.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoFolhaSemRetificacao }
         *     
         */
        public TIdeEventoFolhaSemRetificacao getIdeEvento() {
            return ideEvento;
        }

        /**
         * Sets the value of the ideEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoFolhaSemRetificacao }
         *     
         */
        public void setIdeEvento(TIdeEventoFolhaSemRetificacao value) {
            this.ideEvento = value;
        }

        /**
         * Gets the value of the ideEmpregador property.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEmpregador }
         *     
         */
        public TIdeEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Sets the value of the ideEmpregador property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEmpregador }
         *     
         */
        public void setIdeEmpregador(TIdeEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

    }

}