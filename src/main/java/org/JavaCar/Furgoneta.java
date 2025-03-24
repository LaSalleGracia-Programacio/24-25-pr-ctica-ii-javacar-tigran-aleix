package org.JavaCar;

public class Furgoneta extends Vehicle {
    private double capacitatCarga;

    public Furgoneta(String matricula, String marca, String model, double preuBase, double capacitatCarga, Motor motor, Roda[] rodes) {
        super(matricula, marca, model, preuBase, motor, rodes);
        this.capacitatCarga = capacitatCarga;
    }

    @Override
    public double calcularPreu(int dies) {
        double preuFinal = getPreuBase();
        if (capacitatCarga > 1000) {
            preuFinal += 10;
        }
        return preuFinal * dies;
    }

    public double getCapacitatCarga() {
        return capacitatCarga;
    }

    public void setCapacitatCarga(double capacitatCarga) {
        this.capacitatCarga = capacitatCarga;
    }
}
