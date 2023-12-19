package local.ex10;

public class Incidencia {
    // ATRIBUTOS
    private static int numerototalincidencia = 0;
    private static int pendientes = 0;
    private int numincidencia;
    private int puesto;
    private String descripcion;
    private String estado;
    private String solucion;
    // CONSTRUCTOR
    public Incidencia(int puesto, String problema) {
        Incidencia.numerototalincidencia++;
        Incidencia.pendientes++;
        this.numincidencia = numerototalincidencia;
        this.puesto = puesto;
        this.descripcion = problema;
        this.estado = "Pendiente";
        this.solucion = "";
    }
    // GETTER
    public static int getNumerototalincidencia() {
        return numerototalincidencia;
    }
    public static int getPendientes() {
        return pendientes;
    }
    public int getNumincidencia() {
        return numincidencia;
    }
    public int getPuesto() {
        return puesto;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getEstado() {
        return estado;
    }
    public String getSolucion() {
        return solucion;
    }
    // SETTER
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }
    // TO STRING
    public String toString() {
        if (this.estado == "Pendiente") {
            return "Incidencia nº: " + this.numincidencia + " - Puesto: " + this.puesto + " - " + this.descripcion + " - " + this.estado;
        } else if (this.estado == "Resuelta") {
            return "Incidencia nº: " + this.numincidencia + " - Puesto: " + this.puesto + " - " + this.descripcion + " - " + this.estado + " - " + this.solucion;
        }
        return "";
    }
    // METHODS
    public void resolver(String solucion) {
        this.estado="Resuelta";
        Incidencia.pendientes--;
        this.solucion = solucion;
    }
}
