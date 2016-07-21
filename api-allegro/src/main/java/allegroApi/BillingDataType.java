/**
 * BillingDataType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package allegroApi;

public class BillingDataType implements java.io.Serializable {
    private int billingId;

    private String billingType;

    private String billingFixperc;

    private String billingName;

    private String billingRangeFrom;

    private String billingRangeTo;

    private String billingCat;

    private String billingRate;

    private int billingAuctionType;

    public BillingDataType() {
    }

    public BillingDataType(
            int billingId,
            String billingType,
            String billingFixperc,
            String billingName,
            String billingRangeFrom,
            String billingRangeTo,
            String billingCat,
            String billingRate,
            int billingAuctionType) {
        this.billingId = billingId;
        this.billingType = billingType;
        this.billingFixperc = billingFixperc;
        this.billingName = billingName;
        this.billingRangeFrom = billingRangeFrom;
        this.billingRangeTo = billingRangeTo;
        this.billingCat = billingCat;
        this.billingRate = billingRate;
        this.billingAuctionType = billingAuctionType;
    }


    /**
     * Gets the billingId value for this BillingDataType.
     *
     * @return billingId
     */
    public int getBillingId() {
        return billingId;
    }


    /**
     * Sets the billingId value for this BillingDataType.
     *
     * @param billingId
     */
    public void setBillingId(int billingId) {
        this.billingId = billingId;
    }


    /**
     * Gets the billingType value for this BillingDataType.
     *
     * @return billingType
     */
    public String getBillingType() {
        return billingType;
    }


    /**
     * Sets the billingType value for this BillingDataType.
     *
     * @param billingType
     */
    public void setBillingType(String billingType) {
        this.billingType = billingType;
    }


    /**
     * Gets the billingFixperc value for this BillingDataType.
     *
     * @return billingFixperc
     */
    public String getBillingFixperc() {
        return billingFixperc;
    }


    /**
     * Sets the billingFixperc value for this BillingDataType.
     *
     * @param billingFixperc
     */
    public void setBillingFixperc(String billingFixperc) {
        this.billingFixperc = billingFixperc;
    }


    /**
     * Gets the billingName value for this BillingDataType.
     *
     * @return billingName
     */
    public String getBillingName() {
        return billingName;
    }


    /**
     * Sets the billingName value for this BillingDataType.
     *
     * @param billingName
     */
    public void setBillingName(String billingName) {
        this.billingName = billingName;
    }


    /**
     * Gets the billingRangeFrom value for this BillingDataType.
     *
     * @return billingRangeFrom
     */
    public String getBillingRangeFrom() {
        return billingRangeFrom;
    }


    /**
     * Sets the billingRangeFrom value for this BillingDataType.
     *
     * @param billingRangeFrom
     */
    public void setBillingRangeFrom(String billingRangeFrom) {
        this.billingRangeFrom = billingRangeFrom;
    }


    /**
     * Gets the billingRangeTo value for this BillingDataType.
     *
     * @return billingRangeTo
     */
    public String getBillingRangeTo() {
        return billingRangeTo;
    }


    /**
     * Sets the billingRangeTo value for this BillingDataType.
     *
     * @param billingRangeTo
     */
    public void setBillingRangeTo(String billingRangeTo) {
        this.billingRangeTo = billingRangeTo;
    }


    /**
     * Gets the billingCat value for this BillingDataType.
     *
     * @return billingCat
     */
    public String getBillingCat() {
        return billingCat;
    }


    /**
     * Sets the billingCat value for this BillingDataType.
     *
     * @param billingCat
     */
    public void setBillingCat(String billingCat) {
        this.billingCat = billingCat;
    }


    /**
     * Gets the billingRate value for this BillingDataType.
     *
     * @return billingRate
     */
    public String getBillingRate() {
        return billingRate;
    }


    /**
     * Sets the billingRate value for this BillingDataType.
     *
     * @param billingRate
     */
    public void setBillingRate(String billingRate) {
        this.billingRate = billingRate;
    }


    /**
     * Gets the billingAuctionType value for this BillingDataType.
     *
     * @return billingAuctionType
     */
    public int getBillingAuctionType() {
        return billingAuctionType;
    }


    /**
     * Sets the billingAuctionType value for this BillingDataType.
     *
     * @param billingAuctionType
     */
    public void setBillingAuctionType(int billingAuctionType) {
        this.billingAuctionType = billingAuctionType;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BillingDataType)) return false;
        BillingDataType other = (BillingDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.billingId == other.getBillingId() &&
                ((this.billingType == null && other.getBillingType() == null) ||
                        (this.billingType != null &&
                                this.billingType.equals(other.getBillingType()))) &&
                ((this.billingFixperc == null && other.getBillingFixperc() == null) ||
                        (this.billingFixperc != null &&
                                this.billingFixperc.equals(other.getBillingFixperc()))) &&
                ((this.billingName == null && other.getBillingName() == null) ||
                        (this.billingName != null &&
                                this.billingName.equals(other.getBillingName()))) &&
                ((this.billingRangeFrom == null && other.getBillingRangeFrom() == null) ||
                        (this.billingRangeFrom != null &&
                                this.billingRangeFrom.equals(other.getBillingRangeFrom()))) &&
                ((this.billingRangeTo == null && other.getBillingRangeTo() == null) ||
                        (this.billingRangeTo != null &&
                                this.billingRangeTo.equals(other.getBillingRangeTo()))) &&
                ((this.billingCat == null && other.getBillingCat() == null) ||
                        (this.billingCat != null &&
                                this.billingCat.equals(other.getBillingCat()))) &&
                ((this.billingRate == null && other.getBillingRate() == null) ||
                        (this.billingRate != null &&
                                this.billingRate.equals(other.getBillingRate()))) &&
                this.billingAuctionType == other.getBillingAuctionType();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getBillingId();
        if (getBillingType() != null) {
            _hashCode += getBillingType().hashCode();
        }
        if (getBillingFixperc() != null) {
            _hashCode += getBillingFixperc().hashCode();
        }
        if (getBillingName() != null) {
            _hashCode += getBillingName().hashCode();
        }
        if (getBillingRangeFrom() != null) {
            _hashCode += getBillingRangeFrom().hashCode();
        }
        if (getBillingRangeTo() != null) {
            _hashCode += getBillingRangeTo().hashCode();
        }
        if (getBillingCat() != null) {
            _hashCode += getBillingCat().hashCode();
        }
        if (getBillingRate() != null) {
            _hashCode += getBillingRate().hashCode();
        }
        _hashCode += getBillingAuctionType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(BillingDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "BillingDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingFixperc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing-fixperc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingRangeFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing-range-from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingRangeTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing-range-to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing-cat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing-rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAuctionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing-auction-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

}
