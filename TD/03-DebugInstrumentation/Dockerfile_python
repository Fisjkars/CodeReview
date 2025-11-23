# Use the official Python image as the base
FROM python:3.9-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Python script into the container
COPY sample.py /app/sample.py

# Install debugpy for remote debugging
RUN pip install debugpy

# Expose the debugger port (5678)
EXPOSE 5678

# Run the Python script
CMD ["python", "sample.py"]