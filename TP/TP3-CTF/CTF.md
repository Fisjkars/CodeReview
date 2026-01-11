# TP3 : CTF

## Crypto

### TicketGen

Grab the VIP ticket to beat this challenge !

Hint : Comments could be found inside the QRCode.

```bash
docker run --name crypto_ticketgen -p 8080:8080 --cpus="0.3" --memory="600M" fisjkars/ticketgen:3.0.0
```

### Waterboard

Decrypt this text : 24ded996f66ceeaf775285157158143f69b04b83d91f66b4dd7e9083fc2b5a93ec56ee182d93da01cc0bd9cdf4df4a577065728099a8cb58d50efdf2a3e294f0e550ae6c26f85ecc5c4edc041025749a6be83290754bea030d513ae277967700

Hint : Ask to Oracle.

```bash
docker run --name crypto_waterboard -p 8080:8080 --cpus="1.0" --memory="600M" fisjkars/waterboard:3.0.0
```
