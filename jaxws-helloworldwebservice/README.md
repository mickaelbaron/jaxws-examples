# Projet JAXWS-HelloWorldWebService

Un simple exemple qui montre comment utiliser la bibliothèque JAX-WS pour le développement de services web de type étendu (ou encore appelés SOAP) avec le langage Java. Nous montrons également comment construire un fichier de déploiement WAR et comment le déployer avec un conteneur Docker basé sur une image Tomcat.

Le service web développé dans ce dépôt contient deux opérations qui retournent chacune une chaîne de caractères.

## Générer un JAR et exécuter depuis ce JAR

### Comment compiler

* À la racine du projet, exécuter la ligne de commande suivante :

```shellscript
mvn clean package
```

### Comment exécuter

* Toujours depuis la racine du projet, exécuter la ligne de commande suivante :

```java
$ java -cp "target/classes:target/dependency/*" fr.mickaelbaron.helloworldwebservice.HelloWorldServiceSOAPPublish
...
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.sun.xml.bind.v2.runtime.reflect.opt.Injector (file:/Users/baronm/workspacepersowebserviceslabs/jaxws-helloworldwebservice/target/dependency/jaxb-impl-2.3.0.1.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int)
WARNING: Please consider reporting this to the maintainers of com.sun.xml.bind.v2.runtime.reflect.opt.Injector
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
```

> Pour éviter l'avertissement d'un accès par réflexivité de la dépendance _jaxb-impl-x.y.z.jar_ à un module de la JDK, vous pouvez ajouter l'option `com.sun.xml.bind.v2.bytecode.ClassTailor.noOptimize=true`. Cette option désactive une optimisation de performance qui sera supprimée dans la prochaine version de la bibliothèque.

```shellscript
java -Dcom.sun.xml.bind.v2.bytecode.ClassTailor.noOptimize=true -cp "target/classes:target/dependency/*" fr.mickaelbaron.helloworldwebservice.HelloWorldServiceSOAPPublish
```

## Générer un WAR et déployer ce WAR vers un serveur d'application

### Comment compiler

* À la racine du projet, exécuter la ligne de commande suivante pour générer le fichier _.war_ :

```shellscript
mvn clean package -P war
```

### Comment déployer

* Exécuter la ligne de commande suivante pour télécharger l'image Docker correspondant à la version 9 de Tomcat s'exécutant sous un JRE 10

```shellscript
docker pull tomcat:9.0.12-jre10-slim
```

* Exécuter la ligne de commande suivante permettant de créer un conteneur Docker

```shellscript
docker run --rm --name helloworldservice-tomcat -v $(pwd)/target/helloworldwebservice.war:/usr/local/tomcat/webapps/helloworldwebservice.war -it -p 8080:8080 tomcat:9.0.12-jre10-slim
```

## Tester

* Depuis un navigateur web, saisir l'URL `http://localhost:8080/helloworldwebservice/helloworld?wsdl` pour afficher le contrat WSDL.

Pour exécuter les opérations du service web étendu, vous pouvez utiliser un outil comme SOAP-UI : <https://www.soapui.org/>.

