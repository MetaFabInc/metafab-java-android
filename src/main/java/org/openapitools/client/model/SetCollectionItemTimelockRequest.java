/**
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.1.3
 * Contact: metafabproject@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SetCollectionItemTimelockRequest {
  
  @SerializedName("timelock")
  private BigDecimal timelock = null;

  /**
   * A unix timestamp (in seconds) defining when the set timelock expires.
   **/
  @ApiModelProperty(required = true, value = "A unix timestamp (in seconds) defining when the set timelock expires.")
  public BigDecimal getTimelock() {
    return timelock;
  }
  public void setTimelock(BigDecimal timelock) {
    this.timelock = timelock;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetCollectionItemTimelockRequest setCollectionItemTimelockRequest = (SetCollectionItemTimelockRequest) o;
    return (this.timelock == null ? setCollectionItemTimelockRequest.timelock == null : this.timelock.equals(setCollectionItemTimelockRequest.timelock));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.timelock == null ? 0: this.timelock.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetCollectionItemTimelockRequest {\n");
    
    sb.append("  timelock: ").append(timelock).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
