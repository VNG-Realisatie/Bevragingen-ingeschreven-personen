/*
 * Bevragen Ingeschreven Personen
 * API voor het bevragen van ingeschreven personen uit de basisregistratie personen (BRP), inclusief de registratie niet-ingezeten (RNI). Met deze API kun je personen zoeken en actuele gegevens over personen, kinderen, partners en ouders raadplegen.  Gegevens die er niet zijn of niet actueel zijn krijg je niet terug. Heeft een persoon bijvoorbeeld geen geldige nationaliteit, en alleen een beëindigd partnerschap, dan krijg je geen gegevens over nationaliteit en partner.  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/tree/v1.0.0/features) voor nadere toelichting. 
 *
 * The version of the OpenAPI document: 1.0.0
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
import org.openapitools.client.model.DatumOnvolledig;

/**
 * Geeft aan welke gegevens over het verblijf en adres van de persoon in onderzoek zijn. Elementen van het GBA-adres zelf (Dat zou eigenlijk een BAG-adres moeten zijn) kunnen niet in onderzoek zijn. Wel de relatie naar de nummeraanduiding. Dat wordt gedaan door de identificatiecodeNummeraanduiding in onderzoek te zetten. Zie de [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/v1.0.0/features/in_onderzoek.feature) 
 */
@ApiModel(description = "Geeft aan welke gegevens over het verblijf en adres van de persoon in onderzoek zijn. Elementen van het GBA-adres zelf (Dat zou eigenlijk een BAG-adres moeten zijn) kunnen niet in onderzoek zijn. Wel de relatie naar de nummeraanduiding. Dat wordt gedaan door de identificatiecodeNummeraanduiding in onderzoek te zetten. Zie de [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/v1.0.0/features/in_onderzoek.feature) ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-01T14:03:13.754Z[Etc/UTC]")
public class VerblijfplaatsInOnderzoek {
  public static final String SERIALIZED_NAME_AANDUIDING_BIJ_HUISNUMMER = "aanduidingBijHuisnummer";
  @SerializedName(SERIALIZED_NAME_AANDUIDING_BIJ_HUISNUMMER)
  private Boolean aanduidingBijHuisnummer;

  public static final String SERIALIZED_NAME_DATUM_AANVANG_ADRESHOUDING = "datumAanvangAdreshouding";
  @SerializedName(SERIALIZED_NAME_DATUM_AANVANG_ADRESHOUDING)
  private Boolean datumAanvangAdreshouding;

  public static final String SERIALIZED_NAME_DATUM_INGANG_GELDIGHEID = "datumIngangGeldigheid";
  @SerializedName(SERIALIZED_NAME_DATUM_INGANG_GELDIGHEID)
  private Boolean datumIngangGeldigheid;

  public static final String SERIALIZED_NAME_DATUM_INSCHRIJVING_IN_GEMEENTE = "datumInschrijvingInGemeente";
  @SerializedName(SERIALIZED_NAME_DATUM_INSCHRIJVING_IN_GEMEENTE)
  private Boolean datumInschrijvingInGemeente;

  public static final String SERIALIZED_NAME_DATUM_VESTIGING_IN_NEDERLAND = "datumVestigingInNederland";
  @SerializedName(SERIALIZED_NAME_DATUM_VESTIGING_IN_NEDERLAND)
  private Boolean datumVestigingInNederland;

  public static final String SERIALIZED_NAME_FUNCTIE_ADRES = "functieAdres";
  @SerializedName(SERIALIZED_NAME_FUNCTIE_ADRES)
  private Boolean functieAdres;

  public static final String SERIALIZED_NAME_GEMEENTE_VAN_INSCHRIJVING = "gemeenteVanInschrijving";
  @SerializedName(SERIALIZED_NAME_GEMEENTE_VAN_INSCHRIJVING)
  private Boolean gemeenteVanInschrijving;

  public static final String SERIALIZED_NAME_HUISLETTER = "huisletter";
  @SerializedName(SERIALIZED_NAME_HUISLETTER)
  private Boolean huisletter;

  public static final String SERIALIZED_NAME_HUISNUMMER = "huisnummer";
  @SerializedName(SERIALIZED_NAME_HUISNUMMER)
  private Boolean huisnummer;

  public static final String SERIALIZED_NAME_HUISNUMMERTOEVOEGING = "huisnummertoevoeging";
  @SerializedName(SERIALIZED_NAME_HUISNUMMERTOEVOEGING)
  private Boolean huisnummertoevoeging;

