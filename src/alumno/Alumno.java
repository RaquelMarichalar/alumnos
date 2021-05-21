package alumno;

/**
 *
 * @author Raquel de Marichalar Alegre
 * @version 1.0
 * @since 12.1
 */
public class Alumno {
  private String nombre;
  private double notaMedia = 0.0;
  
  /**
   *
   * @param devuelve el nombre del objeto nombreAlumno
   * @param nombre del objeto notaAsignada
   * @param nombre del objetoasignarNota
   */
  public void AsignarNota(String nombreAlumno, double notaAsignada, int asignarNota) {
      introduceNotas(nombreAlumno, notaAsignada);
  }

  private void introduceNotas(String nombreAlumno, double notaAsignada) {
    muestraResultados(nombreAlumno, notaAsignada);
  }

  private void muestraResultados(String nombreAlumno, double notaAsignada) {
    setNombre(nombreAlumno);
    setNotaMedia(notaAsignada);
  }

  /**
   * @return devuelve el nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * @param nombre es el objeto a introducir en el void
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * @return devuelve la notaMedia
   */
  public double getNotaMedia() {
    return notaMedia;
  }

  /**
   * @param notaMedia es el objeto a introducir en el void
   */
  public void setNotaMedia(double notaMedia) {
    this.notaMedia = notaMedia;
  }
}
