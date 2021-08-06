package test;

import java.util.ArrayList;
import java.util.Scanner;
import Dominio.Discapacidad;
import Dominio.Jubilado;
import Dominio.Patronal;
import Dominio.Vejez;

public class PruebaReporte {
    
    public static void main(String[] args) {
        ArrayList<Jubilado> jb = new ArrayList<>();
        for(;;){
            switch(menu()){
                case 1: vejez(jb);
                        break;
                case 2: discapacidad(jb);
                        break;
                case 3: patronal(jb);
                        break;
                case 4: reporte(jb);
                        break;
                case 5: System.out.println("Gracias por usar el sistema.");
                        System.exit(0);
                        break;
                default: System.out.println("Error, ingrese de nuevo: ");
                        break;
            }
        }
    }
    
    public static void reporte(ArrayList<Jubilado> jb){
        System.out.println("Nombre     Apellido        Tipo Jubilado        Salario Base        Pension Inicial");
        if(jb.size() == 0){
            System.out.println("No existen reportes.");
        }else{
            for(Jubilado j : jb){
                System.out.println(j.getNombre()+"      "+ j.getApellido()+"           "+ j.getTipoJ()+"                "+ j.getSalario()+"             "+ j.getPi());
            }
        }
    }
    
    public static int menu(){
        Scanner in = new Scanner(System.in);
        int op = 0;
        System.out.println("--Programa para generar reporte de Jubilados--");
        System.out.println("Ingrese un numero para el tipo de Jubilado");
        System.out.println("MENU\n1.Ingresar Jubilado Vejez.\n2. Ingresar Jubilado Discapacidad. \n3. Ingresar Jubilado Patronal. \n4. Reporte. \n5. Salir");
        op = in.nextInt();
        return op;
    }
    
    public static void vejez(ArrayList<Jubilado> jb){
        Scanner in = new Scanner(System.in);
        Jubilado j;
        System.out.println("Jubilado Vejez.\n1. Ingrese el nombre: ");
        String n = in.nextLine();
        System.out.println("2. Ingrese el apellido: ");
        String a = in.nextLine();
        System.out.println("3. Ingrese la cedula: ");
        long c = in.nextLong();
        System.out.println("4. Ingrese los años de aporte: ");
        int ap = in.nextInt();
        j = new Vejez(c,n,a,(float)400.00,ap);
        jb.add(j);
    }
    
    public static void discapacidad(ArrayList<Jubilado> jb){
        Scanner in = new Scanner(System.in);
        Jubilado j;
        System.out.println("Jubilado Discapacidad.\n1. Ingrese el nombre: ");
        String n = in.nextLine();
        System.out.println("2. Ingrese el apellido: ");
        String a = in.nextLine();
        System.out.println("3. Ingrese la cedula: ");
        long c = in.nextLong();
        System.out.println("4. Ingrese los años de  aporte: ");
        int ap = in.nextInt();
        System.out.println("5. Ingrese el porcentaje de discapacidad: ");
        float d = in.nextFloat();
        j = new Discapacidad(c,n,a,(float) 400.00, ap, d);
        jb.add(j);
    }
    
    public static void patronal(ArrayList<Jubilado> jb){
        Scanner in = new Scanner(System.in);
        Jubilado j;
        System.out.println("Jubilado Discapacidad.\n1. Ingrese el nombre: ");
        String n = in.nextLine();
        System.out.println("2. Ingrese el apellido: ");
        String a = in.nextLine();
        System.out.println("3. Ingrese la cedula: ");
        long c = in.nextLong();
        System.out.println("4. Ingrese los años de aporte: ");
        int ap = in.nextInt();
        System.out.println("5. Ingrese el nombre de la empresa: ");
        in.nextLine();
        String nE = in.nextLine();
        System.out.println("6. Ingrese el tipo de empresa (Publica/privada): ");
        String t = in.nextLine();
        System.out.println("7. Ingrese el porcentaje de inflacion: ");
        float i = in.nextFloat();
        j = new Patronal(c,n,a, (float) 400.00, ap, nE, t, i);
        jb.add(j);
    }
}
