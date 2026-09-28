import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class TitanicService {
    private List<Persona> pasajeros;

    public TitanicService(String archivo) throws IOException {
        pasajeros = Files.lines(Paths.get(archivo))
                .filter(l -> !l.trim().isEmpty())
                .map(l -> l.split(","))
                .filter(d -> d.length == 4)
                .map(d -> new Persona(d[0].trim(), d[1].trim(), d[2].trim(), d[3].trim()))
                .collect(Collectors.toList());
    }

    public void imprimirPasajeros(String clase) {
        pasajeros.stream().filter(p -> p.getClase().equalsIgnoreCase(clase))
                .limit(10).forEach(System.out::println);
    }

    public void estadisticasTotales() {
        long mujeres = pasajeros.stream().filter(p -> p.getSexo().equalsIgnoreCase("femenino")).count();
        long hombres = pasajeros.stream().filter(p -> p.getSexo().equalsIgnoreCase("masculino")).count();
        System.out.println("Total Censo: " + pasajeros.size() + " (Mujeres: " + mujeres + ", Hombres: " + hombres + ")");
    }

    public void estadisticasFemeninas(String clase) {
        long vivas = pasajeros.stream().filter(p -> p.getClase().equalsIgnoreCase(clase) && p.getSexo().equalsIgnoreCase("femenino") && p.getSobrevivio().equalsIgnoreCase("si")).count();
        long muertas = pasajeros.stream().filter(p -> p.getClase().equalsIgnoreCase(clase) && p.getSexo().equalsIgnoreCase("femenino") && p.getSobrevivio().equalsIgnoreCase("no")).count();
        System.out.println("Mujeres (" + clase + ") -> Vivas: " + vivas + " | Fallecidas: " + muertas);
    }

    public void estadisticasMasculinas(String clase) {
        long vivos = pasajeros.stream().filter(p -> p.getClase().equalsIgnoreCase(clase) && p.getSexo().equalsIgnoreCase("masculino") && p.getSobrevivio().equalsIgnoreCase("si")).count();
        long muertos = pasajeros.stream().filter(p -> p.getClase().equalsIgnoreCase(clase) && p.getSexo().equalsIgnoreCase("masculino") && p.getSobrevivio().equalsIgnoreCase("no")).count();
        System.out.println("Hombres (" + clase + ") -> Vivos: " + vivos + " | Fallecidos: " + muertos);
    }
}