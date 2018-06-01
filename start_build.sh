pwd
ls -alt
cd testAngular/testAngular/
npm install	
ng build --prod --base-href=http://ec2-54-243-8-17.compute-1.amazonaws.com:8090/projecttwoweb/
cd dist/
pwd
ls -alt
\cp -R testAngular/ /c/Program\ Files/Apache\ Software\ Foundation/Tomcat\ 8.5/webapps/
