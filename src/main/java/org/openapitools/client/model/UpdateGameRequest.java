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

import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class UpdateGameRequest {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("currentPassword")
  private String currentPassword = null;
  @SerializedName("newPassword")
  private String newPassword = null;
  @SerializedName("rpcs")
  private Map<String, String> rpcs = null;
  @SerializedName("resetPublishedKey")
  private Boolean resetPublishedKey = null;
  @SerializedName("resetSecretKey")
  private Boolean resetSecretKey = null;

  /**
   * A new name. Replaces the game's current name.
   **/
  @ApiModelProperty(value = "A new name. Replaces the game's current name.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A new email address. The game's old email will no longer be valid for account authentication. `currentPassword` must also be provided.
   **/
  @ApiModelProperty(value = "A new email address. The game's old email will no longer be valid for account authentication. `currentPassword` must also be provided.")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The game's current password. Must be provided if setting `newPassword` or `email`.
   **/
  @ApiModelProperty(value = "The game's current password. Must be provided if setting `newPassword` or `email`.")
  public String getCurrentPassword() {
    return currentPassword;
  }
  public void setCurrentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
  }

  /**
   * A new password. The game's old password will no longer be valid.
   **/
  @ApiModelProperty(value = "A new password. The game's old password will no longer be valid.")
  public String getNewPassword() {
    return newPassword;
  }
  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  /**
   * Sets a custom RPC for your game to use instead of MetaFab's default RPCs for the chain(s) you specify.  Expects a JSON object containing key value pairs of supported `chain` -> `rpc url`. Only the chain names provided as keys in the object will be explicitly overriden. To delete a custom RPC for your game, provide the chain name to delete as a key in the provided object and `null` as the value.  Set RPC example, `{ MATIC: 'https://polygon-rpc.com' }` Delete RPC example, `{ MATIC: null }`
   **/
  @ApiModelProperty(value = "Sets a custom RPC for your game to use instead of MetaFab's default RPCs for the chain(s) you specify.  Expects a JSON object containing key value pairs of supported `chain` -> `rpc url`. Only the chain names provided as keys in the object will be explicitly overriden. To delete a custom RPC for your game, provide the chain name to delete as a key in the provided object and `null` as the value.  Set RPC example, `{ MATIC: 'https://polygon-rpc.com' }` Delete RPC example, `{ MATIC: null }`")
  public Map<String, String> getRpcs() {
    return rpcs;
  }
  public void setRpcs(Map<String, String> rpcs) {
    this.rpcs = rpcs;
  }

  /**
   * Revokes the game's previous published key and returns a new one if true.
   **/
  @ApiModelProperty(value = "Revokes the game's previous published key and returns a new one if true.")
  public Boolean getResetPublishedKey() {
    return resetPublishedKey;
  }
  public void setResetPublishedKey(Boolean resetPublishedKey) {
    this.resetPublishedKey = resetPublishedKey;
  }

  /**
   * Revokes the game's previous secret key and returns a new on if true.
   **/
  @ApiModelProperty(value = "Revokes the game's previous secret key and returns a new on if true.")
  public Boolean getResetSecretKey() {
    return resetSecretKey;
  }
  public void setResetSecretKey(Boolean resetSecretKey) {
    this.resetSecretKey = resetSecretKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGameRequest updateGameRequest = (UpdateGameRequest) o;
    return (this.name == null ? updateGameRequest.name == null : this.name.equals(updateGameRequest.name)) &&
        (this.email == null ? updateGameRequest.email == null : this.email.equals(updateGameRequest.email)) &&
        (this.currentPassword == null ? updateGameRequest.currentPassword == null : this.currentPassword.equals(updateGameRequest.currentPassword)) &&
        (this.newPassword == null ? updateGameRequest.newPassword == null : this.newPassword.equals(updateGameRequest.newPassword)) &&
        (this.rpcs == null ? updateGameRequest.rpcs == null : this.rpcs.equals(updateGameRequest.rpcs)) &&
        (this.resetPublishedKey == null ? updateGameRequest.resetPublishedKey == null : this.resetPublishedKey.equals(updateGameRequest.resetPublishedKey)) &&
        (this.resetSecretKey == null ? updateGameRequest.resetSecretKey == null : this.resetSecretKey.equals(updateGameRequest.resetSecretKey));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.currentPassword == null ? 0: this.currentPassword.hashCode());
    result = 31 * result + (this.newPassword == null ? 0: this.newPassword.hashCode());
    result = 31 * result + (this.rpcs == null ? 0: this.rpcs.hashCode());
    result = 31 * result + (this.resetPublishedKey == null ? 0: this.resetPublishedKey.hashCode());
    result = 31 * result + (this.resetSecretKey == null ? 0: this.resetSecretKey.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGameRequest {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  currentPassword: ").append(currentPassword).append("\n");
    sb.append("  newPassword: ").append(newPassword).append("\n");
    sb.append("  rpcs: ").append(rpcs).append("\n");
    sb.append("  resetPublishedKey: ").append(resetPublishedKey).append("\n");
    sb.append("  resetSecretKey: ").append(resetSecretKey).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
