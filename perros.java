
/**
 * Write a description of class empleados here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;//Teclado
import java.util.Date; //Fecha

public class perros
{
    static Scanner teclado = new Scanner (System.in);//Teclado
    
    //Variables
    private String nombrePerro;
    private String raza;
    private String localidad;
    private int cedula;
    private String nombreDueño;
    private int telefono;
    private String fecha;
    
    //-----------------------------------Metodos--------------------------
    public perros()
    {
        this.nombrePerro = "";
        this.raza = "";
        this.localidad = "";
        this.cedula = 0;
        this.nombreDueño = "";
        this.telefono = 0;
        this.fecha = "";
    }
    
    public perros( String np, String r, String l, int c, String nd, int t, String f  )
    {
        nombrePerro = np;
        raza = r;
        localidad = l;
        cedula = c;
        nombreDueño = nd;
        telefono = t;
        fecha = f;
    }    
    
    public void imprimir()
    {  
      System.out.println( "Nombre del perro : " + nombrePerro );
      System.out.println( "Raza: " + raza );
      System.out.println( "Cedula del dueño: " + cedula );
      System.out.println( "localidad: " + localidad );      
      System.out.println( "Nombre del Dueño: " + nombreDueño );
      System.out.println( "Telefono: " + telefono );
      System.out.println( "Fecha: " + fecha );
    }
    
    public String imprimirNombrePerro()
    {  
      return nombrePerro;
    }
 
    public String imprimirRaza()
    {  
      return raza;
    }
    
    public int imprimirCedula()
    {  
      return cedula;
    }
    
    public String imprimirNombreDueño()
    {  
      return nombreDueño;
    }
    
    public int imprimirTelefono()
    {  
      return telefono;
    }    
    
    public String imprimirFecha()
    {  
      return fecha;
    }    

    public String imprimirLocalidad()
    {  
      return localidad;
    }     
    
    
    //------------------------------------Cambios-----------------------------
    public void cambioNombrePerro( String nombrePerro )
    {
        this.nombrePerro = nombrePerro;
    }
    
    public void cambioLocalidad( String localidad )
    {
        this.localidad = localidad;
    }    
    
    public void cambioRaza( String raza )
    {
        this.raza = raza;
    }
    
    public void cambioCedula( int cedula )
    {
        this.cedula = cedula;
    }
    
    public void cambioNombreDueño( String nombreDueño )
    {
        this.nombreDueño = nombreDueño;
    }    
    
    public void cambioTelefono( int telefono )
    {
        this.telefono = telefono;
    } 
    
    public void cambioFecha( String fecha )
    {
        this.fecha = fecha;
    }     
  
} //end of class perros
       

