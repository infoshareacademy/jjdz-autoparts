/**
 * CountryInfoType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package allegroApi;

public class CountryInfoType implements java.io.Serializable {
    private int countryId;

    private String countryName;

    public CountryInfoType() {
    }

    public CountryInfoType(
            int countryId,
            String countryName) {
        this.countryId = countryId;
        this.countryName = countryName;
    }


    /**
     * Gets the countryId value for this CountryInfoType.
     *
     * @return countryId
     */
    public int getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this CountryInfoType.
     *
     * @param countryId
     */
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the countryName value for this CountryInfoType.
     *
     * @return countryName
     */
    public String getCountryName() {
        return countryName;
    }


    /**
     * Sets the countryName value for this CountryInfoType.
     *
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CountryInfoType)) return false;
        CountryInfoType other = (CountryInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.countryId == other.getCountryId() &&
                ((this.countryName == null && other.getCountryName() == null) ||
                        (this.countryName != null &&
                                this.countryName.equals(other.getCountryName())));
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
        _hashCode += getCountryId();
        if (getCountryName() != null) {
            _hashCode += getCountryName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CountryInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "CountryInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
