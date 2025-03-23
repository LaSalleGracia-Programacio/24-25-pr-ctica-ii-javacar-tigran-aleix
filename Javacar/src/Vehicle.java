public abstract class Vehicle implements Llogable {
    protected String matricula;
    protected String marca;
    protected String model;
    protected double preuBase;

    public Vehicle(String matricula, String marca, String model, double preuBase) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
    }

    public String getMatricula() { return matricula; }
    public String getMarca() { return marca; }
    public String getModel() { return model; }
    public double getPreuBase() { return preuBase; }

    @Override
    public abstract double calcularPreu(int dies);
}
