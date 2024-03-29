/**
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.4.4
 * Contact: metafabproject@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.WalletModel;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class AuthGame200ResponseAllOf1 {
  
  @SerializedName("fundingWallet")
  private WalletModel fundingWallet = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public WalletModel getFundingWallet() {
    return fundingWallet;
  }
  public void setFundingWallet(WalletModel fundingWallet) {
    this.fundingWallet = fundingWallet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthGame200ResponseAllOf1 authGame200ResponseAllOf1 = (AuthGame200ResponseAllOf1) o;
    return (this.fundingWallet == null ? authGame200ResponseAllOf1.fundingWallet == null : this.fundingWallet.equals(authGame200ResponseAllOf1.fundingWallet));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fundingWallet == null ? 0: this.fundingWallet.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthGame200ResponseAllOf1 {\n");
    
    sb.append("  fundingWallet: ").append(fundingWallet).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
