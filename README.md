# HQSE_3

**[ETAPE 1]**

L’objectif de cette étape sera d’implémenter une session de chat
ou on pourra préciser quel pseudo nous souhaitons utiliser, ainsi qu’un chatbot basique qui ne fera que répondre bonjour ainsi que la date et l’heure lorsqu’on le mentionne, comme sur l’exemple suivant.


shell$ java -jar chatbot.jar -p toto


```[toto] @hello

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

Module Epitech CleanCodeTP jour 3
