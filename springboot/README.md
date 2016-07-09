Show a java 8 spring boot app working in docker.

- http://containertutorials.com/docker-compose/spring-boot-app.html
- https://github.com/etiennepeiniau/compose-spring-boot-admin

https://github.com/spotify/docker-maven-plugin
https://spring.io/guides/gs/spring-boot-docker/
https://www.alooma.com/blog/building-dockers

in maven settings.xml add

```
<servers>
  <server>
    <id>docker-hub</id>
    <username>foo</username>
    <password>secret-password</password>
    <configuration>
      <email>foo@foo.bar</email>
    </configuration>
  </server>
</servers>
```

http://stackoverflow.com/questions/27767264/how-to-dockerize-maven-project-and-how-many-ways-to-accomplish-it

mac os s87t

https://github.com/spotify/docker-maven-plugin/issues/218
http://stackoverflow.com/questions/35549854/maven-package-dockerbuild-connection-refused

```
docker-machine env
```

run

```
eval $(docker-machine env)
```	 
 you can also set

```
<dockerHost>https://192.168.99.100:2376</dockerHost>
```
