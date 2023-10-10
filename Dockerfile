FROM ubuntu:latest
LABEL authors="joaco"

COPY . .
RUN chmod +x ./gradlew
RUN ./gradlew bootJar --no-daemon

FROM openjdk:17-alpine
EXPOSE 9000
COPY --from=build ./build/libs/RestfakeApplication-0.0.1-SNAPSHOT.jar ./app.jar

ENTRYPOINT ["top", "-b"]