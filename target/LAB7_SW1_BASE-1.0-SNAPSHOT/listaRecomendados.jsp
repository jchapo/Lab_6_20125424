<%@ page import="Beans.Tour" %>
<%@ page import="Beans.Cancion" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean type="java.util.ArrayList<Beans.Cancion>" scope="request" id="listaRecomendados"/>
<html>
    <jsp:include page="/static/head.jsp">
        <jsp:param name="title" value="Lista de Recomendados"/>
    </jsp:include>
    <body>
        <div class='container'>
            <jsp:include page="/includes/navbar.jsp">
                <jsp:param name="page" value="recomendados"/>
            </jsp:include>
            <div class="pb-5 pt-4 px-3 titlecolor">
                <div class="col-lg-6">
                    <h1 class='text-light'>Lista de Canciones Recomendadas</h1>
                </div>
            </div>
            <div class="tabla">
                <table class="table table-dark table-transparent table-hover">
                    <thead>
                        <th>ID</th>
                        <th>TOUR</th>
                        <th>BANDA</th>
                        <th>Ver</th>
                    </thead>
                    <%
                        for (Cancion cancion : listaRecomendados) {
                    %>
                    <tr>
                        <td><%=cancion.getIdCancion()%>
                        </td>
                        <td><%=cancion.getNombre_Cancion()%>
                        </td>
                        <td><%=cancion.getIdbanda()%>
                        </td>
                        <td><a class="btn btn-warning" href="… ">Más de la banda</a>
                        </td>


                    </tr>

                    <%
                        }
                    %>
                </table>
            </div>

        </div>
        <jsp:include page="/static/scripts.jsp"/>
    </body>
</html>
