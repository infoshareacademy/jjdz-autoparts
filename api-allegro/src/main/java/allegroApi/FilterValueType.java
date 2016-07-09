/**
 * FilterValueType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package allegroApi;

public class FilterValueType implements java.io.Serializable {
    private String filterValueId;

    private String filterValueName;

    private int filterValueCount;

    public FilterValueType() {
    }

    public FilterValueType(
            String filterValueId,
            String filterValueName,
            int filterValueCount) {
        this.filterValueId = filterValueId;
        this.filterValueName = filterValueName;
        this.filterValueCount = filterValueCount;
    }


    /**
     * Gets the filterValueId value for this FilterValueType.
     *
     * @return filterValueId
     */
    public String getFilterValueId() {
        return filterValueId;
    }


    /**
     * Sets the filterValueId value for this FilterValueType.
     *
     * @param filterValueId
     */
    public void setFilterValueId(String filterValueId) {
        this.filterValueId = filterValueId;
    }


    /**
     * Gets the filterValueName value for this FilterValueType.
     *
     * @return filterValueName
     */
    public String getFilterValueName() {
        return filterValueName;
    }


    /**
     * Sets the filterValueName value for this FilterValueType.
     *
     * @param filterValueName
     */
    public void setFilterValueName(String filterValueName) {
        this.filterValueName = filterValueName;
    }


    /**
     * Gets the filterValueCount value for this FilterValueType.
     *
     * @return filterValueCount
     */
    public int getFilterValueCount() {
        return filterValueCount;
    }


    /**
     * Sets the filterValueCount value for this FilterValueType.
     *
     * @param filterValueCount
     */
    public void setFilterValueCount(int filterValueCount) {
        this.filterValueCount = filterValueCount;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FilterValueType)) return false;
        FilterValueType other = (FilterValueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.filterValueId == null && other.getFilterValueId() == null) ||
                        (this.filterValueId != null &&
                                this.filterValueId.equals(other.getFilterValueId()))) &&
                ((this.filterValueName == null && other.getFilterValueName() == null) ||
                        (this.filterValueName != null &&
                                this.filterValueName.equals(other.getFilterValueName()))) &&
                this.filterValueCount == other.getFilterValueCount();
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
        if (getFilterValueId() != null) {
            _hashCode += getFilterValueId().hashCode();
        }
        if (getFilterValueName() != null) {
            _hashCode += getFilterValueName().hashCode();
        }
        _hashCode += getFilterValueCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(FilterValueType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "FilterValueType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterValueId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filter-value-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterValueName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filter-value-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterValueCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filter-value-count"));
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
