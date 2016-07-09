/**
 * CompanyInfoStruct.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package allegroApi;

public class CompanyInfoStruct implements java.io.Serializable {
    private String companyFirstName;

    private String companyLastName;

    private String companyName;

    private String companyAddress;

    private String companyPostcode;

    private String companyCity;

    private String companyNip;

    public CompanyInfoStruct() {
    }

    public CompanyInfoStruct(
            String companyFirstName,
            String companyLastName,
            String companyName,
            String companyAddress,
            String companyPostcode,
            String companyCity,
            String companyNip) {
        this.companyFirstName = companyFirstName;
        this.companyLastName = companyLastName;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyPostcode = companyPostcode;
        this.companyCity = companyCity;
        this.companyNip = companyNip;
    }


    /**
     * Gets the companyFirstName value for this CompanyInfoStruct.
     *
     * @return companyFirstName
     */
    public String getCompanyFirstName() {
        return companyFirstName;
    }


    /**
     * Sets the companyFirstName value for this CompanyInfoStruct.
     *
     * @param companyFirstName
     */
    public void setCompanyFirstName(String companyFirstName) {
        this.companyFirstName = companyFirstName;
    }


    /**
     * Gets the companyLastName value for this CompanyInfoStruct.
     *
     * @return companyLastName
     */
    public String getCompanyLastName() {
        return companyLastName;
    }


    /**
     * Sets the companyLastName value for this CompanyInfoStruct.
     *
     * @param companyLastName
     */
    public void setCompanyLastName(String companyLastName) {
        this.companyLastName = companyLastName;
    }


    /**
     * Gets the companyName value for this CompanyInfoStruct.
     *
     * @return companyName
     */
    public String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this CompanyInfoStruct.
     *
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the companyAddress value for this CompanyInfoStruct.
     *
     * @return companyAddress
     */
    public String getCompanyAddress() {
        return companyAddress;
    }


    /**
     * Sets the companyAddress value for this CompanyInfoStruct.
     *
     * @param companyAddress
     */
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }


    /**
     * Gets the companyPostcode value for this CompanyInfoStruct.
     *
     * @return companyPostcode
     */
    public String getCompanyPostcode() {
        return companyPostcode;
    }


    /**
     * Sets the companyPostcode value for this CompanyInfoStruct.
     *
     * @param companyPostcode
     */
    public void setCompanyPostcode(String companyPostcode) {
        this.companyPostcode = companyPostcode;
    }


    /**
     * Gets the companyCity value for this CompanyInfoStruct.
     *
     * @return companyCity
     */
    public String getCompanyCity() {
        return companyCity;
    }


    /**
     * Sets the companyCity value for this CompanyInfoStruct.
     *
     * @param companyCity
     */
    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }


    /**
     * Gets the companyNip value for this CompanyInfoStruct.
     *
     * @return companyNip
     */
    public String getCompanyNip() {
        return companyNip;
    }


    /**
     * Sets the companyNip value for this CompanyInfoStruct.
     *
     * @param companyNip
     */
    public void setCompanyNip(String companyNip) {
        this.companyNip = companyNip;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CompanyInfoStruct)) return false;
        CompanyInfoStruct other = (CompanyInfoStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.companyFirstName == null && other.getCompanyFirstName() == null) ||
                        (this.companyFirstName != null &&
                                this.companyFirstName.equals(other.getCompanyFirstName()))) &&
                ((this.companyLastName == null && other.getCompanyLastName() == null) ||
                        (this.companyLastName != null &&
                                this.companyLastName.equals(other.getCompanyLastName()))) &&
                ((this.companyName == null && other.getCompanyName() == null) ||
                        (this.companyName != null &&
                                this.companyName.equals(other.getCompanyName()))) &&
                ((this.companyAddress == null && other.getCompanyAddress() == null) ||
                        (this.companyAddress != null &&
                                this.companyAddress.equals(other.getCompanyAddress()))) &&
                ((this.companyPostcode == null && other.getCompanyPostcode() == null) ||
                        (this.companyPostcode != null &&
                                this.companyPostcode.equals(other.getCompanyPostcode()))) &&
                ((this.companyCity == null && other.getCompanyCity() == null) ||
                        (this.companyCity != null &&
                                this.companyCity.equals(other.getCompanyCity()))) &&
                ((this.companyNip == null && other.getCompanyNip() == null) ||
                        (this.companyNip != null &&
                                this.companyNip.equals(other.getCompanyNip())));
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
        if (getCompanyFirstName() != null) {
            _hashCode += getCompanyFirstName().hashCode();
        }
        if (getCompanyLastName() != null) {
            _hashCode += getCompanyLastName().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getCompanyAddress() != null) {
            _hashCode += getCompanyAddress().hashCode();
        }
        if (getCompanyPostcode() != null) {
            _hashCode += getCompanyPostcode().hashCode();
        }
        if (getCompanyCity() != null) {
            _hashCode += getCompanyCity().hashCode();
        }
        if (getCompanyNip() != null) {
            _hashCode += getCompanyNip().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CompanyInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanyInfoStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company-first-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company-last-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company-address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyPostcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company-postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company-city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyNip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company-nip"));
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
