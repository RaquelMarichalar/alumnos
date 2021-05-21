package alumnos;
import alumno.Alumno;
import java.util.Scanner;

/**
 *
 * @author Raquel de Marichalar Alegre
 * @version 1.0
 * @since 12.1
 */
public class Alumnos {

  /**
   *
   * @param permite que el scanner lea los datos introducidos por el usuario
   */
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    Alumno[] istAlumno = new Alumno[5];
    
    

    String nombreIntroducido;
    double notaIntroducida;

      System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");
      for (int i = 0; i < 5; i++) {

          istAlumno[i] = new Alumno();
          System.out.println("Alumno " + i);
          System.out.print("Nombre: ");
          nombreIntroducido = entrada.nextLine();
          //(istAlumno[i]).nombre = nombreIntroducido;
          System.out.print("Nota media: ");
          notaIntroducida = Double.parseDouble(entrada.nextLine());
          //alum[i].notaMedia = notaIntroducida;
          
          istAlumno[i].AsignarNota(nombreIntroducido, notaIntroducida, 10);
          
      }
    
    
  
    double  sumaDeMedias = 0;
  
    System.out.println("Los datos introducidos son los siguientes:");

    
    for(int i = 0; i < 5; i++) {
      System.out.println("Alumno " + i);  
      System.out.println("Nombre: " + istAlumno[i].getNombre());    
      System.out.println("Nota media: " + istAlumno[i].getNotaMedia());
      System.out.println("----------------------------");
      sumaDeMedias += istAlumno[i].getNotaMedia();
    } 
    System.out.println("La media global de la clase es " + sumaDeMedias / 5);
  
  }
}

