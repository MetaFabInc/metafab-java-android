/**
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: metafabproject@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class TransferCollectionItemRequest {
  
  @SerializedName("address")
  private String address = null;
  @SerializedName("walletId")
  private List<String> walletId = null;
  @SerializedName("quantity")
  private BigDecimal quantity = null;

  /**
   * A valid EVM based addresses to transfer items to.
   **/
  @ApiModelProperty(value = "A valid EVM based addresses to transfer items to.")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * A wallet id within the MetaFab ecosystem to transfer items to.
   **/
  @ApiModelProperty(value = "A wallet id within the MetaFab ecosystem to transfer items to.")
  public List<String> getWalletId() {
    return walletId;
  }
  public void setWalletId(List<String> walletId) {
    this.walletId = walletId;
  }

  /**
   * The quantity of the collectionItemId to transfer.
   **/
  @ApiModelProperty(required = true, value = "The quantity of the collectionItemId to transfer.")
  public BigDecimal getQuantity() {
    return quantity;
  }
  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferCollectionItemRequest transferCollectionItemRequest = (TransferCollectionItemRequest) o;
    return (this.address == null ? transferCollectionItemRequest.address == null : this.address.equals(transferCollectionItemRequest.address)) &&
        (this.walletId == null ? transferCollectionItemRequest.walletId == null : this.walletId.equals(transferCollectionItemRequest.walletId)) &&
        (this.quantity == null ? transferCollectionItemRequest.quantity == null : this.quantity.equals(transferCollectionItemRequest.quantity));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.walletId == null ? 0: this.walletId.hashCode());
    result = 31 * result + (this.quantity == null ? 0: this.quantity.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferCollectionItemRequest {\n");
    
    sb.append("  address: ").append(address).append("\n");
    sb.append("  walletId: ").append(walletId).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
