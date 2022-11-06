/**
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.1.43
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
public class GrantCurrencyRoleRequest {
  
  @SerializedName("role")
  private String role = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("walletId")
  private List<String> walletId = null;

  /**
   * A valid MetaFab role or bytes string representing a role, such as `minter` or `0xc9eb32e43bf5ecbceacf00b32281dfc5d6d700a0db676ea26ccf938a385ac3b7`
   **/
  @ApiModelProperty(required = true, value = "A valid MetaFab role or bytes string representing a role, such as `minter` or `0xc9eb32e43bf5ecbceacf00b32281dfc5d6d700a0db676ea26ccf938a385ac3b7`")
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }

  /**
   * A valid EVM based address to grant the role to.
   **/
  @ApiModelProperty(value = "A valid EVM based address to grant the role to.")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * A wallet id within the MetaFab ecosystem to grant the role to.
   **/
  @ApiModelProperty(value = "A wallet id within the MetaFab ecosystem to grant the role to.")
  public List<String> getWalletId() {
    return walletId;
  }
  public void setWalletId(List<String> walletId) {
    this.walletId = walletId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrantCurrencyRoleRequest grantCurrencyRoleRequest = (GrantCurrencyRoleRequest) o;
    return (this.role == null ? grantCurrencyRoleRequest.role == null : this.role.equals(grantCurrencyRoleRequest.role)) &&
        (this.address == null ? grantCurrencyRoleRequest.address == null : this.address.equals(grantCurrencyRoleRequest.address)) &&
        (this.walletId == null ? grantCurrencyRoleRequest.walletId == null : this.walletId.equals(grantCurrencyRoleRequest.walletId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.role == null ? 0: this.role.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.walletId == null ? 0: this.walletId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrantCurrencyRoleRequest {\n");
    
    sb.append("  role: ").append(role).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  walletId: ").append(walletId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
