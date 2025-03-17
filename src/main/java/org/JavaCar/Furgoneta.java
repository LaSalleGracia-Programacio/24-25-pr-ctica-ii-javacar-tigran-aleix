
public class Furgoneta extends Vehicle {
    private int capacitatCarga; // Capacidad de carga en kg


    public Furgoneta(String matricula, String marca, String model, double preuBase, int capacitatCarga, Motor motor, Roda rodes) {
        super(matricula, marca, model, preuBase, motor, rodes);
        this.capacitatCarga = capacitatCarga;
    }

    
    @Override
    public double calcularPreu(int dies) {
        double preuFinal = preuBase;
        if (capacitatCarga > 1000) {
            preuFinal += 10;  // Si la capacidad de carga supera 1000 kg, se suman 10€ al precio base
        }
        return preuFinal * dies;
    }
}
