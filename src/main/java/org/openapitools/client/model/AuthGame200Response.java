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

import org.openapitools.client.model.WalletModel;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class AuthGame200Response {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("walletId")
  private String walletId = null;
  @SerializedName("fundingWalletId")
  private String fundingWalletId = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("rpcs")
  private Object rpcs = null;
  @SerializedName("redirectUris")
  private Object redirectUris = null;
  @SerializedName("iconImageUrl")
  private String iconImageUrl = null;
  @SerializedName("coverImageUrl")
  private String coverImageUrl = null;
  @SerializedName("primaryColorHex")
  private String primaryColorHex = null;
  @SerializedName("publishedKey")
  private String publishedKey = null;
  @SerializedName("secretKey")
  private String secretKey = null;
  @SerializedName("verified")
  private Boolean verified = null;
  @SerializedName("updatedAt")
  private String updatedAt = null;
  @SerializedName("createdAt")
  private String createdAt = null;
  @SerializedName("walletDecryptKey")
  private String walletDecryptKey = null;
  @SerializedName("wallet")
  private WalletModel wallet = null;
  @SerializedName("fundingWallet")
  private WalletModel fundingWallet = null;

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
  public String getFundingWalletId() {
    return fundingWalletId;
  }
  public void setFundingWalletId(String fundingWalletId) {
    this.fundingWalletId = fundingWalletId;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public Object getRpcs() {
    return rpcs;
  }
  public void setRpcs(Object rpcs) {
    this.rpcs = rpcs;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public Object getRedirectUris() {
    return redirectUris;
  }
  public void setRedirectUris(Object redirectUris) {
    this.redirectUris = redirectUris;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getIconImageUrl() {
    return iconImageUrl;
  }
  public void setIconImageUrl(String iconImageUrl) {
    this.iconImageUrl = iconImageUrl;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }
  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getPrimaryColorHex() {
    return primaryColorHex;
  }
  public void setPrimaryColorHex(String primaryColorHex) {
    this.primaryColorHex = primaryColorHex;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getPublishedKey() {
    return publishedKey;
  }
  public void setPublishedKey(String publishedKey) {
    this.publishedKey = publishedKey;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public String getSecretKey() {
    return secretKey;
  }
  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }

  /**
   * This field has not had a description added.
   **/
  @ApiModelProperty(value = "This field has not had a description added.")
  public Boolean getVerified() {
    return verified;
  }
  public void setVerified(Boolean verified) {
    this.verified = verified;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public WalletModel getWallet() {
    return wallet;
  }
  public void setWallet(WalletModel wallet) {
    this.wallet = wallet;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public WalletModel getFundingWallet() {
    return fundingWallet;
  }
  public void setFundingWallet(WalletModel fundingWallet) {
    this.fundingWallet = fundingWallet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthGame200Response authGame200Response = (AuthGame200Response) o;
    return (this.id == null ? authGame200Response.id == null : this.id.equals(authGame200Response.id)) &&
        (this.walletId == null ? authGame200Response.walletId == null : this.walletId.equals(authGame200Response.walletId)) &&
        (this.fundingWalletId == null ? authGame200Response.fundingWalletId == null : this.fundingWalletId.equals(authGame200Response.fundingWalletId)) &&
        (this.email == null ? authGame200Response.email == null : this.email.equals(authGame200Response.email)) &&
        (this.name == null ? authGame200Response.name == null : this.name.equals(authGame200Response.name)) &&
        (this.rpcs == null ? authGame200Response.rpcs == null : this.rpcs.equals(authGame200Response.rpcs)) &&
        (this.redirectUris == null ? authGame200Response.redirectUris == null : this.redirectUris.equals(authGame200Response.redirectUris)) &&
        (this.iconImageUrl == null ? authGame200Response.iconImageUrl == null : this.iconImageUrl.equals(authGame200Response.iconImageUrl)) &&
        (this.coverImageUrl == null ? authGame200Response.coverImageUrl == null : this.coverImageUrl.equals(authGame200Response.coverImageUrl)) &&
        (this.primaryColorHex == null ? authGame200Response.primaryColorHex == null : this.primaryColorHex.equals(authGame200Response.primaryColorHex)) &&
        (this.publishedKey == null ? authGame200Response.publishedKey == null : this.publishedKey.equals(authGame200Response.publishedKey)) &&
        (this.secretKey == null ? authGame200Response.secretKey == null : this.secretKey.equals(authGame200Response.secretKey)) &&
        (this.verified == null ? authGame200Response.verified == null : this.verified.equals(authGame200Response.verified)) &&
        (this.updatedAt == null ? authGame200Response.updatedAt == null : this.updatedAt.equals(authGame200Response.updatedAt)) &&
        (this.createdAt == null ? authGame200Response.createdAt == null : this.createdAt.equals(authGame200Response.createdAt)) &&
        (this.walletDecryptKey == null ? authGame200Response.walletDecryptKey == null : this.walletDecryptKey.equals(authGame200Response.walletDecryptKey)) &&
        (this.wallet == null ? authGame200Response.wallet == null : this.wallet.equals(authGame200Response.wallet)) &&
        (this.fundingWallet == null ? authGame200Response.fundingWallet == null : this.fundingWallet.equals(authGame200Response.fundingWallet));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.walletId == null ? 0: this.walletId.hashCode());
    result = 31 * result + (this.fundingWalletId == null ? 0: this.fundingWalletId.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.rpcs == null ? 0: this.rpcs.hashCode());
    result = 31 * result + (this.redirectUris == null ? 0: this.redirectUris.hashCode());
    result = 31 * result + (this.iconImageUrl == null ? 0: this.iconImageUrl.hashCode());
    result = 31 * result + (this.coverImageUrl == null ? 0: this.coverImageUrl.hashCode());
    result = 31 * result + (this.primaryColorHex == null ? 0: this.primaryColorHex.hashCode());
    result = 31 * result + (this.publishedKey == null ? 0: this.publishedKey.hashCode());
    result = 31 * result + (this.secretKey == null ? 0: this.secretKey.hashCode());
    result = 31 * result + (this.verified == null ? 0: this.verified.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.walletDecryptKey == null ? 0: this.walletDecryptKey.hashCode());
    result = 31 * result + (this.wallet == null ? 0: this.wallet.hashCode());
    result = 31 * result + (this.fundingWallet == null ? 0: this.fundingWallet.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthGame200Response {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  walletId: ").append(walletId).append("\n");
    sb.append("  fundingWalletId: ").append(fundingWalletId).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  rpcs: ").append(rpcs).append("\n");
    sb.append("  redirectUris: ").append(redirectUris).append("\n");
    sb.append("  iconImageUrl: ").append(iconImageUrl).append("\n");
    sb.append("  coverImageUrl: ").append(coverImageUrl).append("\n");
    sb.append("  primaryColorHex: ").append(primaryColorHex).append("\n");
    sb.append("  publishedKey: ").append(publishedKey).append("\n");
    sb.append("  secretKey: ").append(secretKey).append("\n");
    sb.append("  verified: ").append(verified).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  walletDecryptKey: ").append(walletDecryptKey).append("\n");
    sb.append("  wallet: ").append(wallet).append("\n");
    sb.append("  fundingWallet: ").append(fundingWallet).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
