FROM  kdvolder/jdk8

ADD target/cluster-eureka-0.0.1-SNAPSHOT.jar /opt/app.jar
ENTRYPOINT java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom \
 -Duser.timezone=Asia/Shanghai \
 -Dfile.encoding=UTF-8  \
 -Dspring.profiles.active=${PROFILE}  \
 -jar /opt/app.jar \
 -Dserver.port=${EUREKA_PORT} \
 -Deureka.client.serviceUrl.defaultZone=http://gitlab.bryce.com:${EUREKA_PORT}/eureka/
