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

    {
        "id"         : "web_websiterenderer",
        "level"      : "Easy",
        "status"     : "OK",
        "version"    : "2.0.0",
        "maintainer" : "yassine.bengana_ext@michelin.com",
        "port"       : "40011",
        "enabled"    : true,
        "ctfd": {
            "challenge": {
                "name": "Website Renderer",
                "description": "A web developper wanting to help others kickstart their website created an application that can render templates for anyone.\r\nLuckily, he's aware of the issues that most modern templating engine (like Jinja) suffers from, for this reason he chose an uncommon templating engine.\r\n\r\nSurely it cannot be exploited."
            },
            "flag": {
                "content": "michelinCTF{N3v3r_tru5t_us3r_1nput!!!}"
            },
            "hints": [
                "Have a look at this : https://genshi.readthedocs.io/en/latest/templates/"
            ],
            "attachments": [
            ]
        },
        "build": {
            "image": {
                "name": "websiterenderer",
                "file": "Web/WebsiteRenderer/Dockerfile"
            },
            "docker_compose": {
                "template": "docker-compose-simple.sample",
                "internal_port": "5000",
                "cpus": "1.0",
                "memory": "400M"
            }
        }
    },
    {
        "id"         : "web_whatthephp2",
        "level"      : "Easy",
        "status"     : "OK",
        "version"    : "2.0.0",
        "maintainer" : "paul.amar@michelin.com",
        "port"       : "40012",
        "enabled"    : true,
        "ctfd": {
            "challenge": {
                "name": "What the PHP 2",
                "description": "Include everything, everywhere, anytime."
            },
            "flag": {
                "content": "michelinCTF{LF1_1S_N3V3R_0v3R}"
            },
            "hints": [
                "What does the require_once function do ? "
            ],
            "attachments": [
            ]
        },
        "build": {
            "image": {
                "name": "whatthephp2",
                "file": "Web/WhatThePHP2/Dockerfile"
            },
            "docker_compose": {
                "template": "docker-compose-simple.sample",
                "internal_port": "8080",
                "cpus": "0.3",
                "memory": "200M"
            }
        }
    },
    {
        "id"         : "web_theguesser",
        "level"      : "Medium",
        "status"     : "OK",
        "version"    : "2.0.0",
        "maintainer" : "maxime.escourbiac@michelin.com",
        "port"       : "40013",
        "enabled"    : true,
        "ctfd": {
            "challenge": {
                "name": "TheGuesser",
                "description": "Could you guess the next prediction of Paul Muad'dib ?"
            },
            "flag": {
                "content": "michelinCTF{R4ND0M_1S_N0T_R34LLY_R4ND0M}"
            },
            "hints": [
                "Random is not necessary random.",
                "Focus on the seed."
            ]
        },
        "build": {
            "image": {
                "name": "guesser",
                "file": "Web/TheGuesser/Dockerfile"
            },
            "docker_compose": {
                "template": "docker-compose-simple.sample",
                "internal_port": "8080",
                "cpus": "0.50",
                "memory": "600M"
            }
        }
    },
    {
        "id"         : "web_springbootapi",
        "level"      : "Medium",
        "status"     : "OK",
        "version"    : "2.0.0",
        "maintainer" : "maxence.schmitt1@michelin.com",
        "port"       : "40014",
        "enabled"    : true,
        "ctfd": {
            "challenge": {
                "name": "Springboot API",
                "description": "Look at my coffee API!!\n\rThe flag is inside \"flag.txt\""
            },
            "flag": {
                "content": "michelinCTF{C0mP0n3ntW!thKn0wnVu7n3r4b!l!ty}"
            },
            "hints": [
                "pom.xml",
                "CVE-2018-1259"
            ]
        },
        "build": {
            "image": {
                "name": "springbootapi",
                "file": "Web/Springboot_API/Dockerfile"
            },
            "docker_compose": {
                "template": "docker-compose-simple.sample",
                "internal_port": "8080",
                "cpus": "0.3",
                "memory": "400M"
            }
        }
    },
    {
        "id"         : "web_canyouguessthehash",
        "level"      : "Medium",
        "status"     : "OK",
        "version"    : "2.0.0",
        "maintainer" : "maxence.schmitt@michelin.com",
        "port"       : "40015",
        "enabled"    : true,
        "ctfd": {
            "challenge": {
                "name": "Can you guess the hash",
                "description": "Can you guess the hash?<br/>To help you, I am giving you the source code!"
            },
            "flag": {
                "content": "michelinCTF{BeCarefulOfTheTypeOfVarabiabl3}"
            },
            "hints": [
                "Type of variables are important"
            ],
            "attachments": [
            ]
        },
        "build": {
            "image": {
                "name": "canyouguessthehash",
                "file": "Web/CanYouGuessTheHash/Dockerfile"
            },
            "docker_compose": {
                "template": "docker-compose-simple.sample",
                "internal_port": "8080",
                "cpus": "0.3",
                "memory": "200M"
            }
        }
    },
    {
        "id"         : "web_dihydrogen",
        "level"      : "Medium",
        "status"     : "OK",
        "version"    : "2.0.0",
        "maintainer" : "maxime.escourbiac@michelin.com",
        "port"       : "40016",
        "enabled"    : true,
        "ctfd": {
            "challenge": {
                "name": "Dihydrogen",
                "description": "Our main dev created a Springboot starter pack for accelerating our project init. "
            },
            "flag": {
                "content": "michelinCTF{N3V3R_3XP0S3_Y0UR_H2C0N50L3_4NYM0R3}"
            },
            "hints": [
                "The dev let the H2Console online",
                "ALIAS is amazing H2 feature."
            ],
            "attachments": [
            ]
        },
        "build": {
            "image": {
                "name": "dihydrogen",
                "file": "Web/Dihydrogen/Dockerfile"
            },
            "docker_compose": {
                "template": "docker-compose-simple.sample",
                "internal_port": "8080",
                "cpus": "0.4",
                "memory": "200M"
            }
        }
    },
    {
        "id"         : "web_holygrail2",
        "level"      : "Medium",
        "status"     : "OK",
        "version"    : "2.0.0",
        "maintainer" : "maxime.escourbiac@michelin.com",
        "port"       : "40017",
        "enabled"    : true,
        "ctfd": {
            "challenge": {
                "name": "Holy Grail v2!",
                "description": "Could you retrieve company super secret in the fixed version?"
            },
            "flag": {
                "content": "michelinCTF{JWT_W3AK_SECRET_1S_N0T_S4FE}"
            },
            "hints": [
            ],
            "attachments": [
            ]
        },
        "build": {
            "image": {
                "name": "holygrailv2",
                "file": "Web/HolyGrail2/Dockerfile"
            },
            "docker_compose": {
                "template": "docker-compose-simple.sample",
                "internal_port": "8080",
                "cpus": "0.3",
                "memory": "200M"
            }
        }
    },
    {
        "id"         : "web_breakauth",
        "level"      : "Medium",
        "status"     : "OK",
        "version"    : "2.0.0",
        "maintainer" : "maxence.schmitt1@michelin.com",
        "port"       : "40018",
        "enabled"    : true,
        "ctfd": {
            "challenge": {
                "name": "Break the auth!",
                "description": "Can you break the authentication ? <br>  To help you, I am giving you the source code!"
            },
            "flag": {
                "content": "michelinCTF{Th!5_!5_M4gIc!!!}"
            },
            "hints": [
            ],
            "attachments": [
            ]
        },
        "build": {
            "image": {
                "name": "breakauth",
                "file": "Web/Breakauth/Dockerfile"
            },
            "docker_compose": {
                "template": "docker-compose-simple.sample",
                "internal_port": "8080",
                "cpus": "0.3",
                "memory": "200M"
            }
        }
    },
    {
        "id"         : "web_logger",
        "level"      : "Medium",
        "status"     : "OK",
        "version"    : "2.0.0",
        "maintainer" : "maxime.escourbiac@michelin.com",
        "port"       : "40019",
        "enabled"    : true,
        "ctfd": {
            "challenge": {
                "name": "Logger",
                "description": "The security team asked to add tracability in the login page."
            },
            "flag": {
                "content": "michelinCTF{H3Y_Y3S_L0G4SH3LL_M4D3_U5_CR4ZY}"
            },
            "hints": [
                "Look at main 0-day in 2021.",
                "The vulnerability was everywhere."
            ],
            "attachments": [
            ]
        },
        "build": {
            "image": {
                "name": "logger",
                "file": "Web/Logger/Dockerfile"
            },
            "docker_compose": {
                "template": "docker-compose-simple.sample",
                "internal_port": "8080",
                "cpus": "0.5",
                "memory": "500M"
            }
        }
    },
    {
        "id"         : "web_rickandmorty",
        "level"      : "Medium",
        "status"     : "OK",
        "version"    : "2.0.0",
        "maintainer" : "maxime.escourbiac@michelin.com",
        "port"       : "40020",
        "enabled"    : true,
        "ctfd": {
            "challenge": {
                "name": "Rick and Morty",
                "description": "Could you break the solution used by Michelin pentesters ? (Challengers/CTF@Bib1!)"
            },
            "flag": {
                "content": "michelinCTF{3V1L_P1CKL3_R1CK_1S_3V1L!!!}"
            },
            "hints": [
            ],
            "attachments": [
            ]
        },
        "build": {
            "image": {
                "name": "rickandmorty",
                "file": "Web/RickAndMorty/Dockerfile"
            },
            "docker_compose": {
                "template": "docker-compose-simple.sample",
                "internal_port": "8000",
                "cpus": "0.3",
                "memory": "300M"
            }
        }
    },
    {
        "id"         : "web_springbootactuator",
        "level"      : "Hard",
        "status"     : "OK",
        "version"    : "2.0.0",
        "maintainer" : "maxime.escourbiac@michelin.com",
        "port"       : "40021",
        "enabled"    : true,
        "ctfd": {
            "challenge": {
                "name": "Actuator",
                "description": "Our main dev created a Springboot starter pack for accelerating our project init."
            },
            "flag": {
                "content": "michelinCTF{D33P_1NT0_J0L0K1A_W1TH_4CTUAT0R}"
            },
            "hints": [
                "Do you know what is jolokia ?"
            ]
        },
        "build": {
            "image": {
                "name": "sbstarterpack",
                "file": "Web/Springbootstarterpack/Dockerfile"
            },
            "docker_compose": {
                "template": "docker-compose-simple.sample",
                "internal_port": "8080",
                "cpus": "0.8",
                "memory": "1200M"
            }
        }
    },
    {
        "id"         : "web_graviteelike",
        "level"      : "Hard",
        "status"     : "OK",
        "version"    : "2.0.0",
        "maintainer" : "maxime.escourbiac@michelin.com",
        "port"       : "40022",
        "enabled"    : true,
        "ctfd": {
            "challenge": {
                "name": "Gravitee-Like",
                "description": "Our new developer begin to write the new Michelin Social Club website to get the Social Club last amazing content."
            },
            "flag": {
                "content": "michelinCTF{C_35T_4RR1V5_PR35_2_CH3Z_V0U5}"
            },
            "hints": [
                "https://gravitee.io/products/apim/",
                "https://github.com/gravitee-io/issues/issues/2232"
            ],
            "attachments": [
            ]
        },
        "build": {
            "image": {
                "name": "graviteelike",
                "file": "Web/GraviteeLike/Dockerfile"
            },
            "docker_compose": {
                "template": "docker-compose-simple.sample",
                "internal_port": "8080",
                "cpus": "0.5",
                "memory": "600M"
            }
        }
    },
    {
        "id"         : "web_ssofantome",
        "level"      : "Hard",
        "status"     : "OK",
        "version"    : "2.0.0",
        "maintainer" : "maxime.escourbiac@michelin.com",
        "port"       : "40023",
        "enabled"    : true,
        "ctfd": {
            "challenge": {
                "name": "SSO Fantome",
                "description": "Beat that SSO !"
            },
            "flag": {
                "content": "michelinCTF{XX3_1N_550_W45_H3R3_GHOSTBUSTER}"
            },
            "hints": [
            ],
            "attachments": [
            ]
        },
        "build": {
            "image": {
                "name": "ssofantome",
                "file": "Web/SSOFantome/Dockerfile"
            },
            "docker_compose": {
                "template": "docker-compose-simple.sample",
                "internal_port": "8080",
                "cpus": "0.5",
                "memory": "500M"
            }
        }
    },
    {
        "id"         : "web_tomcatmylover",
        "level"      : "Hard",
        "status"     : "OK",
        "version"    : "2.0.0",
        "maintainer" : "maxime.escourbiac@michelin.com",
        "port"       : "40024",
        "enabled"    : true,
        "ctfd": {
            "challenge": {
                "name": "Tomcat My Lover",
                "description": "The Michelin CERT team installed a new portal for publishing responsible disclosure."
            },
            "flag": {
                "content": "michelinCTF{3V3N_T0MC4T_H4D_CR1T1C4L_CV3}"
            },
            "hints": [
                "The application is using a 2020 tomcat.",
                "Commons Collection 3.1 is in the classpath."
            ],
            "attachments": [
            ]
        },
        "build": {
            "image": {
                "name": "tomcatmylover",
                "file": "Web/TomcatMyLover/Dockerfile"
            },
            "docker_compose": {
                "template": "docker-compose-simple.sample",
                "internal_port": "8080",
                "cpus": "0.3",
                "memory": "600M"
            }
        }
    },
    {
        "id"         : "web_websiterenderer2",
        "level"      : "Hard",
        "status"     : "OK",
        "version"    : "2.0.0",
        "maintainer" : "yassine.bengana_ext@michelin.com",
        "port"       : "40025",
        "enabled"    : true,
        "ctfd": {
            "challenge": {
                "name": "Website Renderer 2",
                "description": "The developper behind the application learnt about your shenanigans.\r\nThis time, he decided to implement security restrictions to protect his website against people like you.\r\nHe keeps telling everyone that : \"There is absoltely NO way to get command execution, i'm safe now !\".\r\n\r\nIt's time to prove him wrong !"
            },
            "flag": {
                "content": "michelinCTF{BL4CKL15T5_C4N_B3_BYP4553D!!!}"
            },
            "hints": [
                "Introspection is often necessary."
            ],
            "attachments": [
            ]
        },
        "build": {
            "image": {
                "name": "websiterenderer2",
                "file": "Web/WebsiteRenderer2/Dockerfile"
            },
            "docker_compose": {
                "template": "docker-compose-simple.sample",
                "internal_port": "5000",
                "cpus": "1.0",
                "memory": "400M"
            }
        }
    },
    {
        "id"         : "web_dihydrogen2",
        "level"      : "Extreme",
        "status"     : "OK",
        "version"    : "2.0.0",
        "maintainer" : "maxime.escourbiac@michelin.com",
        "port"       : "40026",
        "enabled"    : true,
        "ctfd": {
            "challenge": {
                "name": "Dihydrogen 2",
                "description": "The security team received a responsible disclosure from an ethical hacker for the first version of the SpringBoot starter pack. Our main dev resticted components installed on the server to fix the issue."
            },
            "flag": {
                "content": "michelinCTF{H2_C0NS0L3_5UCK5N_3V3N_0N_4LP1N3}"
            },
            "hints": [
                "Only static methods can be called.",
                "What about using native library (linux x64)"
            ],
            "attachments": [
            ]
        },
        "build": {
            "image": {
                "name": "dihydrogen2",
                "file": "Web/Dihydrogen2/Dockerfile"
            },
            "docker_compose": {
                "template": "docker-compose-simple.sample",
                "internal_port": "8080",
                "cpus": "0.5",
                "memory": "300M"
            }
        }
    }
]



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
