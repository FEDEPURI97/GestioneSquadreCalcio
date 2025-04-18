# GestioneSquadreCalcio
configurazioni:
postgres: 
porta : localhost:5432
nome db : progettosquadre
username : postgres
password : fred
Nella cartella resources/setUpDb si puo trovare il ddl per la creazione delle tabelle e il dml per le insert

comandi maven : mvn clean install , mvn spring-boot:run

Una volta finite le configurazioni per testare il codice andare al seguente link per l'interfaccia swagger : 
http://localhost:8080/swagger-ui.html 

Le configurazioni di questo progetto prevedono la vista in console delle query eseguite da spring data jpa;
