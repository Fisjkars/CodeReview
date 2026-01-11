# TP3 : CTF

## Crypto

### [MEDIUM] TicketGen

Grab the VIP ticket to beat this challenge !

Hint : Comments could be found inside the QRCode.

```bash
docker run --name crypto_ticketgen -p 30000:8080 --cpus="0.3" --memory="600M" fisjkars/ticketgen:3.0.0
```

### [HARD] Waterboard

Decrypt this text : 24ded996f66ceeaf775285157158143f69b04b83d91f66b4dd7e9083fc2b5a93ec56ee182d93da01cc0bd9cdf4df4a577065728099a8cb58d50efdf2a3e294f0e550ae6c26f85ecc5c4edc041025749a6be83290754bea030d513ae277967700

Hint : Ask to Oracle.

```bash
docker run --name crypto_waterboard -p 30001:8080 --cpus="1.0" --memory="600M" fisjkars/waterboard:3.0.0
```

## Reverse

### [MEDIUM] Really

This binary is not secure I think you can easily get the flag. To access the challenge : `nc 127.0.0.1 25001`

Hint : Do you know Auverflow ?

```bash
docker run --name reverse_really -p 25001:1337 --cpus="0.3" --memory="200M" fisjkars/really:3.0.0
```

### [MEDIUM] Story Teller

I’m just copying and pasting with this program. What can go wrong? You can view source here. To access the challenge : `nc localhost 25002``

```bash
docker run --name reverse_storyteller -p 25002:1337 --cpus="0.3" --memory="200M" fisjkars/storyteller:3.0.0
```
