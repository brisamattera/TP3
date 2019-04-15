import java.util.scanner
public class ejer1{
	public static void main (string []ar)
		{
			scanner teclado= new scanner (system in);
			int cantidad;
			float precio;
			float importe;
			system.out.print("Ingrese la cantidad de articulos a llevar: ");
			cantidad=teclado.nextint();
			system.out.print("Ingrese el valor unitario del producto: ");
			precio=teclado.nextfloat();
			importe=precio * cantidad;
			system.out.print ("El importe a pagar es: ");
			system.out.print (importe)

		}
}