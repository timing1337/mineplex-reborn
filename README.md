# mineplex-reborn

## Credits:
- nekoli, for the maps!

## Before compiling
Some feature might be stripped from the original source due to lack of resources (multi protocol support, missing resources...)
Feel free to add them back by checking git diff or even better recompile everything from [**original source**](https://git.crepe.moe/timing/mineplex-original)

## Requirements
1. [Java 8](https://adoptium.net/temurin/releases/)
2. [Redis](https://redis.io/docs/install/install-redis/)
3. [MySQL](https://www.mysql.com/)
4. API Server (You can use [fakeplex-api](https://github.com/KyleS1872/fakeplex-api) or [MineplexMonitor](https://github.com/timing1337/MineplexMonitor))
5. [ViaVersion](https://ci.viaversion.com/job/ViaVersion/)

## Compiling
1. Clone the repo
2. Change spigot path to your ``libs\spigot-1.8.8-1.9-SNAPSHOT.jar`` and ``libs\bungeecord-bootstrap-1.8-SNAPSHOT.jar`` in pom.xml

```
<dependency>
    <groupId>com.mineplex</groupId>
    <artifactId>spigot</artifactId>
    <version>1.8.8-1.9-SNAPSHOT</version>
    <scope>system</scope>
    <systemPath>path\file\libs\spigot-1.8.8-1.9-SNAPSHOT.jar</systemPath>
</dependency>
```

```
<dependency>
    <groupId>net.md-5</groupId>
    <artifactId>bungeecord-bootstrap</artifactId>
    <version>1.8-SNAPSHOT</version>
    <scope>system</scope>
    <systemPath>path\file\libs\bungeecord-bootstrap-1.8-SNAPSHOT.jar</systemPath>
</dependency>
```

3. ``mvn install``