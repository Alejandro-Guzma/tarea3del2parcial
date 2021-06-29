import java.util.Scanner;

public class tarea3segundoparcial
{
  public static void main (String[] args ){
      String nombre, apellido;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("ingrese el un nombre ");
      
        nombre = sc.nextLine();
      
      System.out.println("ingrese un apellido(s)");
      
        apellido = sc.nextLine();
      
      System.out.println("Hola mi nombre es: "+ nombre);  
      System.out.println("Mi apellido es: "+ apellido); 
       
      
    }
}
