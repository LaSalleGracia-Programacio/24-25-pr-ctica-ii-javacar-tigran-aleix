public class Cotxe extends Vehicle {
    public Cotxe(String matricula, String marca, String model, double preuBase) {
        super(matricula, marca, model, preuBase);
    }

    @Override
    public double calcularPreu(int dies) {
        return preuBase * dies;
    }
}
