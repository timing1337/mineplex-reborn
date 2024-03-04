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
2. Change ``com.mineplex`` path to your spigot jar
3. ``mvn install``