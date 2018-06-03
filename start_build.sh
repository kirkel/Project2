pwd
ls -alt
cd ProjectTwo/src/main/webapp/projecttwoweb/
pwd
ls -alt
npm install
pwd
ls -alt
ng build --prod --base-href=http://ec2-54-89-63-71.compute-1.amazonaws.com:8090/projecttwoweb/
pwd
ls -alt
cd  dist/
\cp -R projecttwoweb/ /c/Program\ Files/Apache\ Software\ Foundation/Tomcat\ 8.5/webapps/
cd /c/Program\ Files/Apache\ Software\ Foundation/Tomcat\ 8.5/webapps/
pwd
ls -alt