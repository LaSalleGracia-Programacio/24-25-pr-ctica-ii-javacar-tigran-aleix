public class Furgoneta extends Vehicle {
    private int capacitatCarga;

    public Furgoneta(String matricula, String marca, String model, double preuBase, int capacitatCarga) {
        super(matricula, marca, model, preuBase);
        this.capacitatCarga = capacitatCarga;
    }

    @Override
    public double calcularPreu(int dies) {
        return (capacitatCarga > 1000) ? (preuBase + 10) * dies : preuBase * dies;
    }
}
