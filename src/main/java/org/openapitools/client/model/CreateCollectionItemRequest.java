/**
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: metafabproject@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import java.net.URI;
import java.util.*;
import org.openapitools.client.model.CreateCollectionItemRequestAttributesInner;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateCollectionItemRequest {
  
  @SerializedName("id")
  private BigDecimal id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("imageBase64")
  private byte[] imageBase64 = null;
  @SerializedName("imageUrl")
  private URI imageUrl = null;
  @SerializedName("externalUrl")
  private URI externalUrl = null;
  @SerializedName("attributes")
  private List<CreateCollectionItemRequestAttributesInner> attributes = null;
  @SerializedName("data")
  private Object data = null;

  /**
   * A unique itemId to use for this item within the collection. If an existing itemId is used, the current metadata will be overriden. Any number may be used.  The terms `itemId` and `collectionItemId` are used interchangeably and equivalent to one another throughout MetaFab documentation.
   **/
  @ApiModelProperty(required = true, value = "A unique itemId to use for this item within the collection. If an existing itemId is used, the current metadata will be overriden. Any number may be used.  The terms `itemId` and `collectionItemId` are used interchangeably and equivalent to one another throughout MetaFab documentation.")
  public BigDecimal getId() {
    return id;
  }
  public void setId(BigDecimal id) {
    this.id = id;
  }

  /**
   * The name of this item.
   **/
  @ApiModelProperty(required = true, value = "The name of this item.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A text description of this item. This is a great spot to include lore, game mechanics and more related to this item.
   **/
  @ApiModelProperty(required = true, value = "A text description of this item. This is a great spot to include lore, game mechanics and more related to this item.")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * A base64 string of the image for this item. Either `imageBase64` or `imageUrl` must be provided. Supported image formats are `jpg`, `jpeg`, `png`, `gif`. Recommended size of 1:1 aspect ratio and no more than 1500x1500 pixels.
   **/
  @ApiModelProperty(value = "A base64 string of the image for this item. Either `imageBase64` or `imageUrl` must be provided. Supported image formats are `jpg`, `jpeg`, `png`, `gif`. Recommended size of 1:1 aspect ratio and no more than 1500x1500 pixels.")
  public byte[] getImageBase64() {
    return imageBase64;
  }
  public void setImageBase64(byte[] imageBase64) {
    this.imageBase64 = imageBase64;
  }

  /**
   * An external url that resolves to an image to use for this item. This can also be set to an ipfs:// uri. Recommended size of 1:1 aspect ratio and no more than 1500x1500 pixels.
   **/
  @ApiModelProperty(value = "An external url that resolves to an image to use for this item. This can also be set to an ipfs:// uri. Recommended size of 1:1 aspect ratio and no more than 1500x1500 pixels.")
  public URI getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(URI imageUrl) {
    this.imageUrl = imageUrl;
  }

  /**
   * An optional URL where players can go to learn more about this item specifically, or your game, or any other link.
   **/
  @ApiModelProperty(value = "An optional URL where players can go to learn more about this item specifically, or your game, or any other link.")
  public URI getExternalUrl() {
    return externalUrl;
  }
  public void setExternalUrl(URI externalUrl) {
    this.externalUrl = externalUrl;
  }

  /**
   * An array of objects that conform with the [metadata attributes standard that can be found here](https://docs.opensea.io/docs/metadata-standards#attributes)
   **/
  @ApiModelProperty(value = "An array of objects that conform with the [metadata attributes standard that can be found here](https://docs.opensea.io/docs/metadata-standards#attributes)")
  public List<CreateCollectionItemRequestAttributesInner> getAttributes() {
    return attributes;
  }
  public void setAttributes(List<CreateCollectionItemRequestAttributesInner> attributes) {
    this.attributes = attributes;
  }

  /**
   * An arbitrary object of data attached to the top level metadata object. This is useful for including data or resource URLs specific to your game. Such as URLs that point to 3D models, music files, bitmaps, or anything else you need to reference.
   **/
  @ApiModelProperty(value = "An arbitrary object of data attached to the top level metadata object. This is useful for including data or resource URLs specific to your game. Such as URLs that point to 3D models, music files, bitmaps, or anything else you need to reference.")
  public Object getData() {
    return data;
  }
  public void setData(Object data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCollectionItemRequest createCollectionItemRequest = (CreateCollectionItemRequest) o;
    return (this.id == null ? createCollectionItemRequest.id == null : this.id.equals(createCollectionItemRequest.id)) &&
        (this.name == null ? createCollectionItemRequest.name == null : this.name.equals(createCollectionItemRequest.name)) &&
        (this.description == null ? createCollectionItemRequest.description == null : this.description.equals(createCollectionItemRequest.description)) &&
        (this.imageBase64 == null ? createCollectionItemRequest.imageBase64 == null : this.imageBase64.equals(createCollectionItemRequest.imageBase64)) &&
        (this.imageUrl == null ? createCollectionItemRequest.imageUrl == null : this.imageUrl.equals(createCollectionItemRequest.imageUrl)) &&
        (this.externalUrl == null ? createCollectionItemRequest.externalUrl == null : this.externalUrl.equals(createCollectionItemRequest.externalUrl)) &&
        (this.attributes == null ? createCollectionItemRequest.attributes == null : this.attributes.equals(createCollectionItemRequest.attributes)) &&
        (this.data == null ? createCollectionItemRequest.data == null : this.data.equals(createCollectionItemRequest.data));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.imageBase64 == null ? 0: this.imageBase64.hashCode());
    result = 31 * result + (this.imageUrl == null ? 0: this.imageUrl.hashCode());
    result = 31 * result + (this.externalUrl == null ? 0: this.externalUrl.hashCode());
    result = 31 * result + (this.attributes == null ? 0: this.attributes.hashCode());
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCollectionItemRequest {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  imageBase64: ").append(imageBase64).append("\n");
    sb.append("  imageUrl: ").append(imageUrl).append("\n");
    sb.append("  externalUrl: ").append(externalUrl).append("\n");
    sb.append("  attributes: ").append(attributes).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
