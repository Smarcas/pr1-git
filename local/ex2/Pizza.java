package local.ex2;

public class Pizza {
    private static int pizzaspedidas = 0;
    private static int pizzasservidas = 0;
    private String tamaño;
    private String tipo;
    private String estado;

    /// METHODS ///
    /// CONSTRUCTOR ///
    Pizza (String tamaño, String tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estado = "pedida";
        Pizza.pizzaspedidas++;
    }

    /// ToString
    @Override
    public String toString() {
        return "Pizza: " + this.getTipo() + ". Tamaño: " + this.getTamaño() + ". Estado: " + this.getEstado() + ".";
    }

    /// GETTER
    public String getTamaño() {
        return this.tamaño;
    }
    public String getTipo() {
        return this.tipo;
    }
    public String getEstado() {
        return this.estado;
    }
    public static int getPizzaspedidas() {
        return pizzaspedidas;
    }
    public static int getPizzasservidas() {
        return pizzasservidas;
    }

    /// SETTER
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /// FUNCIÓN CAMBIO ESTADO
    public void servirPizza() {
        if (this.getEstado() == "pedida") {
            this.setEstado("servida");
            Pizza.pizzasservidas++;
        } else {
            System.out.println("Esa pizza ya ha sido servida.");
        }
    }

}