  public static final String SERIALIZED_NAME_NUMMERAANDUIDING_IDENTIFICATIE = "nummeraanduidingIdentificatie";
  @SerializedName(SERIALIZED_NAME_NUMMERAANDUIDING_IDENTIFICATIE)
  private Boolean nummeraanduidingIdentificatie;

  public static final String SERIALIZED_NAME_ADRESSEERBAAR_OBJECT_IDENTIFICATIE = "adresseerbaarObjectIdentificatie";
  @SerializedName(SERIALIZED_NAME_ADRESSEERBAAR_OBJECT_IDENTIFICATIE)
  private Boolean adresseerbaarObjectIdentificatie;

  public static final String SERIALIZED_NAME_LAND_VANWAAR_INGESCHREVEN = "landVanwaarIngeschreven";
  @SerializedName(SERIALIZED_NAME_LAND_VANWAAR_INGESCHREVEN)
  private Boolean landVanwaarIngeschreven;

  public static final String SERIALIZED_NAME_LOCATIEBESCHRIJVING = "locatiebeschrijving";
  @SerializedName(SERIALIZED_NAME_LOCATIEBESCHRIJVING)
  private Boolean locatiebeschrijving;

  public static final String SERIALIZED_NAME_STRAAT = "straat";
  @SerializedName(SERIALIZED_NAME_STRAAT)
  private Boolean straat;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private Boolean postcode;

  public static final String SERIALIZED_NAME_KORTE_NAAM = "korteNaam";
  @SerializedName(SERIALIZED_NAME_KORTE_NAAM)
  private Boolean korteNaam;

  public static final String SERIALIZED_NAME_VERBLIJF_BUITENLAND = "verblijfBuitenland";
  @SerializedName(SERIALIZED_NAME_VERBLIJF_BUITENLAND)
  private Boolean verblijfBuitenland;

  public static final String SERIALIZED_NAME_WOONPLAATS = "woonplaats";
  @SerializedName(SERIALIZED_NAME_WOONPLAATS)
  private Boolean woonplaats;

  public static final String SERIALIZED_NAME_DATUM_INGANG_ONDERZOEK = "datumIngangOnderzoek";
  @SerializedName(SERIALIZED_NAME_DATUM_INGANG_ONDERZOEK)
  private DatumOnvolledig datumIngangOnderzoek;


  public VerblijfplaatsInOnderzoek aanduidingBijHuisnummer(Boolean aanduidingBijHuisnummer) {
    
    this.aanduidingBijHuisnummer = aanduidingBijHuisnummer;
    return this;
  }

