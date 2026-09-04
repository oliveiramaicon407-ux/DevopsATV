# Estágio 1: Compilação do código fonte usando o Java 21 JDK
FROM eclipse-temurin:21-jdk AS build
WORKDIR /app
COPY Produto.java Main.java ./
RUN javac Produto.java Main.java

# Estágio 2: Execução da aplicação utilizando apenas o Java 21 JRE (mais leve)
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/*.class ./
CMD ["java", "Main"]