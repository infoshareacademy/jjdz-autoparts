/**
 * RefundDetailsType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package allegroApi;

public class RefundDetailsType implements java.io.Serializable {
    private int refundId;

    private String refundStatus;

    private int refundQuantity;

    private java.util.Calendar createdDate;

    private java.util.Calendar considerDate;

    public RefundDetailsType() {
    }

    public RefundDetailsType(
            int refundId,
            String refundStatus,
            int refundQuantity,
            java.util.Calendar createdDate,
            java.util.Calendar considerDate) {
        this.refundId = refundId;
        this.refundStatus = refundStatus;
        this.refundQuantity = refundQuantity;
        this.createdDate = createdDate;
        this.considerDate = considerDate;
    }


    /**
     * Gets the refundId value for this RefundDetailsType.
     *
     * @return refundId
     */
    public int getRefundId() {
        return refundId;
    }


    /**
     * Sets the refundId value for this RefundDetailsType.
     *
     * @param refundId
     */
    public void setRefundId(int refundId) {
        this.refundId = refundId;
    }


    /**
     * Gets the refundStatus value for this RefundDetailsType.
     *
     * @return refundStatus
     */
    public String getRefundStatus() {
        return refundStatus;
    }


    /**
     * Sets the refundStatus value for this RefundDetailsType.
     *
     * @param refundStatus
     */
    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }


    /**
     * Gets the refundQuantity value for this RefundDetailsType.
     *
     * @return refundQuantity
     */
    public int getRefundQuantity() {
        return refundQuantity;
    }


    /**
     * Sets the refundQuantity value for this RefundDetailsType.
     *
     * @param refundQuantity
     */
    public void setRefundQuantity(int refundQuantity) {
        this.refundQuantity = refundQuantity;
    }


    /**
     * Gets the createdDate value for this RefundDetailsType.
     *
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this RefundDetailsType.
     *
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the considerDate value for this RefundDetailsType.
     *
     * @return considerDate
     */
    public java.util.Calendar getConsiderDate() {
        return considerDate;
    }


    /**
     * Sets the considerDate value for this RefundDetailsType.
     *
     * @param considerDate
     */
    public void setConsiderDate(java.util.Calendar considerDate) {
        this.considerDate = considerDate;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RefundDetailsType)) return false;
        RefundDetailsType other = (RefundDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.refundId == other.getRefundId() &&
                ((this.refundStatus == null && other.getRefundStatus() == null) ||
                        (this.refundStatus != null &&
                                this.refundStatus.equals(other.getRefundStatus()))) &&
                this.refundQuantity == other.getRefundQuantity() &&
                ((this.createdDate == null && other.getCreatedDate() == null) ||
                        (this.createdDate != null &&
                                this.createdDate.equals(other.getCreatedDate()))) &&
                ((this.considerDate == null && other.getConsiderDate() == null) ||
                        (this.considerDate != null &&
                                this.considerDate.equals(other.getConsiderDate())));
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
        _hashCode += getRefundId();
        if (getRefundStatus() != null) {
            _hashCode += getRefundStatus().hashCode();
        }
        _hashCode += getRefundQuantity();
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getConsiderDate() != null) {
            _hashCode += getConsiderDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(RefundDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "RefundDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refund-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refund-status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refund-quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("considerDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consider-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
