FROM openjdk:11-jre-slim

RUN mkdir /helpcar-customer-prod

WORKDIR /helpcar-customer

COPY webservice/build/libs/helpcar-customer-webservice-1.0.0.jar /helpcar-customer/helpcar-customer.jar

CMD java -Dserver.port=$PORT -Dspring.profiles.active=dev -jar helpcar-customer.jar