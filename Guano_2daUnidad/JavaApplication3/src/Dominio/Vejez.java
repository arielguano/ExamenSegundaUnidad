package Dominio;

public class Vejez extends Jubilado{
    
    public Vejez(long cedula, String nombre, String apellido, float salario, int aporte) {
        super(cedula, nombre, apellido, salario, aporte);
        this.pi = salario + (salario * this.porcentaje);
        this.ganancia = pi + (salario * (float)0.15);
        this.tipoJ = "Vejez";
    }
    
}
