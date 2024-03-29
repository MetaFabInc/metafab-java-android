# LootboxesApi

All URIs are relative to *https://api.trymetafab.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLootboxManager**](LootboxesApi.md#createLootboxManager) | **POST** /v1/lootboxManagers | Create lootbox manager
[**getLootboxManagerLootbox**](LootboxesApi.md#getLootboxManagerLootbox) | **GET** /v1/lootboxManagers/{lootboxManagerId}/lootboxes/{lootboxManagerLootboxId} | Get lootbox manager lootbox
[**getLootboxManagerLootboxes**](LootboxesApi.md#getLootboxManagerLootboxes) | **GET** /v1/lootboxManagers/{lootboxManagerId}/lootboxes | Get lootbox manager lootboxes
[**getLootboxManagers**](LootboxesApi.md#getLootboxManagers) | **GET** /v1/lootboxManagers | Get lootbox managers
[**openLootboxManagerLootbox**](LootboxesApi.md#openLootboxManagerLootbox) | **POST** /v1/lootboxManagers/{lootboxManagerId}/lootboxes/{lootboxManagerLootboxId}/opens | Open lootbox manager lootbox
[**removeLootboxManagerLootbox**](LootboxesApi.md#removeLootboxManagerLootbox) | **DELETE** /v1/lootboxManagers/{lootboxManagerId}/lootboxes/{lootboxManagerLootboxId} | Remove lootbox manager lootbox
[**setLootboxManagerLootbox**](LootboxesApi.md#setLootboxManagerLootbox) | **POST** /v1/lootboxManagers/{lootboxManagerId}/lootboxes | Set lootbox manager lootbox



## createLootboxManager

> CreateLootboxManager200Response createLootboxManager(xAuthorization, xWalletDecryptKey, createLootboxManagerRequest)

Create lootbox manager

Creates a new game lootbox manager and deploys a lootbox manager contract on behalf of the authenticating game&#39;s primary wallet. The deployed lootbox manager contract allows you to create lootbox behavior for existing items. For example, you can define item id(s) from one of your item collections as the requirement(s) to open a \&quot;lootbox\&quot;. The required item(s) would be burned from the interacting player&#39;s wallet and the player would receive item(s) from a weighted randomized set of possible items the lootbox can contain.

### Example

```java
// Import classes:
//import org.metafab.client.api.LootboxesApi;

LootboxesApi apiInstance = new LootboxesApi();
String xAuthorization = game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP; // String | The `secretKey` of the authenticating game.
String xWalletDecryptKey = AXNP8MKb+5SbBtHWrZu5KHh5/BomXY/dMRG/BDUn7a4=; // String | The `walletDecryptKey` of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
CreateLootboxManagerRequest createLootboxManagerRequest = new CreateLootboxManagerRequest(); // CreateLootboxManagerRequest | 
try {
    CreateLootboxManager200Response result = apiInstance.createLootboxManager(xAuthorization, xWalletDecryptKey, createLootboxManagerRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LootboxesApi#createLootboxManager");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | [default to null]
 **xWalletDecryptKey** | **String**| The &#x60;walletDecryptKey&#x60; of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | [default to null]
 **createLootboxManagerRequest** | [**CreateLootboxManagerRequest**](CreateLootboxManagerRequest.md)|  |

### Return type

[**CreateLootboxManager200Response**](CreateLootboxManager200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getLootboxManagerLootbox

> LootboxManagerLootbox getLootboxManagerLootbox(lootboxManagerId, lootboxManagerLootboxId)

Get lootbox manager lootbox

Returns a lootbox manager lootbox object for the provided lootboxManagerLootboxId.

### Example

```java
// Import classes:
//import org.metafab.client.api.LootboxesApi;

LootboxesApi apiInstance = new LootboxesApi();
String lootboxManagerId = null; // String | Any lootbox manager id within the MetaFab platform.
String lootboxManagerLootboxId = null; // String | Any lootbox manager lootbox id within the MetaFab platform.
try {
    LootboxManagerLootbox result = apiInstance.getLootboxManagerLootbox(lootboxManagerId, lootboxManagerLootboxId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LootboxesApi#getLootboxManagerLootbox");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lootboxManagerId** | **String**| Any lootbox manager id within the MetaFab platform. | [default to null]
 **lootboxManagerLootboxId** | **String**| Any lootbox manager lootbox id within the MetaFab platform. | [default to null]

### Return type

[**LootboxManagerLootbox**](LootboxManagerLootbox.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getLootboxManagerLootboxes

> List&lt;LootboxManagerLootbox&gt; getLootboxManagerLootboxes(lootboxManagerId)

Get lootbox manager lootboxes

Returns all lootbox manager lootboxes as an array of lootbox objects.

### Example

```java
// Import classes:
//import org.metafab.client.api.LootboxesApi;

LootboxesApi apiInstance = new LootboxesApi();
String lootboxManagerId = null; // String | Any lootbox manager id within the MetaFab platform.
try {
    List<LootboxManagerLootbox> result = apiInstance.getLootboxManagerLootboxes(lootboxManagerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LootboxesApi#getLootboxManagerLootboxes");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lootboxManagerId** | **String**| Any lootbox manager id within the MetaFab platform. | [default to null]

### Return type

[**List&lt;LootboxManagerLootbox&gt;**](LootboxManagerLootbox.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getLootboxManagers

> List&lt;GetLootboxManagers200ResponseInner&gt; getLootboxManagers(xGameKey)

Get lootbox managers

Returns an array of active lootbox managers for the game associated with the provided &#x60;X-Game-Key&#x60;.

### Example

```java
// Import classes:
//import org.metafab.client.api.LootboxesApi;

LootboxesApi apiInstance = new LootboxesApi();
String xGameKey = game_pk_4SOqpDi8pQdnQgfCOBW29qR8YmwOhxVPz5iHoMgUEJLDdPXgwLuHqZf8ewo2GajZ; // String | The `publishedKey` of a specific game. This can be shared or included in game clients, websites, etc.
try {
    List<GetLootboxManagers200ResponseInner> result = apiInstance.getLootboxManagers(xGameKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LootboxesApi#getLootboxManagers");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGameKey** | **String**| The &#x60;publishedKey&#x60; of a specific game. This can be shared or included in game clients, websites, etc. | [default to null]

### Return type

[**List&lt;GetLootboxManagers200ResponseInner&gt;**](GetLootboxManagers200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## openLootboxManagerLootbox

> List&lt;TransactionModel&gt; openLootboxManagerLootbox(lootboxManagerId, lootboxManagerLootboxId, xAuthorization, xWalletDecryptKey)

Open lootbox manager lootbox

Opens a lootbox manager lootbox. The required input item(s) are burned from the wallet or player wallet opening the lootbox. The given output item(s) are given to the wallet or player wallet opening the lootbox.

### Example

```java
// Import classes:
//import org.metafab.client.api.LootboxesApi;

LootboxesApi apiInstance = new LootboxesApi();
String lootboxManagerId = null; // String | Any lootbox manager id within the MetaFab platform.
String lootboxManagerLootboxId = null; // String | Any lootbox manager lootbox id within the MetaFab platform.
String xAuthorization = ["game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP","player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"]; // String | The `secretKey` of a specific game or the `accessToken` of a specific player.
String xWalletDecryptKey = AXNP8MKb+5SbBtHWrZu5KHh5/BomXY/dMRG/BDUn7a4=; // String | The `walletDecryptKey` of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet.
try {
    List<TransactionModel> result = apiInstance.openLootboxManagerLootbox(lootboxManagerId, lootboxManagerLootboxId, xAuthorization, xWalletDecryptKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LootboxesApi#openLootboxManagerLootbox");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lootboxManagerId** | **String**| Any lootbox manager id within the MetaFab platform. | [default to null]
 **lootboxManagerLootboxId** | **String**| Any lootbox manager lootbox id within the MetaFab platform. | [default to null]
 **xAuthorization** | **String**| The &#x60;secretKey&#x60; of a specific game or the &#x60;accessToken&#x60; of a specific player. | [default to null]
 **xWalletDecryptKey** | **String**| The &#x60;walletDecryptKey&#x60; of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet. | [default to null]

### Return type

[**List&lt;TransactionModel&gt;**](TransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## removeLootboxManagerLootbox

> TransactionModel removeLootboxManagerLootbox(lootboxManagerId, lootboxManagerLootboxId, xAuthorization, xWalletDecryptKey)

Remove lootbox manager lootbox

Removes the provided lootbox by lootboxId from the provided lootbox manager. Removed lootboxes can no longer be used.

### Example

```java
// Import classes:
//import org.metafab.client.api.LootboxesApi;

LootboxesApi apiInstance = new LootboxesApi();
String lootboxManagerId = null; // String | Any lootbox manager id within the MetaFab platform.
String lootboxManagerLootboxId = null; // String | Any lootbox manager lootbox id within the MetaFab platform.
String xAuthorization = game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP; // String | The `secretKey` of the authenticating game.
String xWalletDecryptKey = AXNP8MKb+5SbBtHWrZu5KHh5/BomXY/dMRG/BDUn7a4=; // String | The `walletDecryptKey` of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
try {
    TransactionModel result = apiInstance.removeLootboxManagerLootbox(lootboxManagerId, lootboxManagerLootboxId, xAuthorization, xWalletDecryptKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LootboxesApi#removeLootboxManagerLootbox");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lootboxManagerId** | **String**| Any lootbox manager id within the MetaFab platform. | [default to null]
 **lootboxManagerLootboxId** | **String**| Any lootbox manager lootbox id within the MetaFab platform. | [default to null]
 **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | [default to null]
 **xWalletDecryptKey** | **String**| The &#x60;walletDecryptKey&#x60; of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | [default to null]

### Return type

[**TransactionModel**](TransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## setLootboxManagerLootbox

> TransactionModel setLootboxManagerLootbox(lootboxManagerId, xAuthorization, xWalletDecryptKey, setLootboxManagerLootboxRequest)

Set lootbox manager lootbox

Sets a new lootbox manager lootbox or updates an existing one for the provided id. Lootboxes allow item(s) to be burned to receive a random set of possible item(s) based on probability weight.  Lootboxes can require any number of unique types of items and quantities to open a created lootbox type within the system. A common pattern with lootboxes is to create a lootbox item type within an item collection, and require it as the input item type.

### Example

```java
// Import classes:
//import org.metafab.client.api.LootboxesApi;

LootboxesApi apiInstance = new LootboxesApi();
String lootboxManagerId = null; // String | Any lootbox manager id within the MetaFab platform.
String xAuthorization = game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP; // String | The `secretKey` of the authenticating game.
String xWalletDecryptKey = AXNP8MKb+5SbBtHWrZu5KHh5/BomXY/dMRG/BDUn7a4=; // String | The `walletDecryptKey` of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
SetLootboxManagerLootboxRequest setLootboxManagerLootboxRequest = new SetLootboxManagerLootboxRequest(); // SetLootboxManagerLootboxRequest | 
try {
    TransactionModel result = apiInstance.setLootboxManagerLootbox(lootboxManagerId, xAuthorization, xWalletDecryptKey, setLootboxManagerLootboxRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LootboxesApi#setLootboxManagerLootbox");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lootboxManagerId** | **String**| Any lootbox manager id within the MetaFab platform. | [default to null]
 **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | [default to null]
 **xWalletDecryptKey** | **String**| The &#x60;walletDecryptKey&#x60; of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | [default to null]
 **setLootboxManagerLootboxRequest** | [**SetLootboxManagerLootboxRequest**](SetLootboxManagerLootboxRequest.md)|  |

### Return type

[**TransactionModel**](TransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

