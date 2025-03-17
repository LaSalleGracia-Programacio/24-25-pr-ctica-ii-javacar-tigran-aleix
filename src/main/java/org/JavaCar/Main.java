import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Motor motorGasolina = new Motor("Gasolina", 150);
        Motor motorElectrico = new Motor("Eléctrico", 100);
        Roda rodaMichelin = new Roda("Michelin", 17.5);
        Roda rodaPirelli = new Roda("Pirelli", 16.0);


        Cotxe cotxe1 = new Cotxe("1234ABC", "Toyota", "Corolla", 30.0, 5, motorGasolina, rodaMichelin);
        Moto moto1 = new Moto("5678XYZ", "Honda", "CBR600", 25.0, 600, motorGasolina, rodaPirelli);
        Furgoneta furgoneta1 = new Furgoneta("9101DEF", "Mercedes", "Sprinter", 50.0, 1200, motorElectrico, rodaMichelin);


        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(cotxe1);
        vehicles.add(moto1);
        vehicles.add(furgoneta1);


        double ingresos = GestorLloguers.calcularIngressosTotals(vehicles, 3);
        System.out.println("Ingresos totales por 3 días de alquiler: " + ingresos + "€");



        List<Vehicle> filtrats = GestorLloguers.filtrarPerPreu(vehicles, 30);
        System.out.println("\nVehículos con precio base ≤ 30€:");
        for (Vehicle v : filtrats) {
            System.out.println(v.getMarca() + " " + v.getModel() + " - " + v.getPreuBase() + "€");
        }



        System.out.println("\nDetalles de los vehículos:");
        for (Vehicle v : vehicles) {
            System.out.println(v.getMatricula() + " - " + v.getMarca() + " " + v.getModel() +
                    " | Precio base: " + v.getPreuBase() + "€" +
                    " | Etiqueta Ambiental: " + v.getEtiquetaAmbiental() +
                    " | Precio por 3 días: " + v.calcularPreu(3) + "€");
        }
    }
}


