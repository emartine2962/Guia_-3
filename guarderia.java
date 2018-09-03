
/**
 * Write a description of class centroComercial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class guarderia
{
    //teclado
    static Scanner teclado = new Scanner (System.in);
    static ArrayList<perros> perro = new ArrayList<perros>();    
    //----------------------------------PROGRAMA----------------------------
    public static void main( String[] args )
    {
        //-----------Variables----------------------
        String nombrePerro = "";
        String raza = "";
        String localidad = "";
        int cedula = 0;
        String nombreDueño = "";
        int telefono = 0;
        String fecha = "";
        
        int option = 0; //Variable option
        
        perro.add(new perros( nombrePerro, raza, localidad, cedula, nombreDueño, telefono, fecha )); //ArrayList
        
        
        
        while( option != 3){
            System.out.println( "Ingresa la opcion" );
            System.out.println( "1 para ingresar un nuevo perro" );
            System.out.println( "2 para buscar un perro por localidad" );
            System.out.println( "3 para salir" );
            option = teclado.nextInt();
        
            if (option == 1){
                       System.out.println( "Ingresa el nombre del perro" );
                        nombrePerro = teclado.next();
                       System.out.println( "Ingresa la raza" );
                        raza = teclado.next();
                       System.out.println( "Ingresa la localidad del perro" );
                        localidad = teclado.next();  
                       System.out.println( "Ingresa la cedula del dueño" );
                        cedula = teclado.nextInt(); 
                       System.out.println( "Ingresa el nombre del dueño" );
                        nombreDueño = teclado.next();
                       System.out.println( "Ingresa el telefono" );
                        telefono = teclado.nextInt();
                       System.out.println( "Ingresa la fecha" );
                        fecha = teclado.next();
                        
                       perro.add(new perros( nombrePerro, raza, localidad, cedula, nombreDueño, telefono, fecha )); 
                for (int i = 0; i < perro.size(); i++){
                    System.out.println( perro.get(i).imprimirNombrePerro() );
                }
                       
                       
            }
        
            if (option == 2){ 
                String nombrePerroBusqueda;
                
                System.out.println( "Ingresa la localidad" );
                nombrePerroBusqueda = teclado.next();
                
                for (int i = 0; i < perro.size(); i++){
                    if (perro.get(i).imprimirLocalidad().equals(nombrePerroBusqueda)){
                        perro.get(i).imprimir();
                    } else{
                        System.out.println( "Nombre de perro no encontrado" );
                    }
                }
                
            
            }
            
            
        }        
    }
}
