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

import org.openapitools.client.model.ContractModel;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GetShops200ResponseInner {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("gameId")
  private String gameId = null;
  @SerializedName("contractId")
  private String contractId = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("updatedAt")
  private String updatedAt = null;
  @SerializedName("createdAt")
  private String createdAt = null;
  @SerializedName("contract")
  private ContractModel contract = null;

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
  public String getContractId() {
    return contractId;
  }
  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public ContractModel getContract() {
    return contract;
  }
  public void setContract(ContractModel contract) {
    this.contract = contract;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetShops200ResponseInner getShops200ResponseInner = (GetShops200ResponseInner) o;
    return (this.id == null ? getShops200ResponseInner.id == null : this.id.equals(getShops200ResponseInner.id)) &&
        (this.gameId == null ? getShops200ResponseInner.gameId == null : this.gameId.equals(getShops200ResponseInner.gameId)) &&
        (this.contractId == null ? getShops200ResponseInner.contractId == null : this.contractId.equals(getShops200ResponseInner.contractId)) &&
        (this.name == null ? getShops200ResponseInner.name == null : this.name.equals(getShops200ResponseInner.name)) &&
        (this.updatedAt == null ? getShops200ResponseInner.updatedAt == null : this.updatedAt.equals(getShops200ResponseInner.updatedAt)) &&
        (this.createdAt == null ? getShops200ResponseInner.createdAt == null : this.createdAt.equals(getShops200ResponseInner.createdAt)) &&
        (this.contract == null ? getShops200ResponseInner.contract == null : this.contract.equals(getShops200ResponseInner.contract));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.gameId == null ? 0: this.gameId.hashCode());
    result = 31 * result + (this.contractId == null ? 0: this.contractId.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.contract == null ? 0: this.contract.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetShops200ResponseInner {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  gameId: ").append(gameId).append("\n");
    sb.append("  contractId: ").append(contractId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  contract: ").append(contract).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
