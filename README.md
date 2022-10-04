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
*CurrenciesApi* | [**getCurrencyBalances**](docs/CurrenciesApi.md#getCurrencyBalances) | **GET** /v1/currencies/{currencyId}/balances | Get currency balance
*CurrenciesApi* | [**getCurrencyFees**](docs/CurrenciesApi.md#getCurrencyFees) | **GET** /v1/currencies/{currencyId}/fees | Get currency fees
*CurrenciesApi* | [**mintCurrency**](docs/CurrenciesApi.md#mintCurrency) | **POST** /v1/currencies/{currencyId}/mints | Mint currency
*CurrenciesApi* | [**setCurrencyFees**](docs/CurrenciesApi.md#setCurrencyFees) | **POST** /v1/currencies/{currencyId}/fees | Set currency fees
*CurrenciesApi* | [**transferCurrency**](docs/CurrenciesApi.md#transferCurrency) | **POST** /v1/currencies/{currencyId}/transfers | Transfer currency
*GamesApi* | [**authGame**](docs/GamesApi.md#authGame) | **GET** /v1/games | Authenticate game
*GamesApi* | [**createGame**](docs/GamesApi.md#createGame) | **POST** /v1/games | Create game
*GamesApi* | [**updateGame**](docs/GamesApi.md#updateGame) | **PATCH** /v1/games/{gameId} | Update game
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
 - [BatchTransferCurrencyRequest](docs/BatchTransferCurrencyRequest.md)
 - [BurnCurrencyRequest](docs/BurnCurrencyRequest.md)
 - [ContractModel](docs/ContractModel.md)
 - [CreateContractRequest](docs/CreateContractRequest.md)
 - [CreateCurrency200Response](docs/CreateCurrency200Response.md)
 - [CreateCurrency200ResponseAllOf](docs/CreateCurrency200ResponseAllOf.md)
 - [CreateCurrency200ResponseAllOfContract](docs/CreateCurrency200ResponseAllOfContract.md)
 - [CreateCurrency200ResponseAllOfContractAllOf](docs/CreateCurrency200ResponseAllOfContractAllOf.md)
 - [CreateCurrencyRequest](docs/CreateCurrencyRequest.md)
 - [CreateGameRequest](docs/CreateGameRequest.md)
 - [CreatePlayerRequest](docs/CreatePlayerRequest.md)
 - [CurrencyModel](docs/CurrencyModel.md)
 - [GameModel](docs/GameModel.md)
 - [GetCurrencies200ResponseInner](docs/GetCurrencies200ResponseInner.md)
 - [GetCurrencies200ResponseInnerAllOf](docs/GetCurrencies200ResponseInnerAllOf.md)
 - [GetCurrencyFees200Response](docs/GetCurrencyFees200Response.md)
 - [MintCurrencyRequest](docs/MintCurrencyRequest.md)
 - [PlayerModel](docs/PlayerModel.md)
 - [SetCurrencyFeesRequest](docs/SetCurrencyFeesRequest.md)
 - [TransactionModel](docs/TransactionModel.md)
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

