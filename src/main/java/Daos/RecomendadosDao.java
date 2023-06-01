package Daos;

import Beans.Cancion;

import java.sql.*;
import java.util.ArrayList;

public class RecomendadosDao {

    private static String user = "root";
    private static String pass = "root";
    private static String url = "jdbc:mysql://localhost:3306/lab6sw1?serverTimezone=America/Lima";


    public static ArrayList<Cancion> obtenerRecomendados(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<Cancion> listaRecomendados = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT r.cancion_idcancion as ID, c.nombre_cancion as CANCION, c.banda as `conteo` FROM lab6sw1.reproduccion r inner join lab6sw1.cancion c on r.cancion_idcancion = c.idcancion group by cancion_idcancion having count(idreproduccion)>2 order by count(cancion_idcancion) desc;")) {

            while (rs.next()) {
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String banda = rs.getString(3);

                listaRecomendados.add(new Cancion(id,nombre,banda));
            }

        } catch (SQLException e) {
            System.out.println("No se pudo realizar la busqueda");
        }
        return listaRecomendados;
    }




}
