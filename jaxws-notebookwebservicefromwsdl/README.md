# Projet JAXWS-NotebookWebServiceFromWSDL

Un simple exemple qui montre comment utiliser la bibliothèque JAX-WS pour le développement de services web de type étendu (ou encore appelés SOAP) avec le langage Java.

Le service web développé dans ce dépôt contient quatre opérations qui acceptent et retournent des types simples et objets.

## Comment compiler (WSDL fourni à partir d'une URL)

* Compiler et exécuter le projet [jaxws-notebookwebservice](https://github.com/mickaelbaron/jaxws-notebookwebservice). Voir le fichier README.md associé au dépôt pour plus de détails.

* Lancer la compilation et la génération des fichiers nécessaire :

```bash
$ mvn clean compile -P url
```

## Comment compiler (WSDL fourni à partir d'un fichier)

Le contrat de description du service web WSDL est stocké dans le répertoire _src/wsdl_.

* À la racine du projet, exécuter la ligne de commande suivante :

```bash
$ mvn clean package -P file
```

## Comment exécuter

* Toujours depuis la racine du projet, exécuter la ligne de commande suivante :

```bash
$ java -cp "target/classes:target/dependency/*" fr.mickaelbaron.notebookwebservicefromwsdl.NotebookServiceSOAPPublish
```

* Depuis un navigateur web, saisir l'URL `http://localhost:8080/notebookwebservicefromwsdl/notebook?wsdl` pour afficher le contrat WSDL.

Pour exécuter les opérations du service web étendu, vous pouvez utiliser un outil comme SOAP-UI : <https://www.soapui.org/>.
