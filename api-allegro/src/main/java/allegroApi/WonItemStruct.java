/**
 * WonItemStruct.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package allegroApi;

public class WonItemStruct implements java.io.Serializable {
    private long itemId;

    private String itemTitle;

    private String itemThumbnailUrl;

    private allegroApi.ItemPriceStruct[] itemPrice;

    private int itemBoughtQuantity;

    private int itemLeftQuantity;

    private int itemQuantityType;

    private long itemEndTime;

    private String itemEndTimeLeft;

    private allegroApi.UserInfoStruct itemSeller;

    private int itemBiddersCounter;

    private int itemCategoryId;

    private int itemViewsCounter;

    private String itemNote;

    private int itemSpecialInfo;

    private int itemShopInfo;

    private long itemProductInfo;

    private int itemPayuInfo;

    public WonItemStruct() {
    }

    public WonItemStruct(
            long itemId,
            String itemTitle,
            String itemThumbnailUrl,
            allegroApi.ItemPriceStruct[] itemPrice,
            int itemBoughtQuantity,
            int itemLeftQuantity,
            int itemQuantityType,
            long itemEndTime,
            String itemEndTimeLeft,
            allegroApi.UserInfoStruct itemSeller,
            int itemBiddersCounter,
            int itemCategoryId,
            int itemViewsCounter,
            String itemNote,
            int itemSpecialInfo,
            int itemShopInfo,
            long itemProductInfo,
            int itemPayuInfo) {
        this.itemId = itemId;
        this.itemTitle = itemTitle;
        this.itemThumbnailUrl = itemThumbnailUrl;
        this.itemPrice = itemPrice;
        this.itemBoughtQuantity = itemBoughtQuantity;
        this.itemLeftQuantity = itemLeftQuantity;
        this.itemQuantityType = itemQuantityType;
        this.itemEndTime = itemEndTime;
        this.itemEndTimeLeft = itemEndTimeLeft;
        this.itemSeller = itemSeller;
        this.itemBiddersCounter = itemBiddersCounter;
        this.itemCategoryId = itemCategoryId;
        this.itemViewsCounter = itemViewsCounter;
        this.itemNote = itemNote;
        this.itemSpecialInfo = itemSpecialInfo;
        this.itemShopInfo = itemShopInfo;
        this.itemProductInfo = itemProductInfo;
        this.itemPayuInfo = itemPayuInfo;
    }


    /**
     * Gets the itemId value for this WonItemStruct.
     *
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this WonItemStruct.
     *
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the itemTitle value for this WonItemStruct.
     *
     * @return itemTitle
     */
    public String getItemTitle() {
        return itemTitle;
    }


    /**
     * Sets the itemTitle value for this WonItemStruct.
     *
     * @param itemTitle
     */
    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }


    /**
     * Gets the itemThumbnailUrl value for this WonItemStruct.
     *
     * @return itemThumbnailUrl
     */
    public String getItemThumbnailUrl() {
        return itemThumbnailUrl;
    }


    /**
     * Sets the itemThumbnailUrl value for this WonItemStruct.
     *
     * @param itemThumbnailUrl
     */
    public void setItemThumbnailUrl(String itemThumbnailUrl) {
        this.itemThumbnailUrl = itemThumbnailUrl;
    }


    /**
     * Gets the itemPrice value for this WonItemStruct.
     *
     * @return itemPrice
     */
    public allegroApi.ItemPriceStruct[] getItemPrice() {
        return itemPrice;
    }


    /**
     * Sets the itemPrice value for this WonItemStruct.
     *
     * @param itemPrice
     */
    public void setItemPrice(allegroApi.ItemPriceStruct[] itemPrice) {
        this.itemPrice = itemPrice;
    }


    /**
     * Gets the itemBoughtQuantity value for this WonItemStruct.
     *
     * @return itemBoughtQuantity
     */
    public int getItemBoughtQuantity() {
        return itemBoughtQuantity;
    }


    /**
     * Sets the itemBoughtQuantity value for this WonItemStruct.
     *
     * @param itemBoughtQuantity
     */
    public void setItemBoughtQuantity(int itemBoughtQuantity) {
        this.itemBoughtQuantity = itemBoughtQuantity;
    }


    /**
     * Gets the itemLeftQuantity value for this WonItemStruct.
     *
     * @return itemLeftQuantity
     */
    public int getItemLeftQuantity() {
        return itemLeftQuantity;
    }


    /**
     * Sets the itemLeftQuantity value for this WonItemStruct.
     *
     * @param itemLeftQuantity
     */
    public void setItemLeftQuantity(int itemLeftQuantity) {
        this.itemLeftQuantity = itemLeftQuantity;
    }


    /**
     * Gets the itemQuantityType value for this WonItemStruct.
     *
     * @return itemQuantityType
     */
    public int getItemQuantityType() {
        return itemQuantityType;
    }


    /**
     * Sets the itemQuantityType value for this WonItemStruct.
     *
     * @param itemQuantityType
     */
    public void setItemQuantityType(int itemQuantityType) {
        this.itemQuantityType = itemQuantityType;
    }


    /**
     * Gets the itemEndTime value for this WonItemStruct.
     *
     * @return itemEndTime
     */
    public long getItemEndTime() {
        return itemEndTime;
    }


    /**
     * Sets the itemEndTime value for this WonItemStruct.
     *
     * @param itemEndTime
     */
    public void setItemEndTime(long itemEndTime) {
        this.itemEndTime = itemEndTime;
    }


    /**
     * Gets the itemEndTimeLeft value for this WonItemStruct.
     *
     * @return itemEndTimeLeft
     */
    public String getItemEndTimeLeft() {
        return itemEndTimeLeft;
    }


    /**
     * Sets the itemEndTimeLeft value for this WonItemStruct.
     *
     * @param itemEndTimeLeft
     */
    public void setItemEndTimeLeft(String itemEndTimeLeft) {
        this.itemEndTimeLeft = itemEndTimeLeft;
    }


    /**
     * Gets the itemSeller value for this WonItemStruct.
     *
     * @return itemSeller
     */
    public allegroApi.UserInfoStruct getItemSeller() {
        return itemSeller;
    }


    /**
     * Sets the itemSeller value for this WonItemStruct.
     *
     * @param itemSeller
     */
    public void setItemSeller(allegroApi.UserInfoStruct itemSeller) {
        this.itemSeller = itemSeller;
    }


    /**
     * Gets the itemBiddersCounter value for this WonItemStruct.
     *
     * @return itemBiddersCounter
     */
    public int getItemBiddersCounter() {
        return itemBiddersCounter;
    }


    /**
     * Sets the itemBiddersCounter value for this WonItemStruct.
     *
     * @param itemBiddersCounter
     */
    public void setItemBiddersCounter(int itemBiddersCounter) {
        this.itemBiddersCounter = itemBiddersCounter;
    }


    /**
     * Gets the itemCategoryId value for this WonItemStruct.
     *
     * @return itemCategoryId
     */
    public int getItemCategoryId() {
        return itemCategoryId;
    }


    /**
     * Sets the itemCategoryId value for this WonItemStruct.
     *
     * @param itemCategoryId
     */
    public void setItemCategoryId(int itemCategoryId) {
        this.itemCategoryId = itemCategoryId;
    }


    /**
     * Gets the itemViewsCounter value for this WonItemStruct.
     *
     * @return itemViewsCounter
     */
    public int getItemViewsCounter() {
        return itemViewsCounter;
    }


    /**
     * Sets the itemViewsCounter value for this WonItemStruct.
     *
     * @param itemViewsCounter
     */
    public void setItemViewsCounter(int itemViewsCounter) {
        this.itemViewsCounter = itemViewsCounter;
    }


    /**
     * Gets the itemNote value for this WonItemStruct.
     *
     * @return itemNote
     */
    public String getItemNote() {
        return itemNote;
    }


    /**
     * Sets the itemNote value for this WonItemStruct.
     *
     * @param itemNote
     */
    public void setItemNote(String itemNote) {
        this.itemNote = itemNote;
    }


    /**
     * Gets the itemSpecialInfo value for this WonItemStruct.
     *
     * @return itemSpecialInfo
     */
    public int getItemSpecialInfo() {
        return itemSpecialInfo;
    }


    /**
     * Sets the itemSpecialInfo value for this WonItemStruct.
     *
     * @param itemSpecialInfo
     */
    public void setItemSpecialInfo(int itemSpecialInfo) {
        this.itemSpecialInfo = itemSpecialInfo;
    }


    /**
     * Gets the itemShopInfo value for this WonItemStruct.
     *
     * @return itemShopInfo
     */
    public int getItemShopInfo() {
        return itemShopInfo;
    }


    /**
     * Sets the itemShopInfo value for this WonItemStruct.
     *
     * @param itemShopInfo
     */
    public void setItemShopInfo(int itemShopInfo) {
        this.itemShopInfo = itemShopInfo;
    }


    /**
     * Gets the itemProductInfo value for this WonItemStruct.
     *
     * @return itemProductInfo
     */
    public long getItemProductInfo() {
        return itemProductInfo;
    }


    /**
     * Sets the itemProductInfo value for this WonItemStruct.
     *
     * @param itemProductInfo
     */
    public void setItemProductInfo(long itemProductInfo) {
        this.itemProductInfo = itemProductInfo;
    }


    /**
     * Gets the itemPayuInfo value for this WonItemStruct.
     *
     * @return itemPayuInfo
     */
    public int getItemPayuInfo() {
        return itemPayuInfo;
    }


    /**
     * Sets the itemPayuInfo value for this WonItemStruct.
     *
     * @param itemPayuInfo
     */
    public void setItemPayuInfo(int itemPayuInfo) {
        this.itemPayuInfo = itemPayuInfo;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WonItemStruct)) return false;
        WonItemStruct other = (WonItemStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.itemId == other.getItemId() &&
                ((this.itemTitle == null && other.getItemTitle() == null) ||
                        (this.itemTitle != null &&
                                this.itemTitle.equals(other.getItemTitle()))) &&
                ((this.itemThumbnailUrl == null && other.getItemThumbnailUrl() == null) ||
                        (this.itemThumbnailUrl != null &&
                                this.itemThumbnailUrl.equals(other.getItemThumbnailUrl()))) &&
                ((this.itemPrice == null && other.getItemPrice() == null) ||
                        (this.itemPrice != null &&
                                java.util.Arrays.equals(this.itemPrice, other.getItemPrice()))) &&
                this.itemBoughtQuantity == other.getItemBoughtQuantity() &&
                this.itemLeftQuantity == other.getItemLeftQuantity() &&
                this.itemQuantityType == other.getItemQuantityType() &&
                this.itemEndTime == other.getItemEndTime() &&
                ((this.itemEndTimeLeft == null && other.getItemEndTimeLeft() == null) ||
                        (this.itemEndTimeLeft != null &&
                                this.itemEndTimeLeft.equals(other.getItemEndTimeLeft()))) &&
                ((this.itemSeller == null && other.getItemSeller() == null) ||
                        (this.itemSeller != null &&
                                this.itemSeller.equals(other.getItemSeller()))) &&
                this.itemBiddersCounter == other.getItemBiddersCounter() &&
                this.itemCategoryId == other.getItemCategoryId() &&
                this.itemViewsCounter == other.getItemViewsCounter() &&
                ((this.itemNote == null && other.getItemNote() == null) ||
                        (this.itemNote != null &&
                                this.itemNote.equals(other.getItemNote()))) &&
                this.itemSpecialInfo == other.getItemSpecialInfo() &&
                this.itemShopInfo == other.getItemShopInfo() &&
                this.itemProductInfo == other.getItemProductInfo() &&
                this.itemPayuInfo == other.getItemPayuInfo();
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
        _hashCode += new Long(getItemId()).hashCode();
        if (getItemTitle() != null) {
            _hashCode += getItemTitle().hashCode();
        }
        if (getItemThumbnailUrl() != null) {
            _hashCode += getItemThumbnailUrl().hashCode();
        }
        if (getItemPrice() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getItemPrice());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getItemPrice(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getItemBoughtQuantity();
        _hashCode += getItemLeftQuantity();
        _hashCode += getItemQuantityType();
        _hashCode += new Long(getItemEndTime()).hashCode();
        if (getItemEndTimeLeft() != null) {
            _hashCode += getItemEndTimeLeft().hashCode();
        }
        if (getItemSeller() != null) {
            _hashCode += getItemSeller().hashCode();
        }
        _hashCode += getItemBiddersCounter();
        _hashCode += getItemCategoryId();
        _hashCode += getItemViewsCounter();
        if (getItemNote() != null) {
            _hashCode += getItemNote().hashCode();
        }
        _hashCode += getItemSpecialInfo();
        _hashCode += getItemShopInfo();
        _hashCode += new Long(getItemProductInfo()).hashCode();
        _hashCode += getItemPayuInfo();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(WonItemStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "WonItemStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemThumbnailUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-thumbnail-url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-price"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemPriceStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemBoughtQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-bought-quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemLeftQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-left-quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemQuantityType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-quantity-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-end-time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemEndTimeLeft");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-end-time-left"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSeller");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-seller"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "UserInfoStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemBiddersCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-bidders-counter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-category-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemViewsCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-views-counter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemNote");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSpecialInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-special-info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemShopInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-shop-info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemProductInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-product-info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPayuInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-payu-info"));
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
