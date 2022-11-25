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
 * ServiceBindingVolumeMountDevice
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-26T00:56:51.461867+05:30[Asia/Kolkata]")
public class ServiceBindingVolumeMountDevice {
  @SerializedName("volume_id")
  private String volumeId = null;

  @SerializedName("mount_config")
  private Object mountConfig = null;

  public ServiceBindingVolumeMountDevice volumeId(String volumeId) {
    this.volumeId = volumeId;
    return this;
  }

   /**
   * Get volumeId
   * @return volumeId
  **/
  @Schema(required = true, description = "")
  public String getVolumeId() {
    return volumeId;
  }

  public void setVolumeId(String volumeId) {
    this.volumeId = volumeId;
  }

  public ServiceBindingVolumeMountDevice mountConfig(Object mountConfig) {
    this.mountConfig = mountConfig;
    return this;
  }

   /**
   * Get mountConfig
   * @return mountConfig
  **/
  @Schema(description = "")
  public Object getMountConfig() {
    return mountConfig;
  }

  public void setMountConfig(Object mountConfig) {
    this.mountConfig = mountConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceBindingVolumeMountDevice serviceBindingVolumeMountDevice = (ServiceBindingVolumeMountDevice) o;
    return Objects.equals(this.volumeId, serviceBindingVolumeMountDevice.volumeId) &&
        Objects.equals(this.mountConfig, serviceBindingVolumeMountDevice.mountConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeId, mountConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceBindingVolumeMountDevice {\n");
    
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
    sb.append("    mountConfig: ").append(toIndentedString(mountConfig)).append("\n");
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