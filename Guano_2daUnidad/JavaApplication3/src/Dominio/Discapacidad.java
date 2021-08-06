package Dominio;

public class Discapacidad extends Jubilado{
    private float discapacidad;

    public Discapacidad(long cedula, String nombre, String apellido, float salario, int aporte, float discapacidad) {
        super(cedula, nombre, apellido, salario, aporte);
        this.pi = salario + (salario*this.porcentaje);
        this.ganancia = this.pi + (salario * discapacidad);
        this.discapacidad = discapacidad;
        this.tipoJ = "Discapacidad";
    }
}
