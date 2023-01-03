/**
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.4.0
 * Contact: metafabproject@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CreateCollection200ResponseAllOfContract;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateLootboxManager200Response {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("gameId")
  private String gameId = null;
  @SerializedName("contractId")
  private String contractId = null;
  @SerializedName("updatedAt")
  private String updatedAt = null;
  @SerializedName("createdAt")
  private String createdAt = null;
  @SerializedName("contract")
  private CreateCollection200ResponseAllOfContract contract = null;

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
  public CreateCollection200ResponseAllOfContract getContract() {
    return contract;
  }
  public void setContract(CreateCollection200ResponseAllOfContract contract) {
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
    CreateLootboxManager200Response createLootboxManager200Response = (CreateLootboxManager200Response) o;
    return (this.id == null ? createLootboxManager200Response.id == null : this.id.equals(createLootboxManager200Response.id)) &&
        (this.gameId == null ? createLootboxManager200Response.gameId == null : this.gameId.equals(createLootboxManager200Response.gameId)) &&
        (this.contractId == null ? createLootboxManager200Response.contractId == null : this.contractId.equals(createLootboxManager200Response.contractId)) &&
        (this.updatedAt == null ? createLootboxManager200Response.updatedAt == null : this.updatedAt.equals(createLootboxManager200Response.updatedAt)) &&
        (this.createdAt == null ? createLootboxManager200Response.createdAt == null : this.createdAt.equals(createLootboxManager200Response.createdAt)) &&
        (this.contract == null ? createLootboxManager200Response.contract == null : this.contract.equals(createLootboxManager200Response.contract));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.gameId == null ? 0: this.gameId.hashCode());
    result = 31 * result + (this.contractId == null ? 0: this.contractId.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.contract == null ? 0: this.contract.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLootboxManager200Response {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  gameId: ").append(gameId).append("\n");
    sb.append("  contractId: ").append(contractId).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  contract: ").append(contract).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
