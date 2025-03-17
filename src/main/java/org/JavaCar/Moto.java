
public class Moto extends Vehicle {
    private int cilindrada; // Cilindrada de la moto (capacidad del motor en cm³)


    public Moto(String matricula, String marca, String model, double preuBase, int cilindrada, Motor motor, Roda rodes) {
        super(matricula, marca, model, preuBase, motor, rodes);
        this.cilindrada = cilindrada;
    }


    @Override
    public double calcularPreu(int dies) {
        double preuFinal = preuBase;
        if (cilindrada > 500) {
            preuFinal += 5;  // Si la cilindrada es mayor de 500 cm³, se suman 5€ al precio base
        }
        return preuFinal * dies;
    }
}
