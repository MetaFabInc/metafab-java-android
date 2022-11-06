/**
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.1.43
 * Contact: metafabproject@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ContractModel;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GetCurrencies200ResponseInnerAllOf {
  
  @SerializedName("contract")
  private ContractModel contract = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ContractModel getContract() {
    return contract;
  }
  public void setContract(ContractModel contract) {
    this.contract = contract;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCurrencies200ResponseInnerAllOf getCurrencies200ResponseInnerAllOf = (GetCurrencies200ResponseInnerAllOf) o;
    return (this.contract == null ? getCurrencies200ResponseInnerAllOf.contract == null : this.contract.equals(getCurrencies200ResponseInnerAllOf.contract));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.contract == null ? 0: this.contract.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCurrencies200ResponseInnerAllOf {\n");
    
    sb.append("  contract: ").append(contract).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
