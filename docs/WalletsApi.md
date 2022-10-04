# WalletsApi

All URIs are relative to *https://api.trymetafab.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWalletBalances**](WalletsApi.md#getWalletBalances) | **GET** /v1/wallets/{walletId}/balances | Get wallet balances
[**getWalletTransactions**](WalletsApi.md#getWalletTransactions) | **GET** /v1/wallets/{walletId}/transactions | Get wallet transactions



## getWalletBalances

> Map&lt;String, BigDecimal&gt; getWalletBalances(walletId)

Get wallet balances

Returns the current native token balance for all chains supported by MetaFab for the provided walletId. This includes balances like Eth, Matic and other native tokens from chains MetaFab supports.

### Example

```java
// Import classes:
//import org.metafab.client.api.WalletsApi;

WalletsApi apiInstance = new WalletsApi();
String walletId = null; // String | Any wallet id within the MetaFab ecosystem.
try {
    Map<String, BigDecimal> result = apiInstance.getWalletBalances(walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#getWalletBalances");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | **String**| Any wallet id within the MetaFab ecosystem. | [default to null]

### Return type

[**Map&lt;String, BigDecimal&gt;**](BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getWalletTransactions

> List&lt;TransactionModel&gt; getWalletTransactions(walletId)

Get wallet transactions

Returns an array of MetaFab initiated transactions performed by the provided walletId. Transactions returned are ordered chronologically from newest to oldest.

### Example

```java
// Import classes:
//import org.metafab.client.api.WalletsApi;

WalletsApi apiInstance = new WalletsApi();
String walletId = null; // String | Any wallet id within the MetaFab ecosystem.
try {
    List<TransactionModel> result = apiInstance.getWalletTransactions(walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#getWalletTransactions");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | **String**| Any wallet id within the MetaFab ecosystem. | [default to null]

### Return type

[**List&lt;TransactionModel&gt;**](TransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

