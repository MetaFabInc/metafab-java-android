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

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SetCurrencyFeesRequest {
  
  @SerializedName("recipientAddress")
  private String recipientAddress = null;
  @SerializedName("basisPoints")
  private BigDecimal basisPoints = null;
  @SerializedName("fixedAmount")
  private BigDecimal fixedAmount = null;
  @SerializedName("capAmount")
  private BigDecimal capAmount = null;

  /**
   * The recipient address of currency transaction fees.
   **/
  @ApiModelProperty(required = true, value = "The recipient address of currency transaction fees.")
  public String getRecipientAddress() {
    return recipientAddress;
  }
  public void setRecipientAddress(String recipientAddress) {
    this.recipientAddress = recipientAddress;
  }

  /**
   * A percentage fee for every transaction represented in basis points. To set a 1.5% fee, you would use a value of 150. This value can be 0, denoting no percentage fees.
   **/
  @ApiModelProperty(required = true, value = "A percentage fee for every transaction represented in basis points. To set a 1.5% fee, you would use a value of 150. This value can be 0, denoting no percentage fees.")
  public BigDecimal getBasisPoints() {
    return basisPoints;
  }
  public void setBasisPoints(BigDecimal basisPoints) {
    this.basisPoints = basisPoints;
  }

  /**
   * A fixed fee for every transaction. A value of 0.5 would mean 0.5 of the currency of a transaction is always taken as a fee. This value can be 0, denoting no fixed fees.
   **/
  @ApiModelProperty(required = true, value = "A fixed fee for every transaction. A value of 0.5 would mean 0.5 of the currency of a transaction is always taken as a fee. This value can be 0, denoting no fixed fees.")
  public BigDecimal getFixedAmount() {
    return fixedAmount;
  }
  public void setFixedAmount(BigDecimal fixedAmount) {
    this.fixedAmount = fixedAmount;
  }

  /**
   * The maximum fee amount for any single transaction. The total fee of a transaction is calculated as the sum of the basis points (percentage) fee, and fixed fee. If a calculated fee is greater than this maximum fee value, the maximum fee will be used instead.
   **/
  @ApiModelProperty(required = true, value = "The maximum fee amount for any single transaction. The total fee of a transaction is calculated as the sum of the basis points (percentage) fee, and fixed fee. If a calculated fee is greater than this maximum fee value, the maximum fee will be used instead.")
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
    SetCurrencyFeesRequest setCurrencyFeesRequest = (SetCurrencyFeesRequest) o;
    return (this.recipientAddress == null ? setCurrencyFeesRequest.recipientAddress == null : this.recipientAddress.equals(setCurrencyFeesRequest.recipientAddress)) &&
        (this.basisPoints == null ? setCurrencyFeesRequest.basisPoints == null : this.basisPoints.equals(setCurrencyFeesRequest.basisPoints)) &&
        (this.fixedAmount == null ? setCurrencyFeesRequest.fixedAmount == null : this.fixedAmount.equals(setCurrencyFeesRequest.fixedAmount)) &&
        (this.capAmount == null ? setCurrencyFeesRequest.capAmount == null : this.capAmount.equals(setCurrencyFeesRequest.capAmount));
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
    sb.append("class SetCurrencyFeesRequest {\n");
    
    sb.append("  recipientAddress: ").append(recipientAddress).append("\n");
    sb.append("  basisPoints: ").append(basisPoints).append("\n");
    sb.append("  fixedAmount: ").append(fixedAmount).append("\n");
    sb.append("  capAmount: ").append(capAmount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
