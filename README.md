# metafab-java-android

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.metafab</groupId>
    <artifactId>metafab-java-android</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.metafab:metafab-java-android:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/metafab-java-android-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.metafab.client.api.ContractsApi;

public class ContractsApiExample {

    public static void main(String[] args) {
        ContractsApi apiInstance = new ContractsApi();
        String xAuthorization = game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP; // String | The `secretKey` of the authenticating game.
        CreateContractRequest createContractRequest = new CreateContractRequest(); // CreateContractRequest | 
        try {
            ContractModel result = apiInstance.createContract(xAuthorization, createContractRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#createContract");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.trymetafab.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ContractsApi* | [**createContract**](docs/ContractsApi.md#createContract) | **POST** /v1/contracts | Create custom contract
*ContractsApi* | [**getContracts**](docs/ContractsApi.md#getContracts) | **GET** /v1/contracts | Get contracts
*ContractsApi* | [**readContract**](docs/ContractsApi.md#readContract) | **GET** /v1/contracts/{contractId}/reads | Read contract data
*ContractsApi* | [**writeContract**](docs/ContractsApi.md#writeContract) | **POST** /v1/contracts/{contractId}/writes | Write contract data
*CurrenciesApi* | [**batchTransferCurrency**](docs/CurrenciesApi.md#batchTransferCurrency) | **POST** /v1/currencies/{currencyId}/batchTransfers | Batch transfer currency
*CurrenciesApi* | [**burnCurrency**](docs/CurrenciesApi.md#burnCurrency) | **POST** /v1/currencies/{currencyId}/burns | Burn currency
*CurrenciesApi* | [**createCurrency**](docs/CurrenciesApi.md#createCurrency) | **POST** /v1/currencies | Create currency
*CurrenciesApi* | [**getCurrencies**](docs/CurrenciesApi.md#getCurrencies) | **GET** /v1/currencies | Get currencies
*CurrenciesApi* | [**getCurrencyBalance**](docs/CurrenciesApi.md#getCurrencyBalance) | **GET** /v1/currencies/{currencyId}/balances | Get currency balance
*CurrenciesApi* | [**getCurrencyFees**](docs/CurrenciesApi.md#getCurrencyFees) | **GET** /v1/currencies/{currencyId}/fees | Get currency fees
*CurrenciesApi* | [**mintCurrency**](docs/CurrenciesApi.md#mintCurrency) | **POST** /v1/currencies/{currencyId}/mints | Mint currency
*CurrenciesApi* | [**setCurrencyFees**](docs/CurrenciesApi.md#setCurrencyFees) | **POST** /v1/currencies/{currencyId}/fees | Set currency fees
*CurrenciesApi* | [**transferCurrency**](docs/CurrenciesApi.md#transferCurrency) | **POST** /v1/currencies/{currencyId}/transfers | Transfer currency
*GamesApi* | [**authGame**](docs/GamesApi.md#authGame) | **GET** /v1/games | Authenticate game
*GamesApi* | [**createGame**](docs/GamesApi.md#createGame) | **POST** /v1/games | Create game
*GamesApi* | [**updateGame**](docs/GamesApi.md#updateGame) | **PATCH** /v1/games/{gameId} | Update game
*ItemsApi* | [**batchMintCollectionItems**](docs/ItemsApi.md#batchMintCollectionItems) | **POST** /v1/collections/{collectionId}/batchMints | Batch mint collection items
*ItemsApi* | [**batchTransferCollectionItems**](docs/ItemsApi.md#batchTransferCollectionItems) | **POST** /v1/collections/{collectionId}/batchTransfers | Batch transfer collection items
*ItemsApi* | [**burnCollectionItem**](docs/ItemsApi.md#burnCollectionItem) | **POST** /v1/collections/{collectionId}/items/{collectionItemId}/burns | Burn collection item
*ItemsApi* | [**createCollection**](docs/ItemsApi.md#createCollection) | **POST** /v1/collections | Create collection
*ItemsApi* | [**createCollectionItem**](docs/ItemsApi.md#createCollectionItem) | **POST** /v1/collections/{collectionId}/items | Create collection item
*ItemsApi* | [**getCollectionApproval**](docs/ItemsApi.md#getCollectionApproval) | **GET** /v1/collections/{collectionId}/approvals | Get collection approval
*ItemsApi* | [**getCollectionItem**](docs/ItemsApi.md#getCollectionItem) | **GET** /v1/collections/{collectionId}/items/{collectionItemId} | Get collection item
*ItemsApi* | [**getCollectionItemBalance**](docs/ItemsApi.md#getCollectionItemBalance) | **GET** /v1/collections/{collectionId}/items/{collectionItemId}/balances | Get collection item balance
*ItemsApi* | [**getCollectionItemBalances**](docs/ItemsApi.md#getCollectionItemBalances) | **GET** /v1/collections/{collectionId}/balances | Get collection item balances
*ItemsApi* | [**getCollectionItemSupplies**](docs/ItemsApi.md#getCollectionItemSupplies) | **GET** /v1/collections/{collectionId}/supplies | Get collection item supplies
*ItemsApi* | [**getCollectionItemSupply**](docs/ItemsApi.md#getCollectionItemSupply) | **GET** /v1/collections/{collectionId}/items/{collectionItemId}/supplies | Get collection item supply
*ItemsApi* | [**getCollectionItemTimelock**](docs/ItemsApi.md#getCollectionItemTimelock) | **GET** /v1/collections/{collectionId}/items/{collectionItemId}/timelocks | Get collection item timelock
*ItemsApi* | [**getCollectionItems**](docs/ItemsApi.md#getCollectionItems) | **GET** /v1/collections/{collectionId}/items | Get collection items
*ItemsApi* | [**getCollections**](docs/ItemsApi.md#getCollections) | **GET** /v1/collections | Get collections
*ItemsApi* | [**mintCollectionItem**](docs/ItemsApi.md#mintCollectionItem) | **POST** /v1/collections/{collectionId}/items/{collectionItemId}/mints | Mint collection item
*ItemsApi* | [**setCollectionApproval**](docs/ItemsApi.md#setCollectionApproval) | **POST** /v1/collections/{collectionId}/approvals | Set collection approval
*ItemsApi* | [**setCollectionItemTimelock**](docs/ItemsApi.md#setCollectionItemTimelock) | **POST** /v1/collections/{collectionId}/items/{collectionItemId}/timelocks | Set collection item timelock
*ItemsApi* | [**transferCollectionItem**](docs/ItemsApi.md#transferCollectionItem) | **POST** /v1/collections/{collectionId}/items/{collectionItemId}/transfers | Transfer collection item
*PlayersApi* | [**authPlayer**](docs/PlayersApi.md#authPlayer) | **GET** /v1/players | Authenticate player
*PlayersApi* | [**createPlayer**](docs/PlayersApi.md#createPlayer) | **POST** /v1/players | Create player
*PlayersApi* | [**updatePlayer**](docs/PlayersApi.md#updatePlayer) | **PATCH** /v1/players/{playerId} | Update player
*TransactionsApi* | [**getTransaction**](docs/TransactionsApi.md#getTransaction) | **GET** /v1/transactions/{transactionId} | Get transaction
*WalletsApi* | [**getWalletBalances**](docs/WalletsApi.md#getWalletBalances) | **GET** /v1/wallets/{walletId}/balances | Get wallet balances
*WalletsApi* | [**getWalletTransactions**](docs/WalletsApi.md#getWalletTransactions) | **GET** /v1/wallets/{walletId}/transactions | Get wallet transactions


## Documentation for Models

 - [AuthGame200Response](docs/AuthGame200Response.md)
 - [AuthGame200ResponseAllOf](docs/AuthGame200ResponseAllOf.md)
 - [AuthGame200ResponseAllOf1](docs/AuthGame200ResponseAllOf1.md)
 - [AuthPlayer200Response](docs/AuthPlayer200Response.md)
 - [BatchMintCollectionItemsRequest](docs/BatchMintCollectionItemsRequest.md)
 - [BatchTransferCollectionItemsRequest](docs/BatchTransferCollectionItemsRequest.md)
 - [BatchTransferCurrencyRequest](docs/BatchTransferCurrencyRequest.md)
 - [BurnCollectionItemRequest](docs/BurnCollectionItemRequest.md)
 - [BurnCurrencyRequest](docs/BurnCurrencyRequest.md)
 - [CollectionModel](docs/CollectionModel.md)
 - [ContractModel](docs/ContractModel.md)
 - [CreateCollection200Response](docs/CreateCollection200Response.md)
 - [CreateCollection200ResponseAllOf](docs/CreateCollection200ResponseAllOf.md)
 - [CreateCollection200ResponseAllOfContract](docs/CreateCollection200ResponseAllOfContract.md)
 - [CreateCollection200ResponseAllOfContractAllOf](docs/CreateCollection200ResponseAllOfContractAllOf.md)
 - [CreateCollectionItemRequest](docs/CreateCollectionItemRequest.md)
 - [CreateCollectionItemRequestAttributesInner](docs/CreateCollectionItemRequestAttributesInner.md)
 - [CreateCollectionRequest](docs/CreateCollectionRequest.md)
 - [CreateContractRequest](docs/CreateContractRequest.md)
 - [CreateCurrency200Response](docs/CreateCurrency200Response.md)
 - [CreateCurrencyRequest](docs/CreateCurrencyRequest.md)
 - [CreateGameRequest](docs/CreateGameRequest.md)
 - [CreatePlayerRequest](docs/CreatePlayerRequest.md)
 - [CurrencyModel](docs/CurrencyModel.md)
 - [GameModel](docs/GameModel.md)
 - [GetCollections200ResponseInner](docs/GetCollections200ResponseInner.md)
 - [GetCollections200ResponseInnerAllOf](docs/GetCollections200ResponseInnerAllOf.md)
 - [GetCurrencies200ResponseInner](docs/GetCurrencies200ResponseInner.md)
 - [GetCurrencies200ResponseInnerAllOf](docs/GetCurrencies200ResponseInnerAllOf.md)
 - [GetCurrencyFees200Response](docs/GetCurrencyFees200Response.md)
 - [MintCollectionItemRequest](docs/MintCollectionItemRequest.md)
 - [MintCurrencyRequest](docs/MintCurrencyRequest.md)
 - [PlayerModel](docs/PlayerModel.md)
 - [SetCollectionApprovalRequest](docs/SetCollectionApprovalRequest.md)
 - [SetCollectionItemTimelockRequest](docs/SetCollectionItemTimelockRequest.md)
 - [SetCurrencyFeesRequest](docs/SetCurrencyFeesRequest.md)
 - [TransactionModel](docs/TransactionModel.md)
 - [TransferCollectionItemRequest](docs/TransferCollectionItemRequest.md)
 - [TransferCurrencyRequest](docs/TransferCurrencyRequest.md)
 - [UpdateGameRequest](docs/UpdateGameRequest.md)
 - [UpdatePlayerRequest](docs/UpdatePlayerRequest.md)
 - [WalletModel](docs/WalletModel.md)
 - [WriteContractRequest](docs/WriteContractRequest.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

metafabproject@gmail.com

