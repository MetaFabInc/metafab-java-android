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
public class SetLootboxManagerLootboxRequest {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("inputCollectionAddress")
  private String inputCollectionAddress = null;
  @SerializedName("inputCollectionId")
  private String inputCollectionId = null;
  @SerializedName("inputCollectionItemIds")
  private List<Integer> inputCollectionItemIds = null;
  @SerializedName("inputCollectionItemAmounts")
  private List<Integer> inputCollectionItemAmounts = null;
  @SerializedName("outputCollectionAddress")
  private String outputCollectionAddress = null;
  @SerializedName("outputCollectionId")
  private String outputCollectionId = null;
  @SerializedName("outputCollectionItemIds")
  private List<Integer> outputCollectionItemIds = null;
  @SerializedName("outputCollectionItemAmounts")
  private List<Integer> outputCollectionItemAmounts = null;
  @SerializedName("outputCollectionItemWeights")
  private List<Integer> outputCollectionItemWeights = null;
  @SerializedName("outputTotalItems")
  private Integer outputTotalItems = null;

  /**
   * A unique lootbox id to use for this lootbox for the lootbox manager. If an existing lootbox id is used, the current lootbox will be updated but the existing number of opens will be kept. If you want to reset the number of opens for an existing lootbox, first remove it using the remove lootbox endpoint, then set it.
   **/
  @ApiModelProperty(required = true, value = "A unique lootbox id to use for this lootbox for the lootbox manager. If an existing lootbox id is used, the current lootbox will be updated but the existing number of opens will be kept. If you want to reset the number of opens for an existing lootbox, first remove it using the remove lootbox endpoint, then set it.")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * A valid EVM based ERC1155 or MetaFab game items contract address that represents the collection for input items required by this lootbox. `inputCollectionAddress` or `inputCollectionId` can optionally be provided.
   **/
  @ApiModelProperty(value = "A valid EVM based ERC1155 or MetaFab game items contract address that represents the collection for input items required by this lootbox. `inputCollectionAddress` or `inputCollectionId` can optionally be provided.")
  public String getInputCollectionAddress() {
    return inputCollectionAddress;
  }
  public void setInputCollectionAddress(String inputCollectionAddress) {
    this.inputCollectionAddress = inputCollectionAddress;
  }

  /**
   * A valid MetaFab collection id that represents the collection for input items required by this lootbox. `inputCollectionAddress` or `inputCollectionId` can optionally be provided.
   **/
  @ApiModelProperty(value = "A valid MetaFab collection id that represents the collection for input items required by this lootbox. `inputCollectionAddress` or `inputCollectionId` can optionally be provided.")
  public String getInputCollectionId() {
    return inputCollectionId;
  }
  public void setInputCollectionId(String inputCollectionId) {
    this.inputCollectionId = inputCollectionId;
  }

  /**
   * An array of item ids from the provided input collection that are required to open this lootbox. Input items are burn upon opening a lootbox.
   **/
  @ApiModelProperty(value = "An array of item ids from the provided input collection that are required to open this lootbox. Input items are burn upon opening a lootbox.")
  public List<Integer> getInputCollectionItemIds() {
    return inputCollectionItemIds;
  }
  public void setInputCollectionItemIds(List<Integer> inputCollectionItemIds) {
    this.inputCollectionItemIds = inputCollectionItemIds;
  }

  /**
   * An array of amounts for each item id from the provided input collection that are required to open this lootbox. Item amounts array indices are reflective of the amount required for a given item id at the same index.
   **/
  @ApiModelProperty(value = "An array of amounts for each item id from the provided input collection that are required to open this lootbox. Item amounts array indices are reflective of the amount required for a given item id at the same index.")
  public List<Integer> getInputCollectionItemAmounts() {
    return inputCollectionItemAmounts;
  }
  public void setInputCollectionItemAmounts(List<Integer> inputCollectionItemAmounts) {
    this.inputCollectionItemAmounts = inputCollectionItemAmounts;
  }

  /**
   * A valid EVM based ERC1155 or MetaFab game items contract address that represents the collection for possible output items given by this lootbox. `outputCollectionAddress` or `outputCollectionId` can optionally be provided.
   **/
  @ApiModelProperty(value = "A valid EVM based ERC1155 or MetaFab game items contract address that represents the collection for possible output items given by this lootbox. `outputCollectionAddress` or `outputCollectionId` can optionally be provided.")
  public String getOutputCollectionAddress() {
    return outputCollectionAddress;
  }
  public void setOutputCollectionAddress(String outputCollectionAddress) {
    this.outputCollectionAddress = outputCollectionAddress;
  }

