/**
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: metafabproject@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BurnCollectionItemRequest {
  
  @SerializedName("quantity")
  private Integer quantity = null;

  /**
   * The quantity of the collectionItemId to burn.
   **/
  @ApiModelProperty(required = true, value = "The quantity of the collectionItemId to burn.")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BurnCollectionItemRequest burnCollectionItemRequest = (BurnCollectionItemRequest) o;
    return (this.quantity == null ? burnCollectionItemRequest.quantity == null : this.quantity.equals(burnCollectionItemRequest.quantity));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.quantity == null ? 0: this.quantity.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BurnCollectionItemRequest {\n");
    
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
