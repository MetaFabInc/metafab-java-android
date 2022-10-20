/**
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: metafabproject@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CollectionModel;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GetCollections200ResponseInnerAllOf {
  
  @SerializedName("contract")
  private CollectionModel contract = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public CollectionModel getContract() {
    return contract;
  }
  public void setContract(CollectionModel contract) {
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
    GetCollections200ResponseInnerAllOf getCollections200ResponseInnerAllOf = (GetCollections200ResponseInnerAllOf) o;
    return (this.contract == null ? getCollections200ResponseInnerAllOf.contract == null : this.contract.equals(getCollections200ResponseInnerAllOf.contract));
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
    sb.append("class GetCollections200ResponseInnerAllOf {\n");
    
    sb.append("  contract: ").append(contract).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
