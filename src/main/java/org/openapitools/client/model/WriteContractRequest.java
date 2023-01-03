/**
 * MetaFab API
 *  Complete MetaFab API references and guides can be found at: https://trymetafab.com
 *
 * The version of the OpenAPI document: 1.4.1
 * Contact: metafabproject@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.WriteContractRequestArgsInner;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class WriteContractRequest {
  
  @SerializedName("func")
  private String func = null;
  @SerializedName("args")
  private List<WriteContractRequestArgsInner> args = null;

  /**
   * A contract function name. This can be any valid function from the the ABI of the contract you are interacting with. For example, `mint`.
   **/
  @ApiModelProperty(required = true, value = "A contract function name. This can be any valid function from the the ABI of the contract you are interacting with. For example, `mint`.")
  public String getFunc() {
    return func;
  }
  public void setFunc(String func) {
    this.func = func;
  }

  /**
   * An array of args. This is optional and only necessary if the function being invoked requires arguments per the contract ABI. For example, `[123, \"Hello\", false]`.
   **/
  @ApiModelProperty(value = "An array of args. This is optional and only necessary if the function being invoked requires arguments per the contract ABI. For example, `[123, \"Hello\", false]`.")
  public List<WriteContractRequestArgsInner> getArgs() {
    return args;
  }
  public void setArgs(List<WriteContractRequestArgsInner> args) {
    this.args = args;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WriteContractRequest writeContractRequest = (WriteContractRequest) o;
    return (this.func == null ? writeContractRequest.func == null : this.func.equals(writeContractRequest.func)) &&
        (this.args == null ? writeContractRequest.args == null : this.args.equals(writeContractRequest.args));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.func == null ? 0: this.func.hashCode());
    result = 31 * result + (this.args == null ? 0: this.args.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WriteContractRequest {\n");
    
    sb.append("  func: ").append(func).append("\n");
    sb.append("  args: ").append(args).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
