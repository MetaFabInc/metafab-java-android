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
public class GetCurrencies200ResponseInner {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("gameId")
  private String gameId = null;
  @SerializedName("contractId")
  private String contractId = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("supplyCap")
  private Integer supplyCap = null;
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
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public Integer getSupplyCap() {
    return supplyCap;
  }
  public void setSupplyCap(Integer supplyCap) {
    this.supplyCap = supplyCap;
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
    GetCurrencies200ResponseInner getCurrencies200ResponseInner = (GetCurrencies200ResponseInner) o;
    return (this.id == null ? getCurrencies200ResponseInner.id == null : this.id.equals(getCurrencies200ResponseInner.id)) &&
        (this.gameId == null ? getCurrencies200ResponseInner.gameId == null : this.gameId.equals(getCurrencies200ResponseInner.gameId)) &&
        (this.contractId == null ? getCurrencies200ResponseInner.contractId == null : this.contractId.equals(getCurrencies200ResponseInner.contractId)) &&
        (this.name == null ? getCurrencies200ResponseInner.name == null : this.name.equals(getCurrencies200ResponseInner.name)) &&
        (this.symbol == null ? getCurrencies200ResponseInner.symbol == null : this.symbol.equals(getCurrencies200ResponseInner.symbol)) &&
        (this.supplyCap == null ? getCurrencies200ResponseInner.supplyCap == null : this.supplyCap.equals(getCurrencies200ResponseInner.supplyCap)) &&
        (this.updatedAt == null ? getCurrencies200ResponseInner.updatedAt == null : this.updatedAt.equals(getCurrencies200ResponseInner.updatedAt)) &&
        (this.createdAt == null ? getCurrencies200ResponseInner.createdAt == null : this.createdAt.equals(getCurrencies200ResponseInner.createdAt)) &&
        (this.contract == null ? getCurrencies200ResponseInner.contract == null : this.contract.equals(getCurrencies200ResponseInner.contract));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.gameId == null ? 0: this.gameId.hashCode());
    result = 31 * result + (this.contractId == null ? 0: this.contractId.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.symbol == null ? 0: this.symbol.hashCode());
    result = 31 * result + (this.supplyCap == null ? 0: this.supplyCap.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.contract == null ? 0: this.contract.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCurrencies200ResponseInner {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  gameId: ").append(gameId).append("\n");
    sb.append("  contractId: ").append(contractId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  supplyCap: ").append(supplyCap).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  contract: ").append(contract).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
