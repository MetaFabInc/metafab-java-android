/**
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.4.0
 * Contact: metafabproject@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.WalletModel;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class AuthPlayer200Response {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("gameId")
  private String gameId = null;
  @SerializedName("walletId")
  private String walletId = null;
  @SerializedName("connectedWalletId")
  private String connectedWalletId = null;
  @SerializedName("username")
  private String username = null;
  @SerializedName("accessToken")
  private String accessToken = null;
  @SerializedName("updatedAt")
  private String updatedAt = null;
  @SerializedName("createdAt")
  private String createdAt = null;
  @SerializedName("wallet")
  private WalletModel wallet = null;

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
   **/
  @ApiModelProperty(value = "")
  public WalletModel getWallet() {
    return wallet;
  }
  public void setWallet(WalletModel wallet) {
    this.wallet = wallet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthPlayer200Response authPlayer200Response = (AuthPlayer200Response) o;
    return (this.id == null ? authPlayer200Response.id == null : this.id.equals(authPlayer200Response.id)) &&
        (this.gameId == null ? authPlayer200Response.gameId == null : this.gameId.equals(authPlayer200Response.gameId)) &&
        (this.walletId == null ? authPlayer200Response.walletId == null : this.walletId.equals(authPlayer200Response.walletId)) &&
        (this.connectedWalletId == null ? authPlayer200Response.connectedWalletId == null : this.connectedWalletId.equals(authPlayer200Response.connectedWalletId)) &&
        (this.username == null ? authPlayer200Response.username == null : this.username.equals(authPlayer200Response.username)) &&
        (this.accessToken == null ? authPlayer200Response.accessToken == null : this.accessToken.equals(authPlayer200Response.accessToken)) &&
        (this.updatedAt == null ? authPlayer200Response.updatedAt == null : this.updatedAt.equals(authPlayer200Response.updatedAt)) &&
        (this.createdAt == null ? authPlayer200Response.createdAt == null : this.createdAt.equals(authPlayer200Response.createdAt)) &&
        (this.wallet == null ? authPlayer200Response.wallet == null : this.wallet.equals(authPlayer200Response.wallet));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.gameId == null ? 0: this.gameId.hashCode());
    result = 31 * result + (this.walletId == null ? 0: this.walletId.hashCode());
    result = 31 * result + (this.connectedWalletId == null ? 0: this.connectedWalletId.hashCode());
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    result = 31 * result + (this.accessToken == null ? 0: this.accessToken.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.wallet == null ? 0: this.wallet.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthPlayer200Response {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  gameId: ").append(gameId).append("\n");
    sb.append("  walletId: ").append(walletId).append("\n");
    sb.append("  connectedWalletId: ").append(connectedWalletId).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  accessToken: ").append(accessToken).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  wallet: ").append(wallet).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
