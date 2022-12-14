

# CreateCurrencyRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of this currency. This can be anything, such as &#x60;Bright Gems&#x60;, &#x60;Gold&#x60;, etc. | 
**symbol** | **String** | The shorthand symbol to represent this currency. This can be anything, such as &#x60;BGEM&#x60;, &#x60;GLD&#x60;, etc. | 
**supplyCap** | [**BigDecimal**](BigDecimal.md) | The maximum amount of this currency that can ever exist. Use &#x60;0&#x60; if you do not want this currency to have a maximum supply. | 
**chain** | [**ChainEnum**](#ChainEnum) | The blockchain you want to deploy this currency on. Support for new blockchains are added over time. | 


## Enum: ChainEnum

Name | Value
---- | -----




