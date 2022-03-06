## Multi stage build
FROM maven:3 as build
WORKDIR  /app

COPY . /app
RUN ["mvn","package","-DskipTests"]
FROM tomcat:8.0-alpine
COPY --from=build /app/target/MySpringApp.war /usr/local/tomcat/webapps/
EXPOSE 8080
