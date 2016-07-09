/**
 * RelatedPersonsStruct.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package allegroApi;

public class RelatedPersonsStruct implements java.io.Serializable {
    private String spouseFirstName;

    private String spouseLastName;

    public RelatedPersonsStruct() {
    }

    public RelatedPersonsStruct(
            String spouseFirstName,
            String spouseLastName) {
        this.spouseFirstName = spouseFirstName;
        this.spouseLastName = spouseLastName;
    }


    /**
     * Gets the spouseFirstName value for this RelatedPersonsStruct.
     *
     * @return spouseFirstName
     */
    public String getSpouseFirstName() {
        return spouseFirstName;
    }


    /**
     * Sets the spouseFirstName value for this RelatedPersonsStruct.
     *
     * @param spouseFirstName
     */
    public void setSpouseFirstName(String spouseFirstName) {
        this.spouseFirstName = spouseFirstName;
    }


    /**
     * Gets the spouseLastName value for this RelatedPersonsStruct.
     *
     * @return spouseLastName
     */
    public String getSpouseLastName() {
        return spouseLastName;
    }


    /**
     * Sets the spouseLastName value for this RelatedPersonsStruct.
     *
     * @param spouseLastName
     */
    public void setSpouseLastName(String spouseLastName) {
        this.spouseLastName = spouseLastName;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RelatedPersonsStruct)) return false;
        RelatedPersonsStruct other = (RelatedPersonsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.spouseFirstName == null && other.getSpouseFirstName() == null) ||
                        (this.spouseFirstName != null &&
                                this.spouseFirstName.equals(other.getSpouseFirstName()))) &&
                ((this.spouseLastName == null && other.getSpouseLastName() == null) ||
                        (this.spouseLastName != null &&
                                this.spouseLastName.equals(other.getSpouseLastName())));
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
        if (getSpouseFirstName() != null) {
            _hashCode += getSpouseFirstName().hashCode();
        }
        if (getSpouseLastName() != null) {
            _hashCode += getSpouseLastName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(RelatedPersonsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "RelatedPersonsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spouseFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spouse-first-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spouseLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spouse-last-name"));
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
