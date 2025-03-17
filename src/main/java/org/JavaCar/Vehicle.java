public abstract class Vehicle implements Llogable {
    protected String matricula;  // Matrícula del vehículo
    protected String marca;      // Marca del vehículo
    protected String model;      // Modelo del vehículo
    protected double preuBase;   // Precio base del alquiler
    protected Motor motor;       // Objeto Motor asociado al vehículo
    protected Roda rodes;        // Objeto Roda asociado al vehículo
    protected String etiquetaAmbiental; // Distintivo ambiental según normativa


    
    public Vehicle(String matricula, String marca, String model, double preuBase, Motor motor, Roda rodes) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
        this.motor = motor;
        this.rodes = rodes;
        this.etiquetaAmbiental = calcularEtiquetaAmbiental();  // Calcula la etiqueta ambiental al crear el objeto
    }
