
package programas;

/**
 *
 * @author miguel.coveñas
 */
import java.util.Scanner;
public class programa03 {
    public static void main(String[] args){
        int numero;
        String mes="";
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar un numero del [1-12]:");
        numero=lectura.nextInt();
        //proceso de datos
        switch (numero) {
            case 1:mes="Enero";break;
            case 2:mes="Febrero";break;
            case 3:mes="Marzo";break;
            case 4:mes="Abril";break;
            case 5:mes="Mayo";break;
            case 6:mes="Junio";break;
            case 7:mes="Julio";break;
            case 8:mes="Agosto";break;
            case 9:mes="Setiembre";break;
            case 10:mes="Octubre";break;
            case 11:mes="Noviembre";break;
            case 12:mes="Diciembre";break;
        }
        //salida de datos
        System.out.println("El nombre del dia de la semana es:"+mes);
    }    
}