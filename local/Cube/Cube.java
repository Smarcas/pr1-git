package local.Cube;

public class Cube {
    int capacity; // Maximun capacity in L.
    int content; // Current content in L.
    // methods //////////////////////////////
    // constructor
    public Cube (int c) {
        this.capacity = c;
    }
    // getter methods
    int getCapacidad() {
        return this.capacity;
    }
    int getContenido() {
        return this.content;
    }

    // setter method
    void setContenido(int litros) {
        this.content = litros;
    }
    //others methods
    void vacia() {
        this.content = 0;
    }

    void llena() {
        this.content = this.capacity;
    }

    void pinta() {
        for (int nivel = this.capacity; nivel > 0; nivel--) {
            if (this.content >= nivel) {
                System.out.println("#~~~~#");
            } else {
                System.out.println("#    #");
            }
        }
        System.out.println("######");
    }
    /**
     * Pour the contents of one bucket over another.
     * Before pouring the water, check how much the destination bucket holds.
     */
    void vuelcaEn(Cube destino) {
        int libres = destino.getCapacidad() - destino.getContenido();
        if (libres > 0) {
            if (this.content <= libres) {
                destino.setContenido(destino.getContenido() + this.content);
                this.vacia();
            } else {
                this.content -= libres;
                destino.llena();
            }
        }
    }
}
