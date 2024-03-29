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

import org.openapitools.client.model.TransactionModel;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SetPlayerConnectedWallet200Response {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("transaction")
  private TransactionModel transaction = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TransactionModel getTransaction() {
    return transaction;
  }
  public void setTransaction(TransactionModel transaction) {
    this.transaction = transaction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetPlayerConnectedWallet200Response setPlayerConnectedWallet200Response = (SetPlayerConnectedWallet200Response) o;
    return (this.id == null ? setPlayerConnectedWallet200Response.id == null : this.id.equals(setPlayerConnectedWallet200Response.id)) &&
        (this.address == null ? setPlayerConnectedWallet200Response.address == null : this.address.equals(setPlayerConnectedWallet200Response.address)) &&
        (this.transaction == null ? setPlayerConnectedWallet200Response.transaction == null : this.transaction.equals(setPlayerConnectedWallet200Response.transaction));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.transaction == null ? 0: this.transaction.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetPlayerConnectedWallet200Response {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  transaction: ").append(transaction).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
