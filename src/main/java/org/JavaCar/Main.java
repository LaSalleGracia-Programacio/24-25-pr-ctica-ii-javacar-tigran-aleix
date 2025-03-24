package org.JavaCar;

import org.JavaCar.Vehicle;

import java.util.*;



public class Main {
    private static List<Vehicle> vehicles = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean sortir = false;

        while (!sortir) {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Afegir Cotxe");
            System.out.println("2. Afegir Moto");
            System.out.println("3. Afegir Furgoneta");
            System.out.println("4. Mostrar vehicles");
            System.out.println("5. Calcular preu lloguer");
            System.out.println("6. Sortir");
            System.out.print("Escull una opció: ");

            int opcio = scanner.nextInt();
            scanner.nextLine(); // neteja buffer

            switch (opcio) {
                case 1:
                    afegirCotxe();
                    break;
                case 2:
                    afegirMoto();
                    break;
                case 3:
                    afegirFurgoneta();
                    break;
                case 4:
                    mostrarVehicles();
                    break;
                case 5:
                    calcularPreuLloguer();
                    break;
                case 6:
                    sortir = true;
                    System.out.println("Sortint del programa...");
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }
        }
    }

    private static void afegirCotxe() {
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Preu base: ");
        double preuBase = scanner.nextDouble();
        System.out.print("Nombre de places: ");
        int places = scanner.nextInt();
        scanner.nextLine();
        Motor motor = crearMotor();
        Roda[] rodes = crearRodes(4);

        Cotxe cotxe = new Cotxe(matricula, marca, model, preuBase, places, motor, rodes);
        vehicles.add(cotxe);
        System.out.println("Cotxe afegit correctament.");
    }

    private static void afegirMoto() {
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Preu base: ");
        double preuBase = scanner.nextDouble();
        System.out.print("Cilindrada: ");
        int cilindrada = scanner.nextInt();
        scanner.nextLine();
        Motor motor = crearMotor();
        Roda[] rodes = crearRodes(2);

        Moto moto = new Moto(matricula, marca, model, preuBase, cilindrada, motor, rodes);
        vehicles.add(moto);
        System.out.println("Moto afegida correctament.");
    }

    private static void afegirFurgoneta() {
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Preu base: ");
        double preuBase = scanner.nextDouble();
        System.out.print("Capacitat de càrrega (kg): ");
        double capacitat = scanner.nextDouble();
        scanner.nextLine();
        Motor motor = crearMotor();
        Roda[] rodes = crearRodes(4);

        Furgoneta furgoneta = new Furgoneta(matricula, marca, model, preuBase, capacitat, motor, rodes);
        vehicles.add(furgoneta);
        System.out.println("Furgoneta afegida correctament.");
    }

    private static void mostrarVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No hi ha vehicles registrats.");
        } else {
            for (int i = 0; i < vehicles.size(); i++) {
                Vehicle v = vehicles.get(i);
                System.out.println(i + ". " + v.getClass().getSimpleName() + " - " + v.getMarca() + " " + v.getModel() + " (" + v.getMatricula() + ")");
            }
        }
    }

    private static void calcularPreuLloguer() {
        if (vehicles.isEmpty()) {
            System.out.println("No hi ha vehicles registrats.");
            return;
        }

        mostrarVehicles();
        System.out.print("Selecciona el número del vehicle: ");
        int index = scanner.nextInt();
        System.out.print("Introdueix els dies de lloguer: ");
        int dies = scanner.nextInt();
        scanner.nextLine();

        if (index >= 0 && index < vehicles.size()) {
            Vehicle v = vehicles.get(index);
            double preu = v.calcularPreu(dies);
            System.out.println("Preu total del lloguer: " + preu + "€");
            System.out.println("Etiqueta ambiental: " + v.getEtiquetaAmbiental());
        } else {
            System.out.println("Índex de vehicle no vàlid.");
        }
    }

    private static Motor crearMotor() {
        System.out.print("Tipus de motor (gasolina, dièsel, híbrid, elèctric): ");
        String tipus = scanner.nextLine();
        System.out.print("Potència (CV): ");
        int potencia = scanner.nextInt();
        scanner.nextLine();
        return new Motor(tipus, potencia);
    }

    private static Roda[] crearRodes(int num) {
        Roda[] rodes = new Roda[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Roda " + (i + 1) + ":");
            System.out.print("  Marca: ");
            String marca = scanner.nextLine();
            System.out.print("  Diàmetre: ");
            int diametre = scanner.nextInt();
            scanner.nextLine();
            rodes[i] = new Roda(marca, diametre);
        }
        return rodes;
    }
}
