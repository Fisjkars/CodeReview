# Debugging PHP in VS Code with Docker and Xdebug (port 9003)

## Prerequisites

- VS Code with PHP Debug extension (`xdebug.php-debug`)
- Docker installed

## Build and Run the PHP Container

Build and run:

```bash
docker build -t php-debug .
docker run --rm -it -p80:80 -p9003:9003 php-debug
```

The PHP application will be available at `http://localhost:80/sample.php`

## VS Code launch.json (Attach to Xdebug)

Create or update `.vscode/launch.json` in the VS Code root folder:

```json
{
    "version": "0.2.0",
    "configurations": [
        {
            "name": "Listen for Xdebug (Docker)",
            "type": "php",
            "request": "launch",
            "hostname": "127.0.0.1",
            "port": 9003,
            "pathMappings": {
                "/var/www/html": "${workspaceFolder}/TD/03-DebugInstrumentation/Debug/PHP"
            }
        }
    ]
}
```
