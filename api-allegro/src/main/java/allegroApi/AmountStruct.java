/**
 * AmountStruct.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package allegroApi;

public class AmountStruct implements java.io.Serializable {
    private float amountValue;

    private String amountCurrencySign;

    public AmountStruct() {
    }

    public AmountStruct(
            float amountValue,
            String amountCurrencySign) {
        this.amountValue = amountValue;
        this.amountCurrencySign = amountCurrencySign;
    }


    /**
     * Gets the amountValue value for this AmountStruct.
     *
     * @return amountValue
     */
    public float getAmountValue() {
        return amountValue;
    }


    /**
     * Sets the amountValue value for this AmountStruct.
     *
     * @param amountValue
     */
    public void setAmountValue(float amountValue) {
        this.amountValue = amountValue;
    }


    /**
     * Gets the amountCurrencySign value for this AmountStruct.
     *
     * @return amountCurrencySign
     */
    public String getAmountCurrencySign() {
        return amountCurrencySign;
    }


    /**
     * Sets the amountCurrencySign value for this AmountStruct.
     *
     * @param amountCurrencySign
     */
    public void setAmountCurrencySign(String amountCurrencySign) {
        this.amountCurrencySign = amountCurrencySign;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AmountStruct)) return false;
        AmountStruct other = (AmountStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.amountValue == other.getAmountValue() &&
                ((this.amountCurrencySign == null && other.getAmountCurrencySign() == null) ||
                        (this.amountCurrencySign != null &&
                                this.amountCurrencySign.equals(other.getAmountCurrencySign())));
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
        _hashCode += new Float(getAmountValue()).hashCode();
        if (getAmountCurrencySign() != null) {
            _hashCode += getAmountCurrencySign().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AmountStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "AmountStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount-value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountCurrencySign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount-currency-sign"));
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
