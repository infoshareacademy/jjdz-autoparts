/**
 * PaymentsUserDataStruct.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package allegroApi;

public class PaymentsUserDataStruct implements java.io.Serializable {
    private String userFullName;

    private String userAddress;

    private String userPostcode;

    private String userCity;

    private int userCountry;

    private String userPhone;

    public PaymentsUserDataStruct() {
    }

    public PaymentsUserDataStruct(
            String userFullName,
            String userAddress,
            String userPostcode,
            String userCity,
            int userCountry,
            String userPhone) {
        this.userFullName = userFullName;
        this.userAddress = userAddress;
        this.userPostcode = userPostcode;
        this.userCity = userCity;
        this.userCountry = userCountry;
        this.userPhone = userPhone;
    }


    /**
     * Gets the userFullName value for this PaymentsUserDataStruct.
     *
     * @return userFullName
     */
    public String getUserFullName() {
        return userFullName;
    }


    /**
     * Sets the userFullName value for this PaymentsUserDataStruct.
     *
     * @param userFullName
     */
    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }


    /**
     * Gets the userAddress value for this PaymentsUserDataStruct.
     *
     * @return userAddress
     */
    public String getUserAddress() {
        return userAddress;
    }


    /**
     * Sets the userAddress value for this PaymentsUserDataStruct.
     *
     * @param userAddress
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }


    /**
     * Gets the userPostcode value for this PaymentsUserDataStruct.
     *
     * @return userPostcode
     */
    public String getUserPostcode() {
        return userPostcode;
    }


    /**
     * Sets the userPostcode value for this PaymentsUserDataStruct.
     *
     * @param userPostcode
     */
    public void setUserPostcode(String userPostcode) {
        this.userPostcode = userPostcode;
    }


    /**
     * Gets the userCity value for this PaymentsUserDataStruct.
     *
     * @return userCity
     */
    public String getUserCity() {
        return userCity;
    }


    /**
     * Sets the userCity value for this PaymentsUserDataStruct.
     *
     * @param userCity
     */
    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }


    /**
     * Gets the userCountry value for this PaymentsUserDataStruct.
     *
     * @return userCountry
     */
    public int getUserCountry() {
        return userCountry;
    }


    /**
     * Sets the userCountry value for this PaymentsUserDataStruct.
     *
     * @param userCountry
     */
    public void setUserCountry(int userCountry) {
        this.userCountry = userCountry;
    }


    /**
     * Gets the userPhone value for this PaymentsUserDataStruct.
     *
     * @return userPhone
     */
    public String getUserPhone() {
        return userPhone;
    }


    /**
     * Sets the userPhone value for this PaymentsUserDataStruct.
     *
     * @param userPhone
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PaymentsUserDataStruct)) return false;
        PaymentsUserDataStruct other = (PaymentsUserDataStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.userFullName == null && other.getUserFullName() == null) ||
                        (this.userFullName != null &&
                                this.userFullName.equals(other.getUserFullName()))) &&
                ((this.userAddress == null && other.getUserAddress() == null) ||
                        (this.userAddress != null &&
                                this.userAddress.equals(other.getUserAddress()))) &&
                ((this.userPostcode == null && other.getUserPostcode() == null) ||
                        (this.userPostcode != null &&
                                this.userPostcode.equals(other.getUserPostcode()))) &&
                ((this.userCity == null && other.getUserCity() == null) ||
                        (this.userCity != null &&
                                this.userCity.equals(other.getUserCity()))) &&
                this.userCountry == other.getUserCountry() &&
                ((this.userPhone == null && other.getUserPhone() == null) ||
                        (this.userPhone != null &&
                                this.userPhone.equals(other.getUserPhone())));
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
        if (getUserFullName() != null) {
            _hashCode += getUserFullName().hashCode();
        }
        if (getUserAddress() != null) {
            _hashCode += getUserAddress().hashCode();
        }
        if (getUserPostcode() != null) {
            _hashCode += getUserPostcode().hashCode();
        }
        if (getUserCity() != null) {
            _hashCode += getUserCity().hashCode();
        }
        _hashCode += getUserCountry();
        if (getUserPhone() != null) {
            _hashCode += getUserPhone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PaymentsUserDataStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentsUserDataStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userFullName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-full-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPostcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-phone"));
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
