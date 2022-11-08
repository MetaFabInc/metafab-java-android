/**
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: metafabproject@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateExchangeRequest {
  
  public enum ChainEnum {
     ETHEREUM,  GOERLI,  MATIC,  MATICMUMBAI,  ARBITRUM,  ARBITRUMGOERLI, 
  };
  @SerializedName("chain")
  private ChainEnum chain = null;

  /**
   * The blockchain you want to deploy this exchange on. Support for new blockchains are added over time.
   **/
  @ApiModelProperty(required = true, value = "The blockchain you want to deploy this exchange on. Support for new blockchains are added over time.")
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
    CreateExchangeRequest createExchangeRequest = (CreateExchangeRequest) o;
    return (this.chain == null ? createExchangeRequest.chain == null : this.chain.equals(createExchangeRequest.chain));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.chain == null ? 0: this.chain.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateExchangeRequest {\n");
    
    sb.append("  chain: ").append(chain).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
