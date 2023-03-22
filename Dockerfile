FROM openjdk:17

LABEL author = "Kiran Kumar B"
LABEL version = 1.0
LABEL description = "The Scientific Calculator"

COPY ./target/Scientific_Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp", "Scientific_Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar", "org.example.ScientificCalculator"]