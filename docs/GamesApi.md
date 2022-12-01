# GamesApi

All URIs are relative to *https://api.trymetafab.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authGame**](GamesApi.md#authGame) | **GET** /v1/games/auth | Authenticate game
[**createGame**](GamesApi.md#createGame) | **POST** /v1/games | Create game
[**getGame**](GamesApi.md#getGame) | **GET** /v1/games/{gameId} | Get game
[**updateGame**](GamesApi.md#updateGame) | **PATCH** /v1/games/{gameId} | Update game



## authGame

> AuthGame200Response authGame()

Authenticate game

Returns an existing game object containing authorization keys and credentials when provided a valid email (in place of username) and password login using Basic Auth.

### Example

```java
// Import classes:
//import org.metafab.client.api.GamesApi;

GamesApi apiInstance = new GamesApi();
try {
    AuthGame200Response result = apiInstance.authGame();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamesApi#authGame");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AuthGame200Response**](AuthGame200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## createGame

> AuthGame200Response createGame(createGameRequest)

Create game

Create a new game. A game is the root entity required for all API interactions. Contracts, currencies, items and more are deployed by games, player accounts are created and registered to games, etc.  To use any of MetaFab&#39;s services, you must first create a game through this endpoint.  After creating your game through this endpoint, a verification email will be sent to the email address used. Before you can access any of MetaFab&#39;s features, you&#39;ll need to click the link contained in the verification email to verify your account.

### Example

```java
// Import classes:
//import org.metafab.client.api.GamesApi;

GamesApi apiInstance = new GamesApi();
CreateGameRequest createGameRequest = new CreateGameRequest(); // CreateGameRequest | 
try {
    AuthGame200Response result = apiInstance.createGame(createGameRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamesApi#createGame");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createGameRequest** | [**CreateGameRequest**](CreateGameRequest.md)|  |

### Return type

[**AuthGame200Response**](AuthGame200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getGame

> PublicGame getGame(gameId)

Get game

Returns a game object for the provided game id.

### Example

```java
// Import classes:
//import org.metafab.client.api.GamesApi;

GamesApi apiInstance = new GamesApi();
String gameId = null; // String | Any game id within the MetaFab ecosystem.
try {
    PublicGame result = apiInstance.getGame(gameId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamesApi#getGame");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gameId** | **String**| Any game id within the MetaFab ecosystem. | [default to null]

### Return type

[**PublicGame**](PublicGame.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateGame

> GameModel updateGame(gameId, xAuthorization, updateGameRequest)

Update game

Update various fields specific to a game. Such as changing its password, resetting its published or secret key, or updating its RPCs.

### Example

```java
// Import classes:
//import org.metafab.client.api.GamesApi;

GamesApi apiInstance = new GamesApi();
String gameId = null; // String | Any game id within the MetaFab ecosystem.
String xAuthorization = game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP; // String | The `secretKey` of the authenticating game.
UpdateGameRequest updateGameRequest = new UpdateGameRequest(); // UpdateGameRequest | 
try {
    GameModel result = apiInstance.updateGame(gameId, xAuthorization, updateGameRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamesApi#updateGame");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gameId** | **String**| Any game id within the MetaFab ecosystem. | [default to null]
 **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | [default to null]
 **updateGameRequest** | [**UpdateGameRequest**](UpdateGameRequest.md)|  |

### Return type

[**GameModel**](GameModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

