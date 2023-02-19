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
public class ApproveEcosystemGameRequest {
  
  @SerializedName("gameId")
  private String gameId = null;

  /**
   * The id of the game being approved.
   **/
  @ApiModelProperty(required = true, value = "The id of the game being approved.")
  public String getGameId() {
    return gameId;
  }
  public void setGameId(String gameId) {
    this.gameId = gameId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApproveEcosystemGameRequest approveEcosystemGameRequest = (ApproveEcosystemGameRequest) o;
    return (this.gameId == null ? approveEcosystemGameRequest.gameId == null : this.gameId.equals(approveEcosystemGameRequest.gameId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.gameId == null ? 0: this.gameId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApproveEcosystemGameRequest {\n");
    
    sb.append("  gameId: ").append(gameId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}