  /**
   * A valid MetaFab collection id that represents the collection for possible output items given by this lootbox. `outputCollectionAddress` or `outputCollectionId` can optionally be provided.
   **/
  @ApiModelProperty(value = "A valid MetaFab collection id that represents the collection for possible output items given by this lootbox. `outputCollectionAddress` or `outputCollectionId` can optionally be provided.")
  public String getOutputCollectionId() {
    return outputCollectionId;
  }
  public void setOutputCollectionId(String outputCollectionId) {
    this.outputCollectionId = outputCollectionId;
  }

  /**
   * An array of item ids from the provided output collection that are possibly given by this lootbox. Randomly selected output items are automatically minted if the lootbox manager contract has the `minter` role for the output collection contract. Otherwise, they are transferred from the item balance held by the lootbox manager contract.
   **/
  @ApiModelProperty(value = "An array of item ids from the provided output collection that are possibly given by this lootbox. Randomly selected output items are automatically minted if the lootbox manager contract has the `minter` role for the output collection contract. Otherwise, they are transferred from the item balance held by the lootbox manager contract.")
  public List<Integer> getOutputCollectionItemIds() {
    return outputCollectionItemIds;
  }
  public void setOutputCollectionItemIds(List<Integer> outputCollectionItemIds) {
    this.outputCollectionItemIds = outputCollectionItemIds;
  }

  /**
   * An array of amounts for each item id that can be randomly selected from the provided output collection that are given by this lootbox. Item amounts array indices are reflective of the amount required for a given item id at the same index.
   **/
  @ApiModelProperty(value = "An array of amounts for each item id that can be randomly selected from the provided output collection that are given by this lootbox. Item amounts array indices are reflective of the amount required for a given item id at the same index.")
  public List<Integer> getOutputCollectionItemAmounts() {
    return outputCollectionItemAmounts;
  }
  public void setOutputCollectionItemAmounts(List<Integer> outputCollectionItemAmounts) {
    this.outputCollectionItemAmounts = outputCollectionItemAmounts;
  }

  /**
   * An array of weights for each item id that can be randomly selected from the provided output collection that are given by this lootbox. Any positive integer for an item's weight can be provided. The weight for an item relative to the sum of all possible item weights determines the probability that an item will be picked upon a lootbox being opened. Item weights array indices are reflective of the probability weight for a given item id at the same index.
   **/
  @ApiModelProperty(value = "An array of weights for each item id that can be randomly selected from the provided output collection that are given by this lootbox. Any positive integer for an item's weight can be provided. The weight for an item relative to the sum of all possible item weights determines the probability that an item will be picked upon a lootbox being opened. Item weights array indices are reflective of the probability weight for a given item id at the same index.")
  public List<Integer> getOutputCollectionItemWeights() {
    return outputCollectionItemWeights;
  }
  public void setOutputCollectionItemWeights(List<Integer> outputCollectionItemWeights) {
    this.outputCollectionItemWeights = outputCollectionItemWeights;
  }

