docker:
	- docker-compose up -d

build:
	- docker-compose exec java bash -c "cd /app && mvn package -DskipTests && java -cp target/chess-1.0-SNAPSHOT.jar catho.App"