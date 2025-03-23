import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear vehículos
        Cotxe cotxe1 = new Cotxe("1234ABC", "Toyota", "Corolla", 30.0);
        Moto moto1 = new Moto("5678XYZ", "Honda", "CBR600", 25.0, 600);
        Furgoneta furgoneta1 = new Furgoneta("9101DEF", "Mercedes", "Sprinter", 50.0, 1200);

        // Lista de vehículos
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(cotxe1);
        vehicles.add(moto1);
        vehicles.add(furgoneta1);

        // Calcular ingresos por 3 días
        double ingresos = GestorLloguers.calcularIngressosTotals(vehicles, 3);
        System.out.println("Ingresos totales por 3 días de alquiler: " + ingresos + "€");

        // Filtrar vehículos con un precio base menor o igual a 30€
        List<Vehicle> filtrats = GestorLloguers.filtrarPerPreu(vehicles, 30);
        System.out.println("\nVehículos con precio base ≤ 30€:");
        for (Vehicle v : filtrats) {
            System.out.println(v.getMarca() + " " + v.getModel() + " - " + v.getPreuBase() + "€");
        }
    }
}
