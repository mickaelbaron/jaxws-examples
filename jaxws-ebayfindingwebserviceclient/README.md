# Projet JAXWS-EbayFindingWebServiceClient

Un exemple qui montre comment invoquer des services web étendus de chez eBay avec la bibliothèque JAX-WS et le langage Java. Le service web appelé concerne `FindingService` permettant d'effectuer des recherches sur les articles proposés par eBay.

## Comment configurer

L’utilisation des services web eBay est soumis à une inscription pour obtenir une clé d’autorisation. 

* Identifiez-vous auprès de eBay et créer une clé d'activation depuis ce site : https://developer.ebay.com/DevZone/account/. La clé sera de la forme : `LISIENSM-1a9e-12ds-d4vd-546g00p10d69`.

* Depuis la classe `EBAYFindingWebServiceClient` modifier la valeur de l'attribut `APPID`.

## Comment compiler

* À la racine du projet, exécuter la ligne de commande suivante :

```shellscript
mvn clean package
```

## Comment exécuter

* Toujours depuis la racine du projet, exécuter la ligne de commande suivante :

```java
$ java -cp "target/classes:target/dependency/*" fr.mickaelbaron.ebayfindingwebserviceclient.EBAYFindingWebServiceClient
...
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.sun.xml.bind.v2.runtime.reflect.opt.Injector (file:/Users/baronm/workspacepersowebserviceslabs/jaxws-ebayfindingwebserviceclient/target/dependency/jaxb-impl-2.3.0.1.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int)
WARNING: Please consider reporting this to the maintainers of com.sun.xml.bind.v2.runtime.reflect.opt.Injector
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
```

> Pour éviter l'avertissement d'un accès par réflexivité de la dépendance _jaxb-impl-x.y.z.jar_ à un module de la JDK, vous pouvez ajouter l'option `com.sun.xml.bind.v2.bytecode.ClassTailor.noOptimize=true`. Cette option désactive une optimisation de performance qui sera supprimée dans la prochaine version de la bibliothèque.

```java
$ java -Dcom.sun.xml.bind.v2.bytecode.ClassTailor.noOptimize=true -cp "target/classes:target/dependency/*" fr.mickaelbaron.ebayfindingwebserviceclient.EBAYFindingWebServiceClient

SIGNED x2 George R R Martin A Game Of Thrones Comic #10 1st Print Mike S Miller (http://thumbs4.ebaystatic.com/m/mUiI0CAq6spnAo3a1Hm-eQg/140.jpg)
SIGNED x2 George R R Martin A Game Of Thrones Comic #11 1st Print Mike S Miller  (http://thumbs2.ebaystatic.com/m/mhjaUVMuzxvrSF7WgHv1HDg/140.jpg)
Game of Thrones 5 - Ein grimmiger Feind, ein treuer Freund (26.06.2017, HC) (http://thumbs1.ebaystatic.com/m/mf9Ol7W364vMKQyw6X0nzkA/140.jpg)
SIGNED x2 George R R Martin A Game Of Thrones Comic #12 1st Print Mike S Miller (http://thumbs3.ebaystatic.com/m/mccRJpxxEV1n_QxP_gvZmuQ/140.jpg)
VANITY FAIR magazine GAME OF THRONES Collector's Issue April 2014 RARE OOP (http://thumbs3.ebaystatic.com/m/mx1wtuHLVFpmg4cogo9wlwA/140.jpg)
TV & AND SATELLITE WEEK UK MAGAZINE x TWO.GAME OF THRONES.x2 MAGAZINES.B2809 (http://thumbs3.ebaystatic.com/m/mCCg-SgDVkr7YcTcWn6FKBQ/140.jpg)
SIGNED x2 George R R Martin A Game Of Thrones Comic #15 1st Print Mike S Miller (http://thumbs2.ebaystatic.com/m/mM90uz3tM-H7V_MQWl6IAzw/140.jpg)
...
```
