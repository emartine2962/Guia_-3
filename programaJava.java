
/**
 * Write a description of class programaJava here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class programaJava
{
    static Scanner teclado = new Scanner (System.in);
    
    private int duplaUno;
    private int duplaDos;
    
    public programaJava()
    {
      this.duplaUno = 0;
      this.duplaDos = 0;
    }
    
    public void optenerDupla()
    {
      System.out.println( this.duplaUno + "," + this.duplaDos );
    }
    
    
    public void cambioDuplaUno( int nuevaDuplaUno )
    {
        this.duplaUno = nuevaDuplaUno;
    }
    
    public void cambioDuplaDos( int nuevaDuplaDos )
    {
        this.duplaDos = nuevaDuplaDos;
    }
    
    public void leer()
    {
        
        //Programa
        System.out.println( "Ingresa el primer numero de la primera dupla" );
        int duplaUno = teclado.nextInt();
        System.out.println( "Ingresa el segundo numero de la primera dupla" );
        int duplaDos = teclado.nextInt();
        
        cambioDuplaUno(duplaUno);
        cambioDuplaDos(duplaDos);
        
    }
    
    public static void main( String[] args )
    {
      programaJava dupla = new programaJava();
      int option = 0;
      
      while( option != 3 ){
      System.out.println( "Programa para gusrdar duplas" );  
      System.out.println( "1 para ver la dupla" );
      System.out.println( "2 para modificarla" );
      System.out.println( "3 para salir" );
      
      option = teclado.nextInt();
      if( option == 1 ){
          dupla.optenerDupla();
        }
      if( option == 2 ){
          dupla.leer();
        }
      if( option > 3 ){
          System.out.println( "Número no valido" );
        }        
        
    }
    }
    
    
} //END CLASS
