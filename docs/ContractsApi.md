# ContractsApi

All URIs are relative to *https://api.trymetafab.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createContract**](ContractsApi.md#createContract) | **POST** /v1/contracts | Create custom contract
[**getContracts**](ContractsApi.md#getContracts) | **GET** /v1/contracts | Get contracts
[**readContract**](ContractsApi.md#readContract) | **GET** /v1/contracts/{contractId}/reads | Read contract data
[**transferContractOwnership**](ContractsApi.md#transferContractOwnership) | **POST** /v1/contracts/{contractId}/owners | Transfer contract ownership
[**upgradeContractTrustedForwarder**](ContractsApi.md#upgradeContractTrustedForwarder) | **POST** /v1/contracts/{contractId}/forwarders | Upgrade contract trusted forwarder
[**writeContract**](ContractsApi.md#writeContract) | **POST** /v1/contracts/{contractId}/writes | Write contract data



## createContract

> ContractModel createContract(xAuthorization, createContractRequest)

Create custom contract

Create a MetaFab custom contract entry from an existing contract address and contract abi. This allows the game and players belonging to the authenticated game to interact with the contract&#39;s read and write functions through MetaFab&#39;s read and write contract endpoints.

### Example

```java
// Import classes:
//import org.metafab.client.api.ContractsApi;

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
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | [default to null]
 **createContractRequest** | [**CreateContractRequest**](CreateContractRequest.md)|  |

### Return type

[**ContractModel**](ContractModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getContracts

> List&lt;ContractModel&gt; getContracts(xGameKey)

Get contracts

Returns an array of active contracts deployed by the game associated with the provided &#x60;X-Game-Key&#x60;.

### Example

```java
// Import classes:
//import org.metafab.client.api.ContractsApi;

ContractsApi apiInstance = new ContractsApi();
String xGameKey = game_pk_4SOqpDi8pQdnQgfCOBW29qR8YmwOhxVPz5iHoMgUEJLDdPXgwLuHqZf8ewo2GajZ; // String | The `publishedKey` of a specific game. This can be shared or included in game clients, websites, etc.
try {
    List<ContractModel> result = apiInstance.getContracts(xGameKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#getContracts");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGameKey** | **String**| The &#x60;publishedKey&#x60; of a specific game. This can be shared or included in game clients, websites, etc. | [default to null]

### Return type

[**List&lt;ContractModel&gt;**](ContractModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## readContract

> OasAnyTypeNotMapped readContract(contractId, func, args)

Read contract data

Oftentimes you&#39;ll want to query and retrieve some data from a contract. This is incredibly easy to do for any contract deployed through MetaFab.  Using this endpoint, you can get the data returned by any readable function listed in a contracts ABI. This could be things like querying the totalSupply of a currency contract, the number of owners of an items contract, and more.

### Example

```java
// Import classes:
//import org.metafab.client.api.ContractsApi;

ContractsApi apiInstance = new ContractsApi();
String contractId = null; // String | Any contract id within the MetaFab ecosystem.
String func = null; // String | A contract function name. This can be any valid function from the the ABI of the contract you are interacting with. For example, `balanceOf`.
String args = 123,"Hello",false; // String | A comma seperated list of basic data type arguments. This is optional and only necessary if the function being invoked requires arguments per the contract ABI. For example, `123,\"Hello\",false`.
try {
    OasAnyTypeNotMapped result = apiInstance.readContract(contractId, func, args);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#readContract");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractId** | **String**| Any contract id within the MetaFab ecosystem. | [default to null]
 **func** | **String**| A contract function name. This can be any valid function from the the ABI of the contract you are interacting with. For example, &#x60;balanceOf&#x60;. | [default to null]
 **args** | **String**| A comma seperated list of basic data type arguments. This is optional and only necessary if the function being invoked requires arguments per the contract ABI. For example, &#x60;123,\&quot;Hello\&quot;,false&#x60;. | [optional] [default to null]

### Return type

[**OasAnyTypeNotMapped**](OasAnyTypeNotMapped.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## transferContractOwnership

> TransactionModel transferContractOwnership(contractId, xAuthorization, xPassword, transferContractOwnershipRequest)

Transfer contract ownership

Transfer ownership and control of a MetaFab deployed smart contract to another wallet you control. Transferring control does not disrupt your usage of MetaFab APIs and can be done so without causing any service outages for your game. The new owner wallet will have full control over any relevant item collections and marketplace related pages this contract may be associated with, such as for MetaFab item or NFT contracts.  Your game&#39;s custodial wallet will retain a &#x60;MANAGER_ROLE&#x60; on your contracts, allowing you to still use MetaFab APIs without issue while you retain full contract ownership and the contract&#39;s administrator role. If ever you want eject from using the MetaFab APIs but still retain your deployed smart contracts, you can revoke the &#x60;MANAGER_ROLE&#x60; from your game&#39;s custodial wallet address for your contract. We do not lock you into our systems.  Please be certain that the wallet address you transfer ownership to is one you control. Once ownership and admin permissions are transferred, your game&#39;s custodial wallet no longer has permission to reassign ownership or administrative priveleges for your contract.

### Example

```java
// Import classes:
//import org.metafab.client.api.ContractsApi;

ContractsApi apiInstance = new ContractsApi();
String contractId = null; // String | Any contract id within the MetaFab ecosystem.
String xAuthorization = game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP; // String | The `secretKey` of the authenticating game.
String xPassword = mySecurePassword; // String | The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
TransferContractOwnershipRequest transferContractOwnershipRequest = new TransferContractOwnershipRequest(); // TransferContractOwnershipRequest | 
try {
    TransactionModel result = apiInstance.transferContractOwnership(contractId, xAuthorization, xPassword, transferContractOwnershipRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#transferContractOwnership");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractId** | **String**| Any contract id within the MetaFab ecosystem. | [default to null]
 **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | [default to null]
 **xPassword** | **String**| The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | [default to null]
 **transferContractOwnershipRequest** | [**TransferContractOwnershipRequest**](TransferContractOwnershipRequest.md)|  |

### Return type

[**TransactionModel**](TransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## upgradeContractTrustedForwarder

> TransactionModel upgradeContractTrustedForwarder(contractId, xAuthorization, xPassword, upgradeContractTrustedForwarderRequest)

Upgrade contract trusted forwarder

In rare circumstances, you may need to upgrade the underlying trusted forwarder contract address attached to your game&#39;s contracts. Using this endpoint, you can provide a new trusted forwarder contract address to assign to any of your contracts that implement the &#x60;upgradeTrustedForwarder&#x60; function.

### Example

```java
// Import classes:
//import org.metafab.client.api.ContractsApi;

ContractsApi apiInstance = new ContractsApi();
String contractId = null; // String | Any contract id within the MetaFab ecosystem.
String xAuthorization = game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP; // String | The `secretKey` of the authenticating game.
String xPassword = mySecurePassword; // String | The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet.
UpgradeContractTrustedForwarderRequest upgradeContractTrustedForwarderRequest = new UpgradeContractTrustedForwarderRequest(); // UpgradeContractTrustedForwarderRequest | 
try {
    TransactionModel result = apiInstance.upgradeContractTrustedForwarder(contractId, xAuthorization, xPassword, upgradeContractTrustedForwarderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#upgradeContractTrustedForwarder");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractId** | **String**| Any contract id within the MetaFab ecosystem. | [default to null]
 **xAuthorization** | **String**| The &#x60;secretKey&#x60; of the authenticating game. | [default to null]
 **xPassword** | **String**| The password of the authenticating game. Required to decrypt and perform blockchain transactions with the game primary wallet. | [default to null]
 **upgradeContractTrustedForwarderRequest** | [**UpgradeContractTrustedForwarderRequest**](UpgradeContractTrustedForwarderRequest.md)|  |

### Return type

[**TransactionModel**](TransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## writeContract

> TransactionModel writeContract(contractId, xAuthorization, xPassword, writeContractRequest)

Write contract data

MetaFab&#39;s convenience endpoints for contract interactions may not be flexible enough depending on your use case. For these situations, you can interact with contracts and create transactions directly.  Using this endpoint, you can execute a transaction for any writeable contract method as defined in the contract&#39;s ABI for the MetaFab contractId provided. Both Games and Player resources have authority to use this endpoint to execute transactions against any valid MetaFab contractId.  Additionally, MetaFab will automatically attempt to perform a gasless transaction for players interacting with a contract through this endpoint. Gasless transactions by players through this endpoint will only work if the target contract was deployed through MetaFab or supports MetaFab&#39;s ERC2771 trusted forwarder contract.

### Example

```java
// Import classes:
//import org.metafab.client.api.ContractsApi;

ContractsApi apiInstance = new ContractsApi();
String contractId = null; // String | Any contract id within the MetaFab ecosystem.
String xAuthorization = ["game_sk_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP","player_at_02z4Mv3c85Ig0gNowY9Dq0N2kjb1xwzr27ArLE0669RrRI6dLf822iPO26K1p1FP"]; // String | The `secretKey` of a specific game or the `accessToken` of a specific player.
String xPassword = mySecurePassword; // String | The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet.
WriteContractRequest writeContractRequest = new WriteContractRequest(); // WriteContractRequest | 
try {
    TransactionModel result = apiInstance.writeContract(contractId, xAuthorization, xPassword, writeContractRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#writeContract");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractId** | **String**| Any contract id within the MetaFab ecosystem. | [default to null]
 **xAuthorization** | **String**| The &#x60;secretKey&#x60; of a specific game or the &#x60;accessToken&#x60; of a specific player. | [default to null]
 **xPassword** | **String**| The password of the authenticating game or player. Required to decrypt and perform blockchain transactions with the game or player primary wallet. | [default to null]
 **writeContractRequest** | [**WriteContractRequest**](WriteContractRequest.md)|  |

### Return type

[**TransactionModel**](TransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

