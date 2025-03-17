public abstract class Vehicle implements Llogable {
    protected String matricula;  // Matrícula del vehículo
    protected String marca;      // Marca del vehículo
    protected String model;      // Modelo del vehículo
    protected double preuBase;   // Precio base del alquiler
    protected Motor motor;       // Objeto Motor asociado al vehículo
    protected Roda rodes;        // Objeto Roda asociado al vehículo
    protected String etiquetaAmbiental; // Distintivo ambiental según normativa