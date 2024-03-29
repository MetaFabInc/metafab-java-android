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
public class ContractModel {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("gameId")
  private String gameId = null;
  @SerializedName("chain")
  private String chain = null;
  @SerializedName("abi")
  private Object abi = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("forwarderAddress")
  private String forwarderAddress = null;
  @SerializedName("updatedAt")
  private String updatedAt = null;
  @SerializedName("createdAt")
  private String createdAt = null;

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getGameId() {
    return gameId;
  }
  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getChain() {
    return chain;
  }
  public void setChain(String chain) {
    this.chain = chain;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public Object getAbi() {
    return abi;
  }
  public void setAbi(Object abi) {
    this.abi = abi;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getForwarderAddress() {
    return forwarderAddress;
  }
  public void setForwarderAddress(String forwarderAddress) {
    this.forwarderAddress = forwarderAddress;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractModel contractModel = (ContractModel) o;
    return (this.id == null ? contractModel.id == null : this.id.equals(contractModel.id)) &&
        (this.gameId == null ? contractModel.gameId == null : this.gameId.equals(contractModel.gameId)) &&
        (this.chain == null ? contractModel.chain == null : this.chain.equals(contractModel.chain)) &&
        (this.abi == null ? contractModel.abi == null : this.abi.equals(contractModel.abi)) &&
        (this.type == null ? contractModel.type == null : this.type.equals(contractModel.type)) &&
        (this.address == null ? contractModel.address == null : this.address.equals(contractModel.address)) &&
        (this.forwarderAddress == null ? contractModel.forwarderAddress == null : this.forwarderAddress.equals(contractModel.forwarderAddress)) &&
        (this.updatedAt == null ? contractModel.updatedAt == null : this.updatedAt.equals(contractModel.updatedAt)) &&
        (this.createdAt == null ? contractModel.createdAt == null : this.createdAt.equals(contractModel.createdAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.gameId == null ? 0: this.gameId.hashCode());
    result = 31 * result + (this.chain == null ? 0: this.chain.hashCode());
    result = 31 * result + (this.abi == null ? 0: this.abi.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.forwarderAddress == null ? 0: this.forwarderAddress.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractModel {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  gameId: ").append(gameId).append("\n");
    sb.append("  chain: ").append(chain).append("\n");
    sb.append("  abi: ").append(abi).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  forwarderAddress: ").append(forwarderAddress).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
