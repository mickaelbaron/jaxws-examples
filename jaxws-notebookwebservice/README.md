# Projet JAXWS-NotebookWebService

Un simple exemple qui montre comment utiliser la bibliothèque JAX-WS pour le développement de services web de type étendu (ou encore appelés SOAP) avec le langage Java.

Le service web développé dans ce dépôt contient quatre opérations qui acceptent et retournent des types simples et objets.

## Comment compiler

- Lancer la compilation et la création du fichier _.jar_ :

```bash
mvn clean package
```

## Comment exécuter

- Éxecuter le programme Java en ajoutant toutes les dépendances nécessaires :

```bash
java -cp "target/classes:target/dependency/*" fr.mickaelbaron.notebookwebservice.NotebookServiceSOAPPublish
```

- Depuis un navigateur web, saisir l'URL <http://localhost:8080/notebookwebservice/notebook?wsdl> pour afficher le contrat WSDL.

Pour exécuter les opérations du service web étendu, vous pouvez utiliser un outil comme SOAP-UI : <https://www.soapui.org/>.
