/* 
 * Bevragingen ingeschreven personen
 *
 * API voor het ontsluiten van gegevens van ingeschreven personen en aanverwante gegevens uit de GBA en RNI. Met deze API worden de actuele gegevens van ingeschreven personen, hun kinderen, partners en ouders ontsloten. <br> Heeft een persoon bijvoorbeeld geen geldige nationaliteit, dan wordt nationaliteit niet geretourneerd. <br> Heeft een persoon een beëindigd partnerschap of huwelijk, dan wordt de partner niet geretourneerd. <br> <br> Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Bevragingen-ingeschreven-personen/tree/master/features) voor nadere toelichting. <br> 
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
    /// PartnerhistorieLinks
    /// </summary>
    [DataContract]
    public partial class PartnerhistorieLinks :  IEquatable<PartnerhistorieLinks>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PartnerhistorieLinks" /> class.
        /// </summary>
        /// <param name="ingeschrevenPersoon">ingeschrevenPersoon.</param>
        public PartnerhistorieLinks(HalLink ingeschrevenPersoon = default(HalLink))
        {
            this.IngeschrevenPersoon = ingeschrevenPersoon;
        }
        
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
            sb.Append("class PartnerhistorieLinks {\n");
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
            return this.Equals(input as PartnerhistorieLinks);
        }

        /// <summary>
        /// Returns true if PartnerhistorieLinks instances are equal
        /// </summary>
        /// <param name="input">Instance of PartnerhistorieLinks to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PartnerhistorieLinks input)
        {
            if (input == null)
                return false;

            return 
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
