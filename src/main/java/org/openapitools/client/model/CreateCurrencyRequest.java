/**
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: metafabproject@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateCurrencyRequest {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("supplyCap")
  private BigDecimal supplyCap = null;
  public enum ChainEnum {
     ETHEREUM,  GOERLI,  MATIC,  MATICMUMBAI,  ARBITRUM,  ARBITRUMGOERLI, 
  };
  @SerializedName("chain")
  private ChainEnum chain = null;

  /**
   * The name of this currency. This can be anything, such as `Bright Gems`, `Gold`, etc.
   **/
  @ApiModelProperty(required = true, value = "The name of this currency. This can be anything, such as `Bright Gems`, `Gold`, etc.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The shorthand symbol to represent this currency. This can be anything, such as `BGEM`, `GLD`, etc.
   **/
  @ApiModelProperty(required = true, value = "The shorthand symbol to represent this currency. This can be anything, such as `BGEM`, `GLD`, etc.")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   * The maximum amount of this currency that can ever exist. Use `0` if you do not want this currency to have a maximum supply.
   **/
  @ApiModelProperty(required = true, value = "The maximum amount of this currency that can ever exist. Use `0` if you do not want this currency to have a maximum supply.")
  public BigDecimal getSupplyCap() {
    return supplyCap;
  }
  public void setSupplyCap(BigDecimal supplyCap) {
    this.supplyCap = supplyCap;
  }

  /**
   * The blockchain you want to deploy this currency on. Support for new blockchains are added over time.
   **/
  @ApiModelProperty(required = true, value = "The blockchain you want to deploy this currency on. Support for new blockchains are added over time.")
  public ChainEnum getChain() {
    return chain;
  }
  public void setChain(ChainEnum chain) {
    this.chain = chain;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCurrencyRequest createCurrencyRequest = (CreateCurrencyRequest) o;
    return (this.name == null ? createCurrencyRequest.name == null : this.name.equals(createCurrencyRequest.name)) &&
        (this.symbol == null ? createCurrencyRequest.symbol == null : this.symbol.equals(createCurrencyRequest.symbol)) &&
        (this.supplyCap == null ? createCurrencyRequest.supplyCap == null : this.supplyCap.equals(createCurrencyRequest.supplyCap)) &&
        (this.chain == null ? createCurrencyRequest.chain == null : this.chain.equals(createCurrencyRequest.chain));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.symbol == null ? 0: this.symbol.hashCode());
    result = 31 * result + (this.supplyCap == null ? 0: this.supplyCap.hashCode());
    result = 31 * result + (this.chain == null ? 0: this.chain.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCurrencyRequest {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  supplyCap: ").append(supplyCap).append("\n");
    sb.append("  chain: ").append(chain).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
