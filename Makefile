COMPOSE_FILE = docker-compose -f
GRADLE = ./gradlew

# Start app
start:
	$(COMPOSE_FILE) docker-compose.yml up

stop:
	$(COMPOSE_FILE) docker-compose.yml down

gradle.build:
	$(GRADLE) clean build

#Run all tests
gradle.test:
	$(GRADLE) test