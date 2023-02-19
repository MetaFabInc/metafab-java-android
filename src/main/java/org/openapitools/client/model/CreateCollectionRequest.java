/**
 * MetaFab API
 * Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.5.1
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
public class CreateCollectionRequest {
  
  @SerializedName("name")
  private String name = null;
  public enum ChainEnum {
     ARBITRUM,  ARBITRUMGOERLI,  ARBITRUMNOVA,  AVALANCHE,  AVALANCHEFUJI,  ETHEREUM,  FANTOM,  FANTOMTEST,  GOERLI,  MATIC,  MATICMUMBAI,  THUNDERCORE,  THUNDERCORETESTNET, 
  };
  @SerializedName("chain")
  private ChainEnum chain = null;

  /**
   * The name of this item collection. This can be anything, such as `Production - Item Collection`, `Testing - My Game Item Collection`, etc.
   **/
  @ApiModelProperty(value = "The name of this item collection. This can be anything, such as `Production - Item Collection`, `Testing - My Game Item Collection`, etc.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The blockchain you want to deploy this item collection on. Support for new blockchains are added over time.
   **/
  @ApiModelProperty(required = true, value = "The blockchain you want to deploy this item collection on. Support for new blockchains are added over time.")
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
    CreateCollectionRequest createCollectionRequest = (CreateCollectionRequest) o;
    return (this.name == null ? createCollectionRequest.name == null : this.name.equals(createCollectionRequest.name)) &&
        (this.chain == null ? createCollectionRequest.chain == null : this.chain.equals(createCollectionRequest.chain));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.chain == null ? 0: this.chain.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCollectionRequest {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  chain: ").append(chain).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