  /**
   * The number of items randomly selected from the possible output items when this lootbox is open. If you provide a value greater than 1, it is possible for the same item to be selected more than once, giving the opener more than one of that item's output from the lootbox.
   **/
  @ApiModelProperty(value = "The number of items randomly selected from the possible output items when this lootbox is open. If you provide a value greater than 1, it is possible for the same item to be selected more than once, giving the opener more than one of that item's output from the lootbox.")
  public Integer getOutputTotalItems() {
    return outputTotalItems;
  }
  public void setOutputTotalItems(Integer outputTotalItems) {
    this.outputTotalItems = outputTotalItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetLootboxManagerLootboxRequest setLootboxManagerLootboxRequest = (SetLootboxManagerLootboxRequest) o;
    return (this.id == null ? setLootboxManagerLootboxRequest.id == null : this.id.equals(setLootboxManagerLootboxRequest.id)) &&
        (this.inputCollectionAddress == null ? setLootboxManagerLootboxRequest.inputCollectionAddress == null : this.inputCollectionAddress.equals(setLootboxManagerLootboxRequest.inputCollectionAddress)) &&
        (this.inputCollectionId == null ? setLootboxManagerLootboxRequest.inputCollectionId == null : this.inputCollectionId.equals(setLootboxManagerLootboxRequest.inputCollectionId)) &&
        (this.inputCollectionItemIds == null ? setLootboxManagerLootboxRequest.inputCollectionItemIds == null : this.inputCollectionItemIds.equals(setLootboxManagerLootboxRequest.inputCollectionItemIds)) &&
        (this.inputCollectionItemAmounts == null ? setLootboxManagerLootboxRequest.inputCollectionItemAmounts == null : this.inputCollectionItemAmounts.equals(setLootboxManagerLootboxRequest.inputCollectionItemAmounts)) &&
        (this.outputCollectionAddress == null ? setLootboxManagerLootboxRequest.outputCollectionAddress == null : this.outputCollectionAddress.equals(setLootboxManagerLootboxRequest.outputCollectionAddress)) &&
        (this.outputCollectionId == null ? setLootboxManagerLootboxRequest.outputCollectionId == null : this.outputCollectionId.equals(setLootboxManagerLootboxRequest.outputCollectionId)) &&
        (this.outputCollectionItemIds == null ? setLootboxManagerLootboxRequest.outputCollectionItemIds == null : this.outputCollectionItemIds.equals(setLootboxManagerLootboxRequest.outputCollectionItemIds)) &&
        (this.outputCollectionItemAmounts == null ? setLootboxManagerLootboxRequest.outputCollectionItemAmounts == null : this.outputCollectionItemAmounts.equals(setLootboxManagerLootboxRequest.outputCollectionItemAmounts)) &&
        (this.outputCollectionItemWeights == null ? setLootboxManagerLootboxRequest.outputCollectionItemWeights == null : this.outputCollectionItemWeights.equals(setLootboxManagerLootboxRequest.outputCollectionItemWeights)) &&
        (this.outputTotalItems == null ? setLootboxManagerLootboxRequest.outputTotalItems == null : this.outputTotalItems.equals(setLootboxManagerLootboxRequest.outputTotalItems));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.inputCollectionAddress == null ? 0: this.inputCollectionAddress.hashCode());
    result = 31 * result + (this.inputCollectionId == null ? 0: this.inputCollectionId.hashCode());
    result = 31 * result + (this.inputCollectionItemIds == null ? 0: this.inputCollectionItemIds.hashCode());
    result = 31 * result + (this.inputCollectionItemAmounts == null ? 0: this.inputCollectionItemAmounts.hashCode());
    result = 31 * result + (this.outputCollectionAddress == null ? 0: this.outputCollectionAddress.hashCode());
    result = 31 * result + (this.outputCollectionId == null ? 0: this.outputCollectionId.hashCode());
    result = 31 * result + (this.outputCollectionItemIds == null ? 0: this.outputCollectionItemIds.hashCode());
    result = 31 * result + (this.outputCollectionItemAmounts == null ? 0: this.outputCollectionItemAmounts.hashCode());
    result = 31 * result + (this.outputCollectionItemWeights == null ? 0: this.outputCollectionItemWeights.hashCode());
    result = 31 * result + (this.outputTotalItems == null ? 0: this.outputTotalItems.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetLootboxManagerLootboxRequest {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  inputCollectionAddress: ").append(inputCollectionAddress).append("\n");
    sb.append("  inputCollectionId: ").append(inputCollectionId).append("\n");
    sb.append("  inputCollectionItemIds: ").append(inputCollectionItemIds).append("\n");
    sb.append("  inputCollectionItemAmounts: ").append(inputCollectionItemAmounts).append("\n");
    sb.append("  outputCollectionAddress: ").append(outputCollectionAddress).append("\n");
    sb.append("  outputCollectionId: ").append(outputCollectionId).append("\n");
    sb.append("  outputCollectionItemIds: ").append(outputCollectionItemIds).append("\n");
    sb.append("  outputCollectionItemAmounts: ").append(outputCollectionItemAmounts).append("\n");
    sb.append("  outputCollectionItemWeights: ").append(outputCollectionItemWeights).append("\n");
    sb.append("  outputTotalItems: ").append(outputTotalItems).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
