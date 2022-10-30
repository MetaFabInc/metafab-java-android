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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GetCurrencyFees200Response {
  
  @SerializedName("recipientAddress")
  private String recipientAddress = null;
  @SerializedName("basisPoints")
  private BigDecimal basisPoints = null;
  @SerializedName("fixedAmount")
  private BigDecimal fixedAmount = null;
  @SerializedName("capAmount")
  private BigDecimal capAmount = null;

  /**
   * The wallet address that fees from all applicable transactions are automatically sent to.
   **/
  @ApiModelProperty(value = "The wallet address that fees from all applicable transactions are automatically sent to.")
  public String getRecipientAddress() {
    return recipientAddress;
  }
  public void setRecipientAddress(String recipientAddress) {
    this.recipientAddress = recipientAddress;
  }

  /**
   * The number of fee basis points. 100 basisPoints = 1% fee of the total transaction amount deducted from the total received by the recipient.
   **/
  @ApiModelProperty(value = "The number of fee basis points. 100 basisPoints = 1% fee of the total transaction amount deducted from the total received by the recipient.")
  public BigDecimal getBasisPoints() {
    return basisPoints;
  }
  public void setBasisPoints(BigDecimal basisPoints) {
    this.basisPoints = basisPoints;
  }

  /**
   * The fixed number of currency as a fee regardless of the total transaction amount. 10 = 10 of the currency as a fee for any transaction, deducted from the total received by the recipient.
   **/
  @ApiModelProperty(value = "The fixed number of currency as a fee regardless of the total transaction amount. 10 = 10 of the currency as a fee for any transaction, deducted from the total received by the recipient.")
  public BigDecimal getFixedAmount() {
    return fixedAmount;
  }
  public void setFixedAmount(BigDecimal fixedAmount) {
    this.fixedAmount = fixedAmount;
  }

  /**
   * The maximum combined fee between basisPoints and fixedAmount. If the total transaction fee is over this amount, the capAmount will be used as the transaction fee deducted from the total received by the recipient.
   **/
  @ApiModelProperty(value = "The maximum combined fee between basisPoints and fixedAmount. If the total transaction fee is over this amount, the capAmount will be used as the transaction fee deducted from the total received by the recipient.")
  public BigDecimal getCapAmount() {
    return capAmount;
  }
  public void setCapAmount(BigDecimal capAmount) {
    this.capAmount = capAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCurrencyFees200Response getCurrencyFees200Response = (GetCurrencyFees200Response) o;
    return (this.recipientAddress == null ? getCurrencyFees200Response.recipientAddress == null : this.recipientAddress.equals(getCurrencyFees200Response.recipientAddress)) &&
        (this.basisPoints == null ? getCurrencyFees200Response.basisPoints == null : this.basisPoints.equals(getCurrencyFees200Response.basisPoints)) &&
        (this.fixedAmount == null ? getCurrencyFees200Response.fixedAmount == null : this.fixedAmount.equals(getCurrencyFees200Response.fixedAmount)) &&
        (this.capAmount == null ? getCurrencyFees200Response.capAmount == null : this.capAmount.equals(getCurrencyFees200Response.capAmount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.recipientAddress == null ? 0: this.recipientAddress.hashCode());
    result = 31 * result + (this.basisPoints == null ? 0: this.basisPoints.hashCode());
    result = 31 * result + (this.fixedAmount == null ? 0: this.fixedAmount.hashCode());
    result = 31 * result + (this.capAmount == null ? 0: this.capAmount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCurrencyFees200Response {\n");
    
    sb.append("  recipientAddress: ").append(recipientAddress).append("\n");
    sb.append("  basisPoints: ").append(basisPoints).append("\n");
    sb.append("  fixedAmount: ").append(fixedAmount).append("\n");
    sb.append("  capAmount: ").append(capAmount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
