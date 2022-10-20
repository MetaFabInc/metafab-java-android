# CurrenciesApi

All URIs are relative to *https://api.trymetafab.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchTransferCurrency**](CurrenciesApi.md#batchTransferCurrency) | **POST** /v1/currencies/{currencyId}/batchTransfers | Batch transfer currency
[**burnCurrency**](CurrenciesApi.md#burnCurrency) | **POST** /v1/currencies/{currencyId}/burns | Burn currency
[**createCurrency**](CurrenciesApi.md#createCurrency) | **POST** /v1/currencies | Create currency
[**getCurrencies**](CurrenciesApi.md#getCurrencies) | **GET** /v1/currencies | Get currencies
[**getCurrencyBalance**](CurrenciesApi.md#getCurrencyBalance) | **GET** /v1/currencies/{currencyId}/balances | Get currency balance
[**getCurrencyFees**](CurrenciesApi.md#getCurrencyFees) | **GET** /v1/currencies/{currencyId}/fees | Get currency fees
[**mintCurrency**](CurrenciesApi.md#mintCurrency) | **POST** /v1/currencies/{currencyId}/mints | Mint currency
[**setCurrencyFees**](CurrenciesApi.md#setCurrencyFees) | **POST** /v1/currencies/{currencyId}/fees | Set currency fees
[**transferCurrency**](CurrenciesApi.md#transferCurrency) | **POST** /v1/currencies/{currencyId}/transfers | Transfer currency



## batchTransferCurrency

> TransactionModel batchTransferCurrency(currencyId, xAuthorization, xPassword, batchTransferCurrencyRequest)

Batch transfer currency

Transfers multiple amounts of currency to multiple provided wallet addresses or wallet addresses associated with the provided walletIds. You may also provide a combination of addresses and walletIds in one request, the proper receipients will be automatically determined, with &#x60;addresses&#x60; getting &#x60;amounts&#x60; order priority first.  Optional references may be included for the transfer. References are useful for identifying transfers intended to pay for items, trades, services and more.

### Example

```java
// Import classes:
//import org.metafab.client.api.CurrenciesApi;

CurrenciesApi apiInstance = new CurrenciesApi();
String currencyId = null; // String | Any currency id within the MetaFab ecosystem.
String xAuthorization = ["game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP","player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"]; // String | The `secretKey` of a specific game or the `accessToken` of a specific player.
String xPassword = mySecurePassword; // String | The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet.
BatchTransferCurrencyRequest batchTransferCurrencyRequest = new BatchTransferCurrencyRequest(); // BatchTransferCurrencyRequest | 
try {
    TransactionModel result = apiInstance.batchTransferCurrency(currencyId, xAuthorization, xPassword, batchTransferCurrencyRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#batchTransferCurrency");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyId** | **String**| Any currency id within the MetaFab ecosystem. | [default to null]
 **xAuthorization** | **String**| The &#x60;secretKey&#x60; of a specific game or the &#x60;accessToken&#x60; of a specific player. | [default to null]
 **xPassword** | **String**| The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet. | [default to null]
 **batchTransferCurrencyRequest** | [**BatchTransferCurrencyRequest**](BatchTransferCurrencyRequest.md)|  |

### Return type

[**TransactionModel**](TransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## burnCurrency

> TransactionModel burnCurrency(currencyId, xAuthorization, xPassword, burnCurrencyRequest)

Burn currency

Removes (burns) the provided amount of currency from the authenticating game or players wallet. The currency amount is permanently removed from the circulating supply of the currency.

### Example

```java
// Import classes:
//import org.metafab.client.api.CurrenciesApi;

CurrenciesApi apiInstance = new CurrenciesApi();
String currencyId = null; // String | Any currency id within the MetaFab ecosystem.
String xAuthorization = ["game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP","player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"]; // String | The `secretKey` of a specific game or the `accessToken` of a specific player.
String xPassword = mySecurePassword; // String | The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet.
BurnCurrencyRequest burnCurrencyRequest = new BurnCurrencyRequest(); // BurnCurrencyRequest | 
try {
    TransactionModel result = apiInstance.burnCurrency(currencyId, xAuthorization, xPassword, burnCurrencyRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#burnCurrency");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyId** | **String**| Any currency id within the MetaFab ecosystem. | [default to null]
 **xAuthorization** | **String**| The &#x60;secretKey&#x60; of a specific game or the &#x60;accessToken&#x60; of a specific player. | [default to null]
 **xPassword** | **String**| The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet. | [default to null]
 **burnCurrencyRequest** | [**BurnCurrencyRequest**](BurnCurrencyRequest.md)|  |

### Return type

[**TransactionModel**](TransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## createCurrency

> CreateCurrency200Response createCurrency(xAuthorization, xPassword, createCurrencyRequest)

Create currency

Creates a new game currency and deploys an ERC20 token contract on behalf of the authenticating game&#39;s primary wallet. The deployed ERC20 contract is preconfigured to fully support bridging across blockchains, batched transfers and gasless transactions on any supported blockchain as well as full support for gasless transactions from player managed wallets.

### Example

```java
// Import classes:
//import org.metafab.client.api.CurrenciesApi;

CurrenciesApi apiInstance = new CurrenciesApi();
String xAuthorization = game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP; // String | The `secretKey` of the authenticating game.
String xPassword = mySecurePassword; // String | The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
CreateCurrencyRequest createCurrencyRequest = new CreateCurrencyRequest(); // CreateCurrencyRequest | 
try {
    CreateCurrency200Response result = apiInstance.createCurrency(xAuthorization, xPassword, createCurrencyRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#createCurrency");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | [default to null]
 **xPassword** | **String**| The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | [default to null]
 **createCurrencyRequest** | [**CreateCurrencyRequest**](CreateCurrencyRequest.md)|  |

### Return type

[**CreateCurrency200Response**](CreateCurrency200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getCurrencies

> List&lt;GetCurrencies200ResponseInner&gt; getCurrencies(xGameKey)

Get currencies

Returns an array of active currencies for the game associated with the provided &#x60;X-Game-Key&#x60;.

### Example

```java
// Import classes:
//import org.metafab.client.api.CurrenciesApi;

CurrenciesApi apiInstance = new CurrenciesApi();
String xGameKey = game_pk_4SOqpDi8pQdnQgfCOBW29qR8YmwOhxVPz5iHoMgUEJLDdPXgwLuHqZf8ewo2GajZ; // String | The `publishedKey` of a specific game. This can be shared or included in game clients, websites, etc.
try {
    List<GetCurrencies200ResponseInner> result = apiInstance.getCurrencies(xGameKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#getCurrencies");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGameKey** | **String**| The &#x60;publishedKey&#x60; of a specific game. This can be shared or included in game clients, websites, etc. | [default to null]

### Return type

[**List&lt;GetCurrencies200ResponseInner&gt;**](GetCurrencies200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCurrencyBalance

> BigDecimal getCurrencyBalance(currencyId, address, walletId)

Get currency balance

Returns the current currency balance of the provided wallet address or or the wallet address associated with the provided walletId.

### Example

```java
// Import classes:
//import org.metafab.client.api.CurrenciesApi;

CurrenciesApi apiInstance = new CurrenciesApi();
String currencyId = null; // String | Any currency id within the MetaFab ecosystem.
String address = 0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D; // String | A valid EVM based address. For example, `0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D`.
String walletId = null; // String | Any wallet id within the MetaFab ecosystem.
try {
    BigDecimal result = apiInstance.getCurrencyBalance(currencyId, address, walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#getCurrencyBalance");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyId** | **String**| Any currency id within the MetaFab ecosystem. | [default to null]
 **address** | **String**| A valid EVM based address. For example, &#x60;0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D&#x60;. | [optional] [default to null]
 **walletId** | **String**| Any wallet id within the MetaFab ecosystem. | [optional] [default to null]

### Return type

[**BigDecimal**](BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCurrencyFees

> GetCurrencyFees200Response getCurrencyFees(currencyId)

Get currency fees

Returns the current fee recipient address and fees of the currency for the provided currencyId. Fees are only applicable for gasless transactions performed by default by players.

### Example

```java
// Import classes:
//import org.metafab.client.api.CurrenciesApi;

CurrenciesApi apiInstance = new CurrenciesApi();
String currencyId = null; // String | Any currency id within the MetaFab ecosystem.
try {
    GetCurrencyFees200Response result = apiInstance.getCurrencyFees(currencyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#getCurrencyFees");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyId** | **String**| Any currency id within the MetaFab ecosystem. | [default to null]

### Return type

[**GetCurrencyFees200Response**](GetCurrencyFees200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## mintCurrency

> TransactionModel mintCurrency(currencyId, xAuthorization, xPassword, mintCurrencyRequest)

Mint currency

Creates (mints) the provided amount of currency to the provided wallet address or wallet address associated with the provided walletId.

### Example

```java
// Import classes:
//import org.metafab.client.api.CurrenciesApi;

CurrenciesApi apiInstance = new CurrenciesApi();
String currencyId = null; // String | Any currency id within the MetaFab ecosystem.
String xAuthorization = game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP; // String | The `secretKey` of the authenticating game.
String xPassword = mySecurePassword; // String | The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
MintCurrencyRequest mintCurrencyRequest = new MintCurrencyRequest(); // MintCurrencyRequest | 
try {
    TransactionModel result = apiInstance.mintCurrency(currencyId, xAuthorization, xPassword, mintCurrencyRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#mintCurrency");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyId** | **String**| Any currency id within the MetaFab ecosystem. | [default to null]
 **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | [default to null]
 **xPassword** | **String**| The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | [default to null]
 **mintCurrencyRequest** | [**MintCurrencyRequest**](MintCurrencyRequest.md)|  |

### Return type

[**TransactionModel**](TransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## setCurrencyFees

> TransactionModel setCurrencyFees(currencyId, xAuthorization, xPassword, setCurrencyFeesRequest)

Set currency fees

Sets the recipient address, basis points, fixed amount and cap amount for a currency&#39;s fees.

### Example

```java
// Import classes:
//import org.metafab.client.api.CurrenciesApi;

CurrenciesApi apiInstance = new CurrenciesApi();
String currencyId = null; // String | Any currency id within the MetaFab ecosystem.
String xAuthorization = game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP; // String | The `secretKey` of the authenticating game.
String xPassword = mySecurePassword; // String | The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
SetCurrencyFeesRequest setCurrencyFeesRequest = new SetCurrencyFeesRequest(); // SetCurrencyFeesRequest | 
try {
    TransactionModel result = apiInstance.setCurrencyFees(currencyId, xAuthorization, xPassword, setCurrencyFeesRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#setCurrencyFees");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyId** | **String**| Any currency id within the MetaFab ecosystem. | [default to null]
 **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | [default to null]
 **xPassword** | **String**| The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | [default to null]
 **setCurrencyFeesRequest** | [**SetCurrencyFeesRequest**](SetCurrencyFeesRequest.md)|  |

### Return type

[**TransactionModel**](TransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## transferCurrency

> TransactionModel transferCurrency(currencyId, xAuthorization, xPassword, transferCurrencyRequest)

Transfer currency

Transfers an amount of currency to the provided wallet address or wallet address associated with the provided walletId. If you want to transfer to multiple wallets with different amounts and optional references in one API request, please see the Batch transfer currency documentation.  An optional reference may be included for the transfer. References are useful for identifying transfers intended to pay for items, trades, services and more.

### Example

```java
// Import classes:
//import org.metafab.client.api.CurrenciesApi;

CurrenciesApi apiInstance = new CurrenciesApi();
String currencyId = null; // String | Any currency id within the MetaFab ecosystem.
String xAuthorization = ["game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP","player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"]; // String | The `secretKey` of a specific game or the `accessToken` of a specific player.
String xPassword = mySecurePassword; // String | The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet.
TransferCurrencyRequest transferCurrencyRequest = new TransferCurrencyRequest(); // TransferCurrencyRequest | 
try {
    TransactionModel result = apiInstance.transferCurrency(currencyId, xAuthorization, xPassword, transferCurrencyRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#transferCurrency");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyId** | **String**| Any currency id within the MetaFab ecosystem. | [default to null]
 **xAuthorization** | **String**| The &#x60;secretKey&#x60; of a specific game or the &#x60;accessToken&#x60; of a specific player. | [default to null]
 **xPassword** | **String**| The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet. | [default to null]
 **transferCurrencyRequest** | [**TransferCurrencyRequest**](TransferCurrencyRequest.md)|  |

### Return type

[**TransactionModel**](TransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

