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
public class BurnCurrencyRequest {
  
  @SerializedName("amount")
  private BigDecimal amount = null;

  /**
   * The amount of currency to remove (burn). The currency balance of the authenticating game or player's wallet must be equal to or greater than this amount.
   **/
  @ApiModelProperty(required = true, value = "The amount of currency to remove (burn). The currency balance of the authenticating game or player's wallet must be equal to or greater than this amount.")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BurnCurrencyRequest burnCurrencyRequest = (BurnCurrencyRequest) o;
    return (this.amount == null ? burnCurrencyRequest.amount == null : this.amount.equals(burnCurrencyRequest.amount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BurnCurrencyRequest {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
