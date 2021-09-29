<%-- 
    Document   : index
    Created on : 12 jul. 2021, 11:25:35
    Author     : Leonardo Martinez
--%>

<%@page import="Modelo.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <% 
        Alumno alu1 = new Alumno(2102);
        Alumno alu2 = new Alumno(2108, "Le gusta comentar todo.");
        

        %>

    <body>
        
        
        
        <h1>Hello World!</h1>
        <p>Este alumno es es de la comisión <strong> <%= alu1.getComision() %> </strong> </p>
        <p> <strong>  Descripción:</strong> <%= alu1.getDescripcion() %>  </p>
        <hr><!-- linea de separación -->
        
        <p>Este alumno es es de la comisión <strong> <%= alu2.getComision() %> </strong> </p>
        <p> <strong>  Descripción:</strong> <%= alu2.getDescripcion() %>  </p>
        
        
        
        
        
    </body>
</html>
