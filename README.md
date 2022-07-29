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

- Add some data and test:
```sh
# Insert Data
curl -X 'POST' \
  'http://localhost:8080/servers' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{
  "hostName": "win-cli-1",
  "nodeName": "win-cli-1.redhat.com",
  "version": "Microsoft Windows Server 2016 Datacenter",
  "updates": [
    {
      "id": "win-cli-1-KB226761",
      "kb": "KB226761",
      "tittle": "Security Intelligence Update for Microsoft Defender Antivirus - KB226761 (Version 1.371.901.0)",
      "status": "OPEN",
      "categories": "category-1,category-2"
    },
    {
      "id": "win-cli-1-KB226762",
      "kb": "KB226762",
      "tittle": "Security Intelligence Update for Microsoft Defender Antivirus - KB2267612 (Version 1.371.901.0)",
      "status": "CLOSED",
      "categories": "category-1"
    }
  ]
}'

# Review Data
curl -X 'GET' \
  'http://localhost:8080/servers' \
  -H 'accept: application/json' | jq

curl -X 'POST' \
  'http://localhost:8080/servers' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{
  "hostName": "win-cli-1",
  "nodeName": "win-cli-1.redhat.com",
  "version": "Microsoft Windows Server 2016 Datacenter",
  "updates": [
    {
      "id": "win-cli-1-KB226761",
      "kb": "KB226761",
      "tittle": "Security Intelligence Update for Microsoft Defender Antivirus - KB226761 (Version 1.371.901.0)",
      "status": "CLOSED",
      "categories": "category-3"
    }
  ]
}'

# Modify Data
curl -X 'GET' \
  'http://localhost:8080/servers' \
  -H 'accept: application/json' | jq


```