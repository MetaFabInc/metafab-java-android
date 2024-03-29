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
public class MintCollectionItemRequest {
  
  @SerializedName("address")
  private String address = null;
  @SerializedName("quantity")
  private Integer quantity = null;
  @SerializedName("walletId")
  private String walletId = null;

  /**
   * A valid EVM based address to create (mint) the item(s) for. For example, `0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D`.
   **/
  @ApiModelProperty(value = "A valid EVM based address to create (mint) the item(s) for. For example, `0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D`.")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * The quantity of the specified item id to create (mint).
   **/
  @ApiModelProperty(required = true, value = "The quantity of the specified item id to create (mint).")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * Any wallet id within the MetaFab ecosystem to create (mint) the item(s) for.
   **/
  @ApiModelProperty(value = "Any wallet id within the MetaFab ecosystem to create (mint) the item(s) for.")
  public String getWalletId() {
    return walletId;
  }
  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MintCollectionItemRequest mintCollectionItemRequest = (MintCollectionItemRequest) o;
    return (this.address == null ? mintCollectionItemRequest.address == null : this.address.equals(mintCollectionItemRequest.address)) &&
        (this.quantity == null ? mintCollectionItemRequest.quantity == null : this.quantity.equals(mintCollectionItemRequest.quantity)) &&
        (this.walletId == null ? mintCollectionItemRequest.walletId == null : this.walletId.equals(mintCollectionItemRequest.walletId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.quantity == null ? 0: this.quantity.hashCode());
    result = 31 * result + (this.walletId == null ? 0: this.walletId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MintCollectionItemRequest {\n");
    
    sb.append("  address: ").append(address).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  walletId: ").append(walletId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
