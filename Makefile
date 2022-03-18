COMPOSE_FILE = docker-compose -f

start:
	$(COMPOSE_FILE) docker-compose-local.yml up

stop:
	$(COMPOSE_FILE) docker-compose-local.yml down