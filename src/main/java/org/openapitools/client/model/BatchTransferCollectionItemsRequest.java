/**
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.1.3
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
public class BatchTransferCollectionItemsRequest {
  
  @SerializedName("addresses")
  private List<String> addresses = null;
  @SerializedName("walletIds")
  private List<String> walletIds = null;
  @SerializedName("itemIds")
  private List<BigDecimal> itemIds = null;
  @SerializedName("quantities")
  private List<BigDecimal> quantities = null;

  /**
   * An array of valid EVM based addresses to transfer items to.
   **/
  @ApiModelProperty(value = "An array of valid EVM based addresses to transfer items to.")
  public List<String> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  /**
   * An array of wallet ids within the MetaFab ecosystem to transfer items to.
   **/
  @ApiModelProperty(value = "An array of wallet ids within the MetaFab ecosystem to transfer items to.")
  public List<String> getWalletIds() {
    return walletIds;
  }
  public void setWalletIds(List<String> walletIds) {
    this.walletIds = walletIds;
  }

  /**
   * An array of unique itemIds to transfer. Each recipient will receive the same set of items provided.
   **/
  @ApiModelProperty(required = true, value = "An array of unique itemIds to transfer. Each recipient will receive the same set of items provided.")
  public List<BigDecimal> getItemIds() {
    return itemIds;
  }
  public void setItemIds(List<BigDecimal> itemIds) {
    this.itemIds = itemIds;
  }

  /**
   * The quantities of each unique itemId to transfer. Each recipient will receive the same quantities of items provided.
   **/
  @ApiModelProperty(required = true, value = "The quantities of each unique itemId to transfer. Each recipient will receive the same quantities of items provided.")
  public List<BigDecimal> getQuantities() {
    return quantities;
  }
  public void setQuantities(List<BigDecimal> quantities) {
    this.quantities = quantities;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchTransferCollectionItemsRequest batchTransferCollectionItemsRequest = (BatchTransferCollectionItemsRequest) o;
    return (this.addresses == null ? batchTransferCollectionItemsRequest.addresses == null : this.addresses.equals(batchTransferCollectionItemsRequest.addresses)) &&
        (this.walletIds == null ? batchTransferCollectionItemsRequest.walletIds == null : this.walletIds.equals(batchTransferCollectionItemsRequest.walletIds)) &&
        (this.itemIds == null ? batchTransferCollectionItemsRequest.itemIds == null : this.itemIds.equals(batchTransferCollectionItemsRequest.itemIds)) &&
        (this.quantities == null ? batchTransferCollectionItemsRequest.quantities == null : this.quantities.equals(batchTransferCollectionItemsRequest.quantities));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.addresses == null ? 0: this.addresses.hashCode());
    result = 31 * result + (this.walletIds == null ? 0: this.walletIds.hashCode());
    result = 31 * result + (this.itemIds == null ? 0: this.itemIds.hashCode());
    result = 31 * result + (this.quantities == null ? 0: this.quantities.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchTransferCollectionItemsRequest {\n");
    
    sb.append("  addresses: ").append(addresses).append("\n");
    sb.append("  walletIds: ").append(walletIds).append("\n");
    sb.append("  itemIds: ").append(itemIds).append("\n");
    sb.append("  quantities: ").append(quantities).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
