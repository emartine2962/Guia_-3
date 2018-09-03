
/**
 * Write a description of class centroComercial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.ArrayList;

public class centroComercial
{
    //teclado
    static Scanner teclado = new Scanner (System.in);
    static ArrayList<empleados> empleado = new ArrayList<empleados>();    
    //----------------------------------PROGRAMA----------------------------
    public static void main( String[] args )
    {
        
        //variables
        String name = "";
        String lastName = "";
        String department = "";
        String title = "";
        double salary = 0;
        int option = 0;
        empleado.add(new empleados( name, lastName, department, title, salary ));
        
        while( option != 3){
            System.out.println( "Ingresa la opcion" );
            System.out.println( "1 para ingresar un nuevo empleado" );
            System.out.println( "2 para buscar un pleado" );
            System.out.println( "3 para salir" );
            option = teclado.nextInt();
        
            if (option == 1){
                       System.out.println( "Ingresa el nuevo nombre" );
                        name = teclado.next();
                       System.out.println( "Ingresa el nuevo apellido" );
                        lastName = teclado.next();
                       System.out.println( "Ingresa el nuevo departamento" );
                        department = teclado.next();  
                       System.out.println( "Ingresa el nuevo cargo" );
                        title = teclado.next(); 
                       System.out.println( "Ingresa el nuevo salario" );
                        salary = teclado.nextDouble();
                       empleado.add(new empleados( name, lastName, department, title, salary )); 
                for (int i = 0; i < empleado.size(); i++){
                    System.out.println( empleado.get(i).imprimirNombre() );
                }
                       
                       
            }
        
            if (option == 2){ 
                String nombreEmpleado;
                
                System.out.println( "Ingresa el nombre del empleado" );
                nombreEmpleado = teclado.next();
                
                for (int i = 0; i < empleado.size(); i++){
                    if (empleado.get(i).imprimirNombre().equals(nombreEmpleado)){
                        empleado.get(i).imprimir();
                    } else{
                        System.out.println( "Usuario no encontrado" );
                    }
                }
                
            
            }
            
            
        }        
    }
}
