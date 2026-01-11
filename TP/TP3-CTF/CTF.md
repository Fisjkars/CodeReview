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

Hint : Have a look at this : https://genshi.readthedocs.io/en/latest/templates/

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

I’m just copying and pasting with this program. What can go wrong? You can view source here. To access the challenge : `nc localhost 25002``

```bash
docker run --name reverse_storyteller -p 25002:1337 --cpus="0.3" --memory="200M" fisjkars/storyteller:3.0.0
```
