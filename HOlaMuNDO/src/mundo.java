import java.util.Scanner;


public class mundo {

	public static void main(String[] args) {
		System.out.println("Hola mundo");
		int suma;
		int cosa1;
		int cosa2;
		suma=2+2;
		System.out.println(suma);
		Scanner t=new Scanner(System.in);
		System.out.println("escribe dos numeros q  quieras multiplicar");
		cosa1=t.nextInt();
		cosa2=t.nextInt();
		int multiplicacion;
		multiplicacion=cosa1*cosa2;
		System.out.println("el producto de la primera y la segunda cifra es = "+multiplicacion);
	}

}
