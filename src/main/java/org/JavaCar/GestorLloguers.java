import java.util.List;
import java.util.stream.Collectors;


public class GestorLloguers {

     public static double calcularIngressosTotals(List<Vehicle> vehicles, int dies) {
        return vehicles.stream().mapToDouble(v -> v.calcularPreu(dies)).sum();
    }

     public static List<Vehicle> filtrarPerPreu(List<Vehicle> vehicles, double preuMax) {
        return vehicles.stream().filter(v -> v.getPreuBase() <= preuMax).collect(Collectors.toList());
    }
}
