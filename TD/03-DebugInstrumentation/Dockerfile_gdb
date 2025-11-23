# Use Debian as the base image
FROM debian:latest

# Update package list and install GCC and GDB
RUN apt-get update && apt-get install -y \
    gcc \
    gdb \
    && apt-get clean

# Set working directory inside the container
WORKDIR /app

# Copy rand.c to the working directory
COPY factorial.c .

# Compile rand.c with debug symbols
RUN gcc -g -o factorial factorial.c

# Default command: Open a shell
CMD ["/bin/bash"]