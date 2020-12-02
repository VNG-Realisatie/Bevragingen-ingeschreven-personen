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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.KindHalBasis;
import org.openapitools.client.model.OuderHalBasis;
import org.openapitools.client.model.PartnerHalBasis;

/**
 * IngeschrevenPersoonEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-02T07:53:40.991Z[Etc/UTC]")
public class IngeschrevenPersoonEmbedded {
  public static final String SERIALIZED_NAME_OUDERS = "ouders";
  @SerializedName(SERIALIZED_NAME_OUDERS)
  private List<OuderHalBasis> ouders = null;

  public static final String SERIALIZED_NAME_KINDEREN = "kinderen";
  @SerializedName(SERIALIZED_NAME_KINDEREN)
  private List<KindHalBasis> kinderen = null;

  public static final String SERIALIZED_NAME_PARTNERS = "partners";
  @SerializedName(SERIALIZED_NAME_PARTNERS)
  private List<PartnerHalBasis> partners = null;


  public IngeschrevenPersoonEmbedded ouders(List<OuderHalBasis> ouders) {
    
    this.ouders = ouders;
    return this;
  }

  public IngeschrevenPersoonEmbedded addOudersItem(OuderHalBasis oudersItem) {
    if (this.ouders == null) {
      this.ouders = new ArrayList<>();
    }
    this.ouders.add(oudersItem);
    return this;
  }

   /**
   * De ouders van de persoon. 
   * @return ouders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "De ouders van de persoon. ")

  public List<OuderHalBasis> getOuders() {
    return ouders;
  }


  public void setOuders(List<OuderHalBasis> ouders) {
    this.ouders = ouders;
  }


  public IngeschrevenPersoonEmbedded kinderen(List<KindHalBasis> kinderen) {
    
    this.kinderen = kinderen;
    return this;
  }

  public IngeschrevenPersoonEmbedded addKinderenItem(KindHalBasis kinderenItem) {
    if (this.kinderen == null) {
      this.kinderen = new ArrayList<>();
    }
    this.kinderen.add(kinderenItem);
    return this;
  }

   /**
   * De kinderen van de persoon. 
   * @return kinderen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "De kinderen van de persoon. ")

  public List<KindHalBasis> getKinderen() {
    return kinderen;
  }


  public void setKinderen(List<KindHalBasis> kinderen) {
    this.kinderen = kinderen;
  }


  public IngeschrevenPersoonEmbedded partners(List<PartnerHalBasis> partners) {
    
    this.partners = partners;
    return this;
  }

  public IngeschrevenPersoonEmbedded addPartnersItem(PartnerHalBasis partnersItem) {
    if (this.partners == null) {
      this.partners = new ArrayList<>();
    }
    this.partners.add(partnersItem);
    return this;
  }

   /**
   * De partners van de persoon. Een beëindigd huwelijk of geregistreerd partnerschap wordt niet teruggegeven. 
   * @return partners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "De partners van de persoon. Een beëindigd huwelijk of geregistreerd partnerschap wordt niet teruggegeven. ")

  public List<PartnerHalBasis> getPartners() {
    return partners;
  }


  public void setPartners(List<PartnerHalBasis> partners) {
    this.partners = partners;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngeschrevenPersoonEmbedded ingeschrevenPersoonEmbedded = (IngeschrevenPersoonEmbedded) o;
    return Objects.equals(this.ouders, ingeschrevenPersoonEmbedded.ouders) &&
        Objects.equals(this.kinderen, ingeschrevenPersoonEmbedded.kinderen) &&
        Objects.equals(this.partners, ingeschrevenPersoonEmbedded.partners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ouders, kinderen, partners);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngeschrevenPersoonEmbedded {\n");
    sb.append("    ouders: ").append(toIndentedString(ouders)).append("\n");
    sb.append("    kinderen: ").append(toIndentedString(kinderen)).append("\n");
    sb.append("    partners: ").append(toIndentedString(partners)).append("\n");
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

