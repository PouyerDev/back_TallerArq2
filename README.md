Como lanzar el proyecto entero:
lanzar mysql
spring
	docker-compose up --build
front 
	docker build -t angular-frontend .
	//docker stop angular-frontend
	docker rm angular-frontend
	docker run -d -p 4220:80 --name angular-frontend angular-frontend
		
