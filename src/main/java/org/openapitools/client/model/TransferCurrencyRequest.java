/**
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: metafabproject@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class TransferCurrencyRequest {
  
  @SerializedName("address")
  private String address = null;
  @SerializedName("walletId")
  private String walletId = null;
  @SerializedName("amount")
  private BigDecimal amount = null;
  @SerializedName("reference")
  private BigDecimal reference = null;

  /**
   * A valid EVM based address to transfer currency to. For example, `0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D`.
   **/
  @ApiModelProperty(value = "A valid EVM based address to transfer currency to. For example, `0x39cb70F972E0EE920088AeF97Dbe5c6251a9c25D`.")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Any wallet id within the MetaFab ecosystem to transfer currency to.
   **/
  @ApiModelProperty(value = "Any wallet id within the MetaFab ecosystem to transfer currency to.")
  public String getWalletId() {
    return walletId;
  }
  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }

  /**
   * The amount of currency to transfer.
   **/
  @ApiModelProperty(required = true, value = "The amount of currency to transfer.")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  /**
   * An optional uint256 number to reference the transfer. Commonly used to identify transfers intended to pay for game items or services.
   **/
  @ApiModelProperty(value = "An optional uint256 number to reference the transfer. Commonly used to identify transfers intended to pay for game items or services.")
  public BigDecimal getReference() {
    return reference;
  }
  public void setReference(BigDecimal reference) {
    this.reference = reference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferCurrencyRequest transferCurrencyRequest = (TransferCurrencyRequest) o;
    return (this.address == null ? transferCurrencyRequest.address == null : this.address.equals(transferCurrencyRequest.address)) &&
        (this.walletId == null ? transferCurrencyRequest.walletId == null : this.walletId.equals(transferCurrencyRequest.walletId)) &&
        (this.amount == null ? transferCurrencyRequest.amount == null : this.amount.equals(transferCurrencyRequest.amount)) &&
        (this.reference == null ? transferCurrencyRequest.reference == null : this.reference.equals(transferCurrencyRequest.reference));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.walletId == null ? 0: this.walletId.hashCode());
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    result = 31 * result + (this.reference == null ? 0: this.reference.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferCurrencyRequest {\n");
    
    sb.append("  address: ").append(address).append("\n");
    sb.append("  walletId: ").append(walletId).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  reference: ").append(reference).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
