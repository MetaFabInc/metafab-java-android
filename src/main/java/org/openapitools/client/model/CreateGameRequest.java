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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateGameRequest {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("password")
  private String password = null;

  /**
   * The name of the game you're creating.
   **/
  @ApiModelProperty(required = true, value = "The name of the game you're creating.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The email address associated with this game and used to login/authenticate as the game.
   **/
  @ApiModelProperty(required = true, value = "The email address associated with this game and used to login/authenticate as the game.")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The password to authenticate as the game. Additionally, this password is used to encrypt/decrypt your game's primary wallet and must be provided anytime this game makes blockchain interactions through various endpoints.
   **/
  @ApiModelProperty(required = true, value = "The password to authenticate as the game. Additionally, this password is used to encrypt/decrypt your game's primary wallet and must be provided anytime this game makes blockchain interactions through various endpoints.")
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
    CreateGameRequest createGameRequest = (CreateGameRequest) o;
    return (this.name == null ? createGameRequest.name == null : this.name.equals(createGameRequest.name)) &&
        (this.email == null ? createGameRequest.email == null : this.email.equals(createGameRequest.email)) &&
        (this.password == null ? createGameRequest.password == null : this.password.equals(createGameRequest.password));
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
    sb.append("class CreateGameRequest {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
