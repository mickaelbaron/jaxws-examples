# Projet JAXWS-HelloWorldQuietWebService

Un simple exemple qui montre comment utiliser la bibliothèque JAX-WS pour le développement de services web de type étendu (ou encore appelés SOAP) avec le langage Java.

Le service web développé dans ce dépôt contient deux opérations qui retournent chacune une chaîne de caractères.

## Comment compiler

- Lancer la compilation et la création du fichier _.jar_ :

```bash
mvn clean package
```

## Comment exécuter

- Éxecuter le programme Java en ajoutant toutes les dépendances nécessaires :

```bash
java -cp "target/classes:target/dependency/*" fr.mickaelbaron.helloworldquietwebservice.HelloWorldServiceSOAPPublish
```

- Depuis un navigateur web, saisir l'URL `http://localhost:8080/helloworldquietwebservice/helloworldquiet?wsdl` pour afficher le contrat WSDL

Pour exécuter les opérations du service web étendu, vous pouvez utiliser un outil comme SOAP-UI : <https://www.soapui.org/>.
