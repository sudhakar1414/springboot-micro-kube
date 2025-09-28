Connect Postgres Sql DB in docker: docker network create pgnet docker run -d
--name postgres
--network pgnet
-e POSTGRES_DB=mydb
-e POSTGRES_USER=myuser
-e POSTGRES_PASSWORD=mypassword
postgres:15 docker run -d
--name pgadmin
--network pgnet
-e PGADMIN_DEFAULT_EMAIL=admin@admin.com
-e PGADMIN_DEFAULT_PASSWORD=admin
-p 5050:80
dpage/pgadmin4 Host name/address: postgres ← this is the container name Port: 5432 Username: myuser Password: mypassword
