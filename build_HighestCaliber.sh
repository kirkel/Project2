pwd
ls -alt
cd HighestCaliber/src/main/webapp/HighestCaliber/
pwd
ls -alt
npm install
pwd
ls -alt
ng build --prod --base-href=http://ec2-54-89-63-71.compute-1.amazonaws.com:8090/HighestCaliber/
pwd
ls -alt
cd  dist/
\cp -R HighestCaliber/ /c/Program\ Files/Apache\ Software\ Foundation/Tomcat\ 8.5/webapps/
cd /c/Program\ Files/Apache\ Software\ Foundation/Tomcat\ 8.5/webapps/
pwd
ls -alt