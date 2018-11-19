# Projet JAXWS-NotebookWebServiceAsyncClient

Un simple exemple qui montre comment utiliser la bibliothèque JAX-WS pour le développement d'un client de services web de type étendu (ou encore appelés SOAP) avec le langage Java pour une invocation asynchrone des opérations.

Le service web appelé fait référence au projet [jaxws-notebookwebservice](https://github.com/mickaelbaron/jaxws-notebookwebservice) contenant quatre opérations qui acceptent et retournent des types simples et objets. L'invocation se fera en mode asynchrone.

## Comment compiler

* Compiler et exécuter le projet [jaxws-notebookwebservice](https://github.com/mickaelbaron/jaxws-notebookwebservice). Voir le fichier README.md associé au dépôt pour plus de détails. Pour information, l'adresse d'invocation du service web sera fixée à `http://localhost:8080/notebookwebservice/notebook`.

* À la racine du projet, exécuter la ligne de commande suivante :

```shellscript
mvn clean package
```

## Comment exécuter

> Nous supposons que le service web étendu du projet [jaxws-notebookwebservice](https://github.com/mickaelbaron/jaxws-notebookwebservice) est toujours en exécution.

* Depuis la racine du projet, exécuter la ligne de commmande suivante :

```shellscript
$ java -cp "target/classes:target/dependency/*" fr.mickaelbaron.notebookwebserviceasyncclient.NotebookServiceAsyncClient
...
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.sun.xml.bind.v2.runtime.reflect.opt.Injector (file:/Users/baronm/workspacepersowebserviceslabs/jaxws-notebookwebserviceasyncclient/target/dependency/jaxb-impl-2.3.0.1.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int)
WARNING: Please consider reporting this to the maintainers of com.sun.xml.bind.v2.runtime.reflect.opt.Injector
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
true
```

> Pour éviter l'avertissement d'un accès par réflexivité de la dépendance _jaxb-impl-x.y.z.jar_ à un module de la JDK, vous pouvez ajouter l'option `com.sun.xml.bind.v2.bytecode.ClassTailor.noOptimize=true`. Cette option désactive une optimisation de performance qui sera supprimée dans la prochaine version de la bibliothèque.

```shellscript
$ java -Dcom.sun.xml.bind.v2.bytecode.ClassTailor.noOptimize=true -cp "target/classes:target/dependency/*" fr.mickaelbaron.notebookwebserviceasyncclient.NotebookServiceAsyncClient
...
true
```
