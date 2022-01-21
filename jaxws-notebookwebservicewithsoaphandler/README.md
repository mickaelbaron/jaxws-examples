# Projet JAXWS-NotebookWebServiceWithSOAPHandler

Un simple exemple qui montre comment utiliser la bibliothèque JAX-WS pour le développement de services web de type étendu (ou encore appelés SOAP) avec le langage Java en utilisant des intercepteurs (handlers).

Le service web développé dans ce dépôt contient quatre opérations qui acceptent et retournent des types simples et objets.

## Comment compiler

* Lancer la compilation et la création du fichier _.jar_ :

```bash
$ mvn clean package
```

## Comment exécuter

* Toujours depuis la racine du projet, exécuter la ligne de commmande suivante :

```bash
$ java -cp "target/classes:target/dependency/*" fr.mickaelbaron.notebookwebservicewithsoaphandler.NotebookServiceSOAPPublish
```

* Pour vérifier le fonctionnement de l'intercepteur, invoquer une opération du service web étendu exposé à cette adresse : http://localhost:8080/notebookwebservicewithsoaphandler/notebook (utiliser par exemple SOAP-UI : <https://www.soapui.org/>).
