# JAXWS-Exemples

Une série d'exemples qui montre comment utiliser la bibliothèque JAX-WS pour le développement de services web de type étendu (ou encore appelés SOAP) et de clients avec le langage Java.

L'intérêt par ailleurs est de montrer comment utiliser les versions les plus récentes de Java afin de pouvoir continuer à utiliser JAX-WS. En effet, depuis la modularisation de Java (>= Java 9), les modules dédiés aux services web étendus (initialement intégré au JDK depuis la version 6) sont voués à disparaître du JDK (prévus pour Java 11).

> Cet exemple ne supporte pas complètement Java 11 puisque celui-ci ne fournit plus les outils wsimport et wsgen. Par ailleurs, les modules Java (introduit depuis Java 9) ne sont pas utilisés explicitement.

> Ce dépôt est utilisé dans le cadre d'un cours sur les architectures orientées services que je dispense à l'[ISAE-ENSMA](https://www.ensma.fr) et à l'[Université de Poitiers](http://www.univ-poitiers.fr/) en français. Tous les supports de cours et tutoriaux sont disponibles sur ma page Developpez.com : [https://mbaron.developpez.com](https://mbaron.developpez.com/#page_soa).

## Prérequis

* Java 10
* Maven 3.5.3
* Docker

## Ressources

* Site web de JAXWS : <https://javaee.github.io/metro-jax-ws/>
* Source de JAXWS : <https://github.com/javaee/metro-jax-ws>
* JSR 224 : <https://jcp.org/en/jsr/detail?id=224>
