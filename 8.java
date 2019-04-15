import java.util.Scanner;
public class Persona {
 private Scanner teclado;
 private String nombre;
 private int edad;
 public void inicializar() {
 teclado=new Scanner(System.in);
 System.out.print("Ingrese nombre:");
 nombre=teclado.next();
 System.out.print("Ingrese edad:");
 edad=teclado.nextInt();
 }
 public void imprimir() {
 System.out.print("Nombre:"+nombre);
 System.out.print("Edad:"+edad);
 }
public class empleado {
 private Scanner teclado;
 private int sueldo;
 public void inicializar() {
 teclado=new Scanner(System.in);
 System.out.print("Ingrese su sueldo:");
 sueldo=teclado.next();
 }
  public void imprimir() {
 System.out.print("Sueldo:"+sueldo);
 }


 public static void main(String[] ar) {
 empleado1=new empleado1;
 empleado1.inicializar();
 empleado1.imprimir();
 persona1=new Persona();
 persona1.inicializar();
 persona1.imprimir();
 }
}

