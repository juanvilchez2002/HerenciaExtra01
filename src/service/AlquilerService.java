
package service;

import entidad.Alquiler;
import entidad.BarcoMotor;
import entidad.BarcoVelero;
import entidad.BarcoYate;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class AlquilerService {
    
    Scanner consola = new Scanner(System.in);
    Alquiler a = new Alquiler();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    
    public void crearAlquiler(){
        
        System.out.print("--- Registro de Alquiler ---\n");
        System.out.println("");
        
        System.out.print("Ingres Nombre: ");
        a.setNombre(consola.nextLine());
        
        System.out.print("Documento: ");
        a.setDocumento(consola.nextLine());
        
        System.out.print("Fecha Alquiler: ");
        LocalDate fa = LocalDate.parse(consola.nextLine(), formatter);
        a.setFechaAlquiler(fa);
        
        System.out.print("Fecha Devolución: ");
        LocalDate fd = LocalDate.parse(consola.nextLine(), formatter);
        a.setFechaDevolucion(fd);
        
        System.out.print("Posicion (Babor, Estribor, Proa, Poa): ");
        a.setPosicion(consola.nextLine().toLowerCase());
        
        
        System.out.print("Matricula: ");
        String matricula = consola.nextLine();
        
        System.out.print("Eslora (Metros): ");
        int eslora = consola.nextInt();
        System.out.print("Año de Fabricación: ");
        int anio = consola.nextInt();
        
        System.out.println("Elije el Tipo de Barco");
        System.out.println(" 1. Barco Velero");
        System.out.println(" 2. Barco a Motor");
        System.out.println(" 3. Yate");
        
        System.out.println("Elija una opción: ");
        int op = consola.nextInt();
        
        switch(op){
            case 1:
                System.out.print("Cantidad de Mastiles: ");
                int nroMastiles = consola.nextInt();
                a.setBarco(new BarcoVelero(nroMastiles, matricula, eslora, anio ));
                break;
            case 2:
                System.out.print("Potencia CV: ");
                int potencia = consola.nextInt();
                a.setBarco(new BarcoMotor(potencia, matricula, eslora, anio ));
                break;
            case 3:
                System.out.print("Potencia CV: ");
                int potenciaC = consola.nextInt();
                System.out.print("Nro Camarotes: ");
                int nroCamarotes = consola.nextInt();
                a.setBarco(new BarcoYate(nroCamarotes, potenciaC, matricula, eslora, anio));
                break;
            default:
                System.out.print("Opción invalida!!");
        }      
        
        System.out.println("Registrado!!");
        System.out.println(a.toString());
    }
    
    public void costoAlquiler(){
        Period periodo = Period.between(a.getFechaAlquiler(), a.getFechaDevolucion());
        int nroDias = periodo.getDays()+1;
        
        int costoAlquiler=0;
        
        if(a.getBarco() instanceof BarcoYate){
            BarcoYate barcoY = (BarcoYate) a.getBarco();
            System.out.println("3");
            costoAlquiler = (nroDias*barcoY.getEslora()*10)+barcoY.getPotenciaMotor()+barcoY.getNroCamarote(); 
        }else if(a.getBarco()instanceof BarcoVelero){
            System.out.println("2");
            BarcoVelero barcoV = (BarcoVelero) a.getBarco();            
            costoAlquiler = nroDias*(barcoV.getEslora()*10)+barcoV.getNroMastiles();            
        }else if(a.getBarco() instanceof BarcoMotor){
            System.out.println("1");
            BarcoMotor barcoM = (BarcoMotor) a.getBarco();
            costoAlquiler = nroDias*(barcoM.getEslora()*10)+barcoM.getPotenciaMotor();           
        }else{
            System.out.println("Error en Barco");
        }
        
        System.out.println("Nro de días Alquilado: "+nroDias+" costo es: "+costoAlquiler);
    }
}