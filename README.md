# ⚽ GestioneSquadreCalcio

## 🔧 Configurazioni Database (PostgreSQL)

- **Host**: `localhost`  
- **Porta**: `5432`  
- **Nome Database**: `progettosquadre`  
- **Username**: `postgres`  
- **Password**: `fred`  

📁 Nella cartella `resources/setUpDb` sono disponibili:

- **DDL**: script per la creazione delle tabelle  
- **DML**: script con i dati di insert

---

## 🛠️ Comandi Maven

Per compilare e avviare il progetto Spring Boot, utilizzare i seguenti comandi da terminale:

```bash
mvn clean install
mvn spring-boot:run

🌐 Interfaccia Swagger
Una volta avviata l’applicazione, è possibile accedere alla documentazione delle API tramite Swagger:

🔗 http://localhost:8080/swagger-ui.html
