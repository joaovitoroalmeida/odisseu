COMPOSE_FILE = docker-compose -f
GRADLE = ./gradlew

start:
	$(COMPOSE_FILE) docker-compose-local.yml up

stop:
	$(COMPOSE_FILE) docker-compose-local.yml down

gradle.build:
	$(GRADLE) clean build

gradle.test:
	$(GRADLE) test