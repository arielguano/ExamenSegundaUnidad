package Dominio;

public class Empresa {
    
    private String nombre;
    private float inflacion;
    private String tipo;

    public Empresa(String nombre, float inflacion, String tipo) {
        this.nombre = nombre;
        this.inflacion = inflacion;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getInflacion() {
        return inflacion;
    }

    public String getTipo() {
        return tipo;
    }
    
}
