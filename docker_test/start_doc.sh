docker build -t hello-php .
docker run -p -v /Users/cb-vaibhav/Vai/MyHome/workme/repos/prac/docker_test/src/:/var/www/html/ 80:80 hello-php