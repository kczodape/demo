FROM openjdk:17
EXPOSE 9091
ADD /target/demo-svc.jar demo-svc.jar
ENTRYPOINT [ "java", "-jar", "/demo-svc.jar" ] 