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

import java.util.*;
import org.openapitools.client.model.PublicPlayer;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GetProfileGames200ResponseInner {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("publishedKey")
  private String publishedKey = null;
  @SerializedName("iconImageUrl")
  private String iconImageUrl = null;
  @SerializedName("coverImageUrl")
  private String coverImageUrl = null;
  @SerializedName("primaryColorHex")
  private String primaryColorHex = null;
  @SerializedName("createdAt")
  private String createdAt = null;
  @SerializedName("players")
  private List<PublicPlayer> players = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPublishedKey() {
    return publishedKey;
  }
  public void setPublishedKey(String publishedKey) {
    this.publishedKey = publishedKey;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getIconImageUrl() {
    return iconImageUrl;
  }
  public void setIconImageUrl(String iconImageUrl) {
    this.iconImageUrl = iconImageUrl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }
  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPrimaryColorHex() {
    return primaryColorHex;
  }
  public void setPrimaryColorHex(String primaryColorHex) {
    this.primaryColorHex = primaryColorHex;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<PublicPlayer> getPlayers() {
    return players;
  }
  public void setPlayers(List<PublicPlayer> players) {
    this.players = players;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProfileGames200ResponseInner getProfileGames200ResponseInner = (GetProfileGames200ResponseInner) o;
    return (this.id == null ? getProfileGames200ResponseInner.id == null : this.id.equals(getProfileGames200ResponseInner.id)) &&
        (this.name == null ? getProfileGames200ResponseInner.name == null : this.name.equals(getProfileGames200ResponseInner.name)) &&
        (this.publishedKey == null ? getProfileGames200ResponseInner.publishedKey == null : this.publishedKey.equals(getProfileGames200ResponseInner.publishedKey)) &&
        (this.iconImageUrl == null ? getProfileGames200ResponseInner.iconImageUrl == null : this.iconImageUrl.equals(getProfileGames200ResponseInner.iconImageUrl)) &&
        (this.coverImageUrl == null ? getProfileGames200ResponseInner.coverImageUrl == null : this.coverImageUrl.equals(getProfileGames200ResponseInner.coverImageUrl)) &&
        (this.primaryColorHex == null ? getProfileGames200ResponseInner.primaryColorHex == null : this.primaryColorHex.equals(getProfileGames200ResponseInner.primaryColorHex)) &&
        (this.createdAt == null ? getProfileGames200ResponseInner.createdAt == null : this.createdAt.equals(getProfileGames200ResponseInner.createdAt)) &&
        (this.players == null ? getProfileGames200ResponseInner.players == null : this.players.equals(getProfileGames200ResponseInner.players));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.publishedKey == null ? 0: this.publishedKey.hashCode());
    result = 31 * result + (this.iconImageUrl == null ? 0: this.iconImageUrl.hashCode());
    result = 31 * result + (this.coverImageUrl == null ? 0: this.coverImageUrl.hashCode());
    result = 31 * result + (this.primaryColorHex == null ? 0: this.primaryColorHex.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.players == null ? 0: this.players.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProfileGames200ResponseInner {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  publishedKey: ").append(publishedKey).append("\n");
    sb.append("  iconImageUrl: ").append(iconImageUrl).append("\n");
    sb.append("  coverImageUrl: ").append(coverImageUrl).append("\n");
    sb.append("  primaryColorHex: ").append(primaryColorHex).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  players: ").append(players).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
