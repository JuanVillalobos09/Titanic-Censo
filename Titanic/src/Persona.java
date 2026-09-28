public class Persona {
    private String clase, edad, sexo, sobrevivio;

    public Persona(String clase, String edad, String sexo, String sobrevivio) {
        this.clase = clase; this.edad = edad; this.sexo = sexo; this.sobrevivio = sobrevivio;
    }
    public String getClase() { return clase; }
    public String getEdad() { return edad; }
    public String getSexo() { return sexo; }
    public String getSobrevivio() { return sobrevivio; }

    @Override
    public String toString() {
        return "Clase: " + clase + " | Sexo: " + sexo + " | Sobrevivió: " + sobrevivio;
    }
}