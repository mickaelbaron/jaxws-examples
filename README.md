# JAXWS-Exemples

Une série d'exemples qui montre comment utiliser la bibliothèque JAX-WS pour le développement de services web de type étendu (ou encore appelés SOAP) et de clients avec le langage Java.

L'intérêt par ailleurs est de montrer comment utiliser les versions les plus récentes de Java afin de pouvoir continuer à utiliser JAX-WS. En effet, depuis Java 11, les packages dédiés aux services web étendus (initialement intégrés au JDK depuis la version 6) ont été supprimés. Les outils **wsimport** et **wsgen** ne sont donc plus fournis, mais la génération (wsdl et classes Java) est réalisée à partir d'un plugin Maven. Ce dépôt intègre également la transisition des packages `javax` en `jakarta` débutée à partir de 2018.

> Ce dépôt est utilisé dans le cadre d'un cours sur les architectures orientées services que je dispense à l'[ISAE-ENSMA](https://www.ensma.fr) et à l'[Université de Poitiers](http://www.univ-poitiers.fr/) en français. Tous les supports de cours et tutoriaux sont disponibles sur ma page Developpez.com : [https://mbaron.developpez.com](https://mbaron.developpez.com/#page_soa).

## Prérequis

- Java 11
- Maven 3
- Docker

## Ressources

- Site web de JAXWS : <https://javaee.github.io/metro-jax-ws/>
- Source de JAXWS : <https://github.com/javaee/metro-jax-ws>
- JSR 224 : <https://jcp.org/en/jsr/detail?id=224>

## Contribuer

Vos contributions sont les bienvenues ! Vous pouvez aider à perfectionner ce dépôt en proposant des optimisations ou en signalant des anomalies via les issues et les pull requests.

## Soutenir mon travail

Afin de pérenniser le développement de ce travail, un compte BuyMeACoffee est à votre disposition pour soutenir mes efforts de création.

[![Soutenir sur BuyMeACoffee](https://img.shields.io/badge/Buy%20Me%20a%20Coffee-Soutenir-orange?style=flat-square&logo=buy-me-a-coffee)](https://www.buymeacoffee.com/mickaelbaron)

## Droits d'auteur et licence d'utilisation

![Creative Commons BY-SA](https://mirrors.creativecommons.org/presskit/buttons/88x31/png/by-sa.png)

Le contenu de ce dépôt est distribués sous [licence Creative Commons BY-SA 4.0](https://creativecommons.org/licenses/by-sa/4.0/) et les droits d'auteur appartiennent à Mickaël Baron. Consultez le fichier [LICENSE](LICENSE) pour plus de détails.

