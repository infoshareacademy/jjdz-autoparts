/**
 * AllegroWebApiPortType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package allegroApi;

public interface AllegroWebApiPortType extends java.rmi.Remote {
    public void doAddDescToItems(String sessionHandle, long[] itemsIdArray, String itDescription, allegroApi.holders.ArrayOfItemsIDHolder arrayItemsAddId, allegroApi.holders.ArrayOfItemsIDHolder arrayItemsDescToLong, allegroApi.holders.ArrayOfItemsIDHolder arrayItemsNotFound) throws java.rmi.RemoteException;

    public PostBuyFormPackageInfoStruct doAddPackageInfoToPostBuyForm(String sessionId, long transactionId, PackageInfoStruct[] packageInfo) throws java.rmi.RemoteException;

    public UserBlackListAddResultStruct[] doAddToBlackList(String sessionHandle, UserBlackListStruct[] usersBlackListArray) throws java.rmi.RemoteException;

    public allegroApi.WatchListInfoStruct doAddToWatchList(String sessionId, long[] itemIds) throws java.rmi.RemoteException;

    public String doBidItem(String sessionHandle, long bidItId, float bidUserPrice, long bidQuantity, long bidBuyNow, PharmacyRecipientDataStruct pharmacyRecipientData, String variantId) throws java.rmi.RemoteException;

    public void doCancelBidItem(String sessionHandle, long cancelItemId, int[] cancelBidsArray, String cancelBidsReason, long cancelAddToBlackList, javax.xml.rpc.holders.IntHolder cancelBidValue, allegroApi.holders.ArrayOfCancelBidsIDHolder cancelledBids, allegroApi.holders.ArrayOfCancelBidsIDHolder notCancelledBids) throws java.rmi.RemoteException;

    public int doCancelTransaction(String sessionId, long transactionId) throws java.rmi.RemoteException;

    public ChangedItemStruct doChangeItemFields(String sessionId, long itemId, allegroApi.FieldsValue[] fieldsToModify, int[] fieldsToRemove, int previewOnly, VariantStruct[] variants, TagNameStruct[] tags) throws java.rmi.RemoteException;

    public String doChangePriceItem(String sessionHandle, javax.xml.rpc.holders.LongHolder itemId, float newStartingPrice, float newReservePrice, float newBuyNowPrice) throws java.rmi.RemoteException;

    public void doChangeQuantityItem(String sessionHandle, javax.xml.rpc.holders.LongHolder itemId, int newItemQuantity, javax.xml.rpc.holders.StringHolder itemInfo, javax.xml.rpc.holders.IntHolder itemQuantityLeft, javax.xml.rpc.holders.IntHolder itemQuantitySold) throws java.rmi.RemoteException;

    public allegroApi.ItemDescriptionStruct doCheckItemDescription(String sessionId, String descriptionContent) throws java.rmi.RemoteException;

    public void doCheckNewAuctionExt(String sessionHandle, allegroApi.FieldsValue[] fields, VariantStruct[] variants, TagNameStruct[] tags, javax.xml.rpc.holders.StringHolder itemPrice, javax.xml.rpc.holders.StringHolder itemPriceDesc, javax.xml.rpc.holders.IntHolder itemIsAllegroStandard) throws java.rmi.RemoteException;

    public allegroApi.CreatedItemTemplateStruct doCreateItemTemplate(String sessionId, String itemTemplateName, allegroApi.FieldsValue[] itemTemplateFields) throws java.rmi.RemoteException;

    public int doFeedback(String sessionHandle, long feItemId, int feUseCommentTemplate, int feToUserId, String feComment, String feCommentType, int feOp, SellRatingEstimationStruct[] feRating) throws java.rmi.RemoteException;

    public FeedbackResultStruct[] doFeedbackMany(String sessionHandle, FeedbackManyStruct[] feedbacksList) throws java.rmi.RemoteException;

    public int doFinishItem(String sessionHandle, long finishItemId, int finishCancelAllBids, String finishCancelReason) throws java.rmi.RemoteException;

    public void doFinishItems(String sessionHandle, allegroApi.FinishItemsStruct[] finishItemsList, allegroApi.holders.ArrayOfFinishSuccessStructHolder finishItemsSucceed, allegroApi.holders.ArrayOfFinishFailureStructHolder finishItemsFailed) throws java.rmi.RemoteException;

    public float doGetAdminUserLicenceDate(String adminSessionHandle, String userLicLogin) throws java.rmi.RemoteException;

    public allegroApi.BidListStruct2[] doGetBidItem2(String sessionHandle, long itemId) throws java.rmi.RemoteException;

    public allegroApi.BlackListStruct[] doGetBlackListUsers(String sessionHandle) throws java.rmi.RemoteException;

    public allegroApi.CategoryData[] doGetCategoryPath(String sessionId, int categoryId) throws java.rmi.RemoteException;

    public void doGetCatsData(int countryId, long localVersion, String webapiKey, allegroApi.holders.ArrayOfCatsHolder catsList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;

    public void doGetCatsDataCount(int countryId, long localVersion, String webapiKey, javax.xml.rpc.holders.IntHolder catsCount, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;

    public void doGetCatsDataLimit(int countryId, long localVersion, String webapiKey, int offset, int packageElement, allegroApi.holders.ArrayOfCatsHolder catsList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;

    public allegroApi.CountryInfoType[] doGetCountries(int countryCode, String webapiKey) throws java.rmi.RemoteException;

    public DealsStruct[] doGetDeals(String sessionHandle, long itemId, int buyerId) throws java.rmi.RemoteException;

    public FavouritesCategoriesStruct[] doGetFavouriteCategories(String sessionHandle) throws java.rmi.RemoteException;

    public FavouritesSellersStruct[] doGetFavouriteSellers(String sessionHandle) throws java.rmi.RemoteException;

    public void doGetFeedback(String sessionHandle, int feedbackFrom, int feedbackTo, int feedbackOffset, String feedbackKindList, allegroApi.holders.ArrayOfFeedbackListHolder feedbackList, javax.xml.rpc.holders.IntHolder feedbackCount) throws java.rmi.RemoteException;

    public FilledPostBuyFormsStruct doGetFilledPostBuyForms(String sessionId, int paymentType, int userRole, long fillingTimeFrom, long fillingTimeTo) throws java.rmi.RemoteException;

    public allegroApi.FieldsValue[] doGetItemFields(String sessionId, long itemId) throws java.rmi.RemoteException;

    public ItemTemplatesStruct doGetItemTemplates(String sessionId, int[] itemTemplateIds) throws java.rmi.RemoteException;

    public allegroApi.ItemImagesStruct[] doGetItemsImages(String sessionHandle, ItemGetImage[] itemsArray, int imageType) throws java.rmi.RemoteException;

    public void doGetItemsInfo(String sessionHandle, long[] itemsIdArray, int getDesc, int getImageUrl, int getAttribs, int getPostageOptions, int getCompanyInfo, int getProductInfo, allegroApi.holders.ArrayOfStructItemInfoListHolder arrayItemListInfo, allegroApi.holders.ArrayOfItemsIDHolder arrayItemsNotFound, allegroApi.holders.ArrayOfItemsIDHolder arrayItemsAdminKilled) throws java.rmi.RemoteException;

    public allegroApi.MessageToBuyerStruct doGetMessageToBuyer(String sessionId, long itemId) throws java.rmi.RemoteException;

    public allegroApi.AddressInfoStruct[] doGetMyAddresses(String sessionId) throws java.rmi.RemoteException;

    public void doGetMyBidItems(String sessionId, SortOptionsStruct sortOptions, String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder bidItemsCounter, allegroApi.holders.ArrayOfBidItemStructHolder bidItemsList) throws java.rmi.RemoteException;

    public int doGetMyCurrentShipmentPriceType(String sessionId) throws java.rmi.RemoteException;

    public void doGetMyData(String sessionHandle, allegroApi.holders.UserDataStructHolder userData, allegroApi.holders.InvoiceDataStructHolder invoiceData, allegroApi.holders.CompanyExtraDataStructHolder companyExtraData, allegroApi.holders.CompanySecondAddressStructHolder companySecondAddress, allegroApi.holders.PharmacyDataStructHolder pharmacyData, allegroApi.holders.AlcoholDataStructHolder alcoholData, allegroApi.holders.RelatedPersonsStructHolder relatedPersons) throws java.rmi.RemoteException;

    public void doGetMyFutureItems(String sessionId, SortOptionsStruct sortOptions, allegroApi.FutureFilterOptionsStruct filterOptions, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder futureItemsCounter, allegroApi.holders.ArrayOfFutureItemStructHolder futureItemsList) throws java.rmi.RemoteException;

    public UserIncomingPaymentStruct[] doGetMyIncomingPayments(String sessionHandle, int buyerId, long itemId, long transRecvDateFrom, long transRecvDateTo, int transPageLimit, int transOffset, int strictedSearch) throws java.rmi.RemoteException;

    public allegroApi.UserIncomingPaymentRefundsStruct[] doGetMyIncomingPaymentsRefunds(String sessionHandle, int buyerId, long itemId, int limit, int offset) throws java.rmi.RemoteException;

    public void doGetMyNotSoldItems(String sessionId, SortOptionsStruct sortOptions, allegroApi.NotSoldFilterOptionsStruct filterOptions, String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder notSoldItemsCounter, allegroApi.holders.ArrayOfNotSoldItemStructHolder notSoldItemsList) throws java.rmi.RemoteException;

    public void doGetMyNotWonItems(String sessionId, SortOptionsStruct sortOptions, String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder notWonItemsCounter, allegroApi.holders.ArrayOfNotWonItemStructHolder notWonItemsList) throws java.rmi.RemoteException;

    public UserPaymentStruct[] doGetMyPayments(String sessionId, int sellerId, long itemId, long paymentTimeFrom, long paymentTimeTo, int pageSize, int pageNumber, int strictedSearch) throws java.rmi.RemoteException;

    public PaymentsInfoStruct doGetMyPaymentsInfo(String sessionId) throws java.rmi.RemoteException;

    public UserPaymentRefundsStruct[] doGetMyPaymentsRefunds(String sessionHandle, int sellerId, long itemId, int limit, int offset) throws java.rmi.RemoteException;

    public allegroApi.UserPayoutStruct[] doGetMyPayouts(String sessionHandle, long transCreateDateFrom, long transCreateDateTo, int transPageLimit, int transOffset) throws java.rmi.RemoteException;

    public void doGetMySellItems(String sessionId, SortOptionsStruct sortOptions, SellFilterOptionsStruct filterOptions, String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder sellItemsCounter, allegroApi.holders.ArrayOfSellItemStructHolder sellItemsList) throws java.rmi.RemoteException;

    public void doGetMySellRating(String sessionHandle, javax.xml.rpc.holders.IntHolder sellRatingTotalCount, allegroApi.holders.ArrayOfSellRatingAverageStructHolder sellRatingAverage, allegroApi.holders.ArrayOfSellRatingDetailStructHolder sellRatingDetails, allegroApi.holders.ArrayOfSellRatingAveragePerMonthHolder sellRatingStatsPerMonth) throws java.rmi.RemoteException;

    public void doGetMySoldItems(String sessionId, SortOptionsStruct sortOptions, SoldFilterOptionsStruct filterOptions, String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder soldItemsCounter, allegroApi.holders.ArrayOfSoldItemStructHolder soldItemsList) throws java.rmi.RemoteException;

    public void doGetMyWatchItems(String sessionId, SortOptionsStruct sortOptions, String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder watchItemsCounter, allegroApi.holders.ArrayOfWatchItemStructHolder watchItemsList) throws java.rmi.RemoteException;

    public void doGetMyWatchedItems(String sessionId, SortOptionsStruct sortOptions, String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder watchedItemsCounter, allegroApi.holders.ArrayOfWatchedItemStructHolder watchedItemsList) throws java.rmi.RemoteException;

    public void doGetMyWonItems(String sessionId, SortOptionsStruct sortOptions, String searchValue, int categoryId, long[] itemIds, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder wonItemsCounter, allegroApi.holders.ArrayOfWonItemStructHolder wonItemsList) throws java.rmi.RemoteException;

    public BillingDataType[] doGetPaymentData(int countryId, String webapiKey) throws java.rmi.RemoteException;

    public PaymentMethodStruct[] doGetPaymentMethods(String sessionId, long[] itemIds) throws java.rmi.RemoteException;

    public ItemPostBuyDataStruct[] doGetPostBuyData(String sessionHandle, long[] itemsArray, long[] buyerFilterArray) throws java.rmi.RemoteException;

    public allegroApi.PostBuyFormForBuyersDataStruct[] doGetPostBuyFormsDataForBuyers(String sessionId, long[] transactionsIdsArray) throws java.rmi.RemoteException;

    public allegroApi.PostBuyFormDataStruct[] doGetPostBuyFormsDataForSellers(String sessionId, long[] transactionsIdsArray) throws java.rmi.RemoteException;

    public PostBuyItemInfoStruct[] doGetPostBuyItemInfo(String sessionId, long[] itemIds) throws java.rmi.RemoteException;

    public void doGetRefundsDeals(String sessionId, allegroApi.FilterOptionsType[] filterOptions, String sortOrder, int resultSize, int resultOffset, javax.xml.rpc.holders.IntHolder dealsCount, allegroApi.holders.ArrayOfRefundsDealsListTypeHolder dealsList, allegroApi.holders.ArrayOfFiltersListTypeHolder filtersList) throws java.rmi.RemoteException;

    public void doGetRefundsList(String sessionId, allegroApi.FilterOptionsType[] filterOptions, int resultSize, int resultOffset, javax.xml.rpc.holders.IntHolder refundsCount, allegroApi.holders.ArrayOfRefundListTypeHolder refundsList, allegroApi.holders.ArrayOfFiltersListTypeHolder filtersList) throws java.rmi.RemoteException;

    public allegroApi.RelatedItemsStruct doGetRelatedItems(String sessionId, long[] itemIds) throws java.rmi.RemoteException;

    public void doGetSellFormAttribs(int countryId, String webapiKey, long localVersion, int catId, allegroApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;

    public void doGetSellFormFields(int countryCode, long localVersion, String webapiKey, allegroApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;

    public void doGetSellFormFieldsExt(int countryCode, long localVersion, String webapiKey, allegroApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException;

    public void doGetSellFormFieldsExtLimit(int countryCode, long localVersion, String webapiKey, int offset, int packageElement, allegroApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr, javax.xml.rpc.holders.IntHolder formFieldsCount) throws java.rmi.RemoteException;

    public SellFormFieldsForCategoryStruct doGetSellFormFieldsForCategory(String webapiKey, int countryId, int categoryId) throws java.rmi.RemoteException;

    public void doGetSellFormFieldsLimit(int countryCode, long localVersion, String webapiKey, int offset, int packageElement, allegroApi.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr, javax.xml.rpc.holders.IntHolder formFieldsCount) throws java.rmi.RemoteException;

    public SellRatingInfoStruct[] doGetSellRatingReasons(String webapiKey, int countryCode) throws java.rmi.RemoteException;

    public void doGetSessionHandleForWidget(String webapiKey, int countryCode, javax.xml.rpc.holders.StringHolder sessionHandle, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException;

    public void doGetShipmentData(int countryId, String webapiKey, allegroApi.holders.ArrayOfShipmentDataStructHolder shipmentDataList, javax.xml.rpc.holders.LongHolder localVersion) throws java.rmi.RemoteException;

    public RelatedItemsShipmentDataStruct doGetShipmentDataForRelatedItems(String sessionId, long[] itemIds) throws java.rmi.RemoteException;

    public ShipmentPriceTypeStruct[] doGetShipmentPriceTypes(int countryId, String webapiKey) throws java.rmi.RemoteException;

    public void doGetShopsTags(String sessionId, javax.xml.rpc.holders.IntHolder shopsTagsCount, allegroApi.holders.ArrayOfShopsTagTypeStructHolder shopsTags) throws java.rmi.RemoteException;

    public SiteJournal[] doGetSiteJournal(String sessionHandle, long startingPoint, int infoType) throws java.rmi.RemoteException;

    public allegroApi.SiteJournalDealsStruct[] doGetSiteJournalDeals(String sessionId, long journalStart) throws java.rmi.RemoteException;

    public SiteJournalDealsInfoStruct doGetSiteJournalDealsInfo(String sessionId, long journalStart) throws java.rmi.RemoteException;

    public allegroApi.SiteJournalInfo doGetSiteJournalInfo(String sessionHandle, long startingPoint, int infoType) throws java.rmi.RemoteException;

    public allegroApi.StateInfoStruct[] doGetStatesInfo(int countryCode, String webapiKey) throws java.rmi.RemoteException;

    public long doGetSystemTime(int countryId, String webapiKey) throws java.rmi.RemoteException;

    public long[] doGetTransactionsIDs(String sessionHandle, long[] itemsIdArray, String userRole, long[] shipmentIdArray) throws java.rmi.RemoteException;

    public int doGetUserID(int countryId, String userLogin, String userEmail, String webapiKey) throws java.rmi.RemoteException;

    public float doGetUserLicenceDate(String sessionHandle) throws java.rmi.RemoteException;

    public String doGetUserLogin(int countryId, int userId, String webapiKey) throws java.rmi.RemoteException;

    public WaitFeedbackStruct[] doGetWaitingFeedbacks(String sessionHandle, int offset, int packageSize) throws java.rmi.RemoteException;

    public int doGetWaitingFeedbacksCount(String sessionHandle) throws java.rmi.RemoteException;

    public void doLogin(String userLogin, String userPassword, int countryCode, String webapiKey, long localVersion, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException;

    public void doLoginEnc(String userLogin, String userHashPassword, int countryCode, String webapiKey, long localVersion, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException;

    public void doLoginWithAccessToken(String accessToken, int countryCode, String webapiKey, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException;

    public MyAccountStruct2[] doMyAccount2(String sessionHandle, String accountType, int offset, long[] itemsArray, int limit) throws java.rmi.RemoteException;

    public int doMyAccountItemsCount(String sessionHandle, String accountType, long[] itemsArray) throws java.rmi.RemoteException;

    public String doMyBilling(String sessionHandle) throws java.rmi.RemoteException;

    public void doMyBillingItem(String sessionHandle, long itemId, String option, allegroApi.holders.ItemBillingListHolder entryFees, allegroApi.holders.ItemBillingListHolder endingFees) throws java.rmi.RemoteException;

    public MyContactList[] doMyContact(String sessionHandle, long[] auctionIdList, int offset, int desc) throws java.rmi.RemoteException;

    public allegroApi.MyFeedbackListStruct2[] doMyFeedback2(String sessionHandle, String feedbackType, int offset, int desc, long[] itemsArray) throws java.rmi.RemoteException;

    public allegroApi.MyFeedbackListStruct2[] doMyFeedback2Limit(String sessionHandle, String feedbackType, int offset, int desc, long[] itemsArray, int packageElement) throws java.rmi.RemoteException;

    public void doNewAuctionExt(String sessionHandle, allegroApi.FieldsValue[] fields, int itemTemplateId, int localId, ItemTemplateCreateStruct itemTemplateCreate, VariantStruct[] variants, TagNameStruct[] tags, javax.xml.rpc.holders.LongHolder itemId, javax.xml.rpc.holders.StringHolder itemInfo, javax.xml.rpc.holders.IntHolder itemIsAllegroStandard) throws java.rmi.RemoteException;

    public SysStatusType[] doQueryAllSysStatus(int countryId, String webapiKey) throws java.rmi.RemoteException;

    public void doQuerySysStatus(int sysvar, int countryId, String webapiKey, javax.xml.rpc.holders.StringHolder info, javax.xml.rpc.holders.LongHolder verKey) throws java.rmi.RemoteException;

    public allegroApi.BlackListResStruct[] doRemoveFromBlackList(String sessionHandle, long[] usersIdArray) throws java.rmi.RemoteException;

    public allegroApi.ItemRemoveWatchStruct[] doRemoveFromWatchList(String sessionHandle, long[] itemsIdArray) throws java.rmi.RemoteException;

    public allegroApi.RemovedItemTemplatesStruct doRemoveItemTemplates(String sessionId, int[] itemTemplateIds) throws java.rmi.RemoteException;

    public int doRequestCancelBid(String sessionHandle, long requestItemId, String requestCancelReason) throws java.rmi.RemoteException;

    public RequestPayoutStruct doRequestPayout(String sessionId) throws java.rmi.RemoteException;

    public int doRequestSurcharge(String sessionHandle, long transactionId, float surchargeValue, String surchargeMessageToBuyer) throws java.rmi.RemoteException;

    public void doSellSomeAgain(String sessionHandle, long[] sellItemsArray, long sellStartingTime, int sellAuctionDuration, int sellOptions, int[] localIds, int sellProlongOptions, allegroApi.holders.ArrayOfStructSellAgainHolder itemsSellAgain, allegroApi.holders.ArrayOfStructSellFailedHolder itemsSellFailed, allegroApi.holders.ArrayOfItemsIDHolder itemsSellNotFound) throws java.rmi.RemoteException;

    public void doSellSomeAgainInShop(String sessionHandle, long[] sellItemsArray, long sellStartingTime, int sellShopDuration, int sellShopOptions, int sellProlongOptions, long sellShopCategory, int[] localIds, allegroApi.holders.ArrayOfStructSellAgainHolder itemsSellAgain, allegroApi.holders.ArrayOfStructSellFailedHolder itemsSellFailed, allegroApi.holders.ArrayOfItemsIDHolder itemsSellNotFound) throws java.rmi.RemoteException;

    public String doSendEmailToUser(String sessionHandle, long mailToUserItemId, javax.xml.rpc.holders.LongHolder mailToUserReceiverId, int mailToUserSubjectId, int mailToUserOption, String mailToUserMessage) throws java.rmi.RemoteException;

    public allegroApi.PostBuyFormStruct doSendPostBuyForm(String sessionId, allegroApi.NewPostBuyFormSellerStruct[] newPostBuyFormSeller, allegroApi.NewPostBuyFormCommonStruct newPostBuyFormCommon) throws java.rmi.RemoteException;

    public int doSetShipmentPriceType(String sessionId, int shipmentPriceTypeId) throws java.rmi.RemoteException;

    public int doSetUserLicenceDate(String adminSessionHandle, String userLicLogin, int userLicCountry, float userLicDate) throws java.rmi.RemoteException;

    public void doShowItemInfoExt(String sessionHandle, long itemId, int getDesc, int getImageUrl, int getAttribs, int getPostageOptions, int getCompanyInfo, int getProductInfo, allegroApi.holders.ItemInfoExtHolder itemListInfoExt, allegroApi.holders.ArrayOfItemCatListHolder itemCatPath, allegroApi.holders.ArrayOfItemImageListHolder itemImgList, allegroApi.holders.ArrayOfAttribStructHolder itemAttribList, allegroApi.holders.ArrayOfPostageStructHolder itemPostageOptions, allegroApi.holders.ItemPaymentOptionsHolder itemPaymentOptions, allegroApi.holders.CompanyInfoStructHolder itemCompanyInfo, allegroApi.holders.ProductStructHolder itemProductInfo, allegroApi.holders.ArrayOfItemVariantStructHolder itemVariants) throws java.rmi.RemoteException;

    public void doShowUser(String webapiKey, int countryId, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.StringHolder userLogin, javax.xml.rpc.holders.IntHolder userCountry, javax.xml.rpc.holders.LongHolder userCreateDate, javax.xml.rpc.holders.LongHolder userLoginDate, javax.xml.rpc.holders.IntHolder userRating, javax.xml.rpc.holders.IntHolder userIsNewUser, javax.xml.rpc.holders.IntHolder userNotActivated, javax.xml.rpc.holders.IntHolder userClosed, javax.xml.rpc.holders.IntHolder userBlocked, javax.xml.rpc.holders.IntHolder userTerminated, javax.xml.rpc.holders.IntHolder userHasPage, javax.xml.rpc.holders.IntHolder userIsSseller, javax.xml.rpc.holders.IntHolder userIsEco, allegroApi.holders.ShowUserFeedbacksHolder userPositiveFeedback, allegroApi.holders.ShowUserFeedbacksHolder userNegativeFeedback, allegroApi.holders.ShowUserFeedbacksHolder userNeutralFeedback, javax.xml.rpc.holders.IntHolder userJuniorStatus, javax.xml.rpc.holders.IntHolder userHasShop, javax.xml.rpc.holders.IntHolder userCompanyIcon, javax.xml.rpc.holders.IntHolder userSellRatingCount, allegroApi.holders.ArrayOfSellRatingAverageStructHolder userSellRatingAverage, javax.xml.rpc.holders.IntHolder userIsAllegroStandard, javax.xml.rpc.holders.IntHolder userIsB2CSeller) throws java.rmi.RemoteException;

    public void doVerifyItem(String sessionHandle, int localId, javax.xml.rpc.holders.LongHolder itemId, javax.xml.rpc.holders.IntHolder itemListed, javax.xml.rpc.holders.LongHolder itemStartingTime) throws java.rmi.RemoteException;
}