   /**
   * Get aanduidingBijHuisnummer
   * @return aanduidingBijHuisnummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAanduidingBijHuisnummer() {
    return aanduidingBijHuisnummer;
  }


  public void setAanduidingBijHuisnummer(Boolean aanduidingBijHuisnummer) {
    this.aanduidingBijHuisnummer = aanduidingBijHuisnummer;
  }


  public VerblijfplaatsInOnderzoek datumAanvangAdreshouding(Boolean datumAanvangAdreshouding) {
    
    this.datumAanvangAdreshouding = datumAanvangAdreshouding;
    return this;
  }

   /**
   * Get datumAanvangAdreshouding
   * @return datumAanvangAdreshouding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDatumAanvangAdreshouding() {
    return datumAanvangAdreshouding;
  }


  public void setDatumAanvangAdreshouding(Boolean datumAanvangAdreshouding) {
    this.datumAanvangAdreshouding = datumAanvangAdreshouding;
  }


  public VerblijfplaatsInOnderzoek datumIngangGeldigheid(Boolean datumIngangGeldigheid) {
    
    this.datumIngangGeldigheid = datumIngangGeldigheid;
    return this;
  }

   /**
   * Get datumIngangGeldigheid
   * @return datumIngangGeldigheid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDatumIngangGeldigheid() {
    return datumIngangGeldigheid;
  }


  public void setDatumIngangGeldigheid(Boolean datumIngangGeldigheid) {
    this.datumIngangGeldigheid = datumIngangGeldigheid;
  }


  public VerblijfplaatsInOnderzoek datumInschrijvingInGemeente(Boolean datumInschrijvingInGemeente) {
    
    this.datumInschrijvingInGemeente = datumInschrijvingInGemeente;
    return this;
  }

   /**
   * Get datumInschrijvingInGemeente
   * @return datumInschrijvingInGemeente
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDatumInschrijvingInGemeente() {
    return datumInschrijvingInGemeente;
  }


  public void setDatumInschrijvingInGemeente(Boolean datumInschrijvingInGemeente) {
    this.datumInschrijvingInGemeente = datumInschrijvingInGemeente;
  }


  public VerblijfplaatsInOnderzoek datumVestigingInNederland(Boolean datumVestigingInNederland) {
    
    this.datumVestigingInNederland = datumVestigingInNederland;
    return this;
  }

   /**
   * Get datumVestigingInNederland
   * @return datumVestigingInNederland
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDatumVestigingInNederland() {
    return datumVestigingInNederland;
  }


  public void setDatumVestigingInNederland(Boolean datumVestigingInNederland) {
    this.datumVestigingInNederland = datumVestigingInNederland;
  }


  public VerblijfplaatsInOnderzoek functieAdres(Boolean functieAdres) {
    
    this.functieAdres = functieAdres;
    return this;
  }

   /**
   * Get functieAdres
   * @return functieAdres
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFunctieAdres() {
    return functieAdres;
  }


  public void setFunctieAdres(Boolean functieAdres) {
    this.functieAdres = functieAdres;
  }


  public VerblijfplaatsInOnderzoek gemeenteVanInschrijving(Boolean gemeenteVanInschrijving) {
    
    this.gemeenteVanInschrijving = gemeenteVanInschrijving;
    return this;
  }

   /**
   * Get gemeenteVanInschrijving
   * @return gemeenteVanInschrijving
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGemeenteVanInschrijving() {
    return gemeenteVanInschrijving;
  }


  public void setGemeenteVanInschrijving(Boolean gemeenteVanInschrijving) {
    this.gemeenteVanInschrijving = gemeenteVanInschrijving;
  }


  public VerblijfplaatsInOnderzoek huisletter(Boolean huisletter) {
    
    this.huisletter = huisletter;
    return this;
  }

   /**
   * Get huisletter
   * @return huisletter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHuisletter() {
    return huisletter;
  }


  public void setHuisletter(Boolean huisletter) {
    this.huisletter = huisletter;
  }


  public VerblijfplaatsInOnderzoek huisnummer(Boolean huisnummer) {
    
    this.huisnummer = huisnummer;
    return this;
  }

   /**
   * Get huisnummer
   * @return huisnummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHuisnummer() {
    return huisnummer;
  }


  public void setHuisnummer(Boolean huisnummer) {
    this.huisnummer = huisnummer;
  }


  public VerblijfplaatsInOnderzoek huisnummertoevoeging(Boolean huisnummertoevoeging) {
    
    this.huisnummertoevoeging = huisnummertoevoeging;
    return this;
  }

   /**
   * Get huisnummertoevoeging
   * @return huisnummertoevoeging
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHuisnummertoevoeging() {
    return huisnummertoevoeging;
  }


  public void setHuisnummertoevoeging(Boolean huisnummertoevoeging) {
    this.huisnummertoevoeging = huisnummertoevoeging;
  }


  public VerblijfplaatsInOnderzoek nummeraanduidingIdentificatie(Boolean nummeraanduidingIdentificatie) {
    
    this.nummeraanduidingIdentificatie = nummeraanduidingIdentificatie;
    return this;
  }

   /**
   * Get nummeraanduidingIdentificatie
   * @return nummeraanduidingIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNummeraanduidingIdentificatie() {
    return nummeraanduidingIdentificatie;
  }


  public void setNummeraanduidingIdentificatie(Boolean nummeraanduidingIdentificatie) {
    this.nummeraanduidingIdentificatie = nummeraanduidingIdentificatie;
  }


  public VerblijfplaatsInOnderzoek adresseerbaarObjectIdentificatie(Boolean adresseerbaarObjectIdentificatie) {
    
    this.adresseerbaarObjectIdentificatie = adresseerbaarObjectIdentificatie;
    return this;
  }

   /**
   * Get adresseerbaarObjectIdentificatie
   * @return adresseerbaarObjectIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAdresseerbaarObjectIdentificatie() {
    return adresseerbaarObjectIdentificatie;
  }


  public void setAdresseerbaarObjectIdentificatie(Boolean adresseerbaarObjectIdentificatie) {
    this.adresseerbaarObjectIdentificatie = adresseerbaarObjectIdentificatie;
  }


  public VerblijfplaatsInOnderzoek landVanwaarIngeschreven(Boolean landVanwaarIngeschreven) {
    
    this.landVanwaarIngeschreven = landVanwaarIngeschreven;
    return this;
  }

   /**
   * Get landVanwaarIngeschreven
   * @return landVanwaarIngeschreven
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLandVanwaarIngeschreven() {
    return landVanwaarIngeschreven;
  }


  public void setLandVanwaarIngeschreven(Boolean landVanwaarIngeschreven) {
    this.landVanwaarIngeschreven = landVanwaarIngeschreven;
  }


  public VerblijfplaatsInOnderzoek locatiebeschrijving(Boolean locatiebeschrijving) {
    
    this.locatiebeschrijving = locatiebeschrijving;
    return this;
  }

   /**
   * Get locatiebeschrijving
   * @return locatiebeschrijving
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLocatiebeschrijving() {
    return locatiebeschrijving;
  }


  public void setLocatiebeschrijving(Boolean locatiebeschrijving) {
    this.locatiebeschrijving = locatiebeschrijving;
  }


  public VerblijfplaatsInOnderzoek straat(Boolean straat) {
    
    this.straat = straat;
    return this;
  }

   /**
   * Get straat
   * @return straat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getStraat() {
    return straat;
  }


  public void setStraat(Boolean straat) {
    this.straat = straat;
  }


  public VerblijfplaatsInOnderzoek postcode(Boolean postcode) {
    
    this.postcode = postcode;
    return this;
  }

   /**
   * Get postcode
   * @return postcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPostcode() {
    return postcode;
  }


  public void setPostcode(Boolean postcode) {
    this.postcode = postcode;
  }


  public VerblijfplaatsInOnderzoek korteNaam(Boolean korteNaam) {
    
    this.korteNaam = korteNaam;
    return this;
  }

   /**
   * Get korteNaam
   * @return korteNaam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getKorteNaam() {
    return korteNaam;
  }


  public void setKorteNaam(Boolean korteNaam) {
    this.korteNaam = korteNaam;
  }


  public VerblijfplaatsInOnderzoek verblijfBuitenland(Boolean verblijfBuitenland) {
    
    this.verblijfBuitenland = verblijfBuitenland;
    return this;
  }

   /**
   * Get verblijfBuitenland
   * @return verblijfBuitenland
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getVerblijfBuitenland() {
    return verblijfBuitenland;
  }


  public void setVerblijfBuitenland(Boolean verblijfBuitenland) {
    this.verblijfBuitenland = verblijfBuitenland;
  }


  public VerblijfplaatsInOnderzoek woonplaats(Boolean woonplaats) {
    
    this.woonplaats = woonplaats;
    return this;
  }

   /**
   * Get woonplaats
   * @return woonplaats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWoonplaats() {
    return woonplaats;
  }


  public void setWoonplaats(Boolean woonplaats) {
    this.woonplaats = woonplaats;
  }


  public VerblijfplaatsInOnderzoek datumIngangOnderzoek(DatumOnvolledig datumIngangOnderzoek) {
    
    this.datumIngangOnderzoek = datumIngangOnderzoek;
    return this;
  }

   /**
   * Get datumIngangOnderzoek
   * @return datumIngangOnderzoek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumIngangOnderzoek() {
    return datumIngangOnderzoek;
  }


  public void setDatumIngangOnderzoek(DatumOnvolledig datumIngangOnderzoek) {
    this.datumIngangOnderzoek = datumIngangOnderzoek;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerblijfplaatsInOnderzoek verblijfplaatsInOnderzoek = (VerblijfplaatsInOnderzoek) o;
    return Objects.equals(this.aanduidingBijHuisnummer, verblijfplaatsInOnderzoek.aanduidingBijHuisnummer) &&
        Objects.equals(this.datumAanvangAdreshouding, verblijfplaatsInOnderzoek.datumAanvangAdreshouding) &&
        Objects.equals(this.datumIngangGeldigheid, verblijfplaatsInOnderzoek.datumIngangGeldigheid) &&
        Objects.equals(this.datumInschrijvingInGemeente, verblijfplaatsInOnderzoek.datumInschrijvingInGemeente) &&
        Objects.equals(this.datumVestigingInNederland, verblijfplaatsInOnderzoek.datumVestigingInNederland) &&
        Objects.equals(this.functieAdres, verblijfplaatsInOnderzoek.functieAdres) &&
        Objects.equals(this.gemeenteVanInschrijving, verblijfplaatsInOnderzoek.gemeenteVanInschrijving) &&
        Objects.equals(this.huisletter, verblijfplaatsInOnderzoek.huisletter) &&
        Objects.equals(this.huisnummer, verblijfplaatsInOnderzoek.huisnummer) &&
        Objects.equals(this.huisnummertoevoeging, verblijfplaatsInOnderzoek.huisnummertoevoeging) &&
        Objects.equals(this.nummeraanduidingIdentificatie, verblijfplaatsInOnderzoek.nummeraanduidingIdentificatie) &&
        Objects.equals(this.adresseerbaarObjectIdentificatie, verblijfplaatsInOnderzoek.adresseerbaarObjectIdentificatie) &&
        Objects.equals(this.landVanwaarIngeschreven, verblijfplaatsInOnderzoek.landVanwaarIngeschreven) &&
        Objects.equals(this.locatiebeschrijving, verblijfplaatsInOnderzoek.locatiebeschrijving) &&
        Objects.equals(this.straat, verblijfplaatsInOnderzoek.straat) &&
        Objects.equals(this.postcode, verblijfplaatsInOnderzoek.postcode) &&
        Objects.equals(this.korteNaam, verblijfplaatsInOnderzoek.korteNaam) &&
        Objects.equals(this.verblijfBuitenland, verblijfplaatsInOnderzoek.verblijfBuitenland) &&
        Objects.equals(this.woonplaats, verblijfplaatsInOnderzoek.woonplaats) &&
        Objects.equals(this.datumIngangOnderzoek, verblijfplaatsInOnderzoek.datumIngangOnderzoek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aanduidingBijHuisnummer, datumAanvangAdreshouding, datumIngangGeldigheid, datumInschrijvingInGemeente, datumVestigingInNederland, functieAdres, gemeenteVanInschrijving, huisletter, huisnummer, huisnummertoevoeging, nummeraanduidingIdentificatie, adresseerbaarObjectIdentificatie, landVanwaarIngeschreven, locatiebeschrijving, straat, postcode, korteNaam, verblijfBuitenland, woonplaats, datumIngangOnderzoek);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerblijfplaatsInOnderzoek {\n");
    sb.append("    aanduidingBijHuisnummer: ").append(toIndentedString(aanduidingBijHuisnummer)).append("\n");
    sb.append("    datumAanvangAdreshouding: ").append(toIndentedString(datumAanvangAdreshouding)).append("\n");
    sb.append("    datumIngangGeldigheid: ").append(toIndentedString(datumIngangGeldigheid)).append("\n");
    sb.append("    datumInschrijvingInGemeente: ").append(toIndentedString(datumInschrijvingInGemeente)).append("\n");
    sb.append("    datumVestigingInNederland: ").append(toIndentedString(datumVestigingInNederland)).append("\n");
    sb.append("    functieAdres: ").append(toIndentedString(functieAdres)).append("\n");
    sb.append("    gemeenteVanInschrijving: ").append(toIndentedString(gemeenteVanInschrijving)).append("\n");
    sb.append("    huisletter: ").append(toIndentedString(huisletter)).append("\n");
    sb.append("    huisnummer: ").append(toIndentedString(huisnummer)).append("\n");
    sb.append("    huisnummertoevoeging: ").append(toIndentedString(huisnummertoevoeging)).append("\n");
    sb.append("    nummeraanduidingIdentificatie: ").append(toIndentedString(nummeraanduidingIdentificatie)).append("\n");
    sb.append("    adresseerbaarObjectIdentificatie: ").append(toIndentedString(adresseerbaarObjectIdentificatie)).append("\n");
    sb.append("    landVanwaarIngeschreven: ").append(toIndentedString(landVanwaarIngeschreven)).append("\n");
    sb.append("    locatiebeschrijving: ").append(toIndentedString(locatiebeschrijving)).append("\n");
    sb.append("    straat: ").append(toIndentedString(straat)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    korteNaam: ").append(toIndentedString(korteNaam)).append("\n");
    sb.append("    verblijfBuitenland: ").append(toIndentedString(verblijfBuitenland)).append("\n");
    sb.append("    woonplaats: ").append(toIndentedString(woonplaats)).append("\n");
    sb.append("    datumIngangOnderzoek: ").append(toIndentedString(datumIngangOnderzoek)).append("\n");
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

