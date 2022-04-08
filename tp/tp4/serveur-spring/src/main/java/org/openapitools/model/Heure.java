package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Heure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-23T09:44:31.412608+01:00[Europe/Paris]")

public class Heure   {
  @JsonProperty("heure")
  private Integer heure;

  @JsonProperty("minute")
  private Integer minute;

  public Heure heure(Integer heure) {
    this.heure = heure;
    return this;
  }

  /**
   * Get heure
   * @return heure
  */
  @ApiModelProperty(value = "")


  public Integer getHeure() {
    return heure;
  }

  public void setHeure(Integer heure) {
    this.heure = heure;
  }

  public Heure minute(Integer minute) {
    this.minute = minute;
    return this;
  }

  /**
   * Get minute
   * @return minute
  */
  @ApiModelProperty(value = "")


  public Integer getMinute() {
    return minute;
  }

  public void setMinute(Integer minute) {
    this.minute = minute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Heure heure = (Heure) o;
    return Objects.equals(this.heure, heure.heure) &&
        Objects.equals(this.minute, heure.minute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heure, minute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Heure {\n");
    
    sb.append("    heure: ").append(toIndentedString(heure)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
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

