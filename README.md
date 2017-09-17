# Pyramid: A SERVLET/JSP Example

This application illustrates and demonstrates SERVLET/JSP Model 2 Pattern with Filters as the controller and Servlets used to serve AJAX requests.

**Libraries & Tools used**

* Apache Shiro (Authentication & Authorization)
* DBUtils (Database connectivity)
* SQLDALMAKER (DAO Generator)
* Logback (Logging)
* Gentelella HTML Template
* DB Migrator (Maven Database Migration)

**Installation**
1. Configure MySQL credentials for DB Migrator in src\main\resources\database.properties
2. Run mvn db-migrator:create db-migrator:migrate
3. Configure MySQL credentials for Shiro in src\main\webapp\WEB-INF\shiro.ini
4. Configure MySQL credentials for Tomcat in src\main\webapp\META-INF\context.xml
5. Run mvn package
6. Deploy WAR file to Tomcat
7. Goto http://localhost:8080/Pyramid in your browser
7. Login admin:admin or guest:guest

**A screenshot of the application**
--
<img src="http://i68.tinypic.com/2vj4xtw.jpg"/>