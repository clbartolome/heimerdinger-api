# heimerdinger-api Project

## Configuration

Done via Environment Variables (quarkus prod profile - quarkus.profile=prod):

- **DB_HOST**: PostgreSQL host url
- **DB_PORT**: PostgreSQL port
- **DB_NAME**: PostgreSQL database for catalog
- **DB_USER**: PostgreSQL user name
- **DB_PASS**: PostgreSQL user password

## Run Locally

- Create PostgressDB:
```sh
docker run -d --name heimerdinger-db \
  -e POSTGRES_USER=develop \
  -e POSTGRES_PASSWORD=develop \
  -e POSTGRES_DB=heimerdinger-db \
  -p 5432:5432 \
  postgres:10.5
```

- Run Application in development mode:
```shell script
mvn compile quarkus:dev
```