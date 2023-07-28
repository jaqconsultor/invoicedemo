setlocal
set "JAVA_HOME=C:\openxava-7-r2-Facturacion\jdk-17.0.6.10-hotspot\"
SET PATH=%PATH%;C:\openxava-7-r2-Facturacion\jdk-17.0.6.10-hotspot\bin;C:\openxava-7-r2-Facturacion\apache-maven-3.9.0\bin;

del C:\SistemaWebPrueba\apache-tomcat-9.0.71\webapps\invoice*.war
del C:\Tomcat9_P\webapps\invoice*.war

cd C:\openxava-7-r2-Facturacion\workspace\invoicedemo
call mvn clean
call mvn package
call mvn install

copy C:\openxava-7-r2-Facturacion\workspace\invoicedemo\*.war C:\SistemaWebPrueba\apache-tomcat-9.0.71\webapps
copy C:\openxava-7-r2-Facturacion\workspace\invoicedemo\*.war C:\Tomcat9_P\webapps\

explorer http://localhost:9980/invoicedemo/

CD C:\SistemaWebPrueba\apache-tomcat-9.0.71\bin
startup.bat

