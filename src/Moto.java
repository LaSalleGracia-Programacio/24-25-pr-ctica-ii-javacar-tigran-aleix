public class Moto extends Vehicle {
    private int cilindrada;

    public Moto(String matricula, String marca, String model, double preuBase, int cilindrada) {
        super(matricula, marca, model, preuBase);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularPreu(int dies) {
        return (cilindrada > 500) ? (preuBase + 5) * dies : preuBase * dies;
    }
}
