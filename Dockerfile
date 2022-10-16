FROM openjdk:11-jre-slim

RUN mkdir /odisseu-production

WORKDIR /odisseu

COPY /modules/webservice/build/libs/odissey-webservice-*.jar /odisseu/odisseu.jar

CMD java -Dserver.port=$PORT -Dspring.profiles.active=production -jar odisseu.jar