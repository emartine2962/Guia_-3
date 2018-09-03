
/**
 * Write a description of class pendulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class pendulo
{
    //Variables
    double longitud;
    double aceleracionGravitacional;
    double periodo;
    //teclado
    static Scanner teclado = new Scanner (System.in);
    
    
    public pendulo()
    {
      this.longitud = 0;
      this.aceleracionGravitacional = 0;
      this.periodo = 0;
    }
    
    public pendulo( double l, double g )
    {
      longitud = l;
      aceleracionGravitacional = g;
    } 
    
    public void calculoPeriodo( double periodo )
    {
        this.periodo = (2*3.14*( Math.sqrt( aceleracionGravitacional/longitud )));
    }  
    
    public double imprimirPeriodo()
    {
       return periodo; 
    }
    
    public void cambioLongitud( double nuevaLongitud )
    {
        this.longitud = nuevaLongitud;
    }    
    
    public void cambioAceleracionGravitacional( double nuevaAceleracionGravitacional )
    {
        this.aceleracionGravitacional = nuevaAceleracionGravitacional;
    }    
    
    public void leer()
    {
        
        //Programa
        System.out.println( "Ingresa el valor de la longitud" );
        double longitud = teclado.nextDouble();
        System.out.println( "Ingresa el valor de la aceleracion gravitacional" );
        double aceleracionGravitacional = teclado.nextDouble();
        
        cambioLongitud(longitud);
        cambioAceleracionGravitacional(aceleracionGravitacional);
        calculoPeriodo(periodo);
        
    }    
    
    
    
    
    public static void main( String[] args )
    {
      pendulo programa1 = new pendulo();
      int option = 0;
      
      do{
          System.out.println( "Programa para calcular el periodo con el que oscila un pendulo" ); 
          System.out.println( "1 para ejecutar" );
          System.out.println( "0 para salir" );
          option = teclado.nextInt();  
          
            switch (option) {
                case 1:
                programa1.leer();
                System.out.println( "resultado: " + programa1.imprimirPeriodo() );
                break;
                
                case 0:
                System.out.println( "Fin del programa" );
                break;                
            }
        } while ( option != 0 );
    }
}

