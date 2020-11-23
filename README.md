# Kafa

Blizzard API implementation in Java. Wraps Blizzard API endpoints into POJOs.

## Installation

A jar is located in releases. Each release lists the currently supported endpoints.

Gradle //TODO

## Usage

You first need to register an account with [Blizzard](https://us.battle.net/login/en/) where you can recieve a ClientID and a Client Secret.

Using your ClientID and Client Secret you will generate an authorization token.

//TODO add imports

```java
String clientId     = "...";
String clientSecret = "...";
Token token = API.Authorization.generateToken(clientId, clientSecret);
```

From there you can now use that token to make requests. Ensure realm and character names are all lowercase!

```java
String realm     = "...";
String character = "...";
CharacterStatistics stats = API.ProfileAPI.getCharacterStatistics(realm, character, token);
```

## Contributing
A list of covered endpoints, and endpoints I have yet to cover can be found in the first issue.

## License
[Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0)
