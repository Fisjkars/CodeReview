# Debugging Factorial (C) with GDB and DDD in Docker

## Prerequisites

- Docker installed
- Source files: `factorial.c` and `Makefile` (or compile manually)
- Optional: X11 for DDD (host must support X11 forwarding)

## Docker Setup

Build and run:

```bash
docker build -t factorial-debug .
docker run --rm -it factorial-debug /bin/bash
```

## Debug with GDB

Start GDB:

```bash
gdb ./factorial
```

Useful commands:

- `run ARG` — start with input (e.g., `run 5`)
- `break main` — set breakpoint
- `break factorial` — break in function
- `step` / `next` — step into / over
- `continue` — resume
- `print var` — inspect variables
- `backtrace` — call stack
- `info locals` — local variables
- `display expr` — auto-print each stop
- `watch var` — stop on change
- `list` — show source
- `quit` — exit

Example session:

```gdb
(gdb) break factorial
(gdb) run 5
(gdb) print n
(gdb) backtrace
(gdb) step
```
