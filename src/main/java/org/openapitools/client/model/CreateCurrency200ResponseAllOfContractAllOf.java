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

import java.util.*;
import org.openapitools.client.model.TransactionModel;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateCurrency200ResponseAllOfContractAllOf {
  
  @SerializedName("transactions")
  private List<TransactionModel> transactions = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<TransactionModel> getTransactions() {
    return transactions;
  }
  public void setTransactions(List<TransactionModel> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCurrency200ResponseAllOfContractAllOf createCurrency200ResponseAllOfContractAllOf = (CreateCurrency200ResponseAllOfContractAllOf) o;
    return (this.transactions == null ? createCurrency200ResponseAllOfContractAllOf.transactions == null : this.transactions.equals(createCurrency200ResponseAllOfContractAllOf.transactions));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.transactions == null ? 0: this.transactions.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCurrency200ResponseAllOfContractAllOf {\n");
    
    sb.append("  transactions: ").append(transactions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
