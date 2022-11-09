/**
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: metafabproject@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SetExchangeOfferRequest {
  
  @SerializedName("id")
  private BigDecimal id = null;
  @SerializedName("inputCollectionAddress")
  private String inputCollectionAddress = null;
  @SerializedName("inputCollectionId")
  private String inputCollectionId = null;
  @SerializedName("inputCollectionItemIds")
  private List<BigDecimal> inputCollectionItemIds = null;
  @SerializedName("inputCollectionItemAmounts")
  private List<BigDecimal> inputCollectionItemAmounts = null;
  @SerializedName("inputCurrencyAddress")
  private String inputCurrencyAddress = null;
  @SerializedName("inputCurrencyId")
  private String inputCurrencyId = null;
  @SerializedName("inputCurrencyAmount")
  private BigDecimal inputCurrencyAmount = null;
  @SerializedName("outputCollectionAddress")
  private String outputCollectionAddress = null;
  @SerializedName("outputCollectionId")
  private String outputCollectionId = null;
  @SerializedName("outputCollectionItemIds")
  private List<BigDecimal> outputCollectionItemIds = null;
  @SerializedName("outputCollectionItemAmounts")
  private List<BigDecimal> outputCollectionItemAmounts = null;
  @SerializedName("outputCurrencyAddress")
  private String outputCurrencyAddress = null;
  @SerializedName("outputCurrencyId")
  private String outputCurrencyId = null;
  @SerializedName("outputCurrencyAmount")
  private BigDecimal outputCurrencyAmount = null;
  @SerializedName("maxUses")
  private BigDecimal maxUses = null;

  /**
   * A unique offer id to use for this offer for the exchange. If an existing offer id is used, the current offer will be updated but the existing number of uses will be kept. If you want to reset the number of uses for an existing offer, first remove it using the remove offer endpoint, then set it.
   **/
  @ApiModelProperty(required = true, value = "A unique offer id to use for this offer for the exchange. If an existing offer id is used, the current offer will be updated but the existing number of uses will be kept. If you want to reset the number of uses for an existing offer, first remove it using the remove offer endpoint, then set it.")
  public BigDecimal getId() {
    return id;
  }
  public void setId(BigDecimal id) {
    this.id = id;
  }

  /**
   * A valid EVM based ERC1155 or MetaFab game items contract address that represents the collection for input items required by this offer. `inputCollectionAddress` or `inputCollectionId` can optionally be provided.
   **/
  @ApiModelProperty(value = "A valid EVM based ERC1155 or MetaFab game items contract address that represents the collection for input items required by this offer. `inputCollectionAddress` or `inputCollectionId` can optionally be provided.")
  public String getInputCollectionAddress() {
    return inputCollectionAddress;
  }
  public void setInputCollectionAddress(String inputCollectionAddress) {
    this.inputCollectionAddress = inputCollectionAddress;
  }

  /**
   * A valid MetaFab collection id that represents the collection for input items required by this offer. `inputCollectionAddress` or `inputCollectionId` can optionally be provided.
   **/
  @ApiModelProperty(value = "A valid MetaFab collection id that represents the collection for input items required by this offer. `inputCollectionAddress` or `inputCollectionId` can optionally be provided.")
  public String getInputCollectionId() {
    return inputCollectionId;
  }
  public void setInputCollectionId(String inputCollectionId) {
    this.inputCollectionId = inputCollectionId;
  }

  /**
   * An array of item ids from the provided input collection that are required to use this offer. Input items are transferred from the wallet to the exchange contract upon using an offer.
   **/
  @ApiModelProperty(value = "An array of item ids from the provided input collection that are required to use this offer. Input items are transferred from the wallet to the exchange contract upon using an offer.")
  public List<BigDecimal> getInputCollectionItemIds() {
    return inputCollectionItemIds;
  }
  public void setInputCollectionItemIds(List<BigDecimal> inputCollectionItemIds) {
    this.inputCollectionItemIds = inputCollectionItemIds;
  }

  /**
   * An array of amounts for each item id from the provided input collection that are required to use this offer. Item amounts array indices are reflective of the amount required for a given item id at the same index.
   **/
  @ApiModelProperty(value = "An array of amounts for each item id from the provided input collection that are required to use this offer. Item amounts array indices are reflective of the amount required for a given item id at the same index.")
  public List<BigDecimal> getInputCollectionItemAmounts() {
    return inputCollectionItemAmounts;
  }
  public void setInputCollectionItemAmounts(List<BigDecimal> inputCollectionItemAmounts) {
    this.inputCollectionItemAmounts = inputCollectionItemAmounts;
  }

  /**
   * A valid EVM based ERC20 or MetaFab game currency contract address that for the currency required by this offer.
   **/
  @ApiModelProperty(value = "A valid EVM based ERC20 or MetaFab game currency contract address that for the currency required by this offer.")
  public String getInputCurrencyAddress() {
    return inputCurrencyAddress;
  }
  public void setInputCurrencyAddress(String inputCurrencyAddress) {
    this.inputCurrencyAddress = inputCurrencyAddress;
  }

  /**
   * A valid MetaFab currency id that represents the currency required by this offer.
   **/
  @ApiModelProperty(value = "A valid MetaFab currency id that represents the currency required by this offer.")
  public String getInputCurrencyId() {
    return inputCurrencyId;
  }
  public void setInputCurrencyId(String inputCurrencyId) {
    this.inputCurrencyId = inputCurrencyId;
  }

  /**
   * The amount of currency required by this offer. If an inputCurrencyAmount is provided without in input currency address or id, the native chain currency is used as the required currency.
   **/
  @ApiModelProperty(value = "The amount of currency required by this offer. If an inputCurrencyAmount is provided without in input currency address or id, the native chain currency is used as the required currency.")
  public BigDecimal getInputCurrencyAmount() {
    return inputCurrencyAmount;
  }
  public void setInputCurrencyAmount(BigDecimal inputCurrencyAmount) {
    this.inputCurrencyAmount = inputCurrencyAmount;
  }

  /**
   * A valid EVM based ERC1155 or MetaFab game items contract address that represents the collection for output items given by this offer. `outputCollectionAddress` or `outputCollectionId` can optionally be provided.
   **/
  @ApiModelProperty(value = "A valid EVM based ERC1155 or MetaFab game items contract address that represents the collection for output items given by this offer. `outputCollectionAddress` or `outputCollectionId` can optionally be provided.")
  public String getOutputCollectionAddress() {
    return outputCollectionAddress;
  }
  public void setOutputCollectionAddress(String outputCollectionAddress) {
    this.outputCollectionAddress = outputCollectionAddress;
  }

  /**
   * A valid MetaFab collection id that represents the collection for output items given by this offer. `outputCollectionAddress` or `outputCollectionId` can optionally be provided.
   **/
  @ApiModelProperty(value = "A valid MetaFab collection id that represents the collection for output items given by this offer. `outputCollectionAddress` or `outputCollectionId` can optionally be provided.")
  public String getOutputCollectionId() {
    return outputCollectionId;
  }
  public void setOutputCollectionId(String outputCollectionId) {
    this.outputCollectionId = outputCollectionId;
  }

  /**
   * An array of item ids from the provided output collection that are given by this offer. Output items are automatically minted if the exchange contract has the `minter` role for the output collection contract. Otherwise, they are transferred from the item balance held by the exchange contract.
   **/
  @ApiModelProperty(value = "An array of item ids from the provided output collection that are given by this offer. Output items are automatically minted if the exchange contract has the `minter` role for the output collection contract. Otherwise, they are transferred from the item balance held by the exchange contract.")
  public List<BigDecimal> getOutputCollectionItemIds() {
    return outputCollectionItemIds;
  }
  public void setOutputCollectionItemIds(List<BigDecimal> outputCollectionItemIds) {
    this.outputCollectionItemIds = outputCollectionItemIds;
  }

  /**
   * An array of amounts for each item id from the provided output collection that are given by this offer. Item amounts array indices are reflective of the amount required for a given item id at the same index.
   **/
  @ApiModelProperty(value = "An array of amounts for each item id from the provided output collection that are given by this offer. Item amounts array indices are reflective of the amount required for a given item id at the same index.")
  public List<BigDecimal> getOutputCollectionItemAmounts() {
    return outputCollectionItemAmounts;
  }
  public void setOutputCollectionItemAmounts(List<BigDecimal> outputCollectionItemAmounts) {
    this.outputCollectionItemAmounts = outputCollectionItemAmounts;
  }

  /**
   * A valid EVM based ERC20 or MetaFab game currency contract address that for the currency given by this offer. The output currency amount is automatically minted if the exchange contract has the `minter` role for the output currency contract. Otherwise, they are transferred from the currency balance held by the exchange contract.
   **/
  @ApiModelProperty(value = "A valid EVM based ERC20 or MetaFab game currency contract address that for the currency given by this offer. The output currency amount is automatically minted if the exchange contract has the `minter` role for the output currency contract. Otherwise, they are transferred from the currency balance held by the exchange contract.")
  public String getOutputCurrencyAddress() {
    return outputCurrencyAddress;
  }
  public void setOutputCurrencyAddress(String outputCurrencyAddress) {
    this.outputCurrencyAddress = outputCurrencyAddress;
  }

  /**
   * A valid MetaFab currency id for the currency given by this offer.
   **/
  @ApiModelProperty(value = "A valid MetaFab currency id for the currency given by this offer.")
  public String getOutputCurrencyId() {
    return outputCurrencyId;
  }
  public void setOutputCurrencyId(String outputCurrencyId) {
    this.outputCurrencyId = outputCurrencyId;
  }

  /**
   * The amount of currency given by this offer. If an outputCurrencyAmount is provided without an output currency address or id, the native chain currency is used as the given currency.
   **/
  @ApiModelProperty(value = "The amount of currency given by this offer. If an outputCurrencyAmount is provided without an output currency address or id, the native chain currency is used as the given currency.")
  public BigDecimal getOutputCurrencyAmount() {
    return outputCurrencyAmount;
  }
  public void setOutputCurrencyAmount(BigDecimal outputCurrencyAmount) {
    this.outputCurrencyAmount = outputCurrencyAmount;
  }

  /**
   * The maximum number of times this offer can be used in total. maxUses is collective across all uses of the offer. If 5 unique players use an offer, that counts as 5 offer uses. Exclude this or use 0 to allow unlimited uses.
   **/
  @ApiModelProperty(value = "The maximum number of times this offer can be used in total. maxUses is collective across all uses of the offer. If 5 unique players use an offer, that counts as 5 offer uses. Exclude this or use 0 to allow unlimited uses.")
  public BigDecimal getMaxUses() {
    return maxUses;
  }
  public void setMaxUses(BigDecimal maxUses) {
    this.maxUses = maxUses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetExchangeOfferRequest setExchangeOfferRequest = (SetExchangeOfferRequest) o;
    return (this.id == null ? setExchangeOfferRequest.id == null : this.id.equals(setExchangeOfferRequest.id)) &&
        (this.inputCollectionAddress == null ? setExchangeOfferRequest.inputCollectionAddress == null : this.inputCollectionAddress.equals(setExchangeOfferRequest.inputCollectionAddress)) &&
        (this.inputCollectionId == null ? setExchangeOfferRequest.inputCollectionId == null : this.inputCollectionId.equals(setExchangeOfferRequest.inputCollectionId)) &&
        (this.inputCollectionItemIds == null ? setExchangeOfferRequest.inputCollectionItemIds == null : this.inputCollectionItemIds.equals(setExchangeOfferRequest.inputCollectionItemIds)) &&
        (this.inputCollectionItemAmounts == null ? setExchangeOfferRequest.inputCollectionItemAmounts == null : this.inputCollectionItemAmounts.equals(setExchangeOfferRequest.inputCollectionItemAmounts)) &&
        (this.inputCurrencyAddress == null ? setExchangeOfferRequest.inputCurrencyAddress == null : this.inputCurrencyAddress.equals(setExchangeOfferRequest.inputCurrencyAddress)) &&
        (this.inputCurrencyId == null ? setExchangeOfferRequest.inputCurrencyId == null : this.inputCurrencyId.equals(setExchangeOfferRequest.inputCurrencyId)) &&
        (this.inputCurrencyAmount == null ? setExchangeOfferRequest.inputCurrencyAmount == null : this.inputCurrencyAmount.equals(setExchangeOfferRequest.inputCurrencyAmount)) &&
        (this.outputCollectionAddress == null ? setExchangeOfferRequest.outputCollectionAddress == null : this.outputCollectionAddress.equals(setExchangeOfferRequest.outputCollectionAddress)) &&
        (this.outputCollectionId == null ? setExchangeOfferRequest.outputCollectionId == null : this.outputCollectionId.equals(setExchangeOfferRequest.outputCollectionId)) &&
        (this.outputCollectionItemIds == null ? setExchangeOfferRequest.outputCollectionItemIds == null : this.outputCollectionItemIds.equals(setExchangeOfferRequest.outputCollectionItemIds)) &&
        (this.outputCollectionItemAmounts == null ? setExchangeOfferRequest.outputCollectionItemAmounts == null : this.outputCollectionItemAmounts.equals(setExchangeOfferRequest.outputCollectionItemAmounts)) &&
        (this.outputCurrencyAddress == null ? setExchangeOfferRequest.outputCurrencyAddress == null : this.outputCurrencyAddress.equals(setExchangeOfferRequest.outputCurrencyAddress)) &&
        (this.outputCurrencyId == null ? setExchangeOfferRequest.outputCurrencyId == null : this.outputCurrencyId.equals(setExchangeOfferRequest.outputCurrencyId)) &&
        (this.outputCurrencyAmount == null ? setExchangeOfferRequest.outputCurrencyAmount == null : this.outputCurrencyAmount.equals(setExchangeOfferRequest.outputCurrencyAmount)) &&
        (this.maxUses == null ? setExchangeOfferRequest.maxUses == null : this.maxUses.equals(setExchangeOfferRequest.maxUses));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.inputCollectionAddress == null ? 0: this.inputCollectionAddress.hashCode());
    result = 31 * result + (this.inputCollectionId == null ? 0: this.inputCollectionId.hashCode());
    result = 31 * result + (this.inputCollectionItemIds == null ? 0: this.inputCollectionItemIds.hashCode());
    result = 31 * result + (this.inputCollectionItemAmounts == null ? 0: this.inputCollectionItemAmounts.hashCode());
    result = 31 * result + (this.inputCurrencyAddress == null ? 0: this.inputCurrencyAddress.hashCode());
    result = 31 * result + (this.inputCurrencyId == null ? 0: this.inputCurrencyId.hashCode());
    result = 31 * result + (this.inputCurrencyAmount == null ? 0: this.inputCurrencyAmount.hashCode());
    result = 31 * result + (this.outputCollectionAddress == null ? 0: this.outputCollectionAddress.hashCode());
    result = 31 * result + (this.outputCollectionId == null ? 0: this.outputCollectionId.hashCode());
    result = 31 * result + (this.outputCollectionItemIds == null ? 0: this.outputCollectionItemIds.hashCode());
    result = 31 * result + (this.outputCollectionItemAmounts == null ? 0: this.outputCollectionItemAmounts.hashCode());
    result = 31 * result + (this.outputCurrencyAddress == null ? 0: this.outputCurrencyAddress.hashCode());
    result = 31 * result + (this.outputCurrencyId == null ? 0: this.outputCurrencyId.hashCode());
    result = 31 * result + (this.outputCurrencyAmount == null ? 0: this.outputCurrencyAmount.hashCode());
    result = 31 * result + (this.maxUses == null ? 0: this.maxUses.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetExchangeOfferRequest {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  inputCollectionAddress: ").append(inputCollectionAddress).append("\n");
    sb.append("  inputCollectionId: ").append(inputCollectionId).append("\n");
    sb.append("  inputCollectionItemIds: ").append(inputCollectionItemIds).append("\n");
    sb.append("  inputCollectionItemAmounts: ").append(inputCollectionItemAmounts).append("\n");
    sb.append("  inputCurrencyAddress: ").append(inputCurrencyAddress).append("\n");
    sb.append("  inputCurrencyId: ").append(inputCurrencyId).append("\n");
    sb.append("  inputCurrencyAmount: ").append(inputCurrencyAmount).append("\n");
    sb.append("  outputCollectionAddress: ").append(outputCollectionAddress).append("\n");
    sb.append("  outputCollectionId: ").append(outputCollectionId).append("\n");
    sb.append("  outputCollectionItemIds: ").append(outputCollectionItemIds).append("\n");
    sb.append("  outputCollectionItemAmounts: ").append(outputCollectionItemAmounts).append("\n");
    sb.append("  outputCurrencyAddress: ").append(outputCurrencyAddress).append("\n");
    sb.append("  outputCurrencyId: ").append(outputCurrencyId).append("\n");
    sb.append("  outputCurrencyAmount: ").append(outputCurrencyAmount).append("\n");
    sb.append("  maxUses: ").append(maxUses).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
