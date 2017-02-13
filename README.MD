#animal-disease



###Database and Redis:


```
drop database if exists animal_disease;
create database animal_disease DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

redis-cli
>>
auth: redis-cli -a {redis password} keys "*" | grep topie_animal_disease_ | xargs redis-cli -a {redis password}} del
none auth : redis-cli -a {redis password} keys "*" | grep topie_animal_disease_ | xargs redis-cli -a {redis password}} del

```
**Redis-server** is required! 
Start redis server and edit **config/properties/redis.properties** !

Edit **/static/application/js/app.js** and set your projectName!
###Start the project and enjoy it!

###Build-in user:
```
User - user:user
Admin - admin:admin
```
