/**
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: metafabproject@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CreateCurrency200ResponseAllOfContract;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateCurrency200ResponseAllOf {
  
  @SerializedName("contract")
  private CreateCurrency200ResponseAllOfContract contract = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public CreateCurrency200ResponseAllOfContract getContract() {
    return contract;
  }
  public void setContract(CreateCurrency200ResponseAllOfContract contract) {
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
    CreateCurrency200ResponseAllOf createCurrency200ResponseAllOf = (CreateCurrency200ResponseAllOf) o;
    return (this.contract == null ? createCurrency200ResponseAllOf.contract == null : this.contract.equals(createCurrency200ResponseAllOf.contract));
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
    sb.append("class CreateCurrency200ResponseAllOf {\n");
    
    sb.append("  contract: ").append(contract).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}