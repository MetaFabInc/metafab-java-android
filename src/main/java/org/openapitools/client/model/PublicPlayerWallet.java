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
public class PublicPlayerWallet {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("address")
  private String address = null;

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicPlayerWallet publicPlayerWallet = (PublicPlayerWallet) o;
    return (this.id == null ? publicPlayerWallet.id == null : this.id.equals(publicPlayerWallet.id)) &&
        (this.address == null ? publicPlayerWallet.address == null : this.address.equals(publicPlayerWallet.address));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicPlayerWallet {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
