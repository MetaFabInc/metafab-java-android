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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class LootboxManagerLootbox {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("inputCollection")
  private String inputCollection = null;
  @SerializedName("inputCollectionItemIds")
  private List<Integer> inputCollectionItemIds = null;
  @SerializedName("inputCollectionItemAmounts")
  private List<Integer> inputCollectionItemAmounts = null;
  @SerializedName("outputCollection")
  private String outputCollection = null;
  @SerializedName("outputCollectionItemIds")
  private List<Integer> outputCollectionItemIds = null;
  @SerializedName("outputCollectionItemAmounts")
  private List<Integer> outputCollectionItemAmounts = null;
  @SerializedName("outputCollectionItemWeights")
  private List<Integer> outputCollectionItemWeights = null;
  @SerializedName("outputTotalItems")
  private Integer outputTotalItems = null;
  @SerializedName("lastUpdatedAt")
  private Integer lastUpdatedAt = null;

  /**
   * The id of this lootbox.
   **/
  @ApiModelProperty(value = "The id of this lootbox.")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The address of the ERC1155 or MetaFab game items contract for input items required by this lootbox.
   **/
  @ApiModelProperty(value = "The address of the ERC1155 or MetaFab game items contract for input items required by this lootbox.")
  public String getInputCollection() {
    return inputCollection;
  }
  public void setInputCollection(String inputCollection) {
    this.inputCollection = inputCollection;
  }

  /**
   * An array of item ids from the input collection that are required for this lootbox.
   **/
  @ApiModelProperty(value = "An array of item ids from the input collection that are required for this lootbox.")
  public List<Integer> getInputCollectionItemIds() {
    return inputCollectionItemIds;
  }
  public void setInputCollectionItemIds(List<Integer> inputCollectionItemIds) {
    this.inputCollectionItemIds = inputCollectionItemIds;
  }

  /**
   * An array of amounts for each item id for the input collection that are required to open this lootbox.
   **/
  @ApiModelProperty(value = "An array of amounts for each item id for the input collection that are required to open this lootbox.")
  public List<Integer> getInputCollectionItemAmounts() {
    return inputCollectionItemAmounts;
  }
  public void setInputCollectionItemAmounts(List<Integer> inputCollectionItemAmounts) {
    this.inputCollectionItemAmounts = inputCollectionItemAmounts;
  }

  /**
   * The address of the ERC1155 of MetaFab game items contract for possible output items given by this lootbox.
   **/
  @ApiModelProperty(value = "The address of the ERC1155 of MetaFab game items contract for possible output items given by this lootbox.")
  public String getOutputCollection() {
    return outputCollection;
  }
  public void setOutputCollection(String outputCollection) {
    this.outputCollection = outputCollection;
  }

  /**
   * An array of item ids from the output collection that are possibly given by this lootbox.
   **/
  @ApiModelProperty(value = "An array of item ids from the output collection that are possibly given by this lootbox.")
  public List<Integer> getOutputCollectionItemIds() {
    return outputCollectionItemIds;
  }
  public void setOutputCollectionItemIds(List<Integer> outputCollectionItemIds) {
    this.outputCollectionItemIds = outputCollectionItemIds;
  }

  /**
   * An array of amounts for each item id for the output collection that are possibly given by this lootbox.
   **/
  @ApiModelProperty(value = "An array of amounts for each item id for the output collection that are possibly given by this lootbox.")
  public List<Integer> getOutputCollectionItemAmounts() {
    return outputCollectionItemAmounts;
  }
  public void setOutputCollectionItemAmounts(List<Integer> outputCollectionItemAmounts) {
    this.outputCollectionItemAmounts = outputCollectionItemAmounts;
  }

  /**
   * An array of weights for each item id for the output collection that are possibly given by this lootbox.
   **/
  @ApiModelProperty(value = "An array of weights for each item id for the output collection that are possibly given by this lootbox.")
  public List<Integer> getOutputCollectionItemWeights() {
    return outputCollectionItemWeights;
  }
  public void setOutputCollectionItemWeights(List<Integer> outputCollectionItemWeights) {
    this.outputCollectionItemWeights = outputCollectionItemWeights;
  }

  /**
   * The number of items randomly selected when this lootbox is opened.
   **/
  @ApiModelProperty(value = "The number of items randomly selected when this lootbox is opened.")
  public Integer getOutputTotalItems() {
    return outputTotalItems;
  }
  public void setOutputTotalItems(Integer outputTotalItems) {
    this.outputTotalItems = outputTotalItems;
  }

  /**
   * A unix timestamp in seconds that represents the last time this offer was set or updated.
   **/
  @ApiModelProperty(value = "A unix timestamp in seconds that represents the last time this offer was set or updated.")
  public Integer getLastUpdatedAt() {
    return lastUpdatedAt;
  }
  public void setLastUpdatedAt(Integer lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LootboxManagerLootbox lootboxManagerLootbox = (LootboxManagerLootbox) o;
    return (this.id == null ? lootboxManagerLootbox.id == null : this.id.equals(lootboxManagerLootbox.id)) &&
        (this.inputCollection == null ? lootboxManagerLootbox.inputCollection == null : this.inputCollection.equals(lootboxManagerLootbox.inputCollection)) &&
        (this.inputCollectionItemIds == null ? lootboxManagerLootbox.inputCollectionItemIds == null : this.inputCollectionItemIds.equals(lootboxManagerLootbox.inputCollectionItemIds)) &&
        (this.inputCollectionItemAmounts == null ? lootboxManagerLootbox.inputCollectionItemAmounts == null : this.inputCollectionItemAmounts.equals(lootboxManagerLootbox.inputCollectionItemAmounts)) &&
        (this.outputCollection == null ? lootboxManagerLootbox.outputCollection == null : this.outputCollection.equals(lootboxManagerLootbox.outputCollection)) &&
        (this.outputCollectionItemIds == null ? lootboxManagerLootbox.outputCollectionItemIds == null : this.outputCollectionItemIds.equals(lootboxManagerLootbox.outputCollectionItemIds)) &&
        (this.outputCollectionItemAmounts == null ? lootboxManagerLootbox.outputCollectionItemAmounts == null : this.outputCollectionItemAmounts.equals(lootboxManagerLootbox.outputCollectionItemAmounts)) &&
        (this.outputCollectionItemWeights == null ? lootboxManagerLootbox.outputCollectionItemWeights == null : this.outputCollectionItemWeights.equals(lootboxManagerLootbox.outputCollectionItemWeights)) &&
        (this.outputTotalItems == null ? lootboxManagerLootbox.outputTotalItems == null : this.outputTotalItems.equals(lootboxManagerLootbox.outputTotalItems)) &&
        (this.lastUpdatedAt == null ? lootboxManagerLootbox.lastUpdatedAt == null : this.lastUpdatedAt.equals(lootboxManagerLootbox.lastUpdatedAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.inputCollection == null ? 0: this.inputCollection.hashCode());
    result = 31 * result + (this.inputCollectionItemIds == null ? 0: this.inputCollectionItemIds.hashCode());
    result = 31 * result + (this.inputCollectionItemAmounts == null ? 0: this.inputCollectionItemAmounts.hashCode());
    result = 31 * result + (this.outputCollection == null ? 0: this.outputCollection.hashCode());
    result = 31 * result + (this.outputCollectionItemIds == null ? 0: this.outputCollectionItemIds.hashCode());
    result = 31 * result + (this.outputCollectionItemAmounts == null ? 0: this.outputCollectionItemAmounts.hashCode());
    result = 31 * result + (this.outputCollectionItemWeights == null ? 0: this.outputCollectionItemWeights.hashCode());
    result = 31 * result + (this.outputTotalItems == null ? 0: this.outputTotalItems.hashCode());
    result = 31 * result + (this.lastUpdatedAt == null ? 0: this.lastUpdatedAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LootboxManagerLootbox {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  inputCollection: ").append(inputCollection).append("\n");
    sb.append("  inputCollectionItemIds: ").append(inputCollectionItemIds).append("\n");
    sb.append("  inputCollectionItemAmounts: ").append(inputCollectionItemAmounts).append("\n");
    sb.append("  outputCollection: ").append(outputCollection).append("\n");
    sb.append("  outputCollectionItemIds: ").append(outputCollectionItemIds).append("\n");
    sb.append("  outputCollectionItemAmounts: ").append(outputCollectionItemAmounts).append("\n");
    sb.append("  outputCollectionItemWeights: ").append(outputCollectionItemWeights).append("\n");
    sb.append("  outputTotalItems: ").append(outputTotalItems).append("\n");
    sb.append("  lastUpdatedAt: ").append(lastUpdatedAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
