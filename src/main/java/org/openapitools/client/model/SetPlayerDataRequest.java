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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SetPlayerDataRequest {
  
  @SerializedName("protectedData")
  private Object protectedData = null;
  @SerializedName("publicData")
  private Object publicData = null;

  /**
   * protectedData can only be set if `X-Authorization` includes credentials for the game the target player is a part of. Expects an arbitrary object allowed to contain any set of properties and nested data within those properties, including arrays.  protectedData is great for storing sensitive player data like tracking experience points, off-chain inventories, save states, and more - things that players shouldn't have the ability to directly change themselves.
   **/
  @ApiModelProperty(value = "protectedData can only be set if `X-Authorization` includes credentials for the game the target player is a part of. Expects an arbitrary object allowed to contain any set of properties and nested data within those properties, including arrays.  protectedData is great for storing sensitive player data like tracking experience points, off-chain inventories, save states, and more - things that players shouldn't have the ability to directly change themselves.")
  public Object getProtectedData() {
    return protectedData;
  }
  public void setProtectedData(Object protectedData) {
    this.protectedData = protectedData;
  }

  /**
   * publicData can be set if `X-Authorization` includes credentials for the target player or game the player is a part of. Expects an arbitrary object allowed to contain any set of properties and nested data within those properties, including arrays.  publicData is great for storing player preferences like in-game settings, non-sensitive data and more. Anything that a player should have the ability to directly change themselves without client or server verification can be stored in publicData.
   **/
  @ApiModelProperty(value = "publicData can be set if `X-Authorization` includes credentials for the target player or game the player is a part of. Expects an arbitrary object allowed to contain any set of properties and nested data within those properties, including arrays.  publicData is great for storing player preferences like in-game settings, non-sensitive data and more. Anything that a player should have the ability to directly change themselves without client or server verification can be stored in publicData.")
  public Object getPublicData() {
    return publicData;
  }
  public void setPublicData(Object publicData) {
    this.publicData = publicData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetPlayerDataRequest setPlayerDataRequest = (SetPlayerDataRequest) o;
    return (this.protectedData == null ? setPlayerDataRequest.protectedData == null : this.protectedData.equals(setPlayerDataRequest.protectedData)) &&
        (this.publicData == null ? setPlayerDataRequest.publicData == null : this.publicData.equals(setPlayerDataRequest.publicData));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.protectedData == null ? 0: this.protectedData.hashCode());
    result = 31 * result + (this.publicData == null ? 0: this.publicData.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetPlayerDataRequest {\n");
    
    sb.append("  protectedData: ").append(protectedData).append("\n");
    sb.append("  publicData: ").append(publicData).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
