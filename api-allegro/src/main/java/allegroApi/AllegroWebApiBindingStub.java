/**
 * AllegroWebApiBindingStub.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package allegroApi;

public class AllegroWebApiBindingStub extends org.apache.axis.client.Stub implements allegroApi.AllegroWebApiPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc[] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[115];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
    }

    private static void _initOperationDesc1() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddDescToItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-id-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "it-description"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-items-add-id"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-items-desc-to-long"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-items-not-found"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddPackageInfoToPostBuyForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "transaction-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "package-info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPackageInfoStruct"), PackageInfoStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormPackageInfoStruct"));
        oper.setReturnClass(PostBuyFormPackageInfoStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "post-buy-form-package-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddToBlackList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "users-black-list-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserBlackListStruct"), UserBlackListStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserBlackListAddResultStruct"));
        oper.setReturnClass(UserBlackListAddResultStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "user-black-list-results-arr"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddToWatchList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "WatchListInfoStruct"));
        oper.setReturnClass(allegroApi.WatchListInfoStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "watch-list-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doBidItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bid-it-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bid-user-price"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bid-quantity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bid-buy-now"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pharmacy-recipient-data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "PharmacyRecipientDataStruct"), allegroApi.PharmacyRecipientDataStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "variant-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "bid-price"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelBidItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancel-item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancel-bids-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCancelBidsID"), int[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancel-bids-reason"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancel-add-to-black-list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancel-bid-value"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancelled-bids"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCancelBidsID"), int[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "not-cancelled-bids"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCancelBidsID"), int[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "transaction-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "cancellation-result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangeItemFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fields-to-modify"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsValue"), allegroApi.FieldsValue[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fields-to-remove"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsId"), int[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "preview-only"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "variants"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfVariantStruct"), VariantStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tags"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTagNameStruct"), allegroApi.TagNameStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ChangedItemStruct"));
        oper.setReturnClass(ChangedItemStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "changed-item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangePriceItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new-starting-price"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new-reserve-price"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new-buy-now-price"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "item-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangeQuantityItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new-item-quantity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-info"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-quantity-left"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-quantity-sold"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCheckItemDescription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "description-content"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemDescriptionStruct"));
        oper.setReturnClass(allegroApi.ItemDescriptionStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "item-description"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCheckNewAuctionExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsValue"), allegroApi.FieldsValue[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "variants"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfVariantStruct"), VariantStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tags"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTagNameStruct"), allegroApi.TagNameStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-price"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-price-desc"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-is-allegro-standard"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCreateItemTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-template-name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-template-fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsValue"), allegroApi.FieldsValue[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "CreatedItemTemplateStruct"));
        oper.setReturnClass(allegroApi.CreatedItemTemplateStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "created-item-template"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFeedback");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fe-item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fe-use-comment-template"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fe-to-user-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fe-comment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fe-comment-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fe-op"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fe-rating"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingEstimationStruct"), allegroApi.SellRatingEstimationStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "feedback-id"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFeedbackMany");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedbacks-list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFeedbackManyStruct"), FeedbackManyStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFeedbacksResult"));
        oper.setReturnClass(FeedbackResultStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "fe-results"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFinishItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "finish-item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "finish-cancel-all-bids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "finish-cancel-reason"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "finish-value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFinishItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "finish-items-list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFinishItemsStruct"), allegroApi.FinishItemsStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "finish-items-succeed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFinishSuccessStruct"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "finish-items-failed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFinishFailureStruct"), allegroApi.FinishFailureStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetAdminUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "admin-session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-lic-login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        oper.setReturnClass(float.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "get-date-value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetBidItem2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBidList2"));
        oper.setReturnClass(allegroApi.BidListStruct2[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "biditem-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetBlackListUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBlackListStruct"));
        oper.setReturnClass(allegroApi.BlackListStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "black-list-users"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCategoryPath");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCategoryData"));
        oper.setReturnClass(allegroApi.CategoryData[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "category-path"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cats-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCats"), allegroApi.CatInfoType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsDataCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cats-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsDataLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "package-element"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cats-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCats"), allegroApi.CatInfoType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCountries");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCountries"));
        oper.setReturnClass(allegroApi.CountryInfoType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "country-array"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "buyer-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfDealsStruct"));
        oper.setReturnClass(DealsStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "deals-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFavouriteCategories");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFavouritesCategories"));
        oper.setReturnClass(FavouritesCategoriesStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "s-favourite-categories-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFavouriteSellers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFavouritesSellers"));
        oper.setReturnClass(FavouritesSellersStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "s-favourite-sellers-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFeedback");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-kind-list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFeedbackList"), allegroApi.FeedbackList[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFilledPostBuyForms");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "payment-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-role"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filling-time-from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filling-time-to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "FilledPostBuyFormsStruct"));
        oper.setReturnClass(allegroApi.FilledPostBuyFormsStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "filled-post-buy-forms"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsValue"));
        oper.setReturnClass(allegroApi.FieldsValue[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "item-fields"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-template-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTemplatesID"), int[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemTemplatesStruct"));
        oper.setReturnClass(ItemTemplatesStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "item-templates"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsImages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemGetImage"), ItemGetImage[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "image-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemImagesStruct"));
        oper.setReturnClass(allegroApi.ItemImagesStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "get_items_images_result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-id-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-image-url"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-attribs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-postage-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-company-info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-product-info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-item-list-info"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructItemInfoList"), allegroApi.ItemInfoStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-items-not-found"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-items-admin-killed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMessageToBuyer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "MessageToBuyerStruct"));
        oper.setReturnClass(allegroApi.MessageToBuyerStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "message-to-buyer"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "AddressesInfoStruct"));
        oper.setReturnClass(allegroApi.AddressInfoStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addresses-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyBidItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sort-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SortOptionsStruct"), allegroApi.SortOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search-value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bid-items-counter"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bid-items-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBidItemStruct"), allegroApi.BidItemStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyCurrentShipmentPriceType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "shipment-price-type-id"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-data"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "UserDataStruct"), allegroApi.UserDataStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoice-data"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "InvoiceDataStruct"), InvoiceDataStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "company-extra-data"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanyExtraDataStruct"), CompanyExtraDataStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "company-second-address"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanySecondAddressStruct"), allegroApi.CompanySecondAddressStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pharmacy-data"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "PharmacyDataStruct"), PharmacyDataStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "alcohol-data"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "AlcoholDataStruct"), AlcoholDataStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "related-persons"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "RelatedPersonsStruct"), RelatedPersonsStruct.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyFutureItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sort-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SortOptionsStruct"), allegroApi.SortOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "FutureFilterOptionsStruct"), allegroApi.FutureFilterOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "future-items-counter"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "future-items-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFutureItemStruct"), FutureItemStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyIncomingPayments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "buyer-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-recv-date-from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-recv-date-to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-page-limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "stricted-search"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserIncomingPaymentStruct"));
        oper.setReturnClass(allegroApi.UserIncomingPaymentStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "pay-trans-income"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyIncomingPaymentsRefunds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "buyer-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserIncomingPaymentRefundsStruct"));
        oper.setReturnClass(allegroApi.UserIncomingPaymentRefundsStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "pay-trans-income-refunds"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyNotSoldItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sort-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SortOptionsStruct"), allegroApi.SortOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "NotSoldFilterOptionsStruct"), allegroApi.NotSoldFilterOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search-value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "not-sold-items-counter"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "not-sold-items-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfNotSoldItemStruct"), allegroApi.NotSoldItemStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyNotWonItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sort-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SortOptionsStruct"), allegroApi.SortOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search-value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "not-won-items-counter"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "not-won-items-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfNotWonItemStruct"), NotWonItemStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPayments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "seller-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "payment-time-from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "payment-time-to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "stricted-search"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserPaymentStruct"));
        oper.setReturnClass(allegroApi.UserPaymentStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "pay-trans-payment"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPaymentsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentsInfoStruct"));
        oper.setReturnClass(allegroApi.PaymentsInfoStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "payments-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPaymentsRefunds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "seller-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserPaymentRefundsStruct"));
        oper.setReturnClass(allegroApi.UserPaymentRefundsStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "pay-trans-payment-refunds"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPayouts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-create-date-from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-create-date-to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-page-limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserPayoutStruct"));
        oper.setReturnClass(allegroApi.UserPayoutStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "pay-trans-payout"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySellItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sort-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SortOptionsStruct"), allegroApi.SortOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SellFilterOptionsStruct"), SellFilterOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search-value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-items-counter"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-items-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellItemStruct"), allegroApi.SellItemStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySellRating");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-rating-total-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-rating-average"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingAverageStruct"), SellRatingAverageStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-rating-details"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingDetailStruct"), allegroApi.SellRatingDetailStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-rating-stats-per-month"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingAveragePerMonth"), allegroApi.SellRatingAveragePerMonthStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySoldItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sort-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SortOptionsStruct"), allegroApi.SortOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SoldFilterOptionsStruct"), SoldFilterOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search-value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sold-items-counter"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sold-items-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSoldItemStruct"), SoldItemStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyWatchItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sort-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SortOptionsStruct"), allegroApi.SortOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search-value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "watch-items-counter"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "watch-items-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfWatchItemStruct"), allegroApi.WatchItemStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyWatchedItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sort-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SortOptionsStruct"), allegroApi.SortOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search-value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "watched-items-counter"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "watched-items-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfWatchedItemStruct"), allegroApi.WatchedItemStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyWonItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sort-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SortOptionsStruct"), allegroApi.SortOptionsStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search-value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "won-items-counter"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "won-items-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfWonItemStruct"), WonItemStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPaymentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBilling"));
        oper.setReturnClass(BillingDataType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "payment-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPaymentMethods");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPaymentMethodStruct"));
        oper.setReturnClass(allegroApi.PaymentMethodStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "payment-methods"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAuctionID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "buyer-filter-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBuyerId"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsPostBuyData"));
        oper.setReturnClass(allegroApi.ItemPostBuyDataStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "items-post-buy-data"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsDataForBuyers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "transactions-ids-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTransactionsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormForBuyersDataStruct"));
        oper.setReturnClass(allegroApi.PostBuyFormForBuyersDataStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "post-buy-form-data-for-buyers"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsDataForSellers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "transactions-ids-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTransactionsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormDataStruct"));
        oper.setReturnClass(allegroApi.PostBuyFormDataStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "post-buy-form-data"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyItemInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyItemInfoStruct"));
        oper.setReturnClass(PostBuyItemInfoStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "item-post-buy-form-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundsDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFilterOptionsType"), allegroApi.FilterOptionsType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sort-order"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result-offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deals-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deals-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRefundsDealsListType"), RefundsDealsListType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filters-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFiltersListType"), allegroApi.FiltersListType[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFilterOptionsType"), allegroApi.FilterOptionsType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result-offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "refunds-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "refunds-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRefundListType"), RefundListType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filters-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFiltersListType"), allegroApi.FiltersListType[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRelatedItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "RelatedItemsStruct"));
        oper.setReturnClass(allegroApi.RelatedItemsStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "related-items"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormAttribs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-form-fields"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellForms"), SellFormType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-form-fields"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellForms"), SellFormType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-form-fields"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellForms"), SellFormType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsExtLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "package-element"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-form-fields"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellForms"), SellFormType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "form-fields-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsForCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SellFormFieldsForCategoryStruct"));
        oper.setReturnClass(allegroApi.SellFormFieldsForCategoryStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "sell-form-fields-for-category"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "package-element"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-form-fields"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellForms"), SellFormType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "form-fields-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellRatingReasons");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingInfoStruct"));
        oper.setReturnClass(SellRatingInfoStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "sell-rating-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSessionHandleForWidget");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "server-time"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "shipment-data-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfShipmentDataStruct"), allegroApi.ShipmentDataStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentDataForRelatedItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "RelatedItemsShipmentDataStruct"));
        oper.setReturnClass(RelatedItemsShipmentDataStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "related-items-shipment-data"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentPriceTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfShipmentPriceTypeStruct"));
        oper.setReturnClass(allegroApi.ShipmentPriceTypeStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "shipment-price-types"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShopsTags");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "shops-tags-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "shops-tags"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfShopsTagTypeStruct"), ShopsTagTypeStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "starting-point"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "info-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalArray"));
        oper.setReturnClass(allegroApi.SiteJournal[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "site-journal-array"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "journal-start"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSiteJournalDealsStruct"));
        oper.setReturnClass(allegroApi.SiteJournalDealsStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "site-journal-deals"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalDealsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "journal-start"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalDealsInfoStruct"));
        oper.setReturnClass(allegroApi.SiteJournalDealsInfoStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "site-journal-deals-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "starting-point"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "info-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalInfo"));
        oper.setReturnClass(allegroApi.SiteJournalInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "site-journal-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetStatesInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStateInfoStruct"));
        oper.setReturnClass(allegroApi.StateInfoStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "states-info-array"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSystemTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "server-time"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetTransactionsIDs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-id-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-role"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "shipment-id-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfShipmentIds"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTransactionsID"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "transactions-ids-array"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "user-id"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        oper.setReturnClass(float.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "get-date-value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "user-login"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetWaitingFeedbacks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "package-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfWaitFeedbackStruct"));
        oper.setReturnClass(WaitFeedbackStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "fe-wait-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetWaitingFeedbacksCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "feedback-count"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle-part"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "server-time"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLoginEnc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-hash-password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle-part"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "server-time"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLoginWithAccessToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "access-token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle-part"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "server-time"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyAccount2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "account-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAuctionID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfMyAccountList2"));
        oper.setReturnClass(allegroApi.MyAccountStruct2[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "myaccount-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyAccountItemsCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "account-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAuctionID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "myaccount-items-count"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyBilling");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "my-billing"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyBillingItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "option"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "entry-fees"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemBillingList"), ItemBilling[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ending-fees"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemBillingList"), ItemBilling[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyContact");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "auction-id-list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAuctionID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfMyContactList"));
        oper.setReturnClass(MyContactList[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "mycontact-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyFeedback2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAuctionID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfMyFeedbackList2"));
        oper.setReturnClass(allegroApi.MyFeedbackListStruct2[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "myfeedback-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyFeedback2Limit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAuctionID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "package-element"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfMyFeedbackList2"));
        oper.setReturnClass(allegroApi.MyFeedbackListStruct2[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "myfeedback-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doNewAuctionExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsValue"), allegroApi.FieldsValue[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-template-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-template-create"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemTemplateCreateStruct"), ItemTemplateCreateStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "variants"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfVariantStruct"), VariantStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tags"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTagNameStruct"), allegroApi.TagNameStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-info"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-is-allegro-standard"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doQueryAllSysStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSysStatus"));
        oper.setReturnClass(allegroApi.SysStatusType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "sys-country-status"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doQuerySysStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sysvar"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "info"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveFromBlackList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "users-id-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUsersID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBlackListResStruct"));
        oper.setReturnClass(allegroApi.BlackListResStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "black-list-result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveFromWatchList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-id-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemRemoveWatchStruct"));
        oper.setReturnClass(allegroApi.ItemRemoveWatchStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "watch-list-result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveItemTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-template-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTemplatesID"), int[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "RemovedItemTemplatesStruct"));
        oper.setReturnClass(allegroApi.RemovedItemTemplatesStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removed-item-templates"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestCancelBid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request-item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request-cancel-reason"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "request-value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestPayout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "RequestPayoutStruct"));
        oper.setReturnClass(RequestPayoutStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "request-payout"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestSurcharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "transaction-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "surcharge-value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "surcharge-message-to-buyer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "surcharge-result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSellSomeAgain");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-starting-time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-auction-duration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfLocalIds"), int[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-prolong-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-sell-again"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructSellAgain"), StructSellAgain[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-sell-failed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructSellFailed"), StructSellFailed[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-sell-not-found"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSellSomeAgainInShop");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-starting-time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-shop-duration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-shop-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-prolong-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-shop-category"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfLocalIds"), int[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-sell-again"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructSellAgain"), StructSellAgain[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-sell-failed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructSellFailed"), StructSellFailed[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-sell-not-found"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendEmailToUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mail-to-user-item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mail-to-user-receiver-id"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mail-to-user-subject-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mail-to-user-option"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mail-to-user-message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "mail-to-user-result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendPostBuyForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new-post-buy-form-seller"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfNewPostBuyFormSellerStruct"), allegroApi.NewPostBuyFormSellerStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new-post-buy-form-common"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "NewPostBuyFormCommonStruct"), allegroApi.NewPostBuyFormCommonStruct.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormStruct"));
        oper.setReturnClass(allegroApi.PostBuyFormStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "post-buy-form"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSetShipmentPriceType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "shipment-price-type-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "operation-result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSetUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "admin-session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-lic-login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-lic-country"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-lic-date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "set-date-value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowItemInfoExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-image-url"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-attribs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-postage-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-company-info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-product-info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-list-info-ext"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemInfoExt"), ItemInfoExt.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-cat-path"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemCatList"), ItemCatList[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-img-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemImageList"), allegroApi.ItemImageList[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-attrib-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAttribStruct"), AttribStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-postage-options"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostageStruct"), allegroApi.PostageStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-payment-options"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemPaymentOptions"), ItemPaymentOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-company-info"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanyInfoStruct"), allegroApi.CompanyInfoStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-product-info"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ProductStruct"), allegroApi.ProductStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-variants"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemVariantStruct"), allegroApi.ItemVariantStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-login"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-country"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-create-date"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-login-date"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-rating"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-is-new-user"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-not-activated"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-closed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-blocked"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-terminated"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-has-page"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-is-sseller"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-is-eco"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-positive-feedback"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ShowUserFeedbacks"), ShowUserFeedbacks.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-negative-feedback"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ShowUserFeedbacks"), ShowUserFeedbacks.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-neutral-feedback"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ShowUserFeedbacks"), ShowUserFeedbacks.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-junior-status"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-has-shop"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-company-icon"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-sell-rating-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-sell-rating-average"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingAverageStruct"), SellRatingAverageStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-is-allegro-standard"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-is-b2c-seller"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doVerifyItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-listed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-starting-time"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[114] = oper;

    }

    public AllegroWebApiBindingStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public AllegroWebApiBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public AllegroWebApiBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.1");
        Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
    }

    private void addBindings0() {
        Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ActionDataStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ActionDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "AddressesInfoStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.AddressInfoStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "AddressInfoStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "AddressInfoStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.AddressInfoStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "AddressUserDataStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.AddressUserDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "AlcoholDataStruct");
        cachedSerQNames.add(qName);
        cls = AlcoholDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "AmountStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.AmountStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfActionDataStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ActionDataStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ActionDataStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAttribStruct");
        cachedSerQNames.add(qName);
        cls = AttribStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "AttribStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAttribValues");
        cachedSerQNames.add(qName);
        cls = String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAuctionID");
        cachedSerQNames.add(qName);
        cls = long[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBankAccounts");
        cachedSerQNames.add(qName);
        cls = String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBidItemStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.BidItemStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BidItemStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBidList2");
        cachedSerQNames.add(qName);
        cls = allegroApi.BidListStruct2[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BidListStruct2");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBilling");
        cachedSerQNames.add(qName);
        cls = BillingDataType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BillingDataType");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBlackListResStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.BlackListResStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BlackListResStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBlackListStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.BlackListStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BlackListStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBuyerId");
        cachedSerQNames.add(qName);
        cls = long[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCancelBidsID");
        cachedSerQNames.add(qName);
        cls = int[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCategoryData");
        cachedSerQNames.add(qName);
        cls = allegroApi.CategoryData[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CategoryData");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCats");
        cachedSerQNames.add(qName);
        cls = allegroApi.CatInfoType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CatInfoType");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCountries");
        cachedSerQNames.add(qName);
        cls = allegroApi.CountryInfoType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CountryInfoType");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfDealsStruct");
        cachedSerQNames.add(qName);
        cls = DealsStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "DealsStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFavouritesCategories");
        cachedSerQNames.add(qName);
        cls = FavouritesCategoriesStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FavouritesCategoriesStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFavouritesSellers");
        cachedSerQNames.add(qName);
        cls = FavouritesSellersStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FavouritesSellersStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFeedbackList");
        cachedSerQNames.add(qName);
        cls = allegroApi.FeedbackList[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FeedbackList");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFeedbackManyStruct");
        cachedSerQNames.add(qName);
        cls = FeedbackManyStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FeedbackManyStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFeedbacksResult");
        cachedSerQNames.add(qName);
        cls = FeedbackResultStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FeedbackResultStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsId");
        cachedSerQNames.add(qName);
        cls = int[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsValue");
        cachedSerQNames.add(qName);
        cls = allegroApi.FieldsValue[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FieldsValue");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFilterOptionsType");
        cachedSerQNames.add(qName);
        cls = allegroApi.FilterOptionsType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FilterOptionsType");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFiltersListType");
        cachedSerQNames.add(qName);
        cls = allegroApi.FiltersListType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FiltersListType");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFilterValueType");
        cachedSerQNames.add(qName);
        cls = FilterValueType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FilterValueType");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFinishFailureStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.FinishFailureStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FinishFailureStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFinishItemsStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.FinishItemsStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FinishItemsStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFinishSuccessStruct");
        cachedSerQNames.add(qName);
        cls = long[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFutureItemStruct");
        cachedSerQNames.add(qName);
        cls = FutureItemStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FutureItemStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemCatList");
        cachedSerQNames.add(qName);
        cls = ItemCatList[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemCatList");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemGetImage");
        cachedSerQNames.add(qName);
        cls = ItemGetImage[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemGetImage");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemImageList");
        cachedSerQNames.add(qName);
        cls = allegroApi.ItemImageList[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemImageList");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemImagesStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ItemImagesStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemImagesStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemPriceStruct");
        cachedSerQNames.add(qName);
        cls = ItemPriceStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemPriceStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemReminderStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ItemReminderStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemReminderStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemRemoveWatchStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ItemRemoveWatchStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemRemoveWatchStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsAdded");
        cachedSerQNames.add(qName);
        cls = long[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID");
        cachedSerQNames.add(qName);
        cls = long[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsNotAddedStruct");
        cachedSerQNames.add(qName);
        cls = ItemsNotAddedStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemsNotAddedStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsPostBuyData");
        cachedSerQNames.add(qName);
        cls = allegroApi.ItemPostBuyDataStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemPostBuyDataStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemSurchargeStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ItemSurchargeStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemSurchargeStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemTemplateListStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ItemTemplateListStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemTemplateListStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemVariantAttributeStruct");
        cachedSerQNames.add(qName);
        cls = ItemVariantAttributeStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemVariantAttributeStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemVariantStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ItemVariantStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemVariantStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfLocalIds");
        cachedSerQNames.add(qName);
        cls = int[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfMyAccountList2");
        cachedSerQNames.add(qName);
        cls = allegroApi.MyAccountStruct2[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyAccountStruct2");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfMyContactList");
        cachedSerQNames.add(qName);
        cls = MyContactList[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyContactList");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfMyFeedbackList2");
        cachedSerQNames.add(qName);
        cls = allegroApi.MyFeedbackListStruct2[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyFeedbackListStruct2");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfNewPostBuyFormSellerStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.NewPostBuyFormSellerStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "NewPostBuyFormSellerStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfNotSoldItemStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.NotSoldItemStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "NotSoldItemStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfNotWonItemStruct");
        cachedSerQNames.add(qName);
        cls = NotWonItemStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "NotWonItemStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPackageIds");
        cachedSerQNames.add(qName);
        cls = String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPackageInfoStruct");
        cachedSerQNames.add(qName);
        cls = PackageInfoStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PackageInfoStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPaymentDetailsStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PaymentDetailsStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentDetailsStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPaymentItemsStruct");
        cachedSerQNames.add(qName);
        cls = PaymentItemsStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentItemsStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPaymentMethodStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PaymentMethodStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentMethodStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPaymentSellersStruct");
        cachedSerQNames.add(qName);
        cls = PaymentSellersStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentSellersStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostageStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PostageStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostageStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormDataStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PostBuyFormDataStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormDataStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormForBuyersDataStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PostBuyFormForBuyersDataStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormForBuyersDataStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormItemDealsStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PostBuyFormItemDealsStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormItemDealsStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormItemStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PostBuyFormItemStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormItemStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormSellersStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PostBuyFormSellersStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormSellersStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormShipmentTrackingStruct");
        cachedSerQNames.add(qName);
        cls = PostBuyFormShipmentTrackingStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormShipmentTrackingStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormSurcharges");
        cachedSerQNames.add(qName);
        cls = long[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyItemInfoStruct");
        cachedSerQNames.add(qName);
        cls = PostBuyItemInfoStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyItemInfoStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfProductImagesList");
        cachedSerQNames.add(qName);
        cls = String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfProductParametersGroupStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ProductParametersGroupStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ProductParametersGroupStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfProductParametersStruct");
        cachedSerQNames.add(qName);
        cls = ProductParametersStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ProductParametersStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfProductParameterValues");
        cachedSerQNames.add(qName);
        cls = String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRefundListType");
        cachedSerQNames.add(qName);
        cls = RefundListType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RefundListType");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRefundsDealsListType");
        cachedSerQNames.add(qName);
        cls = RefundsDealsListType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RefundsDealsListType");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRelatedItemStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.RelatedItemStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RelatedItemStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRelationAnd");
        cachedSerQNames.add(qName);
        cls = String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRelationExclude");
        cachedSerQNames.add(qName);
        cls = String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRelationOr");
        cachedSerQNames.add(qName);
        cls = String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellerShipmentDataStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.SellerShipmentDataStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellerShipmentDataStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellForms");
        cachedSerQNames.add(qName);
        cls = SellFormType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellFormType");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellItemStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.SellItemStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellItemStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingAveragePerMonth");
        cachedSerQNames.add(qName);
        cls = allegroApi.SellRatingAveragePerMonthStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingAveragePerMonthStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingAverageStruct");
        cachedSerQNames.add(qName);
        cls = SellRatingAverageStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingAverageStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingDetailStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.SellRatingDetailStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingDetailStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingEstimationStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.SellRatingEstimationStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingEstimationStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingInfoStruct");
        cachedSerQNames.add(qName);
        cls = SellRatingInfoStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingInfoStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingReasonStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.SellRatingReasonStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingReasonStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingReasonSumStruct");
        cachedSerQNames.add(qName);
        cls = SellRatingReasonSumStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingReasonSumStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingStatsStruct");
        cachedSerQNames.add(qName);
        cls = SellRatingStatsStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingStatsStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfShipmentDataStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ShipmentDataStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShipmentDataStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfShipmentIds");
        cachedSerQNames.add(qName);
        cls = long[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfShipmentPaymentInfoStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ShipmentPaymentInfoStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShipmentPaymentInfoStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfShipmentPriceTypeStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ShipmentPriceTypeStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShipmentPriceTypeStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfShopsTagTypeStruct");
        cachedSerQNames.add(qName);
        cls = ShopsTagTypeStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShopsTagTypeStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSiteJournalDealsStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.SiteJournalDealsStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalDealsStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    private void addBindings1() {
        Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSoldItemStruct");
        cachedSerQNames.add(qName);
        cls = SoldItemStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SoldItemStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStateInfoStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.StateInfoStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "StateInfoStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfString");
        cachedSerQNames.add(qName);
        cls = String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructItemInfoList");
        cachedSerQNames.add(qName);
        cls = allegroApi.ItemInfoStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemInfoStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructSellAgain");
        cachedSerQNames.add(qName);
        cls = StructSellAgain[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "StructSellAgain");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructSellFailed");
        cachedSerQNames.add(qName);
        cls = StructSellFailed[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "StructSellFailed");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSysStatus");
        cachedSerQNames.add(qName);
        cls = allegroApi.SysStatusType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SysStatusType");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTagNameStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.TagNameStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "TagNameStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTemplatesID");
        cachedSerQNames.add(qName);
        cls = int[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTransactionsID");
        cachedSerQNames.add(qName);
        cls = long[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserBlackListAddResultStruct");
        cachedSerQNames.add(qName);
        cls = UserBlackListAddResultStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserBlackListAddResultStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserBlackListStruct");
        cachedSerQNames.add(qName);
        cls = UserBlackListStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserBlackListStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserIncomingPaymentRefundsStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.UserIncomingPaymentRefundsStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserIncomingPaymentRefundsStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserIncomingPaymentStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.UserIncomingPaymentStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserIncomingPaymentStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserPaymentRefundsStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.UserPaymentRefundsStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPaymentRefundsStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserPaymentStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.UserPaymentStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPaymentStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserPayoutStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.UserPayoutStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPayoutStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUsersID");
        cachedSerQNames.add(qName);
        cls = long[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUsersPostBuyData");
        cachedSerQNames.add(qName);
        cls = allegroApi.UserPostBuyDataStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPostBuyDataStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfVariantQuantityStruct");
        cachedSerQNames.add(qName);
        cls = VariantQuantityStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "VariantQuantityStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfVariantStruct");
        cachedSerQNames.add(qName);
        cls = VariantStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "VariantStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfWaitFeedbackStruct");
        cachedSerQNames.add(qName);
        cls = WaitFeedbackStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "WaitFeedbackStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfWatchedItemStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.WatchedItemStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "WatchedItemStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfWatchItemStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.WatchItemStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "WatchItemStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfWonItemStruct");
        cachedSerQNames.add(qName);
        cls = WonItemStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "WonItemStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "AttribStruct");
        cachedSerQNames.add(qName);
        cls = AttribStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BidItemStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.BidItemStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BidList2");
        cachedSerQNames.add(qName);
        cls = String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BidListStruct2");
        cachedSerQNames.add(qName);
        cls = allegroApi.BidListStruct2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BillingDataType");
        cachedSerQNames.add(qName);
        cls = BillingDataType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BlackListResStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.BlackListResStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BlackListStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.BlackListStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CategoryData");
        cachedSerQNames.add(qName);
        cls = allegroApi.CategoryData.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CatInfoType");
        cachedSerQNames.add(qName);
        cls = allegroApi.CatInfoType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ChangedItemStruct");
        cachedSerQNames.add(qName);
        cls = ChangedItemStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanyExtraDataStruct");
        cachedSerQNames.add(qName);
        cls = CompanyExtraDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanyInfoStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.CompanyInfoStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanySecondAddressStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.CompanySecondAddressStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CountryInfoType");
        cachedSerQNames.add(qName);
        cls = allegroApi.CountryInfoType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CreatedItemTemplateStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.CreatedItemTemplateStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "DealsStruct");
        cachedSerQNames.add(qName);
        cls = DealsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "DurationInfoStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.DurationInfoStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FavouritesCategoriesStruct");
        cachedSerQNames.add(qName);
        cls = FavouritesCategoriesStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FavouritesSellersStruct");
        cachedSerQNames.add(qName);
        cls = FavouritesSellersStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FeedbackList");
        cachedSerQNames.add(qName);
        cls = allegroApi.FeedbackList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FeedbackManyStruct");
        cachedSerQNames.add(qName);
        cls = FeedbackManyStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FeedbackResultStruct");
        cachedSerQNames.add(qName);
        cls = FeedbackResultStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FieldsValue");
        cachedSerQNames.add(qName);
        cls = allegroApi.FieldsValue.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FilledPostBuyFormsStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.FilledPostBuyFormsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FilterOptionsType");
        cachedSerQNames.add(qName);
        cls = allegroApi.FilterOptionsType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FilterPriceStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.FilterPriceStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FilterRelationType");
        cachedSerQNames.add(qName);
        cls = allegroApi.FilterRelationType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FiltersListType");
        cachedSerQNames.add(qName);
        cls = allegroApi.FiltersListType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FilterValueType");
        cachedSerQNames.add(qName);
        cls = FilterValueType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FinishFailureStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.FinishFailureStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FinishItemsStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.FinishItemsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FulfillmentTimeStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.FulfillmentTimeStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FutureFilterOptionsStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.FutureFilterOptionsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FutureItemStruct");
        cachedSerQNames.add(qName);
        cls = FutureItemStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "InvoiceDataStruct");
        cachedSerQNames.add(qName);
        cls = InvoiceDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "InvoiceInfoStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.InvoiceInfoStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemBilling");
        cachedSerQNames.add(qName);
        cls = ItemBilling.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemBillingList");
        cachedSerQNames.add(qName);
        cls = ItemBilling[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemBilling");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemCatList");
        cachedSerQNames.add(qName);
        cls = ItemCatList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemDescriptionStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ItemDescriptionStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemGetImage");
        cachedSerQNames.add(qName);
        cls = ItemGetImage.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemImageList");
        cachedSerQNames.add(qName);
        cls = allegroApi.ItemImageList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemImagesStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ItemImagesStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemInfo");
        cachedSerQNames.add(qName);
        cls = ItemInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemInfoExt");
        cachedSerQNames.add(qName);
        cls = ItemInfoExt.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemInfoStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ItemInfoStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemPaymentOptions");
        cachedSerQNames.add(qName);
        cls = ItemPaymentOptions.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemPostBuyDataStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ItemPostBuyDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemPriceStruct");
        cachedSerQNames.add(qName);
        cls = ItemPriceStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemReminderStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ItemReminderStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemRemoveWatchStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ItemRemoveWatchStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemsNotAddedStruct");
        cachedSerQNames.add(qName);
        cls = ItemsNotAddedStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemSurchargeStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ItemSurchargeStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemTemplateCreateStruct");
        cachedSerQNames.add(qName);
        cls = ItemTemplateCreateStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemTemplateListStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ItemTemplateListStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemTemplatesStruct");
        cachedSerQNames.add(qName);
        cls = ItemTemplatesStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemVariantAttributeStruct");
        cachedSerQNames.add(qName);
        cls = ItemVariantAttributeStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemVariantStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ItemVariantStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MessageToBuyerStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.MessageToBuyerStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyAccountList2");
        cachedSerQNames.add(qName);
        cls = String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyAccountStruct2");
        cachedSerQNames.add(qName);
        cls = allegroApi.MyAccountStruct2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyContactList");
        cachedSerQNames.add(qName);
        cls = MyContactList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyFeedbackList2");
        cachedSerQNames.add(qName);
        cls = String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyFeedbackListStruct2");
        cachedSerQNames.add(qName);
        cls = allegroApi.MyFeedbackListStruct2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "NewPostBuyFormCommonStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.NewPostBuyFormCommonStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "NewPostBuyFormSellerStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.NewPostBuyFormSellerStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "NotSoldFilterOptionsStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.NotSoldFilterOptionsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "NotSoldItemStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.NotSoldItemStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "NotWonItemStruct");
        cachedSerQNames.add(qName);
        cls = NotWonItemStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PackageInfoStruct");
        cachedSerQNames.add(qName);
        cls = PackageInfoStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentDetailsStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PaymentDetailsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentItemsStruct");
        cachedSerQNames.add(qName);
        cls = PaymentItemsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentMethodStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PaymentMethodStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentSellersStruct");
        cachedSerQNames.add(qName);
        cls = PaymentSellersStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentsInfoStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PaymentsInfoStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    private void addBindings2() {
        Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentsPayoutStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PaymentsPayoutStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentsUserDataStruct");
        cachedSerQNames.add(qName);
        cls = PaymentsUserDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PayoutAutoFrequencyStruct");
        cachedSerQNames.add(qName);
        cls = PayoutAutoFrequencyStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PayoutAutoSettingsStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PayoutAutoSettingsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PharmacyDataStruct");
        cachedSerQNames.add(qName);
        cls = PharmacyDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PharmacyRecipientDataStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PharmacyRecipientDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostageStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PostageStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormAddressStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PostBuyFormAddressStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormDataStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PostBuyFormDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormForBuyersDataStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PostBuyFormForBuyersDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormItemDealsStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PostBuyFormItemDealsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormItemDealsVariantStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PostBuyFormItemDealsVariantStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormItemStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PostBuyFormItemStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormPackageInfoStruct");
        cachedSerQNames.add(qName);
        cls = PostBuyFormPackageInfoStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormSellersStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PostBuyFormSellersStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormShipmentTrackingStruct");
        cachedSerQNames.add(qName);
        cls = PostBuyFormShipmentTrackingStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.PostBuyFormStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyItemInfoStruct");
        cachedSerQNames.add(qName);
        cls = PostBuyItemInfoStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ProductParametersGroupStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ProductParametersGroupStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ProductParametersStruct");
        cachedSerQNames.add(qName);
        cls = ProductParametersStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ProductStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ProductStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RangeDateValueStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.RangeDateValueStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RangeFloatValueStruct");
        cachedSerQNames.add(qName);
        cls = RangeFloatValueStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RangeIntValueStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.RangeIntValueStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RangeValueType");
        cachedSerQNames.add(qName);
        cls = RangeValueType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RefundDetailsType");
        cachedSerQNames.add(qName);
        cls = allegroApi.RefundDetailsType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RefundListType");
        cachedSerQNames.add(qName);
        cls = RefundListType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RefundsDealsListType");
        cachedSerQNames.add(qName);
        cls = RefundsDealsListType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RelatedItemsShipmentDataStruct");
        cachedSerQNames.add(qName);
        cls = RelatedItemsShipmentDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RelatedItemsStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.RelatedItemsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RelatedItemStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.RelatedItemStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RelatedPersonsStruct");
        cachedSerQNames.add(qName);
        cls = RelatedPersonsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RemovedItemTemplatesStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.RemovedItemTemplatesStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RequestPayoutStruct");
        cachedSerQNames.add(qName);
        cls = RequestPayoutStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellerPaymentInfoStruct");
        cachedSerQNames.add(qName);
        cls = SellerPaymentInfoStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellerShipmentDataStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.SellerShipmentDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellFilterOptionsStruct");
        cachedSerQNames.add(qName);
        cls = SellFilterOptionsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellFormFieldsForCategoryStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.SellFormFieldsForCategoryStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellFormType");
        cachedSerQNames.add(qName);
        cls = SellFormType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellItemStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.SellItemStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingAveragePerMonthStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.SellRatingAveragePerMonthStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingAverageStruct");
        cachedSerQNames.add(qName);
        cls = SellRatingAverageStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingDetailStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.SellRatingDetailStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingEstimationStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.SellRatingEstimationStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingInfoStruct");
        cachedSerQNames.add(qName);
        cls = SellRatingInfoStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingReasonStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.SellRatingReasonStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingReasonSumStruct");
        cachedSerQNames.add(qName);
        cls = SellRatingReasonSumStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingStatsStruct");
        cachedSerQNames.add(qName);
        cls = SellRatingStatsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShipmentDataStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ShipmentDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShipmentPaymentInfoStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ShipmentPaymentInfoStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShipmentPriceTypeStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ShipmentPriceTypeStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShipmentTimeStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.ShipmentTimeStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShopsTagTypeStruct");
        cachedSerQNames.add(qName);
        cls = ShopsTagTypeStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShowUserFeedbacks");
        cachedSerQNames.add(qName);
        cls = ShowUserFeedbacks.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournal");
        cachedSerQNames.add(qName);
        cls = allegroApi.SiteJournal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalArray");
        cachedSerQNames.add(qName);
        cls = allegroApi.SiteJournal[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournal");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalDealsInfoStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.SiteJournalDealsInfoStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalDealsStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.SiteJournalDealsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalInfo");
        cachedSerQNames.add(qName);
        cls = allegroApi.SiteJournalInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SoldFilterOptionsStruct");
        cachedSerQNames.add(qName);
        cls = SoldFilterOptionsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SoldItemStruct");
        cachedSerQNames.add(qName);
        cls = SoldItemStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SortOptionsStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.SortOptionsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "StateInfoStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.StateInfoStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "StructSellAgain");
        cachedSerQNames.add(qName);
        cls = StructSellAgain.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "StructSellFailed");
        cachedSerQNames.add(qName);
        cls = StructSellFailed.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SysStatusType");
        cachedSerQNames.add(qName);
        cls = allegroApi.SysStatusType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "TagNameStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.TagNameStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "TransactionPayByLinkStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.TransactionPayByLinkStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserBlackListAddResultStruct");
        cachedSerQNames.add(qName);
        cls = UserBlackListAddResultStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserBlackListStruct");
        cachedSerQNames.add(qName);
        cls = UserBlackListStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserDataStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.UserDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserIncomingPaymentRefundsStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.UserIncomingPaymentRefundsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserIncomingPaymentStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.UserIncomingPaymentStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserInfoStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.UserInfoStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPaymentRefundsStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.UserPaymentRefundsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPaymentStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.UserPaymentStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPayoutStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.UserPayoutStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPostBuyDataStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.UserPostBuyDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserSentToDataStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.UserSentToDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "VariantQuantityStruct");
        cachedSerQNames.add(qName);
        cls = VariantQuantityStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "VariantStruct");
        cachedSerQNames.add(qName);
        cls = VariantStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "WaitFeedbackStruct");
        cachedSerQNames.add(qName);
        cls = WaitFeedbackStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "WatchedItemStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.WatchedItemStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "WatchItemStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.WatchItemStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "WatchListInfoStruct");
        cachedSerQNames.add(qName);
        cls = allegroApi.WatchListInfoStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "WonItemStruct");
        cachedSerQNames.add(qName);
        cls = WonItemStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                    cachedSerFactories.get(i);
                            Class df = (Class)
                                    cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        } else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                    cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                    cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        } catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void doAddDescToItems(String sessionHandle, long[] itemsIdArray, String itDescription, allegroApi.holders.ArrayOfItemsIDHolder arrayItemsAddId, allegroApi.holders.ArrayOfItemsIDHolder arrayItemsDescToLong, allegroApi.holders.ArrayOfItemsIDHolder arrayItemsNotFound) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doadddesctoitems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doAddDescToItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, itemsIdArray, itDescription});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    arrayItemsAddId.value = (long[]) _output.get(new javax.xml.namespace.QName("", "array-items-add-id"));
                } catch (Exception _exception) {
                    arrayItemsAddId.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array-items-add-id")), long[].class);
                }
                try {
                    arrayItemsDescToLong.value = (long[]) _output.get(new javax.xml.namespace.QName("", "array-items-desc-to-long"));
                } catch (Exception _exception) {
                    arrayItemsDescToLong.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array-items-desc-to-long")), long[].class);
                }
                try {
                    arrayItemsNotFound.value = (long[]) _output.get(new javax.xml.namespace.QName("", "array-items-not-found"));
                } catch (Exception _exception) {
                    arrayItemsNotFound.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array-items-not-found")), long[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public PostBuyFormPackageInfoStruct doAddPackageInfoToPostBuyForm(String sessionId, long transactionId, PackageInfoStruct[] packageInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doaddpackageinfotopostbuyform");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doAddPackageInfoToPostBuyForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, new Long(transactionId), packageInfo});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (PostBuyFormPackageInfoStruct) _resp;
                } catch (Exception _exception) {
                    return (PostBuyFormPackageInfoStruct) org.apache.axis.utils.JavaUtils.convert(_resp, PostBuyFormPackageInfoStruct.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public UserBlackListAddResultStruct[] doAddToBlackList(String sessionHandle, UserBlackListStruct[] usersBlackListArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doaddtoblacklist");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doAddToBlackList"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, usersBlackListArray});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (UserBlackListAddResultStruct[]) _resp;
                } catch (Exception _exception) {
                    return (UserBlackListAddResultStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, UserBlackListAddResultStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.WatchListInfoStruct doAddToWatchList(String sessionId, long[] itemIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doaddtowatchlist");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doAddToWatchList"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, itemIds});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.WatchListInfoStruct) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.WatchListInfoStruct) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.WatchListInfoStruct.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String doBidItem(String sessionHandle, long bidItId, float bidUserPrice, long bidQuantity, long bidBuyNow, allegroApi.PharmacyRecipientDataStruct pharmacyRecipientData, String variantId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dobiditem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doBidItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Long(bidItId), new Float(bidUserPrice), new Long(bidQuantity), new Long(bidBuyNow), pharmacyRecipientData, variantId});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doCancelBidItem(String sessionHandle, long cancelItemId, int[] cancelBidsArray, String cancelBidsReason, long cancelAddToBlackList, javax.xml.rpc.holders.IntHolder cancelBidValue, allegroApi.holders.ArrayOfCancelBidsIDHolder cancelledBids, allegroApi.holders.ArrayOfCancelBidsIDHolder notCancelledBids) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#docancelbiditem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doCancelBidItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Long(cancelItemId), cancelBidsArray, cancelBidsReason, new Long(cancelAddToBlackList)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    cancelBidValue.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "cancel-bid-value"))).intValue();
                } catch (Exception _exception) {
                    cancelBidValue.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cancel-bid-value")), int.class)).intValue();
                }
                try {
                    cancelledBids.value = (int[]) _output.get(new javax.xml.namespace.QName("", "cancelled-bids"));
                } catch (Exception _exception) {
                    cancelledBids.value = (int[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cancelled-bids")), int[].class);
                }
                try {
                    notCancelledBids.value = (int[]) _output.get(new javax.xml.namespace.QName("", "not-cancelled-bids"));
                } catch (Exception _exception) {
                    notCancelledBids.value = (int[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "not-cancelled-bids")), int[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doCancelTransaction(String sessionId, long transactionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#docanceltransaction");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doCancelTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, new Long(transactionId)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ChangedItemStruct doChangeItemFields(String sessionId, long itemId, allegroApi.FieldsValue[] fieldsToModify, int[] fieldsToRemove, int previewOnly, VariantStruct[] variants, allegroApi.TagNameStruct[] tags) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dochangeitemfields");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doChangeItemFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, new Long(itemId), fieldsToModify, fieldsToRemove, new Integer(previewOnly), variants, tags});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ChangedItemStruct) _resp;
                } catch (Exception _exception) {
                    return (ChangedItemStruct) org.apache.axis.utils.JavaUtils.convert(_resp, ChangedItemStruct.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String doChangePriceItem(String sessionHandle, javax.xml.rpc.holders.LongHolder itemId, float newStartingPrice, float newReservePrice, float newBuyNowPrice) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dochangepriceitem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doChangePriceItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Long(itemId.value), new Float(newStartingPrice), new Float(newReservePrice), new Float(newBuyNowPrice)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    itemId.value = ((Long) _output.get(new javax.xml.namespace.QName("", "item-id"))).longValue();
                } catch (Exception _exception) {
                    itemId.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-id")), long.class)).longValue();
                }
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doChangeQuantityItem(String sessionHandle, javax.xml.rpc.holders.LongHolder itemId, int newItemQuantity, javax.xml.rpc.holders.StringHolder itemInfo, javax.xml.rpc.holders.IntHolder itemQuantityLeft, javax.xml.rpc.holders.IntHolder itemQuantitySold) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dochangequantityitem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doChangeQuantityItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Long(itemId.value), new Integer(newItemQuantity)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    itemId.value = ((Long) _output.get(new javax.xml.namespace.QName("", "item-id"))).longValue();
                } catch (Exception _exception) {
                    itemId.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-id")), long.class)).longValue();
                }
                try {
                    itemInfo.value = (String) _output.get(new javax.xml.namespace.QName("", "item-info"));
                } catch (Exception _exception) {
                    itemInfo.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-info")), String.class);
                }
                try {
                    itemQuantityLeft.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "item-quantity-left"))).intValue();
                } catch (Exception _exception) {
                    itemQuantityLeft.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-quantity-left")), int.class)).intValue();
                }
                try {
                    itemQuantitySold.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "item-quantity-sold"))).intValue();
                } catch (Exception _exception) {
                    itemQuantitySold.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-quantity-sold")), int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.ItemDescriptionStruct doCheckItemDescription(String sessionId, String descriptionContent) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#docheckitemdescription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doCheckItemDescription"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, descriptionContent});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.ItemDescriptionStruct) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.ItemDescriptionStruct) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.ItemDescriptionStruct.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doCheckNewAuctionExt(String sessionHandle, allegroApi.FieldsValue[] fields, VariantStruct[] variants, allegroApi.TagNameStruct[] tags, javax.xml.rpc.holders.StringHolder itemPrice, javax.xml.rpc.holders.StringHolder itemPriceDesc, javax.xml.rpc.holders.IntHolder itemIsAllegroStandard) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dochecknewauctionext");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doCheckNewAuctionExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, fields, variants, tags});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    itemPrice.value = (String) _output.get(new javax.xml.namespace.QName("", "item-price"));
                } catch (Exception _exception) {
                    itemPrice.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-price")), String.class);
                }
                try {
                    itemPriceDesc.value = (String) _output.get(new javax.xml.namespace.QName("", "item-price-desc"));
                } catch (Exception _exception) {
                    itemPriceDesc.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-price-desc")), String.class);
                }
                try {
                    itemIsAllegroStandard.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "item-is-allegro-standard"))).intValue();
                } catch (Exception _exception) {
                    itemIsAllegroStandard.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-is-allegro-standard")), int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.CreatedItemTemplateStruct doCreateItemTemplate(String sessionId, String itemTemplateName, allegroApi.FieldsValue[] itemTemplateFields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#docreateitemtemplate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doCreateItemTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, itemTemplateName, itemTemplateFields});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.CreatedItemTemplateStruct) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.CreatedItemTemplateStruct) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.CreatedItemTemplateStruct.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doFeedback(String sessionHandle, long feItemId, int feUseCommentTemplate, int feToUserId, String feComment, String feCommentType, int feOp, allegroApi.SellRatingEstimationStruct[] feRating) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dofeedback");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doFeedback"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Long(feItemId), new Integer(feUseCommentTemplate), new Integer(feToUserId), feComment, feCommentType, new Integer(feOp), feRating});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public FeedbackResultStruct[] doFeedbackMany(String sessionHandle, FeedbackManyStruct[] feedbacksList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dofeedbackmany");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doFeedbackMany"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, feedbacksList});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (FeedbackResultStruct[]) _resp;
                } catch (Exception _exception) {
                    return (FeedbackResultStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, FeedbackResultStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doFinishItem(String sessionHandle, long finishItemId, int finishCancelAllBids, String finishCancelReason) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dofinishitem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doFinishItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Long(finishItemId), new Integer(finishCancelAllBids), finishCancelReason});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doFinishItems(String sessionHandle, allegroApi.FinishItemsStruct[] finishItemsList, allegroApi.holders.ArrayOfFinishSuccessStructHolder finishItemsSucceed, allegroApi.holders.ArrayOfFinishFailureStructHolder finishItemsFailed) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dofinishitems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doFinishItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, finishItemsList});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    finishItemsSucceed.value = (long[]) _output.get(new javax.xml.namespace.QName("", "finish-items-succeed"));
                } catch (Exception _exception) {
                    finishItemsSucceed.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "finish-items-succeed")), long[].class);
                }
                try {
                    finishItemsFailed.value = (allegroApi.FinishFailureStruct[]) _output.get(new javax.xml.namespace.QName("", "finish-items-failed"));
                } catch (Exception _exception) {
                    finishItemsFailed.value = (allegroApi.FinishFailureStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "finish-items-failed")), allegroApi.FinishFailureStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public float doGetAdminUserLicenceDate(String adminSessionHandle, String userLicLogin) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetadminuserlicencedate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetAdminUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{adminSessionHandle, userLicLogin});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Float) _resp).floatValue();
                } catch (Exception _exception) {
                    return ((Float) org.apache.axis.utils.JavaUtils.convert(_resp, float.class)).floatValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.BidListStruct2[] doGetBidItem2(String sessionHandle, long itemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetbiditem2");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetBidItem2"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Long(itemId)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.BidListStruct2[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.BidListStruct2[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.BidListStruct2[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.BlackListStruct[] doGetBlackListUsers(String sessionHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetblacklistusers");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetBlackListUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.BlackListStruct[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.BlackListStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.BlackListStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.CategoryData[] doGetCategoryPath(String sessionId, int categoryId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetcategorypath");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetCategoryPath"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, new Integer(categoryId)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.CategoryData[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.CategoryData[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.CategoryData[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetCatsData(int countryId, long localVersion, String webapiKey, allegroApi.holders.ArrayOfCatsHolder catsList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetcatsdata");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetCatsData"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(countryId), new Long(localVersion), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    catsList.value = (allegroApi.CatInfoType[]) _output.get(new javax.xml.namespace.QName("", "cats-list"));
                } catch (Exception _exception) {
                    catsList.value = (allegroApi.CatInfoType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cats-list")), allegroApi.CatInfoType[].class);
                }
                try {
                    verKey.value = ((Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
                } catch (Exception _exception) {
                    verKey.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
                }
                try {
                    verStr.value = (String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
                } catch (Exception _exception) {
                    verStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetCatsDataCount(int countryId, long localVersion, String webapiKey, javax.xml.rpc.holders.IntHolder catsCount, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetcatsdatacount");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetCatsDataCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(countryId), new Long(localVersion), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    catsCount.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "cats-count"))).intValue();
                } catch (Exception _exception) {
                    catsCount.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cats-count")), int.class)).intValue();
                }
                try {
                    verKey.value = ((Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
                } catch (Exception _exception) {
                    verKey.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
                }
                try {
                    verStr.value = (String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
                } catch (Exception _exception) {
                    verStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetCatsDataLimit(int countryId, long localVersion, String webapiKey, int offset, int packageElement, allegroApi.holders.ArrayOfCatsHolder catsList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetcatsdatalimit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetCatsDataLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(countryId), new Long(localVersion), webapiKey, new Integer(offset), new Integer(packageElement)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    catsList.value = (allegroApi.CatInfoType[]) _output.get(new javax.xml.namespace.QName("", "cats-list"));
                } catch (Exception _exception) {
                    catsList.value = (allegroApi.CatInfoType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cats-list")), allegroApi.CatInfoType[].class);
                }
                try {
                    verKey.value = ((Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
                } catch (Exception _exception) {
                    verKey.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
                }
                try {
                    verStr.value = (String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
                } catch (Exception _exception) {
                    verStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.CountryInfoType[] doGetCountries(int countryCode, String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetcountries");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetCountries"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(countryCode), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.CountryInfoType[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.CountryInfoType[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.CountryInfoType[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public DealsStruct[] doGetDeals(String sessionHandle, long itemId, int buyerId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetdeals");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Long(itemId), new Integer(buyerId)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (DealsStruct[]) _resp;
                } catch (Exception _exception) {
                    return (DealsStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, DealsStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public FavouritesCategoriesStruct[] doGetFavouriteCategories(String sessionHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetfavouritecategories");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetFavouriteCategories"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (FavouritesCategoriesStruct[]) _resp;
                } catch (Exception _exception) {
                    return (FavouritesCategoriesStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, FavouritesCategoriesStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public FavouritesSellersStruct[] doGetFavouriteSellers(String sessionHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetfavouritesellers");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetFavouriteSellers"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (FavouritesSellersStruct[]) _resp;
                } catch (Exception _exception) {
                    return (FavouritesSellersStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, FavouritesSellersStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetFeedback(String sessionHandle, int feedbackFrom, int feedbackTo, int feedbackOffset, String feedbackKindList, allegroApi.holders.ArrayOfFeedbackListHolder feedbackList, javax.xml.rpc.holders.IntHolder feedbackCount) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetfeedback");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetFeedback"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Integer(feedbackFrom), new Integer(feedbackTo), new Integer(feedbackOffset), feedbackKindList});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    feedbackList.value = (allegroApi.FeedbackList[]) _output.get(new javax.xml.namespace.QName("", "feedback-list"));
                } catch (Exception _exception) {
                    feedbackList.value = (allegroApi.FeedbackList[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "feedback-list")), allegroApi.FeedbackList[].class);
                }
                try {
                    feedbackCount.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "feedback-count"))).intValue();
                } catch (Exception _exception) {
                    feedbackCount.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "feedback-count")), int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.FilledPostBuyFormsStruct doGetFilledPostBuyForms(String sessionId, int paymentType, int userRole, long fillingTimeFrom, long fillingTimeTo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetfilledpostbuyforms");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetFilledPostBuyForms"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, new Integer(paymentType), new Integer(userRole), new Long(fillingTimeFrom), new Long(fillingTimeTo)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.FilledPostBuyFormsStruct) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.FilledPostBuyFormsStruct) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.FilledPostBuyFormsStruct.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.FieldsValue[] doGetItemFields(String sessionId, long itemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetitemfields");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetItemFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, new Long(itemId)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.FieldsValue[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.FieldsValue[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.FieldsValue[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ItemTemplatesStruct doGetItemTemplates(String sessionId, int[] itemTemplateIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetitemtemplates");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetItemTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, itemTemplateIds});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ItemTemplatesStruct) _resp;
                } catch (Exception _exception) {
                    return (ItemTemplatesStruct) org.apache.axis.utils.JavaUtils.convert(_resp, ItemTemplatesStruct.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.ItemImagesStruct[] doGetItemsImages(String sessionHandle, ItemGetImage[] itemsArray, int imageType) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetitemsimages");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetItemsImages"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, itemsArray, new Integer(imageType)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.ItemImagesStruct[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.ItemImagesStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.ItemImagesStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetItemsInfo(String sessionHandle, long[] itemsIdArray, int getDesc, int getImageUrl, int getAttribs, int getPostageOptions, int getCompanyInfo, int getProductInfo, allegroApi.holders.ArrayOfStructItemInfoListHolder arrayItemListInfo, allegroApi.holders.ArrayOfItemsIDHolder arrayItemsNotFound, allegroApi.holders.ArrayOfItemsIDHolder arrayItemsAdminKilled) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetitemsinfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetItemsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, itemsIdArray, new Integer(getDesc), new Integer(getImageUrl), new Integer(getAttribs), new Integer(getPostageOptions), new Integer(getCompanyInfo), new Integer(getProductInfo)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    arrayItemListInfo.value = (allegroApi.ItemInfoStruct[]) _output.get(new javax.xml.namespace.QName("", "array-item-list-info"));
                } catch (Exception _exception) {
                    arrayItemListInfo.value = (allegroApi.ItemInfoStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array-item-list-info")), allegroApi.ItemInfoStruct[].class);
                }
                try {
                    arrayItemsNotFound.value = (long[]) _output.get(new javax.xml.namespace.QName("", "array-items-not-found"));
                } catch (Exception _exception) {
                    arrayItemsNotFound.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array-items-not-found")), long[].class);
                }
                try {
                    arrayItemsAdminKilled.value = (long[]) _output.get(new javax.xml.namespace.QName("", "array-items-admin-killed"));
                } catch (Exception _exception) {
                    arrayItemsAdminKilled.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array-items-admin-killed")), long[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.MessageToBuyerStruct doGetMessageToBuyer(String sessionId, long itemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmessagetobuyer");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMessageToBuyer"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, new Long(itemId)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.MessageToBuyerStruct) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.MessageToBuyerStruct) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.MessageToBuyerStruct.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.AddressInfoStruct[] doGetMyAddresses(String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmyaddresses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyAddresses"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.AddressInfoStruct[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.AddressInfoStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.AddressInfoStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetMyBidItems(String sessionId, allegroApi.SortOptionsStruct sortOptions, String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder bidItemsCounter, allegroApi.holders.ArrayOfBidItemStructHolder bidItemsList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmybiditems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyBidItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, sortOptions, searchValue, new Integer(categoryId), itemIds, new Integer(pageSize), new Integer(pageNumber)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    bidItemsCounter.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "bid-items-counter"))).intValue();
                } catch (Exception _exception) {
                    bidItemsCounter.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "bid-items-counter")), int.class)).intValue();
                }
                try {
                    bidItemsList.value = (allegroApi.BidItemStruct[]) _output.get(new javax.xml.namespace.QName("", "bid-items-list"));
                } catch (Exception _exception) {
                    bidItemsList.value = (allegroApi.BidItemStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "bid-items-list")), allegroApi.BidItemStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doGetMyCurrentShipmentPriceType(String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmycurrentshipmentpricetype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyCurrentShipmentPriceType"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetMyData(String sessionHandle, allegroApi.holders.UserDataStructHolder userData, allegroApi.holders.InvoiceDataStructHolder invoiceData, allegroApi.holders.CompanyExtraDataStructHolder companyExtraData, allegroApi.holders.CompanySecondAddressStructHolder companySecondAddress, allegroApi.holders.PharmacyDataStructHolder pharmacyData, allegroApi.holders.AlcoholDataStructHolder alcoholData, allegroApi.holders.RelatedPersonsStructHolder relatedPersons) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmydata");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyData"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    userData.value = (allegroApi.UserDataStruct) _output.get(new javax.xml.namespace.QName("", "user-data"));
                } catch (Exception _exception) {
                    userData.value = (allegroApi.UserDataStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-data")), allegroApi.UserDataStruct.class);
                }
                try {
                    invoiceData.value = (InvoiceDataStruct) _output.get(new javax.xml.namespace.QName("", "invoice-data"));
                } catch (Exception _exception) {
                    invoiceData.value = (InvoiceDataStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "invoice-data")), InvoiceDataStruct.class);
                }
                try {
                    companyExtraData.value = (CompanyExtraDataStruct) _output.get(new javax.xml.namespace.QName("", "company-extra-data"));
                } catch (Exception _exception) {
                    companyExtraData.value = (CompanyExtraDataStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "company-extra-data")), CompanyExtraDataStruct.class);
                }
                try {
                    companySecondAddress.value = (allegroApi.CompanySecondAddressStruct) _output.get(new javax.xml.namespace.QName("", "company-second-address"));
                } catch (Exception _exception) {
                    companySecondAddress.value = (allegroApi.CompanySecondAddressStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "company-second-address")), allegroApi.CompanySecondAddressStruct.class);
                }
                try {
                    pharmacyData.value = (PharmacyDataStruct) _output.get(new javax.xml.namespace.QName("", "pharmacy-data"));
                } catch (Exception _exception) {
                    pharmacyData.value = (PharmacyDataStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "pharmacy-data")), PharmacyDataStruct.class);
                }
                try {
                    alcoholData.value = (AlcoholDataStruct) _output.get(new javax.xml.namespace.QName("", "alcohol-data"));
                } catch (Exception _exception) {
                    alcoholData.value = (AlcoholDataStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "alcohol-data")), AlcoholDataStruct.class);
                }
                try {
                    relatedPersons.value = (RelatedPersonsStruct) _output.get(new javax.xml.namespace.QName("", "related-persons"));
                } catch (Exception _exception) {
                    relatedPersons.value = (RelatedPersonsStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "related-persons")), RelatedPersonsStruct.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetMyFutureItems(String sessionId, allegroApi.SortOptionsStruct sortOptions, allegroApi.FutureFilterOptionsStruct filterOptions, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder futureItemsCounter, allegroApi.holders.ArrayOfFutureItemStructHolder futureItemsList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmyfutureitems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyFutureItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, sortOptions, filterOptions, new Integer(categoryId), itemIds, new Integer(pageSize), new Integer(pageNumber)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    futureItemsCounter.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "future-items-counter"))).intValue();
                } catch (Exception _exception) {
                    futureItemsCounter.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "future-items-counter")), int.class)).intValue();
                }
                try {
                    futureItemsList.value = (FutureItemStruct[]) _output.get(new javax.xml.namespace.QName("", "future-items-list"));
                } catch (Exception _exception) {
                    futureItemsList.value = (FutureItemStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "future-items-list")), FutureItemStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.UserIncomingPaymentStruct[] doGetMyIncomingPayments(String sessionHandle, int buyerId, long itemId, long transRecvDateFrom, long transRecvDateTo, int transPageLimit, int transOffset, int strictedSearch) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmyincomingpayments");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyIncomingPayments"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Integer(buyerId), new Long(itemId), new Long(transRecvDateFrom), new Long(transRecvDateTo), new Integer(transPageLimit), new Integer(transOffset), new Integer(strictedSearch)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.UserIncomingPaymentStruct[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.UserIncomingPaymentStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.UserIncomingPaymentStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.UserIncomingPaymentRefundsStruct[] doGetMyIncomingPaymentsRefunds(String sessionHandle, int buyerId, long itemId, int limit, int offset) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmyincomingpaymentsrefunds");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyIncomingPaymentsRefunds"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Integer(buyerId), new Long(itemId), new Integer(limit), new Integer(offset)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.UserIncomingPaymentRefundsStruct[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.UserIncomingPaymentRefundsStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.UserIncomingPaymentRefundsStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetMyNotSoldItems(String sessionId, allegroApi.SortOptionsStruct sortOptions, allegroApi.NotSoldFilterOptionsStruct filterOptions, String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder notSoldItemsCounter, allegroApi.holders.ArrayOfNotSoldItemStructHolder notSoldItemsList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmynotsolditems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyNotSoldItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, sortOptions, filterOptions, searchValue, new Integer(categoryId), itemIds, new Integer(pageSize), new Integer(pageNumber)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    notSoldItemsCounter.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "not-sold-items-counter"))).intValue();
                } catch (Exception _exception) {
                    notSoldItemsCounter.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "not-sold-items-counter")), int.class)).intValue();
                }
                try {
                    notSoldItemsList.value = (allegroApi.NotSoldItemStruct[]) _output.get(new javax.xml.namespace.QName("", "not-sold-items-list"));
                } catch (Exception _exception) {
                    notSoldItemsList.value = (allegroApi.NotSoldItemStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "not-sold-items-list")), allegroApi.NotSoldItemStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetMyNotWonItems(String sessionId, allegroApi.SortOptionsStruct sortOptions, String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder notWonItemsCounter, allegroApi.holders.ArrayOfNotWonItemStructHolder notWonItemsList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmynotwonitems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyNotWonItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, sortOptions, searchValue, new Integer(categoryId), itemIds, new Integer(pageSize), new Integer(pageNumber)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    notWonItemsCounter.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "not-won-items-counter"))).intValue();
                } catch (Exception _exception) {
                    notWonItemsCounter.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "not-won-items-counter")), int.class)).intValue();
                }
                try {
                    notWonItemsList.value = (NotWonItemStruct[]) _output.get(new javax.xml.namespace.QName("", "not-won-items-list"));
                } catch (Exception _exception) {
                    notWonItemsList.value = (NotWonItemStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "not-won-items-list")), NotWonItemStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.UserPaymentStruct[] doGetMyPayments(String sessionId, int sellerId, long itemId, long paymentTimeFrom, long paymentTimeTo, int pageSize, int pageNumber, int strictedSearch) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmypayments");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyPayments"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, new Integer(sellerId), new Long(itemId), new Long(paymentTimeFrom), new Long(paymentTimeTo), new Integer(pageSize), new Integer(pageNumber), new Integer(strictedSearch)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.UserPaymentStruct[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.UserPaymentStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.UserPaymentStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.PaymentsInfoStruct doGetMyPaymentsInfo(String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmypaymentsinfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyPaymentsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.PaymentsInfoStruct) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.PaymentsInfoStruct) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.PaymentsInfoStruct.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.UserPaymentRefundsStruct[] doGetMyPaymentsRefunds(String sessionHandle, int sellerId, long itemId, int limit, int offset) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmypaymentsrefunds");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyPaymentsRefunds"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Integer(sellerId), new Long(itemId), new Integer(limit), new Integer(offset)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.UserPaymentRefundsStruct[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.UserPaymentRefundsStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.UserPaymentRefundsStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.UserPayoutStruct[] doGetMyPayouts(String sessionHandle, long transCreateDateFrom, long transCreateDateTo, int transPageLimit, int transOffset) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmypayouts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyPayouts"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Long(transCreateDateFrom), new Long(transCreateDateTo), new Integer(transPageLimit), new Integer(transOffset)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.UserPayoutStruct[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.UserPayoutStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.UserPayoutStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetMySellItems(String sessionId, allegroApi.SortOptionsStruct sortOptions, SellFilterOptionsStruct filterOptions, String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder sellItemsCounter, allegroApi.holders.ArrayOfSellItemStructHolder sellItemsList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmysellitems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMySellItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, sortOptions, filterOptions, searchValue, new Integer(categoryId), itemIds, new Integer(pageSize), new Integer(pageNumber)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sellItemsCounter.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "sell-items-counter"))).intValue();
                } catch (Exception _exception) {
                    sellItemsCounter.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-items-counter")), int.class)).intValue();
                }
                try {
                    sellItemsList.value = (allegroApi.SellItemStruct[]) _output.get(new javax.xml.namespace.QName("", "sell-items-list"));
                } catch (Exception _exception) {
                    sellItemsList.value = (allegroApi.SellItemStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-items-list")), allegroApi.SellItemStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetMySellRating(String sessionHandle, javax.xml.rpc.holders.IntHolder sellRatingTotalCount, allegroApi.holders.ArrayOfSellRatingAverageStructHolder sellRatingAverage, allegroApi.holders.ArrayOfSellRatingDetailStructHolder sellRatingDetails, allegroApi.holders.ArrayOfSellRatingAveragePerMonthHolder sellRatingStatsPerMonth) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmysellrating");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMySellRating"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sellRatingTotalCount.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "sell-rating-total-count"))).intValue();
                } catch (Exception _exception) {
                    sellRatingTotalCount.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-rating-total-count")), int.class)).intValue();
                }
                try {
                    sellRatingAverage.value = (SellRatingAverageStruct[]) _output.get(new javax.xml.namespace.QName("", "sell-rating-average"));
                } catch (Exception _exception) {
                    sellRatingAverage.value = (SellRatingAverageStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-rating-average")), SellRatingAverageStruct[].class);
                }
                try {
                    sellRatingDetails.value = (allegroApi.SellRatingDetailStruct[]) _output.get(new javax.xml.namespace.QName("", "sell-rating-details"));
                } catch (Exception _exception) {
                    sellRatingDetails.value = (allegroApi.SellRatingDetailStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-rating-details")), allegroApi.SellRatingDetailStruct[].class);
                }
                try {
                    sellRatingStatsPerMonth.value = (allegroApi.SellRatingAveragePerMonthStruct[]) _output.get(new javax.xml.namespace.QName("", "sell-rating-stats-per-month"));
                } catch (Exception _exception) {
                    sellRatingStatsPerMonth.value = (allegroApi.SellRatingAveragePerMonthStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-rating-stats-per-month")), allegroApi.SellRatingAveragePerMonthStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetMySoldItems(String sessionId, allegroApi.SortOptionsStruct sortOptions, SoldFilterOptionsStruct filterOptions, String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder soldItemsCounter, allegroApi.holders.ArrayOfSoldItemStructHolder soldItemsList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmysolditems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMySoldItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, sortOptions, filterOptions, searchValue, new Integer(categoryId), itemIds, new Integer(pageSize), new Integer(pageNumber)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    soldItemsCounter.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "sold-items-counter"))).intValue();
                } catch (Exception _exception) {
                    soldItemsCounter.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sold-items-counter")), int.class)).intValue();
                }
                try {
                    soldItemsList.value = (SoldItemStruct[]) _output.get(new javax.xml.namespace.QName("", "sold-items-list"));
                } catch (Exception _exception) {
                    soldItemsList.value = (SoldItemStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sold-items-list")), SoldItemStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetMyWatchItems(String sessionId, allegroApi.SortOptionsStruct sortOptions, String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder watchItemsCounter, allegroApi.holders.ArrayOfWatchItemStructHolder watchItemsList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmywatchitems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyWatchItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, sortOptions, searchValue, new Integer(categoryId), itemIds, new Integer(pageSize), new Integer(pageNumber)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    watchItemsCounter.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "watch-items-counter"))).intValue();
                } catch (Exception _exception) {
                    watchItemsCounter.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "watch-items-counter")), int.class)).intValue();
                }
                try {
                    watchItemsList.value = (allegroApi.WatchItemStruct[]) _output.get(new javax.xml.namespace.QName("", "watch-items-list"));
                } catch (Exception _exception) {
                    watchItemsList.value = (allegroApi.WatchItemStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "watch-items-list")), allegroApi.WatchItemStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetMyWatchedItems(String sessionId, allegroApi.SortOptionsStruct sortOptions, String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder watchedItemsCounter, allegroApi.holders.ArrayOfWatchedItemStructHolder watchedItemsList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmywatcheditems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyWatchedItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, sortOptions, searchValue, new Integer(categoryId), itemIds, new Integer(pageSize), new Integer(pageNumber)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    watchedItemsCounter.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "watched-items-counter"))).intValue();
                } catch (Exception _exception) {
                    watchedItemsCounter.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "watched-items-counter")), int.class)).intValue();
                }
                try {
                    watchedItemsList.value = (allegroApi.WatchedItemStruct[]) _output.get(new javax.xml.namespace.QName("", "watched-items-list"));
                } catch (Exception _exception) {
                    watchedItemsList.value = (allegroApi.WatchedItemStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "watched-items-list")), allegroApi.WatchedItemStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetMyWonItems(String sessionId, allegroApi.SortOptionsStruct sortOptions, String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder wonItemsCounter, allegroApi.holders.ArrayOfWonItemStructHolder wonItemsList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetmywonitems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyWonItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, sortOptions, searchValue, new Integer(categoryId), itemIds, new Integer(pageSize), new Integer(pageNumber)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    wonItemsCounter.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "won-items-counter"))).intValue();
                } catch (Exception _exception) {
                    wonItemsCounter.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "won-items-counter")), int.class)).intValue();
                }
                try {
                    wonItemsList.value = (WonItemStruct[]) _output.get(new javax.xml.namespace.QName("", "won-items-list"));
                } catch (Exception _exception) {
                    wonItemsList.value = (WonItemStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "won-items-list")), WonItemStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public BillingDataType[] doGetPaymentData(int countryId, String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetpaymentdata");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetPaymentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(countryId), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (BillingDataType[]) _resp;
                } catch (Exception _exception) {
                    return (BillingDataType[]) org.apache.axis.utils.JavaUtils.convert(_resp, BillingDataType[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.PaymentMethodStruct[] doGetPaymentMethods(String sessionId, long[] itemIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetpaymentmethods");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetPaymentMethods"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, itemIds});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.PaymentMethodStruct[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.PaymentMethodStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.PaymentMethodStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.ItemPostBuyDataStruct[] doGetPostBuyData(String sessionHandle, long[] itemsArray, long[] buyerFilterArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetpostbuydata");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetPostBuyData"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, itemsArray, buyerFilterArray});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.ItemPostBuyDataStruct[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.ItemPostBuyDataStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.ItemPostBuyDataStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.PostBuyFormForBuyersDataStruct[] doGetPostBuyFormsDataForBuyers(String sessionId, long[] transactionsIdsArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetpostbuyformsdataforbuyers");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetPostBuyFormsDataForBuyers"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, transactionsIdsArray});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.PostBuyFormForBuyersDataStruct[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.PostBuyFormForBuyersDataStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.PostBuyFormForBuyersDataStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.PostBuyFormDataStruct[] doGetPostBuyFormsDataForSellers(String sessionId, long[] transactionsIdsArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetpostbuyformsdataforsellers");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetPostBuyFormsDataForSellers"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, transactionsIdsArray});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.PostBuyFormDataStruct[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.PostBuyFormDataStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.PostBuyFormDataStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public PostBuyItemInfoStruct[] doGetPostBuyItemInfo(String sessionId, long[] itemIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetpostbuyiteminfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetPostBuyItemInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, itemIds});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (PostBuyItemInfoStruct[]) _resp;
                } catch (Exception _exception) {
                    return (PostBuyItemInfoStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, PostBuyItemInfoStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetRefundsDeals(String sessionId, allegroApi.FilterOptionsType[] filterOptions, String sortOrder, int resultSize, int resultOffset, javax.xml.rpc.holders.IntHolder dealsCount, allegroApi.holders.ArrayOfRefundsDealsListTypeHolder dealsList, allegroApi.holders.ArrayOfFiltersListTypeHolder filtersList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetrefundsdeals");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetRefundsDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, filterOptions, sortOrder, new Integer(resultSize), new Integer(resultOffset)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    dealsCount.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "deals-count"))).intValue();
                } catch (Exception _exception) {
                    dealsCount.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "deals-count")), int.class)).intValue();
                }
                try {
                    dealsList.value = (RefundsDealsListType[]) _output.get(new javax.xml.namespace.QName("", "deals-list"));
                } catch (Exception _exception) {
                    dealsList.value = (RefundsDealsListType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "deals-list")), RefundsDealsListType[].class);
                }
                try {
                    filtersList.value = (allegroApi.FiltersListType[]) _output.get(new javax.xml.namespace.QName("", "filters-list"));
                } catch (Exception _exception) {
                    filtersList.value = (allegroApi.FiltersListType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "filters-list")), allegroApi.FiltersListType[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetRefundsList(String sessionId, allegroApi.FilterOptionsType[] filterOptions, int resultSize, int resultOffset, javax.xml.rpc.holders.IntHolder refundsCount, allegroApi.holders.ArrayOfRefundListTypeHolder refundsList, allegroApi.holders.ArrayOfFiltersListTypeHolder filtersList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetrefundslist");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetRefundsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, filterOptions, new Integer(resultSize), new Integer(resultOffset)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    refundsCount.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "refunds-count"))).intValue();
                } catch (Exception _exception) {
                    refundsCount.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "refunds-count")), int.class)).intValue();
                }
                try {
                    refundsList.value = (RefundListType[]) _output.get(new javax.xml.namespace.QName("", "refunds-list"));
                } catch (Exception _exception) {
                    refundsList.value = (RefundListType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "refunds-list")), RefundListType[].class);
                }
                try {
                    filtersList.value = (allegroApi.FiltersListType[]) _output.get(new javax.xml.namespace.QName("", "filters-list"));
                } catch (Exception _exception) {
                    filtersList.value = (allegroApi.FiltersListType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "filters-list")), allegroApi.FiltersListType[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.RelatedItemsStruct doGetRelatedItems(String sessionId, long[] itemIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetrelateditems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetRelatedItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, itemIds});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.RelatedItemsStruct) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.RelatedItemsStruct) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.RelatedItemsStruct.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetSellFormAttribs(int countryId, String webapiKey, long localVersion, int catId, allegroApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsellformattribs");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSellFormAttribs"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(countryId), webapiKey, new Long(localVersion), new Integer(catId)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sellFormFields.value = (SellFormType[]) _output.get(new javax.xml.namespace.QName("", "sell-form-fields"));
                } catch (Exception _exception) {
                    sellFormFields.value = (SellFormType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-form-fields")), SellFormType[].class);
                }
                try {
                    verKey.value = ((Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
                } catch (Exception _exception) {
                    verKey.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
                }
                try {
                    verStr.value = (String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
                } catch (Exception _exception) {
                    verStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetSellFormFields(int countryCode, long localVersion, String webapiKey, allegroApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsellformfields");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSellFormFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(countryCode), new Long(localVersion), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sellFormFields.value = (SellFormType[]) _output.get(new javax.xml.namespace.QName("", "sell-form-fields"));
                } catch (Exception _exception) {
                    sellFormFields.value = (SellFormType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-form-fields")), SellFormType[].class);
                }
                try {
                    verKey.value = ((Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
                } catch (Exception _exception) {
                    verKey.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
                }
                try {
                    verStr.value = (String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
                } catch (Exception _exception) {
                    verStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetSellFormFieldsExt(int countryCode, long localVersion, String webapiKey, allegroApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsellformfieldsext");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSellFormFieldsExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(countryCode), new Long(localVersion), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sellFormFields.value = (SellFormType[]) _output.get(new javax.xml.namespace.QName("", "sell-form-fields"));
                } catch (Exception _exception) {
                    sellFormFields.value = (SellFormType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-form-fields")), SellFormType[].class);
                }
                try {
                    verKey.value = ((Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
                } catch (Exception _exception) {
                    verKey.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
                }
                try {
                    verStr.value = (String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
                } catch (Exception _exception) {
                    verStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetSellFormFieldsExtLimit(int countryCode, long localVersion, String webapiKey, int offset, int packageElement, allegroApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr, javax.xml.rpc.holders.IntHolder formFieldsCount) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsellformfieldsextlimit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSellFormFieldsExtLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(countryCode), new Long(localVersion), webapiKey, new Integer(offset), new Integer(packageElement)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sellFormFields.value = (SellFormType[]) _output.get(new javax.xml.namespace.QName("", "sell-form-fields"));
                } catch (Exception _exception) {
                    sellFormFields.value = (SellFormType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-form-fields")), SellFormType[].class);
                }
                try {
                    verKey.value = ((Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
                } catch (Exception _exception) {
                    verKey.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
                }
                try {
                    verStr.value = (String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
                } catch (Exception _exception) {
                    verStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), String.class);
                }
                try {
                    formFieldsCount.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "form-fields-count"))).intValue();
                } catch (Exception _exception) {
                    formFieldsCount.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "form-fields-count")), int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.SellFormFieldsForCategoryStruct doGetSellFormFieldsForCategory(String webapiKey, int countryId, int categoryId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsellformfieldsforcategory");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSellFormFieldsForCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{webapiKey, new Integer(countryId), new Integer(categoryId)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.SellFormFieldsForCategoryStruct) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.SellFormFieldsForCategoryStruct) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.SellFormFieldsForCategoryStruct.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetSellFormFieldsLimit(int countryCode, long localVersion, String webapiKey, int offset, int packageElement, allegroApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr, javax.xml.rpc.holders.IntHolder formFieldsCount) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsellformfieldslimit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSellFormFieldsLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(countryCode), new Long(localVersion), webapiKey, new Integer(offset), new Integer(packageElement)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sellFormFields.value = (SellFormType[]) _output.get(new javax.xml.namespace.QName("", "sell-form-fields"));
                } catch (Exception _exception) {
                    sellFormFields.value = (SellFormType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-form-fields")), SellFormType[].class);
                }
                try {
                    verKey.value = ((Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
                } catch (Exception _exception) {
                    verKey.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
                }
                try {
                    verStr.value = (String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
                } catch (Exception _exception) {
                    verStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), String.class);
                }
                try {
                    formFieldsCount.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "form-fields-count"))).intValue();
                } catch (Exception _exception) {
                    formFieldsCount.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "form-fields-count")), int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public SellRatingInfoStruct[] doGetSellRatingReasons(String webapiKey, int countryCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsellratingreasons");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSellRatingReasons"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{webapiKey, new Integer(countryCode)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (SellRatingInfoStruct[]) _resp;
                } catch (Exception _exception) {
                    return (SellRatingInfoStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, SellRatingInfoStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetSessionHandleForWidget(String webapiKey, int countryCode, javax.xml.rpc.holders.StringHolder sessionHandle, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsessionhandleforwidget");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSessionHandleForWidget"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{webapiKey, new Integer(countryCode)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sessionHandle.value = (String) _output.get(new javax.xml.namespace.QName("", "session-handle"));
                } catch (Exception _exception) {
                    sessionHandle.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "session-handle")), String.class);
                }
                try {
                    serverTime.value = ((Long) _output.get(new javax.xml.namespace.QName("", "server-time"))).longValue();
                } catch (Exception _exception) {
                    serverTime.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "server-time")), long.class)).longValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetShipmentData(int countryId, String webapiKey, allegroApi.holders.ArrayOfShipmentDataStructHolder shipmentDataList, javax.xml.rpc.holders.LongHolder localVersion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetshipmentdata");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetShipmentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(countryId), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    shipmentDataList.value = (allegroApi.ShipmentDataStruct[]) _output.get(new javax.xml.namespace.QName("", "shipment-data-list"));
                } catch (Exception _exception) {
                    shipmentDataList.value = (allegroApi.ShipmentDataStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "shipment-data-list")), allegroApi.ShipmentDataStruct[].class);
                }
                try {
                    localVersion.value = ((Long) _output.get(new javax.xml.namespace.QName("", "local-version"))).longValue();
                } catch (Exception _exception) {
                    localVersion.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "local-version")), long.class)).longValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public RelatedItemsShipmentDataStruct doGetShipmentDataForRelatedItems(String sessionId, long[] itemIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetshipmentdataforrelateditems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetShipmentDataForRelatedItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, itemIds});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (RelatedItemsShipmentDataStruct) _resp;
                } catch (Exception _exception) {
                    return (RelatedItemsShipmentDataStruct) org.apache.axis.utils.JavaUtils.convert(_resp, RelatedItemsShipmentDataStruct.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.ShipmentPriceTypeStruct[] doGetShipmentPriceTypes(int countryId, String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetshipmentpricetypes");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetShipmentPriceTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(countryId), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.ShipmentPriceTypeStruct[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.ShipmentPriceTypeStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.ShipmentPriceTypeStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetShopsTags(String sessionId, javax.xml.rpc.holders.IntHolder shopsTagsCount, allegroApi.holders.ArrayOfShopsTagTypeStructHolder shopsTags) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetshopstags");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetShopsTags"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    shopsTagsCount.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "shops-tags-count"))).intValue();
                } catch (Exception _exception) {
                    shopsTagsCount.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "shops-tags-count")), int.class)).intValue();
                }
                try {
                    shopsTags.value = (ShopsTagTypeStruct[]) _output.get(new javax.xml.namespace.QName("", "shops-tags"));
                } catch (Exception _exception) {
                    shopsTags.value = (ShopsTagTypeStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "shops-tags")), ShopsTagTypeStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.SiteJournal[] doGetSiteJournal(String sessionHandle, long startingPoint, int infoType) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsitejournal");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSiteJournal"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Long(startingPoint), new Integer(infoType)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.SiteJournal[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.SiteJournal[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.SiteJournal[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.SiteJournalDealsStruct[] doGetSiteJournalDeals(String sessionId, long journalStart) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsitejournaldeals");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSiteJournalDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, new Long(journalStart)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.SiteJournalDealsStruct[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.SiteJournalDealsStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.SiteJournalDealsStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.SiteJournalDealsInfoStruct doGetSiteJournalDealsInfo(String sessionId, long journalStart) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsitejournaldealsinfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSiteJournalDealsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, new Long(journalStart)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.SiteJournalDealsInfoStruct) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.SiteJournalDealsInfoStruct) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.SiteJournalDealsInfoStruct.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.SiteJournalInfo doGetSiteJournalInfo(String sessionHandle, long startingPoint, int infoType) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsitejournalinfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSiteJournalInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Long(startingPoint), new Integer(infoType)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.SiteJournalInfo) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.SiteJournalInfo) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.SiteJournalInfo.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.StateInfoStruct[] doGetStatesInfo(int countryCode, String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetstatesinfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetStatesInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(countryCode), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.StateInfoStruct[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.StateInfoStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.StateInfoStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public long doGetSystemTime(int countryId, String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsystemtime");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSystemTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(countryId), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Long) _resp).longValue();
                } catch (Exception _exception) {
                    return ((Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public long[] doGetTransactionsIDs(String sessionHandle, long[] itemsIdArray, String userRole, long[] shipmentIdArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogettransactionsids");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetTransactionsIDs"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, itemsIdArray, userRole, shipmentIdArray});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (long[]) _resp;
                } catch (Exception _exception) {
                    return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doGetUserID(int countryId, String userLogin, String userEmail, String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetuserid");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetUserID"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(countryId), userLogin, userEmail, webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public float doGetUserLicenceDate(String sessionHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetuserlicencedate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Float) _resp).floatValue();
                } catch (Exception _exception) {
                    return ((Float) org.apache.axis.utils.JavaUtils.convert(_resp, float.class)).floatValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String doGetUserLogin(int countryId, int userId, String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetuserlogin");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetUserLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(countryId), new Integer(userId), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public WaitFeedbackStruct[] doGetWaitingFeedbacks(String sessionHandle, int offset, int packageSize) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetwaitingfeedbacks");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetWaitingFeedbacks"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Integer(offset), new Integer(packageSize)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (WaitFeedbackStruct[]) _resp;
                } catch (Exception _exception) {
                    return (WaitFeedbackStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, WaitFeedbackStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doGetWaitingFeedbacksCount(String sessionHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetwaitingfeedbackscount");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetWaitingFeedbacksCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doLogin(String userLogin, String userPassword, int countryCode, String webapiKey, long localVersion, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dologin");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{userLogin, userPassword, new Integer(countryCode), webapiKey, new Long(localVersion)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sessionHandlePart.value = (String) _output.get(new javax.xml.namespace.QName("", "session-handle-part"));
                } catch (Exception _exception) {
                    sessionHandlePart.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "session-handle-part")), String.class);
                }
                try {
                    userId.value = ((Long) _output.get(new javax.xml.namespace.QName("", "user-id"))).longValue();
                } catch (Exception _exception) {
                    userId.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-id")), long.class)).longValue();
                }
                try {
                    serverTime.value = ((Long) _output.get(new javax.xml.namespace.QName("", "server-time"))).longValue();
                } catch (Exception _exception) {
                    serverTime.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "server-time")), long.class)).longValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doLoginEnc(String userLogin, String userHashPassword, int countryCode, String webapiKey, long localVersion, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dologinenc");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doLoginEnc"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{userLogin, userHashPassword, new Integer(countryCode), webapiKey, new Long(localVersion)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sessionHandlePart.value = (String) _output.get(new javax.xml.namespace.QName("", "session-handle-part"));
                } catch (Exception _exception) {
                    sessionHandlePart.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "session-handle-part")), String.class);
                }
                try {
                    userId.value = ((Long) _output.get(new javax.xml.namespace.QName("", "user-id"))).longValue();
                } catch (Exception _exception) {
                    userId.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-id")), long.class)).longValue();
                }
                try {
                    serverTime.value = ((Long) _output.get(new javax.xml.namespace.QName("", "server-time"))).longValue();
                } catch (Exception _exception) {
                    serverTime.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "server-time")), long.class)).longValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doLoginWithAccessToken(String accessToken, int countryCode, String webapiKey, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dologinwithaccesstoken");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doLoginWithAccessToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{accessToken, new Integer(countryCode), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sessionHandlePart.value = (String) _output.get(new javax.xml.namespace.QName("", "session-handle-part"));
                } catch (Exception _exception) {
                    sessionHandlePart.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "session-handle-part")), String.class);
                }
                try {
                    userId.value = ((Long) _output.get(new javax.xml.namespace.QName("", "user-id"))).longValue();
                } catch (Exception _exception) {
                    userId.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-id")), long.class)).longValue();
                }
                try {
                    serverTime.value = ((Long) _output.get(new javax.xml.namespace.QName("", "server-time"))).longValue();
                } catch (Exception _exception) {
                    serverTime.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "server-time")), long.class)).longValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.MyAccountStruct2[] doMyAccount2(String sessionHandle, String accountType, int offset, long[] itemsArray, int limit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#domyaccount2");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMyAccount2"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, accountType, new Integer(offset), itemsArray, new Integer(limit)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.MyAccountStruct2[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.MyAccountStruct2[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.MyAccountStruct2[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doMyAccountItemsCount(String sessionHandle, String accountType, long[] itemsArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#domyaccountitemscount");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMyAccountItemsCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, accountType, itemsArray});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String doMyBilling(String sessionHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#domybilling");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMyBilling"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doMyBillingItem(String sessionHandle, long itemId, String option, allegroApi.holders.ItemBillingListHolder entryFees, allegroApi.holders.ItemBillingListHolder endingFees) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#domybillingitem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMyBillingItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Long(itemId), option});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    entryFees.value = (ItemBilling[]) _output.get(new javax.xml.namespace.QName("", "entry-fees"));
                } catch (Exception _exception) {
                    entryFees.value = (ItemBilling[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "entry-fees")), ItemBilling[].class);
                }
                try {
                    endingFees.value = (ItemBilling[]) _output.get(new javax.xml.namespace.QName("", "ending-fees"));
                } catch (Exception _exception) {
                    endingFees.value = (ItemBilling[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ending-fees")), ItemBilling[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public MyContactList[] doMyContact(String sessionHandle, long[] auctionIdList, int offset, int desc) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#domycontact");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMyContact"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, auctionIdList, new Integer(offset), new Integer(desc)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (MyContactList[]) _resp;
                } catch (Exception _exception) {
                    return (MyContactList[]) org.apache.axis.utils.JavaUtils.convert(_resp, MyContactList[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.MyFeedbackListStruct2[] doMyFeedback2(String sessionHandle, String feedbackType, int offset, int desc, long[] itemsArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#domyfeedback2");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMyFeedback2"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, feedbackType, new Integer(offset), new Integer(desc), itemsArray});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.MyFeedbackListStruct2[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.MyFeedbackListStruct2[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.MyFeedbackListStruct2[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.MyFeedbackListStruct2[] doMyFeedback2Limit(String sessionHandle, String feedbackType, int offset, int desc, long[] itemsArray, int packageElement) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#domyfeedback2limit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMyFeedback2Limit"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, feedbackType, new Integer(offset), new Integer(desc), itemsArray, new Integer(packageElement)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.MyFeedbackListStruct2[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.MyFeedbackListStruct2[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.MyFeedbackListStruct2[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doNewAuctionExt(String sessionHandle, allegroApi.FieldsValue[] fields, int itemTemplateId, int localId, ItemTemplateCreateStruct itemTemplateCreate, VariantStruct[] variants, allegroApi.TagNameStruct[] tags, javax.xml.rpc.holders.LongHolder itemId, javax.xml.rpc.holders.StringHolder itemInfo, javax.xml.rpc.holders.IntHolder itemIsAllegroStandard) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#donewauctionext");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doNewAuctionExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, fields, new Integer(itemTemplateId), new Integer(localId), itemTemplateCreate, variants, tags});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    itemId.value = ((Long) _output.get(new javax.xml.namespace.QName("", "item-id"))).longValue();
                } catch (Exception _exception) {
                    itemId.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-id")), long.class)).longValue();
                }
                try {
                    itemInfo.value = (String) _output.get(new javax.xml.namespace.QName("", "item-info"));
                } catch (Exception _exception) {
                    itemInfo.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-info")), String.class);
                }
                try {
                    itemIsAllegroStandard.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "item-is-allegro-standard"))).intValue();
                } catch (Exception _exception) {
                    itemIsAllegroStandard.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-is-allegro-standard")), int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.SysStatusType[] doQueryAllSysStatus(int countryId, String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doqueryallsysstatus");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doQueryAllSysStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(countryId), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.SysStatusType[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.SysStatusType[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.SysStatusType[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doQuerySysStatus(int sysvar, int countryId, String webapiKey, javax.xml.rpc.holders.StringHolder info, javax.xml.rpc.holders.LongHolder verKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doquerysysstatus");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doQuerySysStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Integer(sysvar), new Integer(countryId), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    info.value = (String) _output.get(new javax.xml.namespace.QName("", "info"));
                } catch (Exception _exception) {
                    info.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "info")), String.class);
                }
                try {
                    verKey.value = ((Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
                } catch (Exception _exception) {
                    verKey.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.BlackListResStruct[] doRemoveFromBlackList(String sessionHandle, long[] usersIdArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doremovefromblacklist");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doRemoveFromBlackList"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, usersIdArray});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.BlackListResStruct[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.BlackListResStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.BlackListResStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.ItemRemoveWatchStruct[] doRemoveFromWatchList(String sessionHandle, long[] itemsIdArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doremovefromwatchlist");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doRemoveFromWatchList"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, itemsIdArray});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.ItemRemoveWatchStruct[]) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.ItemRemoveWatchStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.ItemRemoveWatchStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.RemovedItemTemplatesStruct doRemoveItemTemplates(String sessionId, int[] itemTemplateIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doremoveitemtemplates");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doRemoveItemTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, itemTemplateIds});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.RemovedItemTemplatesStruct) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.RemovedItemTemplatesStruct) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.RemovedItemTemplatesStruct.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doRequestCancelBid(String sessionHandle, long requestItemId, String requestCancelReason) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dorequestcancelbid");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doRequestCancelBid"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Long(requestItemId), requestCancelReason});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public RequestPayoutStruct doRequestPayout(String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dorequestpayout");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doRequestPayout"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (RequestPayoutStruct) _resp;
                } catch (Exception _exception) {
                    return (RequestPayoutStruct) org.apache.axis.utils.JavaUtils.convert(_resp, RequestPayoutStruct.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doRequestSurcharge(String sessionHandle, long transactionId, float surchargeValue, String surchargeMessageToBuyer) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dorequestsurcharge");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doRequestSurcharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Long(transactionId), new Float(surchargeValue), surchargeMessageToBuyer});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doSellSomeAgain(String sessionHandle, long[] sellItemsArray, long sellStartingTime, int sellAuctionDuration, int sellOptions, int[] localIds, int sellProlongOptions, allegroApi.holders.ArrayOfStructSellAgainHolder itemsSellAgain, allegroApi.holders.ArrayOfStructSellFailedHolder itemsSellFailed, allegroApi.holders.ArrayOfItemsIDHolder itemsSellNotFound) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dosellsomeagain");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doSellSomeAgain"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, sellItemsArray, new Long(sellStartingTime), new Integer(sellAuctionDuration), new Integer(sellOptions), localIds, new Integer(sellProlongOptions)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    itemsSellAgain.value = (StructSellAgain[]) _output.get(new javax.xml.namespace.QName("", "items-sell-again"));
                } catch (Exception _exception) {
                    itemsSellAgain.value = (StructSellAgain[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "items-sell-again")), StructSellAgain[].class);
                }
                try {
                    itemsSellFailed.value = (StructSellFailed[]) _output.get(new javax.xml.namespace.QName("", "items-sell-failed"));
                } catch (Exception _exception) {
                    itemsSellFailed.value = (StructSellFailed[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "items-sell-failed")), StructSellFailed[].class);
                }
                try {
                    itemsSellNotFound.value = (long[]) _output.get(new javax.xml.namespace.QName("", "items-sell-not-found"));
                } catch (Exception _exception) {
                    itemsSellNotFound.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "items-sell-not-found")), long[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doSellSomeAgainInShop(String sessionHandle, long[] sellItemsArray, long sellStartingTime, int sellShopDuration, int sellShopOptions, int sellProlongOptions, long sellShopCategory, int[] localIds, allegroApi.holders.ArrayOfStructSellAgainHolder itemsSellAgain, allegroApi.holders.ArrayOfStructSellFailedHolder itemsSellFailed, allegroApi.holders.ArrayOfItemsIDHolder itemsSellNotFound) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dosellsomeagaininshop");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doSellSomeAgainInShop"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, sellItemsArray, new Long(sellStartingTime), new Integer(sellShopDuration), new Integer(sellShopOptions), new Integer(sellProlongOptions), new Long(sellShopCategory), localIds});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    itemsSellAgain.value = (StructSellAgain[]) _output.get(new javax.xml.namespace.QName("", "items-sell-again"));
                } catch (Exception _exception) {
                    itemsSellAgain.value = (StructSellAgain[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "items-sell-again")), StructSellAgain[].class);
                }
                try {
                    itemsSellFailed.value = (StructSellFailed[]) _output.get(new javax.xml.namespace.QName("", "items-sell-failed"));
                } catch (Exception _exception) {
                    itemsSellFailed.value = (StructSellFailed[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "items-sell-failed")), StructSellFailed[].class);
                }
                try {
                    itemsSellNotFound.value = (long[]) _output.get(new javax.xml.namespace.QName("", "items-sell-not-found"));
                } catch (Exception _exception) {
                    itemsSellNotFound.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "items-sell-not-found")), long[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String doSendEmailToUser(String sessionHandle, long mailToUserItemId, javax.xml.rpc.holders.LongHolder mailToUserReceiverId, int mailToUserSubjectId, int mailToUserOption, String mailToUserMessage) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dosendemailtouser");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doSendEmailToUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Long(mailToUserItemId), new Long(mailToUserReceiverId.value), new Integer(mailToUserSubjectId), new Integer(mailToUserOption), mailToUserMessage});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    mailToUserReceiverId.value = ((Long) _output.get(new javax.xml.namespace.QName("", "mail-to-user-receiver-id"))).longValue();
                } catch (Exception _exception) {
                    mailToUserReceiverId.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "mail-to-user-receiver-id")), long.class)).longValue();
                }
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public allegroApi.PostBuyFormStruct doSendPostBuyForm(String sessionId, allegroApi.NewPostBuyFormSellerStruct[] newPostBuyFormSeller, allegroApi.NewPostBuyFormCommonStruct newPostBuyFormCommon) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dosendpostbuyform");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doSendPostBuyForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, newPostBuyFormSeller, newPostBuyFormCommon});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (allegroApi.PostBuyFormStruct) _resp;
                } catch (Exception _exception) {
                    return (allegroApi.PostBuyFormStruct) org.apache.axis.utils.JavaUtils.convert(_resp, allegroApi.PostBuyFormStruct.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doSetShipmentPriceType(String sessionId, int shipmentPriceTypeId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dosetshipmentpricetype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doSetShipmentPriceType"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionId, new Integer(shipmentPriceTypeId)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doSetUserLicenceDate(String adminSessionHandle, String userLicLogin, int userLicCountry, float userLicDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dosetuserlicencedate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doSetUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{adminSessionHandle, userLicLogin, new Integer(userLicCountry), new Float(userLicDate)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doShowItemInfoExt(String sessionHandle, long itemId, int getDesc, int getImageUrl, int getAttribs, int getPostageOptions, int getCompanyInfo, int getProductInfo, allegroApi.holders.ItemInfoExtHolder itemListInfoExt, allegroApi.holders.ArrayOfItemCatListHolder itemCatPath, allegroApi.holders.ArrayOfItemImageListHolder itemImgList, allegroApi.holders.ArrayOfAttribStructHolder itemAttribList, allegroApi.holders.ArrayOfPostageStructHolder itemPostageOptions, allegroApi.holders.ItemPaymentOptionsHolder itemPaymentOptions, allegroApi.holders.CompanyInfoStructHolder itemCompanyInfo, allegroApi.holders.ProductStructHolder itemProductInfo, allegroApi.holders.ArrayOfItemVariantStructHolder itemVariants) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doshowiteminfoext");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doShowItemInfoExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Long(itemId), new Integer(getDesc), new Integer(getImageUrl), new Integer(getAttribs), new Integer(getPostageOptions), new Integer(getCompanyInfo), new Integer(getProductInfo)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    itemListInfoExt.value = (ItemInfoExt) _output.get(new javax.xml.namespace.QName("", "item-list-info-ext"));
                } catch (Exception _exception) {
                    itemListInfoExt.value = (ItemInfoExt) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-list-info-ext")), ItemInfoExt.class);
                }
                try {
                    itemCatPath.value = (ItemCatList[]) _output.get(new javax.xml.namespace.QName("", "item-cat-path"));
                } catch (Exception _exception) {
                    itemCatPath.value = (ItemCatList[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-cat-path")), ItemCatList[].class);
                }
                try {
                    itemImgList.value = (allegroApi.ItemImageList[]) _output.get(new javax.xml.namespace.QName("", "item-img-list"));
                } catch (Exception _exception) {
                    itemImgList.value = (allegroApi.ItemImageList[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-img-list")), allegroApi.ItemImageList[].class);
                }
                try {
                    itemAttribList.value = (AttribStruct[]) _output.get(new javax.xml.namespace.QName("", "item-attrib-list"));
                } catch (Exception _exception) {
                    itemAttribList.value = (AttribStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-attrib-list")), AttribStruct[].class);
                }
                try {
                    itemPostageOptions.value = (allegroApi.PostageStruct[]) _output.get(new javax.xml.namespace.QName("", "item-postage-options"));
                } catch (Exception _exception) {
                    itemPostageOptions.value = (allegroApi.PostageStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-postage-options")), allegroApi.PostageStruct[].class);
                }
                try {
                    itemPaymentOptions.value = (ItemPaymentOptions) _output.get(new javax.xml.namespace.QName("", "item-payment-options"));
                } catch (Exception _exception) {
                    itemPaymentOptions.value = (ItemPaymentOptions) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-payment-options")), ItemPaymentOptions.class);
                }
                try {
                    itemCompanyInfo.value = (allegroApi.CompanyInfoStruct) _output.get(new javax.xml.namespace.QName("", "item-company-info"));
                } catch (Exception _exception) {
                    itemCompanyInfo.value = (allegroApi.CompanyInfoStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-company-info")), allegroApi.CompanyInfoStruct.class);
                }
                try {
                    itemProductInfo.value = (allegroApi.ProductStruct) _output.get(new javax.xml.namespace.QName("", "item-product-info"));
                } catch (Exception _exception) {
                    itemProductInfo.value = (allegroApi.ProductStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-product-info")), allegroApi.ProductStruct.class);
                }
                try {
                    itemVariants.value = (allegroApi.ItemVariantStruct[]) _output.get(new javax.xml.namespace.QName("", "item-variants"));
                } catch (Exception _exception) {
                    itemVariants.value = (allegroApi.ItemVariantStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-variants")), allegroApi.ItemVariantStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doShowUser(String webapiKey, int countryId, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.StringHolder userLogin, javax.xml.rpc.holders.IntHolder userCountry, javax.xml.rpc.holders.LongHolder userCreateDate, javax.xml.rpc.holders.LongHolder userLoginDate, javax.xml.rpc.holders.IntHolder userRating, javax.xml.rpc.holders.IntHolder userIsNewUser, javax.xml.rpc.holders.IntHolder userNotActivated, javax.xml.rpc.holders.IntHolder userClosed, javax.xml.rpc.holders.IntHolder userBlocked, javax.xml.rpc.holders.IntHolder userTerminated, javax.xml.rpc.holders.IntHolder userHasPage, javax.xml.rpc.holders.IntHolder userIsSseller, javax.xml.rpc.holders.IntHolder userIsEco, allegroApi.holders.ShowUserFeedbacksHolder userPositiveFeedback, allegroApi.holders.ShowUserFeedbacksHolder userNegativeFeedback, allegroApi.holders.ShowUserFeedbacksHolder userNeutralFeedback, javax.xml.rpc.holders.IntHolder userJuniorStatus, javax.xml.rpc.holders.IntHolder userHasShop, javax.xml.rpc.holders.IntHolder userCompanyIcon, javax.xml.rpc.holders.IntHolder userSellRatingCount, allegroApi.holders.ArrayOfSellRatingAverageStructHolder userSellRatingAverage, javax.xml.rpc.holders.IntHolder userIsAllegroStandard, javax.xml.rpc.holders.IntHolder userIsB2CSeller) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doshowuser");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doShowUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{webapiKey, new Integer(countryId), new Long(userId.value), userLogin.value});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    userId.value = ((Long) _output.get(new javax.xml.namespace.QName("", "user-id"))).longValue();
                } catch (Exception _exception) {
                    userId.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-id")), long.class)).longValue();
                }
                try {
                    userLogin.value = (String) _output.get(new javax.xml.namespace.QName("", "user-login"));
                } catch (Exception _exception) {
                    userLogin.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-login")), String.class);
                }
                try {
                    userCountry.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "user-country"))).intValue();
                } catch (Exception _exception) {
                    userCountry.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-country")), int.class)).intValue();
                }
                try {
                    userCreateDate.value = ((Long) _output.get(new javax.xml.namespace.QName("", "user-create-date"))).longValue();
                } catch (Exception _exception) {
                    userCreateDate.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-create-date")), long.class)).longValue();
                }
                try {
                    userLoginDate.value = ((Long) _output.get(new javax.xml.namespace.QName("", "user-login-date"))).longValue();
                } catch (Exception _exception) {
                    userLoginDate.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-login-date")), long.class)).longValue();
                }
                try {
                    userRating.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "user-rating"))).intValue();
                } catch (Exception _exception) {
                    userRating.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-rating")), int.class)).intValue();
                }
                try {
                    userIsNewUser.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "user-is-new-user"))).intValue();
                } catch (Exception _exception) {
                    userIsNewUser.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-is-new-user")), int.class)).intValue();
                }
                try {
                    userNotActivated.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "user-not-activated"))).intValue();
                } catch (Exception _exception) {
                    userNotActivated.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-not-activated")), int.class)).intValue();
                }
                try {
                    userClosed.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "user-closed"))).intValue();
                } catch (Exception _exception) {
                    userClosed.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-closed")), int.class)).intValue();
                }
                try {
                    userBlocked.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "user-blocked"))).intValue();
                } catch (Exception _exception) {
                    userBlocked.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-blocked")), int.class)).intValue();
                }
                try {
                    userTerminated.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "user-terminated"))).intValue();
                } catch (Exception _exception) {
                    userTerminated.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-terminated")), int.class)).intValue();
                }
                try {
                    userHasPage.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "user-has-page"))).intValue();
                } catch (Exception _exception) {
                    userHasPage.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-has-page")), int.class)).intValue();
                }
                try {
                    userIsSseller.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "user-is-sseller"))).intValue();
                } catch (Exception _exception) {
                    userIsSseller.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-is-sseller")), int.class)).intValue();
                }
                try {
                    userIsEco.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "user-is-eco"))).intValue();
                } catch (Exception _exception) {
                    userIsEco.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-is-eco")), int.class)).intValue();
                }
                try {
                    userPositiveFeedback.value = (ShowUserFeedbacks) _output.get(new javax.xml.namespace.QName("", "user-positive-feedback"));
                } catch (Exception _exception) {
                    userPositiveFeedback.value = (ShowUserFeedbacks) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-positive-feedback")), ShowUserFeedbacks.class);
                }
                try {
                    userNegativeFeedback.value = (ShowUserFeedbacks) _output.get(new javax.xml.namespace.QName("", "user-negative-feedback"));
                } catch (Exception _exception) {
                    userNegativeFeedback.value = (ShowUserFeedbacks) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-negative-feedback")), ShowUserFeedbacks.class);
                }
                try {
                    userNeutralFeedback.value = (ShowUserFeedbacks) _output.get(new javax.xml.namespace.QName("", "user-neutral-feedback"));
                } catch (Exception _exception) {
                    userNeutralFeedback.value = (ShowUserFeedbacks) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-neutral-feedback")), ShowUserFeedbacks.class);
                }
                try {
                    userJuniorStatus.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "user-junior-status"))).intValue();
                } catch (Exception _exception) {
                    userJuniorStatus.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-junior-status")), int.class)).intValue();
                }
                try {
                    userHasShop.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "user-has-shop"))).intValue();
                } catch (Exception _exception) {
                    userHasShop.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-has-shop")), int.class)).intValue();
                }
                try {
                    userCompanyIcon.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "user-company-icon"))).intValue();
                } catch (Exception _exception) {
                    userCompanyIcon.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-company-icon")), int.class)).intValue();
                }
                try {
                    userSellRatingCount.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "user-sell-rating-count"))).intValue();
                } catch (Exception _exception) {
                    userSellRatingCount.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-sell-rating-count")), int.class)).intValue();
                }
                try {
                    userSellRatingAverage.value = (SellRatingAverageStruct[]) _output.get(new javax.xml.namespace.QName("", "user-sell-rating-average"));
                } catch (Exception _exception) {
                    userSellRatingAverage.value = (SellRatingAverageStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-sell-rating-average")), SellRatingAverageStruct[].class);
                }
                try {
                    userIsAllegroStandard.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "user-is-allegro-standard"))).intValue();
                } catch (Exception _exception) {
                    userIsAllegroStandard.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-is-allegro-standard")), int.class)).intValue();
                }
                try {
                    userIsB2CSeller.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "user-is-b2c-seller"))).intValue();
                } catch (Exception _exception) {
                    userIsB2CSeller.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-is-b2c-seller")), int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doVerifyItem(String sessionHandle, int localId, javax.xml.rpc.holders.LongHolder itemId, javax.xml.rpc.holders.IntHolder itemListed, javax.xml.rpc.holders.LongHolder itemStartingTime) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doverifyitem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doVerifyItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionHandle, new Integer(localId)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    itemId.value = ((Long) _output.get(new javax.xml.namespace.QName("", "item-id"))).longValue();
                } catch (Exception _exception) {
                    itemId.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-id")), long.class)).longValue();
                }
                try {
                    itemListed.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "item-listed"))).intValue();
                } catch (Exception _exception) {
                    itemListed.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-listed")), int.class)).intValue();
                }
                try {
                    itemStartingTime.value = ((Long) _output.get(new javax.xml.namespace.QName("", "item-starting-time"))).longValue();
                } catch (Exception _exception) {
                    itemStartingTime.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-starting-time")), long.class)).longValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

}
