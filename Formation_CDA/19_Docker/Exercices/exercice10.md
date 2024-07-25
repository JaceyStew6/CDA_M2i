# Docker compose

``` yml
services:
  db:
    image: mysql
    container_name: local_mysqldb
    restart: always
    ports:
      - "6033:3306"
    environment:
      MYSQL_DATABASE: mydatabase
      # MYSQL_USER: root
      MYSQL_ROOT_PASSWORD: Root
    volumes:
      - db_data:/var/lib/mysql
    networks:
      - mysql-phpmyadmin
  
  phpmyadmin:
    depends_on:
      - db
    image: phpmyadmin
    container_name: phpmyadmin_container
    restart: always
    ports:
      - "8080:80"
    environment:
      PMA_HOST: local_mysqldb
      # PMA_USER: root
      # PMA_PASSWORD: root
    networks:
      - mysql-phpmyadmin


volumes:
  db_data:

networks:
  mysql-phpmyadmin:

# docker-compose up -d
# http://localhost:8080

# docker-compose ps

# docker-compose down
```