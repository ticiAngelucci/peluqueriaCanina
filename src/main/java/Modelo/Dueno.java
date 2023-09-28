
package Modelo;

public class Dueno {
    private int id_dueno;
    private String nombre_dueno;
    private String cel_dueno;
    
    public Dueno() {
       
    }

    public Dueno(int id_dueno, String nombreDueno, String celDueno) {
        this.id_dueno = id_dueno;
        this.nombre_dueno = nombreDueno;
        this.cel_dueno = celDueno;
    }

    public int getId_dueno() {
        return id_dueno;
    }

    public void setId_dueno(int id_dueno) {
        this.id_dueno = id_dueno;
    }

    public String getNombreDueno() {
        return nombre_dueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombre_dueno = nombreDueno;
    }

    public String getCelDueno() {
        return cel_dueno;
    }

    public void setCelDueno(String celDueno) {
        this.cel_dueno = celDueno;
    }
    
    
}
