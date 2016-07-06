/**
 * SellerShipmentDataStruct.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package allegroApi;

public class SellerShipmentDataStruct implements java.io.Serializable {
    private int sellerId;

    private allegroApi.SellerPaymentInfoStruct sellerPaymentInfo;

    private int sellerOtherShipmentIsActive;

    private allegroApi.ShipmentPaymentInfoStruct[] generalDeliveryPaymentInfo;

    public SellerShipmentDataStruct() {
    }

    public SellerShipmentDataStruct(
            int sellerId,
            allegroApi.SellerPaymentInfoStruct sellerPaymentInfo,
            int sellerOtherShipmentIsActive,
            allegroApi.ShipmentPaymentInfoStruct[] generalDeliveryPaymentInfo) {
        this.sellerId = sellerId;
        this.sellerPaymentInfo = sellerPaymentInfo;
        this.sellerOtherShipmentIsActive = sellerOtherShipmentIsActive;
        this.generalDeliveryPaymentInfo = generalDeliveryPaymentInfo;
    }


    /**
     * Gets the sellerId value for this SellerShipmentDataStruct.
     *
     * @return sellerId
     */
    public int getSellerId() {
        return sellerId;
    }


    /**
     * Sets the sellerId value for this SellerShipmentDataStruct.
     *
     * @param sellerId
     */
    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }


    /**
     * Gets the sellerPaymentInfo value for this SellerShipmentDataStruct.
     *
     * @return sellerPaymentInfo
     */
    public allegroApi.SellerPaymentInfoStruct getSellerPaymentInfo() {
        return sellerPaymentInfo;
    }


    /**
     * Sets the sellerPaymentInfo value for this SellerShipmentDataStruct.
     *
     * @param sellerPaymentInfo
     */
    public void setSellerPaymentInfo(allegroApi.SellerPaymentInfoStruct sellerPaymentInfo) {
        this.sellerPaymentInfo = sellerPaymentInfo;
    }


    /**
     * Gets the sellerOtherShipmentIsActive value for this SellerShipmentDataStruct.
     *
     * @return sellerOtherShipmentIsActive
     */
    public int getSellerOtherShipmentIsActive() {
        return sellerOtherShipmentIsActive;
    }


    /**
     * Sets the sellerOtherShipmentIsActive value for this SellerShipmentDataStruct.
     *
     * @param sellerOtherShipmentIsActive
     */
    public void setSellerOtherShipmentIsActive(int sellerOtherShipmentIsActive) {
        this.sellerOtherShipmentIsActive = sellerOtherShipmentIsActive;
    }


    /**
     * Gets the generalDeliveryPaymentInfo value for this SellerShipmentDataStruct.
     *
     * @return generalDeliveryPaymentInfo
     */
    public allegroApi.ShipmentPaymentInfoStruct[] getGeneralDeliveryPaymentInfo() {
        return generalDeliveryPaymentInfo;
    }


    /**
     * Sets the generalDeliveryPaymentInfo value for this SellerShipmentDataStruct.
     *
     * @param generalDeliveryPaymentInfo
     */
    public void setGeneralDeliveryPaymentInfo(allegroApi.ShipmentPaymentInfoStruct[] generalDeliveryPaymentInfo) {
        this.generalDeliveryPaymentInfo = generalDeliveryPaymentInfo;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellerShipmentDataStruct)) return false;
        SellerShipmentDataStruct other = (SellerShipmentDataStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.sellerId == other.getSellerId() &&
                ((this.sellerPaymentInfo == null && other.getSellerPaymentInfo() == null) ||
                        (this.sellerPaymentInfo != null &&
                                this.sellerPaymentInfo.equals(other.getSellerPaymentInfo()))) &&
                this.sellerOtherShipmentIsActive == other.getSellerOtherShipmentIsActive() &&
                ((this.generalDeliveryPaymentInfo == null && other.getGeneralDeliveryPaymentInfo() == null) ||
                        (this.generalDeliveryPaymentInfo != null &&
                                java.util.Arrays.equals(this.generalDeliveryPaymentInfo, other.getGeneralDeliveryPaymentInfo())));
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
        _hashCode += getSellerId();
        if (getSellerPaymentInfo() != null) {
            _hashCode += getSellerPaymentInfo().hashCode();
        }
        _hashCode += getSellerOtherShipmentIsActive();
        if (getGeneralDeliveryPaymentInfo() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getGeneralDeliveryPaymentInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGeneralDeliveryPaymentInfo(), i);
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
            new org.apache.axis.description.TypeDesc(SellerShipmentDataStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SellerShipmentDataStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seller-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerPaymentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seller-payment-info"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SellerPaymentInfoStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerOtherShipmentIsActive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seller-other-shipment-is-active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generalDeliveryPaymentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "general-delivery-payment-info"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ShipmentPaymentInfoStruct"));
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
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

}
