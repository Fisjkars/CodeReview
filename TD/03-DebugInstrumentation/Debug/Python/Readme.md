# Debugging Python in VS Code with Docker and debugpy (port 5678)

## Prerequisites

- VS Code with Python extension

## Build the java container

Build and run:

```bash
docker build -t python-debug .
docker run --rm -it -p5678:5678 python-debug 
```

## VS Code launch.json (Attach to debugpy)

Create or update `.vscode/launch.json` in the vscode root folder:

```json
{
    "version": "0.2.0",
    "configurations": [
        {
            "name": "Attach to debugpy (Docker)",
            "type": "python",
            "request": "attach",
            "connect": {
                "host": "localhost",
                "port": 5678
            },
            "justMyCode": true,
            "pathMappings": [
                {
                    "localRoot": "${workspaceFolder}/TD/03-DebugInstrumentation/Debug/Python",
                    "remoteRoot": "/app"
                }
            ]
        }
    ]
}
```