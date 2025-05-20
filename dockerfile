# Etapa de build
FROM eclipse-temurin:17-jdk AS build

# Instalar Maven
RUN apt-get update && apt-get install -y maven

# Establecer directorio de trabajo
WORKDIR /app

# Copiar todo el proyecto
COPY . .

# Compilar el proyecto sin ejecutar tests
RUN mvn clean package -DskipTests

# Etapa final: imagen ligera con solo el jar
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copiar el archivo .jar generado desde la etapa de build
COPY --from=build /app/target/*.jar app.jar

# Puerto que expone tu aplicación (ajústalo si usas otro)
EXPOSE 8080

# Comando para iniciar tu aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
