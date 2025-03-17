
public class Motor {
    private String tipus;  // Tipo de motor (eléctrico, diésel, gasolina, híbrido, etc.)
    private int potencia;  // Potencia del motor en caballos (CV)


    public Motor(String tipus, int potencia) {
        this.tipus = tipus;
        this.potencia = potencia;
    }

    
    public String getTipus() { return tipus; }
    public int getPotencia() { return potencia; }
}
