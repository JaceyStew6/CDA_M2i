# Solution Dockerfile

[Documentation Dockerisation Vue.js](https://v2.fr.vuejs.org/v2/cookbook/dockerize-vuejs-app.html)

``` dockerfile
# Build stage
FROM node as builder

WORKDIR /usr/src/app

COPY package.json .
COPY package-lock.json .
RUN npm install

COPY . .
RUN npm run build

# Production stage
FROM nginx

RUN rm -rf /usr/share/nginx/html/*
COPY --from=builder /usr/src/app/dist /usr/share/nginx/html

EXPOSE 80

CMD ["nginx","-g","daemon off;"]
```

``` powershell
# Créer le dockerfile
docker build -t photowebsite .

# Commande pour tester l'image (prise dans la doc httpd)
docker run --name photosite -p 8080:80 photowebsite

# ---- Publier l'image sur dockerHub ----
docker login
docker tag photowebsite jaceystew6/myphotowebsite
docker push jaceystew6/myphotowebsite
```