FROM openjdk
COPY ./target/SPECalculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "SPECalculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]