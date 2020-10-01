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
    /// BadRequestFoutberichtAllOf
    /// </summary>
    [DataContract]
    public partial class BadRequestFoutberichtAllOf :  IEquatable<BadRequestFoutberichtAllOf>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BadRequestFoutberichtAllOf" /> class.
        /// </summary>
        /// <param name="invalidParams">Foutmelding per fout in een parameter. Alle gevonden fouten worden één keer teruggemeld..</param>
        public BadRequestFoutberichtAllOf(List<InvalidParams> invalidParams = default(List<InvalidParams>))
        {
            this.InvalidParams = invalidParams;
        }
        
        /// <summary>
        /// Foutmelding per fout in een parameter. Alle gevonden fouten worden één keer teruggemeld.
        /// </summary>
        /// <value>Foutmelding per fout in een parameter. Alle gevonden fouten worden één keer teruggemeld.</value>
        [DataMember(Name="invalidParams", EmitDefaultValue=false)]
        public List<InvalidParams> InvalidParams { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BadRequestFoutberichtAllOf {\n");
            sb.Append("  InvalidParams: ").Append(InvalidParams).Append("\n");
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
            return this.Equals(input as BadRequestFoutberichtAllOf);
        }

        /// <summary>
        /// Returns true if BadRequestFoutberichtAllOf instances are equal
        /// </summary>
        /// <param name="input">Instance of BadRequestFoutberichtAllOf to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BadRequestFoutberichtAllOf input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.InvalidParams == input.InvalidParams ||
                    this.InvalidParams != null &&
                    input.InvalidParams != null &&
                    this.InvalidParams.SequenceEqual(input.InvalidParams)
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
                if (this.InvalidParams != null)
                    hashCode = hashCode * 59 + this.InvalidParams.GetHashCode();
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
