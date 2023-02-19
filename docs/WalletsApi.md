# WalletsApi

All URIs are relative to *https://api.trymetafab.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWalletSignature**](WalletsApi.md#createWalletSignature) | **POST** /v1/wallets/{walletId}/signatures | Create wallet signature
[**getWallet**](WalletsApi.md#getWallet) | **GET** /v1/wallets/{walletId} | Get wallet
[**getWalletBalances**](WalletsApi.md#getWalletBalances) | **GET** /v1/wallets/{walletId}/balances | Get wallet balances
[**getWalletTransactions**](WalletsApi.md#getWalletTransactions) | **GET** /v1/wallets/{walletId}/transactions | Get wallet transactions



## createWalletSignature

> String createWalletSignature(walletId, xWalletDecryptKey, createWalletSignatureRequest)

Create wallet signature

Creates a wallet signature from a plaintext message using the wallet for the provided walletId and walletDecryptKey. Wallet signatures cannot be generated for EOA wallets.

### Example

```java
// Import classes:
//import org.metafab.client.api.WalletsApi;

WalletsApi apiInstance = new WalletsApi();
String walletId = null; // String | Any wallet id within the MetaFab platform.
String xWalletDecryptKey = AXNP8MKb+5SbBtHWrZu5KHh5/BomXY/dMRG/BDUn7a4=; // String | The `walletDecryptKey` for the provided `walletId`.
CreateWalletSignatureRequest createWalletSignatureRequest = new CreateWalletSignatureRequest(); // CreateWalletSignatureRequest | 
try {
    String result = apiInstance.createWalletSignature(walletId, xWalletDecryptKey, createWalletSignatureRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#createWalletSignature");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | **String**| Any wallet id within the MetaFab platform. | [default to null]
 **xWalletDecryptKey** | **String**| The &#x60;walletDecryptKey&#x60; for the provided &#x60;walletId&#x60;. | [default to null]
 **createWalletSignatureRequest** | [**CreateWalletSignatureRequest**](CreateWalletSignatureRequest.md)|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getWallet

> WalletModel getWallet(walletId)

Get wallet

Returns a wallet object for the provided walletId.

### Example

```java
// Import classes:
//import org.metafab.client.api.WalletsApi;

WalletsApi apiInstance = new WalletsApi();
String walletId = null; // String | Any wallet id within the MetaFab platform.
try {
    WalletModel result = apiInstance.getWallet(walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#getWallet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | **String**| Any wallet id within the MetaFab platform. | [default to null]

### Return type

[**WalletModel**](WalletModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getWalletBalances

> Map&lt;String, BigDecimal&gt; getWalletBalances(walletId)

Get wallet balances

Returns the current native token balance for all chains supported by MetaFab for the provided walletId. This includes balances like Eth, Matic and other native tokens from chains MetaFab supports.

### Example

```java
// Import classes:
//import org.metafab.client.api.WalletsApi;

WalletsApi apiInstance = new WalletsApi();
String walletId = null; // String | Any wallet id within the MetaFab platform.
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
 **walletId** | **String**| Any wallet id within the MetaFab platform. | [default to null]

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
String walletId = null; // String | Any wallet id within the MetaFab platform.
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
 **walletId** | **String**| Any wallet id within the MetaFab platform. | [default to null]

### Return type

[**List&lt;TransactionModel&gt;**](TransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

