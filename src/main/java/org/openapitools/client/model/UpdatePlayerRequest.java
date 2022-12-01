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
public class UpdatePlayerRequest {
  
  @SerializedName("currentPassword")
  private String currentPassword = null;
  @SerializedName("newPassword")
  private String newPassword = null;
  @SerializedName("resetAccessToken")
  private Boolean resetAccessToken = null;

  /**
   * The player's current password. Must be provided if setting `newPassword`.
   **/
  @ApiModelProperty(value = "The player's current password. Must be provided if setting `newPassword`.")
  public String getCurrentPassword() {
    return currentPassword;
  }
  public void setCurrentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
  }

  /**
   * A new password. The player's old password will no longer be valid.
   **/
  @ApiModelProperty(value = "A new password. The player's old password will no longer be valid.")
  public String getNewPassword() {
    return newPassword;
  }
  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  /**
   * Revokes the player's previous access token and returns a new one if true.
   **/
  @ApiModelProperty(value = "Revokes the player's previous access token and returns a new one if true.")
  public Boolean getResetAccessToken() {
    return resetAccessToken;
  }
  public void setResetAccessToken(Boolean resetAccessToken) {
    this.resetAccessToken = resetAccessToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePlayerRequest updatePlayerRequest = (UpdatePlayerRequest) o;
    return (this.currentPassword == null ? updatePlayerRequest.currentPassword == null : this.currentPassword.equals(updatePlayerRequest.currentPassword)) &&
        (this.newPassword == null ? updatePlayerRequest.newPassword == null : this.newPassword.equals(updatePlayerRequest.newPassword)) &&
        (this.resetAccessToken == null ? updatePlayerRequest.resetAccessToken == null : this.resetAccessToken.equals(updatePlayerRequest.resetAccessToken));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.currentPassword == null ? 0: this.currentPassword.hashCode());
    result = 31 * result + (this.newPassword == null ? 0: this.newPassword.hashCode());
    result = 31 * result + (this.resetAccessToken == null ? 0: this.resetAccessToken.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePlayerRequest {\n");
    
    sb.append("  currentPassword: ").append(currentPassword).append("\n");
    sb.append("  newPassword: ").append(newPassword).append("\n");
    sb.append("  resetAccessToken: ").append(resetAccessToken).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
