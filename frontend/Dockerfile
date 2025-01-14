FROM node:12.7-alpine AS build
WORKDIR /usr/src/app
COPY ./my-app-frontend/ .
RUN npm ci
RUN npm install --no-progress --loglevel=error
CMD npm run build:prod --no-progress --loglevel=error
RUN ls -al /usr/src/app/dist/angular-mean-crud-tutorial
RUN node setenv.js

FROM nginx:alpine3.18
RUN rm -rf /etc/nginx/sites-enabled/
RUN rm -rf /usr/share/nginx/html/*
COPY --from=build /usr/src/app/dist/angular-mean-crud-tutorial /usr/share/nginx/html
COPY my-app-frontend/nginx.conf  /etc/nginx/conf.d/default.conf
CMD nginx -g 'daemon off;'
EXPOSE 4200
