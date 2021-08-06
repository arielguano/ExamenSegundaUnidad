package Dominio;

public class Jubilado {
    protected long cedula; //Cedula del jubilado
    protected String nombre; //Nombre del jubilado
    protected String apellido; //Apellido del jubilado
    protected float salario; //Salario 
    protected int aporte; //Tiempo de aporte
    protected float porcentaje; //procentaje de pi para cada jubilado
    protected String tipoJ;
    protected float pi;
    protected float ganancia;

    public Jubilado(long cedula, String nombre, String apellido, float salario, int aporte) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.aporte = aporte;
        if(aporte <= 10){
            this.porcentaje = (float)0.50;
        }else if(aporte > 10 && aporte <=20){
            this.porcentaje = (float)0.60;
        }else if(aporte > 20 && aporte <=30){
            this.porcentaje = (float)0.70;
        }else if(aporte > 30 && aporte <= 35){
            this.porcentaje = (float) 0.80;
        }else if(aporte > 35 && aporte <= 39){
            this.porcentaje = (float) 0.90;
        }else if(aporte >= 40){
            this.porcentaje = (float) 1.00;
        }
    }

    @Override
    public String toString() {
        return "Jubilado{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", aporte=" + aporte + ", porcentaje=" + porcentaje + '}';
    }

    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public float getSalario() {
        return salario;
    }

    public int getAporte() {
        return aporte;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public String getTipoJ() {
        return tipoJ;
    }
    
    public float getPi() {
        return pi;
    }

    public float getGanancia() {
        return ganancia;
    }
}
