FROM openjdk:11
WORKDIR /app

COPY . /app
RUN javac -d . Main.java
CMD ["java", "Main"]

EXPOSE 8080