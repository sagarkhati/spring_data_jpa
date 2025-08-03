# spring_data_jpa

**Step1:** Go to [Spring Initializr](https://start.spring.io/) and create the project with following dependencies included: 
- Spring Web
- Spring Data JPA
- PostgreSQL Driver (As per the database)


**Step2:** Extract the downloaded code and import it into IDE (Eclipse).


**Step3:** In application.properties file, add the following properties: 

```
spring.datasource.url=jdbc:postgresql://localhost:5432/spring_data_jpa_demo
spring.datasource.username=postgres
spring.datasource.password=root
```


**Step4:** Now launch the application as Java Application, It should successfully started.


**Step5:** Added Product entity and following property in application.properties file. 

```
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
```

above two properties help to show the sql command in console and create the product table in db
