/**
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.4.1
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
public class CreateContractRequest {
  
  @SerializedName("address")
  private String address = null;
  @SerializedName("forwarderAddress")
  private String forwarderAddress = null;
  @SerializedName("abi")
  private String abi = null;
  public enum ChainEnum {
     ETHEREUM,  GOERLI,  MATIC,  MATICMUMBAI,  ARBITRUM,  ARBITRUMGOERLI, 
  };
  @SerializedName("chain")
  private ChainEnum chain = null;

  /**
   * The address of the existing contract.
   **/
  @ApiModelProperty(required = true, value = "The address of the existing contract.")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * The address of the ERC2771 forwarding contract trusted by the contract.
   **/
  @ApiModelProperty(value = "The address of the ERC2771 forwarding contract trusted by the contract.")
  public String getForwarderAddress() {
    return forwarderAddress;
  }
  public void setForwarderAddress(String forwarderAddress) {
    this.forwarderAddress = forwarderAddress;
  }

  /**
   * JSON of the abi.
   **/
  @ApiModelProperty(required = true, value = "JSON of the abi.")
  public String getAbi() {
    return abi;
  }
  public void setAbi(String abi) {
    this.abi = abi;
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
    CreateContractRequest createContractRequest = (CreateContractRequest) o;
    return (this.address == null ? createContractRequest.address == null : this.address.equals(createContractRequest.address)) &&
        (this.forwarderAddress == null ? createContractRequest.forwarderAddress == null : this.forwarderAddress.equals(createContractRequest.forwarderAddress)) &&
        (this.abi == null ? createContractRequest.abi == null : this.abi.equals(createContractRequest.abi)) &&
        (this.chain == null ? createContractRequest.chain == null : this.chain.equals(createContractRequest.chain));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.forwarderAddress == null ? 0: this.forwarderAddress.hashCode());
    result = 31 * result + (this.abi == null ? 0: this.abi.hashCode());
    result = 31 * result + (this.chain == null ? 0: this.chain.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateContractRequest {\n");
    
    sb.append("  address: ").append(address).append("\n");
    sb.append("  forwarderAddress: ").append(forwarderAddress).append("\n");
    sb.append("  abi: ").append(abi).append("\n");
    sb.append("  chain: ").append(chain).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
