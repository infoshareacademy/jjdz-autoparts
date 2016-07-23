/**
 * FilterRelationType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package allegroApi;

public class FilterRelationType implements java.io.Serializable {
    private String[] relationAnd;

    private String[] relationOr;

    private String[] relationExclude;

    public FilterRelationType() {
    }

    public FilterRelationType(
            String[] relationAnd,
            String[] relationOr,
            String[] relationExclude) {
        this.relationAnd = relationAnd;
        this.relationOr = relationOr;
        this.relationExclude = relationExclude;
    }


    /**
     * Gets the relationAnd value for this FilterRelationType.
     *
     * @return relationAnd
     */
    public String[] getRelationAnd() {
        return relationAnd;
    }


    /**
     * Sets the relationAnd value for this FilterRelationType.
     *
     * @param relationAnd
     */
    public void setRelationAnd(String[] relationAnd) {
        this.relationAnd = relationAnd;
    }


    /**
     * Gets the relationOr value for this FilterRelationType.
     *
     * @return relationOr
     */
    public String[] getRelationOr() {
        return relationOr;
    }


    /**
     * Sets the relationOr value for this FilterRelationType.
     *
     * @param relationOr
     */
    public void setRelationOr(String[] relationOr) {
        this.relationOr = relationOr;
    }


    /**
     * Gets the relationExclude value for this FilterRelationType.
     *
     * @return relationExclude
     */
    public String[] getRelationExclude() {
        return relationExclude;
    }


    /**
     * Sets the relationExclude value for this FilterRelationType.
     *
     * @param relationExclude
     */
    public void setRelationExclude(String[] relationExclude) {
        this.relationExclude = relationExclude;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FilterRelationType)) return false;
        FilterRelationType other = (FilterRelationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.relationAnd == null && other.getRelationAnd() == null) ||
                        (this.relationAnd != null &&
                                java.util.Arrays.equals(this.relationAnd, other.getRelationAnd()))) &&
                ((this.relationOr == null && other.getRelationOr() == null) ||
                        (this.relationOr != null &&
                                java.util.Arrays.equals(this.relationOr, other.getRelationOr()))) &&
                ((this.relationExclude == null && other.getRelationExclude() == null) ||
                        (this.relationExclude != null &&
                                java.util.Arrays.equals(this.relationExclude, other.getRelationExclude())));
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
        if (getRelationAnd() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getRelationAnd());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRelationAnd(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelationOr() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getRelationOr());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRelationOr(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelationExclude() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getRelationExclude());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRelationExclude(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(FilterRelationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "FilterRelationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationAnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relation-and"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationOr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relation-or"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationExclude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relation-exclude"));
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
