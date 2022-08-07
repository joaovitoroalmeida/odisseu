# ODISSEU

//Description here


### RUN APP WITH DOCKER
 >**Run command:** ``make start`` this command is responsibility to start the **docker-compose** with
app and database configurations.

### RUN APP WITH IDE
 > **For run app local using an IDE it's necessary configure environment and VM Options:**
 > 1. Environment
 >    - _**DB_PASSWORD**_=helpcar-customer-local
 >    - _**DB_USER**_=helpcar-customer-local
 > 2. VM Options
 >    - -Dspring.profiles.active=local

### MAKE FILE COMMANDS
> 1. **Build app**
>      - make gradle.build
> 2. **Run tests**
>      - make gradle.test
> 3. **Up app**
>      - make start 
> 4. **Down app**
>      - make stop
  
 
