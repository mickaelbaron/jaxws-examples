# Projet JAXWS-NotebookWebServiceAsyncClient

Un simple exemple qui montre comment utiliser la bibliothèque JAX-WS pour le développement d'un client de services web de type étendu (ou encore appelés SOAP) avec le langage Java pour une invocation asynchrone des opérations.

Le service web appelé fait référence au projet [jaxws-notebookwebservice](https://github.com/mickaelbaron/jaxws-notebookwebservice) contenant quatre opérations qui acceptent et retournent des types simples et objets. L'invocation se fera en mode asynchrone.

## Comment compiler

- Compiler et exécuter le projet [jaxws-notebookwebservice](https://github.com/mickaelbaron/jaxws-notebookwebservice). Voir le fichier _README.md_ associé au dépôt pour plus de détails. Pour information, l'adresse d'invocation du service web sera fixée à <http://localhost:8080/notebookwebservice/notebook>.

- Lancer la compilation et la création du fichier _.jar_ :

```bash
mvn clean package
```

## Comment exécuter

> Nous supposons que le service web étendu du projet [jaxws-notebookwebservice](https://github.com/mickaelbaron/jaxws-notebookwebservice) est toujours en exécution.

- Depuis la racine du projet, exécuter la ligne de commmande suivante :

```bash
java -cp "target/classes:target/dependency/*" fr.mickaelbaron.notebookwebserviceasyncclient.NotebookServiceAsyncClient
```
