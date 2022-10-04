# TransactionsApi

All URIs are relative to *https://api.trymetafab.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransaction**](TransactionsApi.md#getTransaction) | **GET** /v1/transactions/{transactionId} | Get transaction



## getTransaction

> TransactionModel getTransaction(transactionId)

Get transaction

Returns an executed transaction object for the provided transactionId. Transactions are created by MetaFab when interacting with contracts, currencies, items and other MetaFab resources.

### Example

```java
// Import classes:
//import org.metafab.client.api.TransactionsApi;

TransactionsApi apiInstance = new TransactionsApi();
String transactionId = null; // String | Any transaction id within the MetaFab ecosystem.
try {
    TransactionModel result = apiInstance.getTransaction(transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#getTransaction");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | **String**| Any transaction id within the MetaFab ecosystem. | [default to null]

### Return type

[**TransactionModel**](TransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

