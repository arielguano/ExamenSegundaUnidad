package Dominio;

public class Patronal extends Jubilado{
    Empresa empresa;
    public Patronal(long cedula, String nombre, String apellido, float salario, int aporte, String nEmpresa, String tipo, float inflacion) {
        super(cedula, nombre, apellido, salario, aporte);
        this.pi = salario + (salario * this.porcentaje);
        this.empresa = new Empresa(nEmpresa, inflacion, tipo);
        this.ganancia = pi + (salario * this.empresa.getInflacion());
        this.tipoJ = "Patronal";
    }    
    
    @Override
    public String getTipoJ() {
        return tipoJ+"/"+this.empresa.getTipo();
    }
}
