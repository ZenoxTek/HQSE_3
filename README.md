# HQSE_3
[![Build Status](https://travis-ci.com/ZenoxTek/HQSE_3.svg?branch=Develop)](https://travis-ci.com/ZenoxTek/HQSE_3)

**[ETAPE 1]**

L’objectif de cette étape sera d’implémenter une session de chat
ou on pourra préciser quel pseudo nous souhaitons utiliser, ainsi qu’un chatbot basique qui ne fera que répondre bonjour ainsi que la date et l’heure lorsqu’on le mentionne, comme sur l’exemple suivant.


```
shell$ java -jar chatbot.jar -p toto


[toto] @hello

[hello] Salut toto! Nous sommes Jeudi 25 octobre et il est 14h30. 

[toto] foo

[toto] ++

shell$
```

 

Il vous faudra donc :



* Récupérer la valeur de l’argument “-p”.




* Lancer une session de chat ou l’application attendra que l'utilisateur saisisse son message, on
considère que l’utilisateur a terminé lorsqu’il appuiera sur la touche “Entrer” (astuce: regarder du côté de System.in)




* En cas d’un message égal à @hello, le chatbot répond comme sur l’exemple ci-dessus, en cas d’autre
message, le chatbot ne répond pas.




* Pour quitter la session (et donc terminer l'exécution de l’application), l’utilisateur devra saisir
le message “++”.


**[ETAPE 2]**

Un système de chargement de bots avec traitement des erreurs
Avant d’aller plus loin dans le projet, il vous est demandé de vous
poser un instant et de réfléchir à l’architecture de votre application.

Jusqu'à présent, nous avons eu à utiliser qu’un seul chatbot, cependant,
dans la suite de ce projet, il nous sera possible de discuter avec une multitude de chatbots.

Il va donc falloir pouvoir charger autant de chatbots que nécessaire,
de s’assurer que chaque chatbot a bien un nom unique, de lui transmettre les messages qui lui sont adressés ainsi que les arguments dont il a besoin, de gérer les situations ou le chatbot adressé n’existe pas.

L’exemple suivant montre un exemple d’utilisation de la nouvelle
version.

```
shell$ java -jar chatbot.jar -p toto


[toto] @hello

[hello] Salut toto!

[toto] @time Europe/Paris

[time] Nous sommes Jeudi 25 octobre et il est 14h30.

[toto] @time

[time] Désolé mais il me manque la zone pour afficher l’heure.

[toto] @foo

[system] Je ne connais pas le chatbot @foo!
```


Module Epitech CleanCodeTP jour 3

**CREDITS**

Developpers :

Elodie BERTHAUD
Remi DE LIMA
Benjamin DUHIEU