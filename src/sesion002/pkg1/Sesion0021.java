
package sesion02;
/**
 *
 * @author miguel.coveñas
 */
import java.util.Scanner;
import java.lang.Math;
public class Sesion0021 {
    //metodo de la clase
    public static void main(String[] args){
        //declarar variables
        int num1,num2,maximo,minimo;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar número 1:");
        num1=lectura.nextInt();
        System.out.print("Ingresar número 2:");
        num2=lectura.nextInt();
        //proceso de datos
        maximo=Math.max(num1,num2);
        minimo=Math.min(num1,num2);
        //Salida de datos
        System.out.println("El maximo numero es:"+maximo);
        System.out.println("El minimo numero es:"+minimo);
        //System.out.println("hola a todos...!");
    }
}
