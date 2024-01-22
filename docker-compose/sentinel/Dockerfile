FROM azul/zulu-openjdk:8u392

WORKDIR /sentinel-dashboard

ARG JAR_FILE=jar/sentinel-dashboard-1.8.6.jar
ARG CONF_FILE=conf/application.yml

COPY ${JAR_FILE} app.jar
COPY ${CONF_FILE} application.yml

EXPOSE 8080

ENV TZ=Asia/Shanghai JAVA_OPTS="-Xms128m -Xmx256m -Djava.security.egd=file:/dev/./urandom"

CMD java $JAVA_OPTS -jar app.jar