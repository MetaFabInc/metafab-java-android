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
public class WithdrawFromExchangeRequest {
  
  @SerializedName("address")
  private String address = null;
  @SerializedName("walletId")
  private String walletId = null;
  @SerializedName("currencyAddress")
  private String currencyAddress = null;
  @SerializedName("currencyId")
  private String currencyId = null;
  @SerializedName("collectionAddress")
  private String collectionAddress = null;
  @SerializedName("collectionId")
  private String collectionId = null;
  @SerializedName("itemIds")
  private List<BigDecimal> itemIds = null;

  /**
   * A valid EVM based address to withdraw to. For example, `0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D`.
   **/
  @ApiModelProperty(value = "A valid EVM based address to withdraw to. For example, `0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D`.")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Any wallet id within the MetaFab ecosystem to withdraw to.
   **/
  @ApiModelProperty(value = "Any wallet id within the MetaFab ecosystem to withdraw to.")
  public String getWalletId() {
    return walletId;
  }
  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }

  /**
   * The address of the currency (ERC20) token to withdraw from the exchange. If no currencyAddress or currencyId, and no collectionAddress or collectionId are provided, the native token held by the exchange will be withdrawn.
   **/
  @ApiModelProperty(value = "The address of the currency (ERC20) token to withdraw from the exchange. If no currencyAddress or currencyId, and no collectionAddress or collectionId are provided, the native token held by the exchange will be withdrawn.")
  public String getCurrencyAddress() {
    return currencyAddress;
  }
  public void setCurrencyAddress(String currencyAddress) {
    this.currencyAddress = currencyAddress;
  }

  /**
   * A valid MetaFab currency id that represents the currency token to withdraw from the exchange. `currencyAddress` or `currencyId` can be provided when withdrawing currency.
   **/
  @ApiModelProperty(value = "A valid MetaFab currency id that represents the currency token to withdraw from the exchange. `currencyAddress` or `currencyId` can be provided when withdrawing currency.")
  public String getCurrencyId() {
    return currencyId;
  }
  public void setCurrencyId(String currencyId) {
    this.currencyId = currencyId;
  }

  /**
   * The address of the collection (ERC1155) for the items to withdraw from the exchange. If no currencyAddress and no collectionAddress is provided, the native token held by the exchange will be withdrawn.
   **/
  @ApiModelProperty(value = "The address of the collection (ERC1155) for the items to withdraw from the exchange. If no currencyAddress and no collectionAddress is provided, the native token held by the exchange will be withdrawn.")
  public String getCollectionAddress() {
    return collectionAddress;
  }
  public void setCollectionAddress(String collectionAddress) {
    this.collectionAddress = collectionAddress;
  }

  /**
   * A valid MetaFab collection id that represents the collection for the items to withdraw from the exchange. `collectionAddress` or `collectionId` can be provided when withdrawing items.
   **/
  @ApiModelProperty(value = "A valid MetaFab collection id that represents the collection for the items to withdraw from the exchange. `collectionAddress` or `collectionId` can be provided when withdrawing items.")
  public String getCollectionId() {
    return collectionId;
  }
  public void setCollectionId(String collectionId) {
    this.collectionId = collectionId;
  }

  /**
   * The specific itemIds of the provided collection to withdraw from the exchange.
   **/
  @ApiModelProperty(value = "The specific itemIds of the provided collection to withdraw from the exchange.")
  public List<BigDecimal> getItemIds() {
    return itemIds;
  }
  public void setItemIds(List<BigDecimal> itemIds) {
    this.itemIds = itemIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WithdrawFromExchangeRequest withdrawFromExchangeRequest = (WithdrawFromExchangeRequest) o;
    return (this.address == null ? withdrawFromExchangeRequest.address == null : this.address.equals(withdrawFromExchangeRequest.address)) &&
        (this.walletId == null ? withdrawFromExchangeRequest.walletId == null : this.walletId.equals(withdrawFromExchangeRequest.walletId)) &&
        (this.currencyAddress == null ? withdrawFromExchangeRequest.currencyAddress == null : this.currencyAddress.equals(withdrawFromExchangeRequest.currencyAddress)) &&
        (this.currencyId == null ? withdrawFromExchangeRequest.currencyId == null : this.currencyId.equals(withdrawFromExchangeRequest.currencyId)) &&
        (this.collectionAddress == null ? withdrawFromExchangeRequest.collectionAddress == null : this.collectionAddress.equals(withdrawFromExchangeRequest.collectionAddress)) &&
        (this.collectionId == null ? withdrawFromExchangeRequest.collectionId == null : this.collectionId.equals(withdrawFromExchangeRequest.collectionId)) &&
        (this.itemIds == null ? withdrawFromExchangeRequest.itemIds == null : this.itemIds.equals(withdrawFromExchangeRequest.itemIds));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.walletId == null ? 0: this.walletId.hashCode());
    result = 31 * result + (this.currencyAddress == null ? 0: this.currencyAddress.hashCode());
    result = 31 * result + (this.currencyId == null ? 0: this.currencyId.hashCode());
    result = 31 * result + (this.collectionAddress == null ? 0: this.collectionAddress.hashCode());
    result = 31 * result + (this.collectionId == null ? 0: this.collectionId.hashCode());
    result = 31 * result + (this.itemIds == null ? 0: this.itemIds.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WithdrawFromExchangeRequest {\n");
    
    sb.append("  address: ").append(address).append("\n");
    sb.append("  walletId: ").append(walletId).append("\n");
    sb.append("  currencyAddress: ").append(currencyAddress).append("\n");
    sb.append("  currencyId: ").append(currencyId).append("\n");
    sb.append("  collectionAddress: ").append(collectionAddress).append("\n");
    sb.append("  collectionId: ").append(collectionId).append("\n");
    sb.append("  itemIds: ").append(itemIds).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
