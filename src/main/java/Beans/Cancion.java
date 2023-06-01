package Beans;

public class Cancion {
    private int idCancion;
    private String nombre_Cancion;
    private String idbanda;

    public Cancion(int idCancion, String nombre_Cancion, String idbanda) {
        this.idCancion = idCancion;
        this.nombre_Cancion = nombre_Cancion;
        this.idbanda = idbanda;
    }

    public int getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public String getNombre_Cancion() {
        return nombre_Cancion;
    }

    public void setNombre_Cancion(String nombre_Cancion) {
        this.nombre_Cancion = nombre_Cancion;
    }

    public String getIdbanda() {
        return idbanda;
    }

    public void setIdbanda(String idbanda) {
        this.idbanda = idbanda;
    }
}
