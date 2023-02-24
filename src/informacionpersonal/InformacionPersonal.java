
package informacionpersonal;

/**
 *
 * @author maryse
 * 
 * Programa para imprimir cadenas en Java 
 * 
 */

public class InformacionPersonal {

    String nombreDelAlumno = "Omar";
    String numeroDeCuenta = "1742771";
    String semestreCursado = "2do semestre";
    String materiasCantidad = "6";
    String horario = "7 am - 2:30 pm";
            
    public void Informacion(){        
        System.out.println("El nombre del alumno es: "+ nombreDelAlumno);
        System.out.println("Su numero de cuenta es: "+ numeroDeCuenta);
        System.out.println("El semestre que cursa es: "+ semestreCursado);
        System.out.println("La cantidad de materias que toma son: "+ materiasCantidad);
        System.out.println("Su horario es de: "+ horario);
    }
    
    public static void main(String[] args) {
        InformacionPersonal informacion= new InformacionPersonal();
        informacion.Informacion();
                
    }
    
}
