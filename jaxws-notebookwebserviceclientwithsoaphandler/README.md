# Projet JAXWS-NotebookWebServiceAsyncClient

Un simple exemple qui montre comment utiliser la bibliothèque JAX-WS pour le développement d'un client de services web de type étendu (ou encore appelés SOAP) avec le langage Java en utilisant des intercepteurs (handlers).

Le service web appelé fait référence au projet [jaxws-notebookwebservice](https://github.com/mickaelbaron/jaxws-notebookwebservice) contenant quatre opérations qui acceptent et retournent des types simples et objets.

## Comment compiler

Le contrat de description du service web WSDL est stocké dans le répertoire _src/wsdl_. Pour modifier l'adresse d'invocation du service web, modifier la valeur de l'attribut `location` :

```xml
  ...
    <port name="NotebookPort" binding="tns:NotebookPortBinding">
      <soap:address location="http://localhost:8080/notebookwebservice/notebook"/>
    </port>
  ...
```

* Lancer la compilation et la création du fichier _.jar_ :

```bash
$ mvn clean package
```

## Comment exécuter

* Compiler et exécuter le projet [jaxws-notebookwebservice](https://github.com/mickaelbaron/jaxws-notebookwebservice). Voir le fichier README.md associé au dépôt pour plus de détails.

* Depuis la racine du projet, exécuter la ligne de commmande suivante :

```bash
$ java -cp "target/classes:target/dependency/*" fr.mickaelbaron.notebookwebserviceclientwithsoaphandler.NotebookServiceClient
```
