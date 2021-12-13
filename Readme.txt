#############################################################
                        URL(s)
#############################################################
Http - http://20.87.15.236/maven-0.0.1-SNAPSHOT/
Https - https://20.87.15.236/maven-0.0.1-SNAPSHOT/
Jenkins - http://20.87.15.236:8080/
Jenkins_Username - admin
Jenkins_Password - docker

#############################################################
			  Generate Selfsigned keypair
		   (stored in a keystore for Tomcat)
#############################################################
sudo keytool -genkey -keyalg RSA -alias selfsigned -dname "CN=Tiaan,OU=DevOps,O=Ayo,C=ZA" -ext "SAN:c=DNS:localhost,IP:127.0.0.1" -keystore keystore.jks -storepass docker -validity 360 -keysize 2048
sudo keytool -v -export -file keystore.cer -keystore keystore.jks -alias selfsigned
sudo keytool -import -alias keystore -file keystore.cer -keystore test.truststore

#############################################################
                        Info
#############################################################
Paths in Reporsitory:

Jenkins Dockerfile: tmatthysen/Ayo_project/Jenkins/Container_Setup/
WebApp Dockerfile: tmatthysen/Ayo_project/WebApp/Container_Setup/
docker-compose file: tmatthysen/Ayo_project/docker-compose/

Jenkins Pipeline: tmatthysen/Ayo_project/Jenkins/Pipeline/

WebApp Source Code: tmatthysen/Ayo_project/WebApp/Source Code/
WebApp Repository: https://github.com/tmatthysen/project_java