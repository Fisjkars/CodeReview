# Debugging Java in VS Code with JDWP on a Container

## Prerequisites

- Visual Studio Code with : Extension Pack for Java

## Build the java container

Build and run:

```bash
docker build -t java-debug .
docker run --rm -it -p5005:5005 java-debug 
```

## VS Code Attach Configuration

Create or update `.vscode/launch.json` in the vscode root folder :

```json
{
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "name": "Attach to Container (JDWP :5005)",
            "request": "attach",
            "hostName": "localhost",
            "port": 5005,
            "projectName": "blah"
        }
    ]
}
```
