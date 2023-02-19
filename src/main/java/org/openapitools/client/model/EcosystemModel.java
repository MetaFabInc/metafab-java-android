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
public class EcosystemModel {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("name")
  private String name = null;
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
  @SerializedName("updatedAt")
  private String updatedAt = null;
  @SerializedName("createdAt")
  private String createdAt = null;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EcosystemModel ecosystemModel = (EcosystemModel) o;
    return (this.id == null ? ecosystemModel.id == null : this.id.equals(ecosystemModel.id)) &&
        (this.email == null ? ecosystemModel.email == null : this.email.equals(ecosystemModel.email)) &&
        (this.name == null ? ecosystemModel.name == null : this.name.equals(ecosystemModel.name)) &&
        (this.iconImageUrl == null ? ecosystemModel.iconImageUrl == null : this.iconImageUrl.equals(ecosystemModel.iconImageUrl)) &&
        (this.coverImageUrl == null ? ecosystemModel.coverImageUrl == null : this.coverImageUrl.equals(ecosystemModel.coverImageUrl)) &&
        (this.primaryColorHex == null ? ecosystemModel.primaryColorHex == null : this.primaryColorHex.equals(ecosystemModel.primaryColorHex)) &&
        (this.publishedKey == null ? ecosystemModel.publishedKey == null : this.publishedKey.equals(ecosystemModel.publishedKey)) &&
        (this.secretKey == null ? ecosystemModel.secretKey == null : this.secretKey.equals(ecosystemModel.secretKey)) &&
        (this.updatedAt == null ? ecosystemModel.updatedAt == null : this.updatedAt.equals(ecosystemModel.updatedAt)) &&
        (this.createdAt == null ? ecosystemModel.createdAt == null : this.createdAt.equals(ecosystemModel.createdAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.iconImageUrl == null ? 0: this.iconImageUrl.hashCode());
    result = 31 * result + (this.coverImageUrl == null ? 0: this.coverImageUrl.hashCode());
    result = 31 * result + (this.primaryColorHex == null ? 0: this.primaryColorHex.hashCode());
    result = 31 * result + (this.publishedKey == null ? 0: this.publishedKey.hashCode());
    result = 31 * result + (this.secretKey == null ? 0: this.secretKey.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EcosystemModel {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  iconImageUrl: ").append(iconImageUrl).append("\n");
    sb.append("  coverImageUrl: ").append(coverImageUrl).append("\n");
    sb.append("  primaryColorHex: ").append(primaryColorHex).append("\n");
    sb.append("  publishedKey: ").append(publishedKey).append("\n");
    sb.append("  secretKey: ").append(secretKey).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}