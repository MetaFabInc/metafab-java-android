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
public class CreateEcosystemRequest {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("password")
  private String password = null;

  /**
   * The name of the ecosystem you're creating.
   **/
  @ApiModelProperty(required = true, value = "The name of the ecosystem you're creating.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The email address associated with this ecosystem and used to login/authenticate as the ecosystem.
   **/
  @ApiModelProperty(required = true, value = "The email address associated with this ecosystem and used to login/authenticate as the ecosystem.")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The password to authenticate as the ecosystem.
   **/
  @ApiModelProperty(required = true, value = "The password to authenticate as the ecosystem.")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEcosystemRequest createEcosystemRequest = (CreateEcosystemRequest) o;
    return (this.name == null ? createEcosystemRequest.name == null : this.name.equals(createEcosystemRequest.name)) &&
        (this.email == null ? createEcosystemRequest.email == null : this.email.equals(createEcosystemRequest.email)) &&
        (this.password == null ? createEcosystemRequest.password == null : this.password.equals(createEcosystemRequest.password));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEcosystemRequest {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
