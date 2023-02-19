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
*ContractsApi* | [**transferContractOwnership**](docs/ContractsApi.md#transferContractOwnership) | **POST** /v1/contracts/{contractId}/owners | Transfer contract ownership
*ContractsApi* | [**upgradeContractTrustedForwarder**](docs/ContractsApi.md#upgradeContractTrustedForwarder) | **POST** /v1/contracts/{contractId}/forwarders | Upgrade contract trusted forwarder
*ContractsApi* | [**writeContract**](docs/ContractsApi.md#writeContract) | **POST** /v1/contracts/{contractId}/writes | Write contract data
*CurrenciesApi* | [**batchTransferCurrency**](docs/CurrenciesApi.md#batchTransferCurrency) | **POST** /v1/currencies/{currencyId}/batchTransfers | Batch transfer currency
*CurrenciesApi* | [**burnCurrency**](docs/CurrenciesApi.md#burnCurrency) | **POST** /v1/currencies/{currencyId}/burns | Burn currency
*CurrenciesApi* | [**createCurrency**](docs/CurrenciesApi.md#createCurrency) | **POST** /v1/currencies | Create currency
*CurrenciesApi* | [**getCurrencies**](docs/CurrenciesApi.md#getCurrencies) | **GET** /v1/currencies | Get currencies
*CurrenciesApi* | [**getCurrencyBalance**](docs/CurrenciesApi.md#getCurrencyBalance) | **GET** /v1/currencies/{currencyId}/balances | Get currency balance
*CurrenciesApi* | [**getCurrencyFees**](docs/CurrenciesApi.md#getCurrencyFees) | **GET** /v1/currencies/{currencyId}/fees | Get currency fees
*CurrenciesApi* | [**getCurrencyRole**](docs/CurrenciesApi.md#getCurrencyRole) | **GET** /v1/currencies/{currencyId}/roles | Get currency role
*CurrenciesApi* | [**grantCurrencyRole**](docs/CurrenciesApi.md#grantCurrencyRole) | **POST** /v1/currencies/{currencyId}/roles | Grant currency role
*CurrenciesApi* | [**mintCurrency**](docs/CurrenciesApi.md#mintCurrency) | **POST** /v1/currencies/{currencyId}/mints | Mint currency
*CurrenciesApi* | [**revokeCurrencyRole**](docs/CurrenciesApi.md#revokeCurrencyRole) | **DELETE** /v1/currencies/{currencyId}/roles | Revoke currency role
*CurrenciesApi* | [**setCurrencyFees**](docs/CurrenciesApi.md#setCurrencyFees) | **POST** /v1/currencies/{currencyId}/fees | Set currency fees
*CurrenciesApi* | [**transferCurrency**](docs/CurrenciesApi.md#transferCurrency) | **POST** /v1/currencies/{currencyId}/transfers | Transfer currency
*EcosystemsApi* | [**approveEcosystemGame**](docs/EcosystemsApi.md#approveEcosystemGame) | **POST** /v1/ecosystems/{ecosystemId}/games | Approve ecosystem game
*EcosystemsApi* | [**authEcosystem**](docs/EcosystemsApi.md#authEcosystem) | **GET** /v1/ecosystems/auth | Authenticate ecosystem
*EcosystemsApi* | [**authProfile**](docs/EcosystemsApi.md#authProfile) | **GET** /v1/profiles/auth | Authenticate profile
*EcosystemsApi* | [**authProfilePlayer**](docs/EcosystemsApi.md#authProfilePlayer) | **GET** /v1/profiles/{profileId}/games/{gameId}/players/auth | Authenticate profile player
*EcosystemsApi* | [**createEcosystem**](docs/EcosystemsApi.md#createEcosystem) | **POST** /v1/ecosystems | Create ecosystem
*EcosystemsApi* | [**createProfile**](docs/EcosystemsApi.md#createProfile) | **POST** /v1/profiles | Create profile
*EcosystemsApi* | [**createProfilePlayer**](docs/EcosystemsApi.md#createProfilePlayer) | **POST** /v1/profiles/{profileId}/games/{gameId}/players | Create profile player
*EcosystemsApi* | [**getEcosystem**](docs/EcosystemsApi.md#getEcosystem) | **GET** /v1/ecosystems/{ecosystemId} | Get ecosystem
*EcosystemsApi* | [**getEcosystemGame**](docs/EcosystemsApi.md#getEcosystemGame) | **GET** /v1/ecosystems/{ecosystemId}/games/{gameId} | Get ecosystem game
*EcosystemsApi* | [**getEcosystemGames**](docs/EcosystemsApi.md#getEcosystemGames) | **GET** /v1/ecosystems/{ecosystemId}/games | Get ecosystem games
*EcosystemsApi* | [**getProfileGame**](docs/EcosystemsApi.md#getProfileGame) | **GET** /v1/profiles/{profileId}/games/{gameId} | Get profile game
*EcosystemsApi* | [**getProfileGames**](docs/EcosystemsApi.md#getProfileGames) | **GET** /v1/profiles/{profileId}/games | Get profile games
*EcosystemsApi* | [**unapproveEcosystemGame**](docs/EcosystemsApi.md#unapproveEcosystemGame) | **DELETE** /v1/ecosystems/{ecosystemId}/games/{gameId} | Unapprove ecosystem game
*EcosystemsApi* | [**updateEcosystem**](docs/EcosystemsApi.md#updateEcosystem) | **PATCH** /v1/ecosystems/{ecosystemId} | Update ecosystem
*EcosystemsApi* | [**updateProfile**](docs/EcosystemsApi.md#updateProfile) | **PATCH** /v1/profiles/{profileId} | Update profile
*EcosystemsApi* | [**updateProfilePlayer**](docs/EcosystemsApi.md#updateProfilePlayer) | **PATCH** /v1/profiles/{profileId}/games/{gameId}/players/{playerId} | Update profile player
*GamesApi* | [**authGame**](docs/GamesApi.md#authGame) | **GET** /v1/games/auth | Authenticate game
*GamesApi* | [**createGame**](docs/GamesApi.md#createGame) | **POST** /v1/games | Create game
*GamesApi* | [**getGame**](docs/GamesApi.md#getGame) | **GET** /v1/games/{gameId} | Get game
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
*ItemsApi* | [**getCollectionRole**](docs/ItemsApi.md#getCollectionRole) | **GET** /v1/collections/{collectionId}/roles | Get collection role
*ItemsApi* | [**getCollections**](docs/ItemsApi.md#getCollections) | **GET** /v1/collections | Get collections
*ItemsApi* | [**grantCollectionRole**](docs/ItemsApi.md#grantCollectionRole) | **POST** /v1/collections/{collectionId}/roles | Grant collection role
*ItemsApi* | [**mintCollectionItem**](docs/ItemsApi.md#mintCollectionItem) | **POST** /v1/collections/{collectionId}/items/{collectionItemId}/mints | Mint collection item
*ItemsApi* | [**revokeCollectionRole**](docs/ItemsApi.md#revokeCollectionRole) | **DELETE** /v1/collections/{collectionId}/roles | Revoke collection role
*ItemsApi* | [**setCollectionApproval**](docs/ItemsApi.md#setCollectionApproval) | **POST** /v1/collections/{collectionId}/approvals | Set collection approval
*ItemsApi* | [**setCollectionItemTimelock**](docs/ItemsApi.md#setCollectionItemTimelock) | **POST** /v1/collections/{collectionId}/items/{collectionItemId}/timelocks | Set collection item timelock
*ItemsApi* | [**transferCollectionItem**](docs/ItemsApi.md#transferCollectionItem) | **POST** /v1/collections/{collectionId}/items/{collectionItemId}/transfers | Transfer collection item
*LootboxesApi* | [**createLootboxManager**](docs/LootboxesApi.md#createLootboxManager) | **POST** /v1/lootboxManagers | Create lootbox manager
*LootboxesApi* | [**getLootboxManagerLootbox**](docs/LootboxesApi.md#getLootboxManagerLootbox) | **GET** /v1/lootboxManagers/{lootboxManagerId}/lootboxes/{lootboxManagerLootboxId} | Get lootbox manager lootbox
*LootboxesApi* | [**getLootboxManagerLootboxes**](docs/LootboxesApi.md#getLootboxManagerLootboxes) | **GET** /v1/lootboxManagers/{lootboxManagerId}/lootboxes | Get lootbox manager lootboxes
*LootboxesApi* | [**getLootboxManagers**](docs/LootboxesApi.md#getLootboxManagers) | **GET** /v1/lootboxManagers | Get lootbox managers
*LootboxesApi* | [**openLootboxManagerLootbox**](docs/LootboxesApi.md#openLootboxManagerLootbox) | **POST** /v1/lootboxManagers/{lootboxManagerId}/lootboxes/{lootboxManagerLootboxId}/opens | Open lootbox manager lootbox
*LootboxesApi* | [**removeLootboxManagerLootbox**](docs/LootboxesApi.md#removeLootboxManagerLootbox) | **DELETE** /v1/lootboxManagers/{lootboxManagerId}/lootboxes/{lootboxManagerLootboxId} | Remove lootbox manager lootbox
*LootboxesApi* | [**setLootboxManagerLootbox**](docs/LootboxesApi.md#setLootboxManagerLootbox) | **POST** /v1/lootboxManagers/{lootboxManagerId}/lootboxes | Set lootbox manager lootbox
*PlayersApi* | [**authPlayer**](docs/PlayersApi.md#authPlayer) | **GET** /v1/players/auth | Authenticate player
*PlayersApi* | [**createPlayer**](docs/PlayersApi.md#createPlayer) | **POST** /v1/players | Create player
*PlayersApi* | [**getPlayer**](docs/PlayersApi.md#getPlayer) | **GET** /v1/players/{playerId} | Get player
*PlayersApi* | [**getPlayerData**](docs/PlayersApi.md#getPlayerData) | **GET** /v1/players/{playerId}/data | Get player data
*PlayersApi* | [**getPlayers**](docs/PlayersApi.md#getPlayers) | **GET** /v1/players | Get players
*PlayersApi* | [**removePlayerConnectedWallet**](docs/PlayersApi.md#removePlayerConnectedWallet) | **DELETE** /v1/players/{playerId}/wallets/{playerWalletId} | Remove player connected wallet
*PlayersApi* | [**setPlayerConnectedWallet**](docs/PlayersApi.md#setPlayerConnectedWallet) | **POST** /v1/players/{playerId}/wallets | Set player connected wallet
*PlayersApi* | [**setPlayerData**](docs/PlayersApi.md#setPlayerData) | **POST** /v1/players/{playerId}/data | Set player data
*PlayersApi* | [**updatePlayer**](docs/PlayersApi.md#updatePlayer) | **PATCH** /v1/players/{playerId} | Update player
*ShopsApi* | [**createShop**](docs/ShopsApi.md#createShop) | **POST** /v1/shops | Create shop
*ShopsApi* | [**getShopOffer**](docs/ShopsApi.md#getShopOffer) | **GET** /v1/shops/{shopId}/offers/{shopOfferId} | Get shop offer
*ShopsApi* | [**getShopOffers**](docs/ShopsApi.md#getShopOffers) | **GET** /v1/shops/{shopId}/offers | Get shop offers
*ShopsApi* | [**getShops**](docs/ShopsApi.md#getShops) | **GET** /v1/shops | Get shops
*ShopsApi* | [**removeShopOffer**](docs/ShopsApi.md#removeShopOffer) | **DELETE** /v1/shops/{shopId}/offers/{shopOfferId} | Remove shop offer
*ShopsApi* | [**setShopOffer**](docs/ShopsApi.md#setShopOffer) | **POST** /v1/shops/{shopId}/offers | Set shop offer
*ShopsApi* | [**useShopOffer**](docs/ShopsApi.md#useShopOffer) | **POST** /v1/shops/{shopId}/offers/{shopOfferId}/uses | Use shop offer
*ShopsApi* | [**withdrawFromShop**](docs/ShopsApi.md#withdrawFromShop) | **POST** /v1/shops/{shopId}/withdrawals | Withdraw from shop
*TransactionsApi* | [**getTransaction**](docs/TransactionsApi.md#getTransaction) | **GET** /v1/transactions/{transactionId} | Get transaction
*WalletsApi* | [**createWalletSignature**](docs/WalletsApi.md#createWalletSignature) | **POST** /v1/wallets/{walletId}/signatures | Create wallet signature
*WalletsApi* | [**getWallet**](docs/WalletsApi.md#getWallet) | **GET** /v1/wallets/{walletId} | Get wallet
*WalletsApi* | [**getWalletBalances**](docs/WalletsApi.md#getWalletBalances) | **GET** /v1/wallets/{walletId}/balances | Get wallet balances
*WalletsApi* | [**getWalletTransactions**](docs/WalletsApi.md#getWalletTransactions) | **GET** /v1/wallets/{walletId}/transactions | Get wallet transactions


## Documentation for Models

 - [ApproveEcosystemGameRequest](docs/ApproveEcosystemGameRequest.md)
 - [AuthGame200Response](docs/AuthGame200Response.md)
 - [AuthGame200ResponseAllOf](docs/AuthGame200ResponseAllOf.md)
 - [AuthPlayer200Response](docs/AuthPlayer200Response.md)
 - [AuthPlayer200ResponseAllOf](docs/AuthPlayer200ResponseAllOf.md)
 - [AuthProfile200Response](docs/AuthProfile200Response.md)
 - [BatchMintCollectionItemsRequest](docs/BatchMintCollectionItemsRequest.md)
 - [BatchTransferCollectionItemsRequest](docs/BatchTransferCollectionItemsRequest.md)
 - [BatchTransferCurrencyRequest](docs/BatchTransferCurrencyRequest.md)
 - [BurnCollectionItemRequest](docs/BurnCollectionItemRequest.md)
 - [BurnCurrencyRequest](docs/BurnCurrencyRequest.md)
 - [CollectionItem](docs/CollectionItem.md)
 - [CollectionItemAttributesInner](docs/CollectionItemAttributesInner.md)
 - [CollectionItemAttributesInnerValue](docs/CollectionItemAttributesInnerValue.md)
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
 - [CreateEcosystemRequest](docs/CreateEcosystemRequest.md)
 - [CreateGameRequest](docs/CreateGameRequest.md)
 - [CreateLootboxManager200Response](docs/CreateLootboxManager200Response.md)
 - [CreateLootboxManagerRequest](docs/CreateLootboxManagerRequest.md)
 - [CreatePlayerRequest](docs/CreatePlayerRequest.md)
 - [CreateProfilePlayerRequest](docs/CreateProfilePlayerRequest.md)
 - [CreateProfileRequest](docs/CreateProfileRequest.md)
 - [CreateShop200Response](docs/CreateShop200Response.md)
 - [CreateShopRequest](docs/CreateShopRequest.md)
 - [CreateWalletSignatureRequest](docs/CreateWalletSignatureRequest.md)
 - [CurrencyModel](docs/CurrencyModel.md)
 - [EcosystemGameModel](docs/EcosystemGameModel.md)
 - [EcosystemModel](docs/EcosystemModel.md)
 - [GameModel](docs/GameModel.md)
 - [GetCollections200ResponseInner](docs/GetCollections200ResponseInner.md)
 - [GetCollections200ResponseInnerAllOf](docs/GetCollections200ResponseInnerAllOf.md)
 - [GetCurrencies200ResponseInner](docs/GetCurrencies200ResponseInner.md)
 - [GetCurrencyFees200Response](docs/GetCurrencyFees200Response.md)
 - [GetLootboxManagers200ResponseInner](docs/GetLootboxManagers200ResponseInner.md)
 - [GetPlayerData200Response](docs/GetPlayerData200Response.md)
 - [GetProfileGames200ResponseInner](docs/GetProfileGames200ResponseInner.md)
 - [GetShops200ResponseInner](docs/GetShops200ResponseInner.md)
 - [GrantCollectionRoleRequest](docs/GrantCollectionRoleRequest.md)
 - [GrantCurrencyRoleRequest](docs/GrantCurrencyRoleRequest.md)
 - [LootboxManagerLootbox](docs/LootboxManagerLootbox.md)
 - [LootboxManagerModel](docs/LootboxManagerModel.md)
 - [MintCollectionItemRequest](docs/MintCollectionItemRequest.md)
 - [MintCurrencyRequest](docs/MintCurrencyRequest.md)
 - [PlayerModel](docs/PlayerModel.md)
 - [ProfileModel](docs/ProfileModel.md)
 - [ProfilePermissionsValue](docs/ProfilePermissionsValue.md)
 - [PublicEcosystem](docs/PublicEcosystem.md)
 - [PublicGame](docs/PublicGame.md)
 - [PublicPlayer](docs/PublicPlayer.md)
 - [PublicPlayerCustodialWallet](docs/PublicPlayerCustodialWallet.md)
 - [PublicProfile](docs/PublicProfile.md)
 - [RemovePlayerConnectedWalletRequest](docs/RemovePlayerConnectedWalletRequest.md)
 - [RevokeCollectionRoleRequest](docs/RevokeCollectionRoleRequest.md)
 - [SetCollectionApprovalRequest](docs/SetCollectionApprovalRequest.md)
 - [SetCollectionItemTimelockRequest](docs/SetCollectionItemTimelockRequest.md)
 - [SetCurrencyFeesRequest](docs/SetCurrencyFeesRequest.md)
 - [SetLootboxManagerLootboxRequest](docs/SetLootboxManagerLootboxRequest.md)
 - [SetPlayerConnectedWallet200Response](docs/SetPlayerConnectedWallet200Response.md)
 - [SetPlayerConnectedWalletRequest](docs/SetPlayerConnectedWalletRequest.md)
 - [SetPlayerDataRequest](docs/SetPlayerDataRequest.md)
 - [SetShopOfferRequest](docs/SetShopOfferRequest.md)
 - [ShopModel](docs/ShopModel.md)
 - [ShopOffer](docs/ShopOffer.md)
 - [TransactionModel](docs/TransactionModel.md)
 - [TransferCollectionItemRequest](docs/TransferCollectionItemRequest.md)
 - [TransferContractOwnershipRequest](docs/TransferContractOwnershipRequest.md)
 - [TransferCurrencyRequest](docs/TransferCurrencyRequest.md)
 - [UpdateEcosystemRequest](docs/UpdateEcosystemRequest.md)
 - [UpdateGame200Response](docs/UpdateGame200Response.md)
 - [UpdateGame200ResponseAllOf](docs/UpdateGame200ResponseAllOf.md)
 - [UpdateGameRequest](docs/UpdateGameRequest.md)
 - [UpdatePlayer200Response](docs/UpdatePlayer200Response.md)
 - [UpdatePlayerRequest](docs/UpdatePlayerRequest.md)
 - [UpdateProfilePlayer200Response](docs/UpdateProfilePlayer200Response.md)
 - [UpdateProfilePlayer200ResponseAllOf](docs/UpdateProfilePlayer200ResponseAllOf.md)
 - [UpdateProfilePlayerRequest](docs/UpdateProfilePlayerRequest.md)
 - [UpdateProfileRequest](docs/UpdateProfileRequest.md)
 - [UpgradeContractTrustedForwarderRequest](docs/UpgradeContractTrustedForwarderRequest.md)
 - [WalletModel](docs/WalletModel.md)
 - [WithdrawFromShopRequest](docs/WithdrawFromShopRequest.md)
 - [WriteContractRequest](docs/WriteContractRequest.md)
 - [WriteContractRequestArgsInner](docs/WriteContractRequestArgsInner.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

metafabproject@gmail.com

