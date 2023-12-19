package localhost.Fraction;

public class Fraction {
    /// Atributos ///
    private int numerador;
    private int denominador;
    /// METHODS ////////////////////
    /// Constructor ///
    Fraction (int num, int denomin) {
        this.numerador = num;
        if (denomin>0) {
            this.denominador = denomin;
        } else {
            System.out.print("El denominador no puede ser 0.");
        }
    }
    /// Getter ///
    public int getNumerador() {
        return this.numerador;
    }
    public int getDenominador() {
        return this.denominador;
    }
    /// Setter ///
    void setNumerador(int num) {
        this.numerador = num;
    }
    void setDenominador(int denom) {
        this.denominador = denom;
    }
    /// toString ///
    @Override
    public String toString() {
        return " " + this.getNumerador() + "\n" + "---" + "\n " + this.getDenominador();
    }
    /// OTHERS ///
    /// Multiply fractions ///
    public void multiply(Fraction fraction1, Fraction fraction2) {
        this.setNumerador(fraction1.getNumerador()*fraction2.getNumerador());
        this.setDenominador(fraction1.getDenominador()*fraction2.getDenominador());
        System.out.println(this);
    }
    /// Divide fractions ///
    public void divide(Fraction fraction1, Fraction fraction2) {
        this.setNumerador(fraction1.getNumerador()*fraction2.getDenominador());
        this.setDenominador(fraction1.getDenominador()*fraction2.getNumerador());
        System.out.println(this);
    }
    /// Reverse fractions ///
    public void reverse() {
        int temporal = this.getNumerador();
        this.setNumerador(this.getDenominador());
        this.setDenominador(temporal);
        System.out.println(this);
    }
}
