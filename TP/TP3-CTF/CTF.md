# TP3 : CTF

## Web

### [VeryEasy] Matrix

Neo, Neo, wake up!

```bash
docker run --name web_matrix -p 40001:8080 --cpus="0.3" --memory="200M" fisjkars/matrix:3.0.0
```

### [VeryEasy] What the PHP

Include everything, everywhere, anytime.

Hint : What does the require_once function do ?

```bash
docker run --name web_whatthephp -p 40002:8080 --cpus="0.3" --memory="200M" fisjkars/whatthephp:3.0.0
```

### [Easy] IDOR me if you can!

Will you be able to find the admin user details?

```bash
docker run --name web_idormeifyoucan -p 40003:8000 --cpus="0.3" --memory="200M" fisjkars/idormeifyoucan2:3.0.0
```

### [Easy] Holy Grail

Could you retrieve company super secret?

```bash
docker run --name web_holygrail -p 40004:8080 --cpus="0.3" --memory="200M" fisjkars/holygrail:3.0.0
```

### [Easy] You shall not pass

Will you be able to access my DLINK router?

Hint : Old known vulnerability in DLink router

```bash
docker run --name web_youshallnotpass -p 40005:8080 --cpus="0.3" --memory="200M" fisjkars/youshallnotpass:3.0.0
```

### [Easy] You shall not pass again

This service is only restricted to a specific IP.

Hint : How to set an IP inside HTTP headers

```bash
docker run --name web_youshallnotpassagain -p 40006:8080 --cpus="0.3" --memory="200M" fisjkars/youshallnotpassagain:3.0.0
```

### [Easy] MovieDB

Your favorite movie site doesn't list your most liked films, get admin access to it and add them to the list !

Hint : Sometimes a little injection is enough.

```bash
docker run --name web_moviedb -p 40007:5000 --cpus="1.0" --memory="400M" fisjkars/moviedb:3.0.0
```

### [Easy] Website Renderer

A web developper wanting to help others kickstart their website created an application that can render templates for anyone.
Luckily, he's aware of the issues that most modern templating engine (like Jinja) suffers from, for this reason he chose an uncommon templating engine.
Surely it cannot be exploited.

Hint : Have a look at this : <https://genshi.readthedocs.io/en/latest/templates.html>

```bash
docker run --name web_websiterenderer -p 40008:5000 --cpus="1.0" --memory="400M" fisjkars/websiterenderer:3.0.0
```

### [Easy] What the PHP 2

Include everything, everywhere, anytime.

Hint : What does the require_once function do ?

```bash
docker run --name web_whatthephp2 -p 40009:8080 --cpus="0.3" --memory="200M" fisjkars/whatthephp2:3.0.0
```

### [Medium] The Guesser

Could you guess the next prediction of Paul Muad'dib ?

Hints :

- Random is not necessary random.
- Focus on the seed.

```bash
docker run --name web_theguesser -p 40010:8080 --cpus="0.5" --memory="600M" fisjkars/guesser:3.0.0
```

### [Medium] Springboot API

Look at my coffee API!! The flag is inside `flag.txt`

Hints :

- pom.xml
- CVE-2018-1259

```bash
docker run --name web_springbootapi -p 40011:8080 --cpus="0.3" --memory="400M" fisjkars/springbootapi:3.0.0
```

### [Medium] Can you guess the hash

Can you guess the hash? To help you, I am giving you the source code!

Hints : Type of variables are important

```bash
docker run --name web_canyouguessthehash -p 40012:8080 --cpus="0.3" --memory="400M" fisjkars/canyouguessthehash:3.0.2
```

### [Medium] Dihydrogen

Our main dev created a Springboot starter pack for accelerating our project init.

Hints :

- The dev let the H2Console online
- ALIAS is amazing H2 feature.

```bash
docker run --name web_dihydrogen -p 40013:8080 --cpus="0.4" --memory="200M" fisjkars/dihydrogen:3.0.0
```

### [Medium] Logger

The security team asked to add tracability in the login page.

Hints :

- Look at main 0-day in 2021.
- The vulnerability was everywhere.

```bash
docker run --name web_logger -p 40014:8080 --cpus="0.5" --memory="500M" fisjkars/logger:3.0.0
```

### [Medium] Rick and Morty

The security team asked to add tracability in the login page.

Hints : Could you break the solution used by Michelin pentesters ? (Challengers/CTF@Bib1!)

```bash
docker run --name web_rickandmorty -p 40015:8000 --cpus="0.3" --memory="300M" fisjkars/rickandmorty:3.0.0
```

### [Hard] SpringBoot Starter Pack

Our main dev created a Springboot starter pack for accelerating our project init.

Hints : CDo you know what is jolokia ?

```bash
docker run --name web_springbootstarterpack -p 40016:8080 --cpus="0.8" --memory="1200M" fisjkars/springbootstarterpack:3.0.0
```

### [Hard] Gravitee-Like

Our new developer begin to write the new Michelin Social Club website to get the Social Club last amazing content.

Hints :

- <https://gravitee.io/products/apim/>
- <https://github.com/gravitee-io/issues/issues/2232>

```bash
docker run --name web_graviteelike -p 40017:8080 --cpus="0.5" --memory="600M" fisjkars/graviteelike:3.0.0
```

### [Hard] SSO Fantome

Beat that SSO !

```bash
docker run --name web_ssofantome -p 40018:8080 --cpus="0.5" --memory="500M" fisjkars/ssofantome:3.0.0
```

### [Hard] Website Renderer 2

The developper behind the application learnt about your shenanigans.\r\nThis time, he decided to implement security restrictions to protect his website against people like you.
He keeps telling everyone that there is absoltely NO way to get command execution, i'm safe now !

```bash
docker run --name web_websiterenderer2 -p 40019:5000 --cpus="1.0" --memory="400M" fisjkars/websiterenderer2:3.0.0
```

### [Extreme] Dihydrogen 2

The security team received a responsible disclosure from an ethical hacker for the first version of the SpringBoot starter pack. Our main dev resticted components installed on the server to fix the issue.

```bash
docker run --name web_dihydrogen2 -p 40020:5000 --cpus="0.5" --memory="300M" fisjkars/dihydrogen2:3.0.0
```

## Crypto

### [Medium] TicketGen

Grab the VIP ticket to beat this challenge !

Hint : Comments could be found inside the QRCode.

```bash
docker run --name crypto_ticketgen -p 30000:8080 --cpus="0.3" --memory="600M" fisjkars/ticketgen:3.0.0
```

### [Hard] Waterboard

Decrypt this text : 24ded996f66ceeaf775285157158143f69b04b83d91f66b4dd7e9083fc2b5a93ec56ee182d93da01cc0bd9cdf4df4a577065728099a8cb58d50efdf2a3e294f0e550ae6c26f85ecc5c4edc041025749a6be83290754bea030d513ae277967700

Hint : Ask to Oracle.

```bash
docker run --name crypto_waterboard -p 30001:8080 --cpus="1.0" --memory="600M" fisjkars/waterboard:3.0.0
```

## Reverse

### [Medium] Really

This binary is not secure I think you can easily get the flag. To access the challenge : `nc 127.0.0.1 25001`

Hint : Do you know Auverflow ?

```bash
docker run --name reverse_really -p 25001:1337 --cpus="0.3" --memory="200M" fisjkars/really:3.0.0
```

### [Medium] Story Teller

I’m just copying and pasting with this program. What can go wrong? You can view source here. To access the challenge : `nc localhost 25002`

```bash
docker run --name reverse_storyteller -p 25002:1337 --cpus="0.3" --memory="200M" fisjkars/storyteller:3.0.0
```
