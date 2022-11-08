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
public class TransactionModel {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("contractId")
  private String contractId = null;
  @SerializedName("walletId")
  private String walletId = null;
  @SerializedName("function")
  private String function = null;
  @SerializedName("args")
  private Object args = null;
  @SerializedName("hash")
  private String hash = null;
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
  public String getWalletId() {
    return walletId;
  }
  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getFunction() {
    return function;
  }
  public void setFunction(String function) {
    this.function = function;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public Object getArgs() {
    return args;
  }
  public void setArgs(Object args) {
    this.args = args;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getHash() {
    return hash;
  }
  public void setHash(String hash) {
    this.hash = hash;
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
    TransactionModel transactionModel = (TransactionModel) o;
    return (this.id == null ? transactionModel.id == null : this.id.equals(transactionModel.id)) &&
        (this.contractId == null ? transactionModel.contractId == null : this.contractId.equals(transactionModel.contractId)) &&
        (this.walletId == null ? transactionModel.walletId == null : this.walletId.equals(transactionModel.walletId)) &&
        (this.function == null ? transactionModel.function == null : this.function.equals(transactionModel.function)) &&
        (this.args == null ? transactionModel.args == null : this.args.equals(transactionModel.args)) &&
        (this.hash == null ? transactionModel.hash == null : this.hash.equals(transactionModel.hash)) &&
        (this.updatedAt == null ? transactionModel.updatedAt == null : this.updatedAt.equals(transactionModel.updatedAt)) &&
        (this.createdAt == null ? transactionModel.createdAt == null : this.createdAt.equals(transactionModel.createdAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.contractId == null ? 0: this.contractId.hashCode());
    result = 31 * result + (this.walletId == null ? 0: this.walletId.hashCode());
    result = 31 * result + (this.function == null ? 0: this.function.hashCode());
    result = 31 * result + (this.args == null ? 0: this.args.hashCode());
    result = 31 * result + (this.hash == null ? 0: this.hash.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionModel {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  contractId: ").append(contractId).append("\n");
    sb.append("  walletId: ").append(walletId).append("\n");
    sb.append("  function: ").append(function).append("\n");
    sb.append("  args: ").append(args).append("\n");
    sb.append("  hash: ").append(hash).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
