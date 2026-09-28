import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            TitanicService s = new TitanicService("data/Titanic.txt");
            int op;
            do {
                System.out.println("\n--- MENU DEMOGRAFICO TITANIC ---");
                System.out.println("1. Ver 10 pasajeros por clase");
                System.out.println("2. Ver estadísticas absolutas de género");
                System.out.println("3. Tasa de mortalidad Femenina por clase");
                System.out.println("4. Tasa de mortalidad Masculina por clase");
                System.out.println("0. Salir");
                op = sc.nextInt(); sc.nextLine();

                if(op==1) {
                    System.out.print("Clase (1st, 2nd, 3rd): ");
                    s.imprimirPasajeros(sc.nextLine());
                } else if(op==2) {
                    s.estadisticasTotales();
                } else if(op==3) {
                    System.out.print("Clase (1st, 2nd, 3rd): ");
                    s.estadisticasFemeninas(sc.nextLine());
                } else if(op==4) {
                    System.out.print("Clase (1st, 2nd, 3rd): ");
                    s.estadisticasMasculinas(sc.nextLine());
                }
            } while(op != 0);
        } catch (Exception e) { System.out.println("Error: " + e.getMessage()); }
    }
}