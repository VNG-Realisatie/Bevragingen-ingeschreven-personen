/* 
 * Bevragen Ingeschreven Personen
 *
 * API voor het bevragen van ingeschreven personen uit de basisregistratie personen (BRP), inclusief de registratie niet-ingezeten (RNI). Met deze API kun je personen zoeken en actuele gegevens over personen, kinderen, partners en ouders raadplegen.  Gegevens die er niet zijn of niet actueel zijn krijg je niet terug. Heeft een persoon bijvoorbeeld geen geldige nationaliteit, en alleen een beëindigd partnerschap, dan krijg je geen gegevens over nationaliteit en partner.  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/tree/v1.0.0/features) voor nadere toelichting. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// OuderLinks
    /// </summary>
    [DataContract]
    public partial class OuderLinks :  IEquatable<OuderLinks>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OuderLinks" /> class.
        /// </summary>
        /// <param name="self">self.</param>
        /// <param name="ingeschrevenPersoon">ingeschrevenPersoon.</param>
        public OuderLinks(HalLink self = default(HalLink), HalLink ingeschrevenPersoon = default(HalLink))
        {
            this.Self = self;
            this.IngeschrevenPersoon = ingeschrevenPersoon;
        }
        
        /// <summary>
        /// Gets or Sets Self
        /// </summary>
        [DataMember(Name="self", EmitDefaultValue=false)]
        public HalLink Self { get; set; }

        /// <summary>
        /// Gets or Sets IngeschrevenPersoon
        /// </summary>
        [DataMember(Name="ingeschrevenPersoon", EmitDefaultValue=false)]
        public HalLink IngeschrevenPersoon { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OuderLinks {\n");
            sb.Append("  Self: ").Append(Self).Append("\n");
            sb.Append("  IngeschrevenPersoon: ").Append(IngeschrevenPersoon).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as OuderLinks);
        }

        /// <summary>
        /// Returns true if OuderLinks instances are equal
        /// </summary>
        /// <param name="input">Instance of OuderLinks to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OuderLinks input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Self == input.Self ||
                    (this.Self != null &&
                    this.Self.Equals(input.Self))
                ) && 
                (
                    this.IngeschrevenPersoon == input.IngeschrevenPersoon ||
                    (this.IngeschrevenPersoon != null &&
                    this.IngeschrevenPersoon.Equals(input.IngeschrevenPersoon))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Self != null)
                    hashCode = hashCode * 59 + this.Self.GetHashCode();
                if (this.IngeschrevenPersoon != null)
                    hashCode = hashCode * 59 + this.IngeschrevenPersoon.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
