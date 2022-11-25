/*
 * Open Service Broker API
 * The Open Service Broker API defines an HTTP(S) interface between Platforms and Service Brokers.
 *
 * OpenAPI spec version: master - might contain changes that are not yet released
 * Contact: open-service-broker-api@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * See [Service Broker Errors](https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors) for more details.
 */
@Schema(description = "See [Service Broker Errors](https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors) for more details.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-26T00:56:51.461867+05:30[Asia/Kolkata]")
public class Error {
  @SerializedName("error")
  private String error = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("instance_usable")
  private Boolean instanceUsable = null;

  @SerializedName("update_repeatable")
  private Boolean updateRepeatable = null;

  public Error error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @Schema(description = "")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public Error description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Error instanceUsable(Boolean instanceUsable) {
    this.instanceUsable = instanceUsable;
    return this;
  }

   /**
   * Get instanceUsable
   * @return instanceUsable
  **/
  @Schema(description = "")
  public Boolean isInstanceUsable() {
    return instanceUsable;
  }

  public void setInstanceUsable(Boolean instanceUsable) {
    this.instanceUsable = instanceUsable;
  }

  public Error updateRepeatable(Boolean updateRepeatable) {
    this.updateRepeatable = updateRepeatable;
    return this;
  }

   /**
   * Get updateRepeatable
   * @return updateRepeatable
  **/
  @Schema(description = "")
  public Boolean isUpdateRepeatable() {
    return updateRepeatable;
  }

  public void setUpdateRepeatable(Boolean updateRepeatable) {
    this.updateRepeatable = updateRepeatable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.error, error.error) &&
        Objects.equals(this.description, error.description) &&
        Objects.equals(this.instanceUsable, error.instanceUsable) &&
        Objects.equals(this.updateRepeatable, error.updateRepeatable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, description, instanceUsable, updateRepeatable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    instanceUsable: ").append(toIndentedString(instanceUsable)).append("\n");
    sb.append("    updateRepeatable: ").append(toIndentedString(updateRepeatable)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}