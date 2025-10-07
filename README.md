Docker Command	Description
"docker build . -t eazybytes/accounts:s4"	To generate a docker image based on a Dockerfile
"docker run -p 8080:8080 eazybytes/accounts:s4"	To start a docker container based on a given image
"docker images"	To list all the docker images present in the Docker server
"docker image inspect image-id"	To display detailed image information for a given image id
"docker image rm image-id"	To remove one or more images for a given image ids
"docker image push docker.io/eazybytes/accounts:s4"	To push an image or a repository to a registry
"docker image pull docker.io/eazybytes/accounts:s4"	To pull an image or a repository from a registry
"docker ps"	To show all running containers
"docker ps -a"	To show all containers including running and stopped
"docker container start container-id"	To start one or more stopped containers
"docker container pause container-id"	To pause all processes within one or more containers
"docker container unpause container-id"	To unpause all processes within one or more containers
"docker container stop container-id"	To stop one or more running containers
"docker container kill container-id"	To kill one or more running containers instantly
"docker container restart container-id"	To restart one or more containers
"docker container inspect container-id"	To inspect all the details for a given container id
"docker container logs container-id"	To fetch the logs of a given container id
"docker container logs -f container-id"	To follow log output of a given container id
"docker container rm container-id"	To remove one or more containers based on container ids
"docker container prune"	To remove all stopped containers
"docker compose up"	Creates and starts containers based on the given Docker Compose file
"docker compose down"	Stops and removes containers, networks, volumes, and images created by up
"docker compose start"	Starts existing (previously created) containers without recreating them
"docker compose stop"	Stops running containers without removing them
"docker run -p 3306:3306 --name accountsdb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=accountsdb -d mysql"	To create a MySQL DB container
"docker run -p 6379:6379 --name eazyredis -d redis"	To create a Redis Container
"docker run -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:22.0.3 start-dev"	To create Keycloak Container
docker run -d --name accountsdb --network pgnet -e POSTGRES_DB=accountsdb -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=Capge7878 -p 5433:5432 postgres:15
docker run -d --name pgadmin1 --network pgnet -e PGADMIN_DEFAULT_EMAIL=admin1@example.com -e PGADMIN_DEFAULT_PASSWORD=admin1 -v pgadmin1_data:/var/lib/pgadmin -p 5050:80 dpage/pgadmin4

docker run -d --name cardsdb --network pgnet -e POSTGRES_DB=cardsdb -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=Capge7878 -p 5434:5432 postgres:15
docker run -d --name pgadmin2 --network pgnet -e PGADMIN_DEFAULT_EMAIL=admin2@example.com -e PGADMIN_DEFAULT_PASSWORD=admin2 -v pgadmin2_data:/var/lib/pgadmin -p 5051:80 dpage/pgadmin4

docker run -d --name loansdb --network pgnet -e POSTGRES_DB=loansdb -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=Capge7878 -p 5435:5432 postgres:15
docker run -d --name pgadmin3 --network pgnet -e PGADMIN_DEFAULT_EMAIL=admin3@example.com -e PGADMIN_DEFAULT_PASSWORD=admin3 -v pgadmin3_data:/var/lib/pgadmin -p 5052:80 dpage/pgadmin4
