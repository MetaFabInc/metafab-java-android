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

import org.openapitools.client.model.CreateCollection200ResponseAllOfContract;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateCollection200ResponseAllOf {
  
  @SerializedName("contract")
  private CreateCollection200ResponseAllOfContract contract = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public CreateCollection200ResponseAllOfContract getContract() {
    return contract;
  }
  public void setContract(CreateCollection200ResponseAllOfContract contract) {
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
    CreateCollection200ResponseAllOf createCollection200ResponseAllOf = (CreateCollection200ResponseAllOf) o;
    return (this.contract == null ? createCollection200ResponseAllOf.contract == null : this.contract.equals(createCollection200ResponseAllOf.contract));
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
    sb.append("class CreateCollection200ResponseAllOf {\n");
    
    sb.append("  contract: ").append(contract).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
