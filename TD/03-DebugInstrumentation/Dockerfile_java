# Use an official OpenJDK image as the base image
FROM openjdk:26-ea-trixie

# Set the working directory inside the container
WORKDIR /app

# Copy the application JAR file to the container
COPY app.jar /app/app.jar

# Expose the debugging port
EXPOSE 5005

# Command to run the JAR with the Java Debugger (JDWP) enabled
# docker run -p 5005:5005 app-debug
CMD ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005", "-jar", "app.jar"]