# coding: utf-8

"""
    Bevragen Ingeschreven Personen

    API voor het bevragen van ingeschreven personen uit de basisregistratie personen (BRP), inclusief de registratie niet-ingezeten (RNI). Met deze API kun je personen zoeken en actuele gegevens over personen, kinderen, partners en ouders raadplegen.  Gegevens die er niet zijn of niet actueel zijn krijg je niet terug. Heeft een persoon bijvoorbeeld geen geldige nationaliteit, en alleen een beëindigd partnerschap, dan krijg je geen gegevens over nationaliteit en partner.  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/tree/v1.0.0/features) voor nadere toelichting.   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from openapi_client.configuration import Configuration


class Ouder(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'burgerservicenummer': 'str',
        'geslachtsaanduiding': 'GeslachtEnum',
        'ouder_aanduiding': 'OuderAanduidingEnum',
        'datum_ingang_familierechtelijke_betrekking': 'DatumOnvolledig',
        'naam': 'Naam',
        'in_onderzoek': 'OuderInOnderzoek',
        'geboorte': 'Geboorte',
        'geheimhouding_persoonsgegevens': 'bool'
    }

    attribute_map = {
        'burgerservicenummer': 'burgerservicenummer',
        'geslachtsaanduiding': 'geslachtsaanduiding',
        'ouder_aanduiding': 'ouderAanduiding',
        'datum_ingang_familierechtelijke_betrekking': 'datumIngangFamilierechtelijkeBetrekking',
        'naam': 'naam',
        'in_onderzoek': 'inOnderzoek',
        'geboorte': 'geboorte',
        'geheimhouding_persoonsgegevens': 'geheimhoudingPersoonsgegevens'
    }

    def __init__(self, burgerservicenummer=None, geslachtsaanduiding=None, ouder_aanduiding=None, datum_ingang_familierechtelijke_betrekking=None, naam=None, in_onderzoek=None, geboorte=None, geheimhouding_persoonsgegevens=None, local_vars_configuration=None):  # noqa: E501
        """Ouder - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._burgerservicenummer = None
        self._geslachtsaanduiding = None
        self._ouder_aanduiding = None
        self._datum_ingang_familierechtelijke_betrekking = None
        self._naam = None
        self._in_onderzoek = None
        self._geboorte = None
        self._geheimhouding_persoonsgegevens = None
        self.discriminator = None

        if burgerservicenummer is not None:
            self.burgerservicenummer = burgerservicenummer
        if geslachtsaanduiding is not None:
            self.geslachtsaanduiding = geslachtsaanduiding
        if ouder_aanduiding is not None:
            self.ouder_aanduiding = ouder_aanduiding
        if datum_ingang_familierechtelijke_betrekking is not None:
            self.datum_ingang_familierechtelijke_betrekking = datum_ingang_familierechtelijke_betrekking
        if naam is not None:
            self.naam = naam
        if in_onderzoek is not None:
            self.in_onderzoek = in_onderzoek
        if geboorte is not None:
            self.geboorte = geboorte
        if geheimhouding_persoonsgegevens is not None:
            self.geheimhouding_persoonsgegevens = geheimhouding_persoonsgegevens

    @property
    def burgerservicenummer(self):
        """Gets the burgerservicenummer of this Ouder.  # noqa: E501


        :return: The burgerservicenummer of this Ouder.  # noqa: E501
        :rtype: str
        """
        return self._burgerservicenummer

    @burgerservicenummer.setter
    def burgerservicenummer(self, burgerservicenummer):
        """Sets the burgerservicenummer of this Ouder.


        :param burgerservicenummer: The burgerservicenummer of this Ouder.  # noqa: E501
        :type: str
        """

        self._burgerservicenummer = burgerservicenummer

    @property
    def geslachtsaanduiding(self):
        """Gets the geslachtsaanduiding of this Ouder.  # noqa: E501


        :return: The geslachtsaanduiding of this Ouder.  # noqa: E501
        :rtype: GeslachtEnum
        """
        return self._geslachtsaanduiding

    @geslachtsaanduiding.setter
    def geslachtsaanduiding(self, geslachtsaanduiding):
        """Sets the geslachtsaanduiding of this Ouder.


        :param geslachtsaanduiding: The geslachtsaanduiding of this Ouder.  # noqa: E501
        :type: GeslachtEnum
        """

        self._geslachtsaanduiding = geslachtsaanduiding

    @property
    def ouder_aanduiding(self):
        """Gets the ouder_aanduiding of this Ouder.  # noqa: E501


        :return: The ouder_aanduiding of this Ouder.  # noqa: E501
        :rtype: OuderAanduidingEnum
        """
        return self._ouder_aanduiding

    @ouder_aanduiding.setter
    def ouder_aanduiding(self, ouder_aanduiding):
        """Sets the ouder_aanduiding of this Ouder.


        :param ouder_aanduiding: The ouder_aanduiding of this Ouder.  # noqa: E501
        :type: OuderAanduidingEnum
        """

        self._ouder_aanduiding = ouder_aanduiding

    @property
    def datum_ingang_familierechtelijke_betrekking(self):
        """Gets the datum_ingang_familierechtelijke_betrekking of this Ouder.  # noqa: E501


        :return: The datum_ingang_familierechtelijke_betrekking of this Ouder.  # noqa: E501
        :rtype: DatumOnvolledig
        """
        return self._datum_ingang_familierechtelijke_betrekking

    @datum_ingang_familierechtelijke_betrekking.setter
    def datum_ingang_familierechtelijke_betrekking(self, datum_ingang_familierechtelijke_betrekking):
        """Sets the datum_ingang_familierechtelijke_betrekking of this Ouder.


        :param datum_ingang_familierechtelijke_betrekking: The datum_ingang_familierechtelijke_betrekking of this Ouder.  # noqa: E501
        :type: DatumOnvolledig
        """

        self._datum_ingang_familierechtelijke_betrekking = datum_ingang_familierechtelijke_betrekking

    @property
    def naam(self):
        """Gets the naam of this Ouder.  # noqa: E501


        :return: The naam of this Ouder.  # noqa: E501
        :rtype: Naam
        """
        return self._naam

    @naam.setter
    def naam(self, naam):
        """Sets the naam of this Ouder.


        :param naam: The naam of this Ouder.  # noqa: E501
        :type: Naam
        """

        self._naam = naam

    @property
    def in_onderzoek(self):
        """Gets the in_onderzoek of this Ouder.  # noqa: E501


        :return: The in_onderzoek of this Ouder.  # noqa: E501
        :rtype: OuderInOnderzoek
        """
        return self._in_onderzoek

    @in_onderzoek.setter
    def in_onderzoek(self, in_onderzoek):
        """Sets the in_onderzoek of this Ouder.


        :param in_onderzoek: The in_onderzoek of this Ouder.  # noqa: E501
        :type: OuderInOnderzoek
        """

        self._in_onderzoek = in_onderzoek

    @property
    def geboorte(self):
        """Gets the geboorte of this Ouder.  # noqa: E501


        :return: The geboorte of this Ouder.  # noqa: E501
        :rtype: Geboorte
        """
        return self._geboorte

    @geboorte.setter
    def geboorte(self, geboorte):
        """Sets the geboorte of this Ouder.


        :param geboorte: The geboorte of this Ouder.  # noqa: E501
        :type: Geboorte
        """

        self._geboorte = geboorte

    @property
    def geheimhouding_persoonsgegevens(self):
        """Gets the geheimhouding_persoonsgegevens of this Ouder.  # noqa: E501

        Gegevens mogen niet worden verstrekt aan derden / maarschappelijke instellingen.   # noqa: E501

        :return: The geheimhouding_persoonsgegevens of this Ouder.  # noqa: E501
        :rtype: bool
        """
        return self._geheimhouding_persoonsgegevens

    @geheimhouding_persoonsgegevens.setter
    def geheimhouding_persoonsgegevens(self, geheimhouding_persoonsgegevens):
        """Sets the geheimhouding_persoonsgegevens of this Ouder.

        Gegevens mogen niet worden verstrekt aan derden / maarschappelijke instellingen.   # noqa: E501

        :param geheimhouding_persoonsgegevens: The geheimhouding_persoonsgegevens of this Ouder.  # noqa: E501
        :type: bool
        """

        self._geheimhouding_persoonsgegevens = geheimhouding_persoonsgegevens

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, Ouder):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Ouder):
            return True

        return self.to_dict() != other.to_dict()
