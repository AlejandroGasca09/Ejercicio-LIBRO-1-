public interface Vehiculo {
    public static final int VELOCIDAD_MAXIMA = 160;
    public static final char CLASIFICIACION_EFICIENCIA = 'A';

    public boolean encender();
    public boolean apagar();

    public boolean avanzar();
    public boolean frenar();
}
