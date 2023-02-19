# PlayersApi

All URIs are relative to *https://api.trymetafab.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authPlayer**](PlayersApi.md#authPlayer) | **GET** /v1/players/auth | Authenticate player
[**createPlayer**](PlayersApi.md#createPlayer) | **POST** /v1/players | Create player
[**getPlayer**](PlayersApi.md#getPlayer) | **GET** /v1/players/{playerId} | Get player
[**getPlayerData**](PlayersApi.md#getPlayerData) | **GET** /v1/players/{playerId}/data | Get player data
[**getPlayers**](PlayersApi.md#getPlayers) | **GET** /v1/players | Get players
[**removePlayerConnectedWallet**](PlayersApi.md#removePlayerConnectedWallet) | **DELETE** /v1/players/{playerId}/wallets/{playerWalletId} | Remove player connected wallet
[**setPlayerConnectedWallet**](PlayersApi.md#setPlayerConnectedWallet) | **POST** /v1/players/{playerId}/wallets | Set player connected wallet
[**setPlayerData**](PlayersApi.md#setPlayerData) | **POST** /v1/players/{playerId}/data | Set player data
[**updatePlayer**](PlayersApi.md#updatePlayer) | **PATCH** /v1/players/{playerId} | Update player



## authPlayer

> AuthPlayer200Response authPlayer(xGameKey)

Authenticate player

Returns an existing player object containing access token, wallet, and other details for a game when provided a valid username and password login using Basic Auth.

### Example

```java
// Import classes:
//import org.metafab.client.api.PlayersApi;

PlayersApi apiInstance = new PlayersApi();
String xGameKey = game_pk_4SOqpDi8pQdnQgfCOBW29qR8YmwOhxVPz5iHoMgUEJLDdPXgwLuHqZf8ewo2GajZ; // String | The `publishedKey` of a specific game. This can be shared or included in game clients, websites, etc.
try {
    AuthPlayer200Response result = apiInstance.authPlayer(xGameKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#authPlayer");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGameKey** | **String**| The &#x60;publishedKey&#x60; of a specific game. This can be shared or included in game clients, websites, etc. | [default to null]

### Return type

[**AuthPlayer200Response**](AuthPlayer200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## createPlayer

> AuthPlayer200Response createPlayer(xGameKey, createPlayerRequest)

Create player

Create a new player for a game. Players are automatically associated with an internally managed wallet.  Player access tokens can be used to directly interact with any MetaFab managed contracts, currencies, items collections, marketplaces and more. Player interactions are also gasless by default, completely removing all crypto friction for players to engage with your MetaFab supported games.

### Example

```java
// Import classes:
//import org.metafab.client.api.PlayersApi;

PlayersApi apiInstance = new PlayersApi();
String xGameKey = game_pk_4SOqpDi8pQdnQgfCOBW29qR8YmwOhxVPz5iHoMgUEJLDdPXgwLuHqZf8ewo2GajZ; // String | The `publishedKey` of a specific game. This can be shared or included in game clients, websites, etc.
CreatePlayerRequest createPlayerRequest = new CreatePlayerRequest(); // CreatePlayerRequest | 
try {
    AuthPlayer200Response result = apiInstance.createPlayer(xGameKey, createPlayerRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#createPlayer");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGameKey** | **String**| The &#x60;publishedKey&#x60; of a specific game. This can be shared or included in game clients, websites, etc. | [default to null]
 **createPlayerRequest** | [**CreatePlayerRequest**](CreatePlayerRequest.md)|  |

### Return type

[**AuthPlayer200Response**](AuthPlayer200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getPlayer

> PublicPlayer getPlayer(playerId)

Get player

Returns a player object for the provided player id.

### Example

```java
// Import classes:
//import org.metafab.client.api.PlayersApi;

PlayersApi apiInstance = new PlayersApi();
String playerId = null; // String | Any player id within the MetaFab platform.
try {
    PublicPlayer result = apiInstance.getPlayer(playerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#getPlayer");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **String**| Any player id within the MetaFab platform. | [default to null]

### Return type

[**PublicPlayer**](PublicPlayer.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPlayerData

> GetPlayerData200Response getPlayerData(playerId)

Get player data

Returns the latest public and protected data as an object for the provided playerId.

### Example

```java
// Import classes:
//import org.metafab.client.api.PlayersApi;

PlayersApi apiInstance = new PlayersApi();
String playerId = null; // String | Any player id within the MetaFab platform.
try {
    GetPlayerData200Response result = apiInstance.getPlayerData(playerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#getPlayerData");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **String**| Any player id within the MetaFab platform. | [default to null]

### Return type

[**GetPlayerData200Response**](GetPlayerData200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPlayers

> List&lt;PublicPlayer&gt; getPlayers(xAuthorization)

Get players

Returns all players for the authenticated game as an array of player objects.

### Example

```java
// Import classes:
//import org.metafab.client.api.PlayersApi;

PlayersApi apiInstance = new PlayersApi();
String xAuthorization = game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP; // String | The `secretKey` of the authenticating game.
try {
    List<PublicPlayer> result = apiInstance.getPlayers(xAuthorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#getPlayers");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | [default to null]

### Return type

[**List&lt;PublicPlayer&gt;**](PublicPlayer.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## removePlayerConnectedWallet

> removePlayerConnectedWallet(playerId, playerWalletId, removePlayerConnectedWalletRequest)

Remove player connected wallet

Removes an external wallet from a player account. The player&#39;s wallet is reverted to their custodial wallet.

### Example

```java
// Import classes:
//import org.metafab.client.api.PlayersApi;

PlayersApi apiInstance = new PlayersApi();
String playerId = null; // String | Any player id within the MetaFab platform.
String playerWalletId = null; // String | Any player wallet id within the MetaFab platform.
RemovePlayerConnectedWalletRequest removePlayerConnectedWalletRequest = new RemovePlayerConnectedWalletRequest(); // RemovePlayerConnectedWalletRequest | 
try {
    apiInstance.removePlayerConnectedWallet(playerId, playerWalletId, removePlayerConnectedWalletRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#removePlayerConnectedWallet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **String**| Any player id within the MetaFab platform. | [default to null]
 **playerWalletId** | **String**| Any player wallet id within the MetaFab platform. | [default to null]
 **removePlayerConnectedWalletRequest** | [**RemovePlayerConnectedWalletRequest**](RemovePlayerConnectedWalletRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## setPlayerConnectedWallet

> SetPlayerConnectedWallet200Response setPlayerConnectedWallet(playerId, xAuthorization, setPlayerConnectedWalletRequest)

Set player connected wallet

Sets an external wallet as the wallet for a player account. The set wallet can transact gaslessly with all MetaFab related systems through the same MetaFab API calls as custodial wallets without requiring transaction signing or private keys.  This is done through an internal system MetaFab has created that allows an external connected wallet to delegate transaction signing for a specific game&#39;s set of contracts to a player&#39;s password protected custodial wallet. This allow the custodial wallet to sign and submit transactions to a specific game&#39;s related contracts as if they were signed and submitted by the connected external wallet. This also means that all earned tokens, purchased items and any interactions happen and are recorded on chain as the external connected wallet. No additional logic needs to be writted by developers to support both custodial and external wallets, everything just works.  Finally, this endpoint is meant for advanced users. The majority of developers who want to implement external wallet support for their game can do so without any extra work through our whitelabeled wallet connection feature that implements this endpoint underneath the hood without any required work.

### Example

```java
// Import classes:
//import org.metafab.client.api.PlayersApi;

PlayersApi apiInstance = new PlayersApi();
String playerId = null; // String | The player id of the authenticating player.
String xAuthorization = player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP; // String | The `accessToken` of the authenticating player.
SetPlayerConnectedWalletRequest setPlayerConnectedWalletRequest = new SetPlayerConnectedWalletRequest(); // SetPlayerConnectedWalletRequest | 
try {
    SetPlayerConnectedWallet200Response result = apiInstance.setPlayerConnectedWallet(playerId, xAuthorization, setPlayerConnectedWalletRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#setPlayerConnectedWallet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **String**| The player id of the authenticating player. | [default to null]
 **xAuthorization** | **String**| The &#x60;accessToken&#x60; of the authenticating player. | [default to null]
 **setPlayerConnectedWalletRequest** | [**SetPlayerConnectedWalletRequest**](SetPlayerConnectedWalletRequest.md)|  |

### Return type

[**SetPlayerConnectedWallet200Response**](SetPlayerConnectedWallet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## setPlayerData

> GetPlayerData200Response setPlayerData(playerId, xAuthorization, setPlayerDataRequest)

Set player data

Creates or updates public and/or protected data for the provided playerId. Data updates are performed using deep merging. This means that when you update any top level or nested properties specific to player public or protected data, you only need to include the properties you are making changes to. Any existing properties not included in request body arguments will be retained on the player data object.  Please note, When writing an array type for a player, arrays do not follow the deep merge approach. If you add or remove an item from an array, the entire array must be passed as an argument when updating the related property for player public or protected data.

### Example

```java
// Import classes:
//import org.metafab.client.api.PlayersApi;

PlayersApi apiInstance = new PlayersApi();
String playerId = null; // String | Any player id within the MetaFab platform.
String xAuthorization = ["game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP","player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"]; // String | The `secretKey` of a specific game or the `accessToken` of a specific player.
SetPlayerDataRequest setPlayerDataRequest = new SetPlayerDataRequest(); // SetPlayerDataRequest | 
try {
    GetPlayerData200Response result = apiInstance.setPlayerData(playerId, xAuthorization, setPlayerDataRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#setPlayerData");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **String**| Any player id within the MetaFab platform. | [default to null]
 **xAuthorization** | **String**| The &#x60;secretKey&#x60; of a specific game or the &#x60;accessToken&#x60; of a specific player. | [default to null]
 **setPlayerDataRequest** | [**SetPlayerDataRequest**](SetPlayerDataRequest.md)|  |

### Return type

[**GetPlayerData200Response**](GetPlayerData200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## updatePlayer

> UpdatePlayer200Response updatePlayer(playerId, xAuthorization, updatePlayerRequest)

Update player

Update various fields specific to a player. Such as changing its password and resetting its access token.

### Example

```java
// Import classes:
//import org.metafab.client.api.PlayersApi;

PlayersApi apiInstance = new PlayersApi();
String playerId = null; // String | The player id of the authenticating player.
String xAuthorization = player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP; // String | The `accessToken` of the authenticating player.
UpdatePlayerRequest updatePlayerRequest = new UpdatePlayerRequest(); // UpdatePlayerRequest | 
try {
    UpdatePlayer200Response result = apiInstance.updatePlayer(playerId, xAuthorization, updatePlayerRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayersApi#updatePlayer");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **String**| The player id of the authenticating player. | [default to null]
 **xAuthorization** | **String**| The &#x60;accessToken&#x60; of the authenticating player. | [default to null]
 **updatePlayerRequest** | [**UpdatePlayerRequest**](UpdatePlayerRequest.md)|  |

### Return type

[**UpdatePlayer200Response**](UpdatePlayer200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

