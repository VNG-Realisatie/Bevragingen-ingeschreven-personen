/*
 * Bevragen Ingeschreven Personen
 * API voor het bevragen van ingeschreven personen uit de basisregistratie personen (BRP), inclusief de registratie niet-ingezeten (RNI). Met deze API kun je personen zoeken en actuele gegevens over personen, kinderen, partners en ouders raadplegen.  Gegevens die er niet zijn of niet actueel zijn krijg je niet terug. Heeft een persoon bijvoorbeeld geen geldige nationaliteit, en alleen een beëindigd partnerschap, dan krijg je geen gegevens over nationaliteit en partner.  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/tree/v1.1.0/features) voor nadere toelichting. 
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.IngeschrevenPersoonEmbedded;

/**
 * IngeschrevenPersoonHalAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-02T08:18:19.408Z[Etc/UTC]")
public class IngeschrevenPersoonHalAllOf {
  public static final String SERIALIZED_NAME_EMBEDDED = "_embedded";
  @SerializedName(SERIALIZED_NAME_EMBEDDED)
  private IngeschrevenPersoonEmbedded embedded;


  public IngeschrevenPersoonHalAllOf embedded(IngeschrevenPersoonEmbedded embedded) {
    
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IngeschrevenPersoonEmbedded getEmbedded() {
    return embedded;
  }


  public void setEmbedded(IngeschrevenPersoonEmbedded embedded) {
    this.embedded = embedded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngeschrevenPersoonHalAllOf ingeschrevenPersoonHalAllOf = (IngeschrevenPersoonHalAllOf) o;
    return Objects.equals(this.embedded, ingeschrevenPersoonHalAllOf.embedded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embedded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngeschrevenPersoonHalAllOf {\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
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

