import java.sql.SQLOutput;

public class Motocicleta implements Vehiculo {
    private int centimetroscubicos;
    private String marca ;

    public Motocicleta() {
    }

    public Motocicleta(int centimetroscubicos, String marca) {
        this.centimetroscubicos = centimetroscubicos;
        this.marca = marca;
    }

    public int getCentimetroscubicos() {
        return centimetroscubicos;
    }

    public void setCentimetroscubicos(int centimetroscubicos) {
        this.centimetroscubicos = centimetroscubicos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "centimetroscubicos=" + centimetroscubicos +
                ", marca='" + marca + '\'' +
                '}';
    }
    public void hacercaballito(){
        System.out.println("Haciendo un caballito para romperme un hueso ");
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo la motocicleta de marca "+ this.marca);
        return false;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando la motocicleta de marca "+ this.marca);
        return false;
    }

    @Override
    public boolean avanzar() {
        System.out.println("Avanzando la motocicleta de "+ this.centimetroscubicos);
        return false;
    }

    @Override
    public boolean frenar() {
        System.out.println("Frenando la motocicleta de "+ this.centimetroscubicos);
        return false;
    }
}
