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
