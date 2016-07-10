/**
 * CompanySecondAddressStruct.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package allegroApi;

public class CompanySecondAddressStruct implements java.io.Serializable {
    private String companyWorkerFirstName;

    private String companyWorkerLastName;

    private String companyAddress;

    private String companyPostcode;

    private String companyCity;

    private int companyCountryId;

    private int companyStateId;

    public CompanySecondAddressStruct() {
    }

    public CompanySecondAddressStruct(
            String companyWorkerFirstName,
            String companyWorkerLastName,
            String companyAddress,
            String companyPostcode,
            String companyCity,
            int companyCountryId,
            int companyStateId) {
        this.companyWorkerFirstName = companyWorkerFirstName;
        this.companyWorkerLastName = companyWorkerLastName;
        this.companyAddress = companyAddress;
        this.companyPostcode = companyPostcode;
        this.companyCity = companyCity;
        this.companyCountryId = companyCountryId;
        this.companyStateId = companyStateId;
    }


    /**
     * Gets the companyWorkerFirstName value for this CompanySecondAddressStruct.
     *
     * @return companyWorkerFirstName
     */
    public String getCompanyWorkerFirstName() {
        return companyWorkerFirstName;
    }


    /**
     * Sets the companyWorkerFirstName value for this CompanySecondAddressStruct.
     *
     * @param companyWorkerFirstName
     */
    public void setCompanyWorkerFirstName(String companyWorkerFirstName) {
        this.companyWorkerFirstName = companyWorkerFirstName;
    }


    /**
     * Gets the companyWorkerLastName value for this CompanySecondAddressStruct.
     *
     * @return companyWorkerLastName
     */
    public String getCompanyWorkerLastName() {
        return companyWorkerLastName;
    }


    /**
     * Sets the companyWorkerLastName value for this CompanySecondAddressStruct.
     *
     * @param companyWorkerLastName
     */
    public void setCompanyWorkerLastName(String companyWorkerLastName) {
        this.companyWorkerLastName = companyWorkerLastName;
    }


    /**
     * Gets the companyAddress value for this CompanySecondAddressStruct.
     *
     * @return companyAddress
     */
    public String getCompanyAddress() {
        return companyAddress;
    }


    /**
     * Sets the companyAddress value for this CompanySecondAddressStruct.
     *
     * @param companyAddress
     */
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }


    /**
     * Gets the companyPostcode value for this CompanySecondAddressStruct.
     *
     * @return companyPostcode
     */
    public String getCompanyPostcode() {
        return companyPostcode;
    }


    /**
     * Sets the companyPostcode value for this CompanySecondAddressStruct.
     *
     * @param companyPostcode
     */
    public void setCompanyPostcode(String companyPostcode) {
        this.companyPostcode = companyPostcode;
    }


    /**
     * Gets the companyCity value for this CompanySecondAddressStruct.
     *
     * @return companyCity
     */
    public String getCompanyCity() {
        return companyCity;
    }


    /**
     * Sets the companyCity value for this CompanySecondAddressStruct.
     *
     * @param companyCity
     */
    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }


    /**
     * Gets the companyCountryId value for this CompanySecondAddressStruct.
     *
     * @return companyCountryId
     */
    public int getCompanyCountryId() {
        return companyCountryId;
    }


    /**
     * Sets the companyCountryId value for this CompanySecondAddressStruct.
     *
     * @param companyCountryId
     */
    public void setCompanyCountryId(int companyCountryId) {
        this.companyCountryId = companyCountryId;
    }


    /**
     * Gets the companyStateId value for this CompanySecondAddressStruct.
     *
     * @return companyStateId
     */
    public int getCompanyStateId() {
        return companyStateId;
    }


    /**
     * Sets the companyStateId value for this CompanySecondAddressStruct.
     *
     * @param companyStateId
     */
    public void setCompanyStateId(int companyStateId) {
        this.companyStateId = companyStateId;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CompanySecondAddressStruct)) return false;
        CompanySecondAddressStruct other = (CompanySecondAddressStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.companyWorkerFirstName == null && other.getCompanyWorkerFirstName() == null) ||
                        (this.companyWorkerFirstName != null &&
                                this.companyWorkerFirstName.equals(other.getCompanyWorkerFirstName()))) &&
                ((this.companyWorkerLastName == null && other.getCompanyWorkerLastName() == null) ||
                        (this.companyWorkerLastName != null &&
                                this.companyWorkerLastName.equals(other.getCompanyWorkerLastName()))) &&
                ((this.companyAddress == null && other.getCompanyAddress() == null) ||
                        (this.companyAddress != null &&
                                this.companyAddress.equals(other.getCompanyAddress()))) &&
                ((this.companyPostcode == null && other.getCompanyPostcode() == null) ||
                        (this.companyPostcode != null &&
                                this.companyPostcode.equals(other.getCompanyPostcode()))) &&
                ((this.companyCity == null && other.getCompanyCity() == null) ||
                        (this.companyCity != null &&
                                this.companyCity.equals(other.getCompanyCity()))) &&
                this.companyCountryId == other.getCompanyCountryId() &&
                this.companyStateId == other.getCompanyStateId();
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
        if (getCompanyWorkerFirstName() != null) {
            _hashCode += getCompanyWorkerFirstName().hashCode();
        }
        if (getCompanyWorkerLastName() != null) {
            _hashCode += getCompanyWorkerLastName().hashCode();
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
        _hashCode += getCompanyCountryId();
        _hashCode += getCompanyStateId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CompanySecondAddressStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanySecondAddressStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyWorkerFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company-worker-first-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyWorkerLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company-worker-last-name"));
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
        elemField.setFieldName("companyCountryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company-country-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyStateId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company-state-id"));
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
