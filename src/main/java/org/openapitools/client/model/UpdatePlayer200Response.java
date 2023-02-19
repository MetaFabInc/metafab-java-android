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
public class UpdatePlayer200Response {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("gameId")
  private String gameId = null;
  @SerializedName("walletId")
  private String walletId = null;
  @SerializedName("connectedWalletId")
  private String connectedWalletId = null;
  @SerializedName("profileId")
  private String profileId = null;
  @SerializedName("username")
  private String username = null;
  @SerializedName("accessToken")
  private String accessToken = null;
  @SerializedName("profilePermissions")
  private Object profilePermissions = null;
  @SerializedName("updatedAt")
  private String updatedAt = null;
  @SerializedName("createdAt")
  private String createdAt = null;
  @SerializedName("walletDecryptKey")
  private String walletDecryptKey = null;

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
  public String getGameId() {
    return gameId;
  }
  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getWalletId() {
    return walletId;
  }
  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getConnectedWalletId() {
    return connectedWalletId;
  }
  public void setConnectedWalletId(String connectedWalletId) {
    this.connectedWalletId = connectedWalletId;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getProfileId() {
    return profileId;
  }
  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public Object getProfilePermissions() {
    return profilePermissions;
  }
  public void setProfilePermissions(Object profilePermissions) {
    this.profilePermissions = profilePermissions;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getWalletDecryptKey() {
    return walletDecryptKey;
  }
  public void setWalletDecryptKey(String walletDecryptKey) {
    this.walletDecryptKey = walletDecryptKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePlayer200Response updatePlayer200Response = (UpdatePlayer200Response) o;
    return (this.id == null ? updatePlayer200Response.id == null : this.id.equals(updatePlayer200Response.id)) &&
        (this.gameId == null ? updatePlayer200Response.gameId == null : this.gameId.equals(updatePlayer200Response.gameId)) &&
        (this.walletId == null ? updatePlayer200Response.walletId == null : this.walletId.equals(updatePlayer200Response.walletId)) &&
        (this.connectedWalletId == null ? updatePlayer200Response.connectedWalletId == null : this.connectedWalletId.equals(updatePlayer200Response.connectedWalletId)) &&
        (this.profileId == null ? updatePlayer200Response.profileId == null : this.profileId.equals(updatePlayer200Response.profileId)) &&
        (this.username == null ? updatePlayer200Response.username == null : this.username.equals(updatePlayer200Response.username)) &&
        (this.accessToken == null ? updatePlayer200Response.accessToken == null : this.accessToken.equals(updatePlayer200Response.accessToken)) &&
        (this.profilePermissions == null ? updatePlayer200Response.profilePermissions == null : this.profilePermissions.equals(updatePlayer200Response.profilePermissions)) &&
        (this.updatedAt == null ? updatePlayer200Response.updatedAt == null : this.updatedAt.equals(updatePlayer200Response.updatedAt)) &&
        (this.createdAt == null ? updatePlayer200Response.createdAt == null : this.createdAt.equals(updatePlayer200Response.createdAt)) &&
        (this.walletDecryptKey == null ? updatePlayer200Response.walletDecryptKey == null : this.walletDecryptKey.equals(updatePlayer200Response.walletDecryptKey));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.gameId == null ? 0: this.gameId.hashCode());
    result = 31 * result + (this.walletId == null ? 0: this.walletId.hashCode());
    result = 31 * result + (this.connectedWalletId == null ? 0: this.connectedWalletId.hashCode());
    result = 31 * result + (this.profileId == null ? 0: this.profileId.hashCode());
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    result = 31 * result + (this.accessToken == null ? 0: this.accessToken.hashCode());
    result = 31 * result + (this.profilePermissions == null ? 0: this.profilePermissions.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.walletDecryptKey == null ? 0: this.walletDecryptKey.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePlayer200Response {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  gameId: ").append(gameId).append("\n");
    sb.append("  walletId: ").append(walletId).append("\n");
    sb.append("  connectedWalletId: ").append(connectedWalletId).append("\n");
    sb.append("  profileId: ").append(profileId).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  accessToken: ").append(accessToken).append("\n");
    sb.append("  profilePermissions: ").append(profilePermissions).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  walletDecryptKey: ").append(walletDecryptKey).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
