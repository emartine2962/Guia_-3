
/**
 * Write a description of class empleados here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;//Teclado


public class empleados
{
    static Scanner teclado = new Scanner (System.in);//Teclado
    
    //Variables
    private String name;
    private String lastName;
    private String department;
    private String title;
    private double salary;
    
    //-----------------------------------Metodos--------------------------
    public empleados()
    {
      this.name = "";
      this.lastName = "";
      this.department = "";
      this.title = "";
      this.salary = 0;
    }
    
    public empleados( String n, String ln, String d, String t, double s )
    {
      name = n;
      lastName = ln;
      department = d;
      title = t;
      salary = s;
    }    
    
    public void imprimir()
    {  
      System.out.println( "Nombre: " + name );
      System.out.println( "Apellido: " + lastName );
      System.out.println( "Departamento: " + department );
      System.out.println( "Cargo: " + title );
      System.out.println( "Salario: " + salary );
    }
    
    public String imprimirNombre()
    {  
      return name;
    }
 
    public String imprimirLastName()
    {  
      return lastName;
    }
    
    public String imprimirDepartment()
    {  
      return department;
    }
    
    public String imprimirTitle()
    {  
      return title;
    }
    
    public double imprimirSalary()
    {  
      return salary;
    }    
    
    public void cambioName( String name )
    {
        this.name = name;
    }
    
    public void cambioLastName( String nuevoLastName )
    {
        this.lastName = lastName;
    }
    
    public void cambioDepartment( String department )
    {
        this.department = department;
    }
    
    public void cambioTitle( String title )
    {
        this.title = title;
    }    
    
    public void cambioSalary( double salary )
    {
        this.salary = salary;
    } 
  
} //end of class empleados
       

