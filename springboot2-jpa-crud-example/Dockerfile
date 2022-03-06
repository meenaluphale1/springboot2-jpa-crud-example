FROM maven:3 as build

WORKDIR  /app

COPY . /app

RUN ["mvn","package","-DskipTests"]

FROM openjdk:8-jdk

WORKDIR /app

COPY --from=build /app/target/*.jar /app/api-app.jar

EXPOSE 8080

## DB Connection properties AS enviornment variables
## Below values are DEFAULTS, Must be Overidden in deployment artifacts
ENV DBURL=172.17.0.2 DBUSER=meenal DBPASS=Ritwik123 DBNAME=Ritwik123

CMD [ "java","-jar","/app/api-app.jar" ]