public class Cotxe extends Vehicle {
    private int nombrePlaces; // Número de plazas del coche



    public Cotxe(String matricula, String marca, String model, double preuBase, int nombrePlaces, Motor motor, Roda rodes) {
        super(matricula, marca, model, preuBase, motor, rodes);
        this.nombrePlaces = nombrePlaces;
    }