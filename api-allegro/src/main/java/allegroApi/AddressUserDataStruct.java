/**
 * AddressUserDataStruct.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package allegroApi;

public class AddressUserDataStruct implements java.io.Serializable {
    private String userCompany;

    private String userFullName;

    private String userAddress;

    private String userPostcode;

    private String userCity;

    public AddressUserDataStruct() {
    }

    public AddressUserDataStruct(
            String userCompany,
            String userFullName,
            String userAddress,
            String userPostcode,
            String userCity) {
        this.userCompany = userCompany;
        this.userFullName = userFullName;
        this.userAddress = userAddress;
        this.userPostcode = userPostcode;
        this.userCity = userCity;
    }


    /**
     * Gets the userCompany value for this AddressUserDataStruct.
     *
     * @return userCompany
     */
    public String getUserCompany() {
        return userCompany;
    }


    /**
     * Sets the userCompany value for this AddressUserDataStruct.
     *
     * @param userCompany
     */
    public void setUserCompany(String userCompany) {
        this.userCompany = userCompany;
    }


    /**
     * Gets the userFullName value for this AddressUserDataStruct.
     *
     * @return userFullName
     */
    public String getUserFullName() {
        return userFullName;
    }


    /**
     * Sets the userFullName value for this AddressUserDataStruct.
     *
     * @param userFullName
     */
    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }


    /**
     * Gets the userAddress value for this AddressUserDataStruct.
     *
     * @return userAddress
     */
    public String getUserAddress() {
        return userAddress;
    }


    /**
     * Sets the userAddress value for this AddressUserDataStruct.
     *
     * @param userAddress
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }


    /**
     * Gets the userPostcode value for this AddressUserDataStruct.
     *
     * @return userPostcode
     */
    public String getUserPostcode() {
        return userPostcode;
    }


    /**
     * Sets the userPostcode value for this AddressUserDataStruct.
     *
     * @param userPostcode
     */
    public void setUserPostcode(String userPostcode) {
        this.userPostcode = userPostcode;
    }


    /**
     * Gets the userCity value for this AddressUserDataStruct.
     *
     * @return userCity
     */
    public String getUserCity() {
        return userCity;
    }


    /**
     * Sets the userCity value for this AddressUserDataStruct.
     *
     * @param userCity
     */
    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AddressUserDataStruct)) return false;
        AddressUserDataStruct other = (AddressUserDataStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.userCompany == null && other.getUserCompany() == null) ||
                        (this.userCompany != null &&
                                this.userCompany.equals(other.getUserCompany()))) &&
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
                                this.userCity.equals(other.getUserCity())));
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
        if (getUserCompany() != null) {
            _hashCode += getUserCompany().hashCode();
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AddressUserDataStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "AddressUserDataStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
