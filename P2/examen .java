import java.util.Scanner;

public class examen{
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Cuantos valores vas a capturar");
	int tamaño = teclado.nextInt();
	int[] valores = new int[tamano];
	int a;
	for (a=0;a<tamano;a++){
		System.out.println("ingrese el valor #"+a+":");
		valores[a] = teclado.nextInt();
	}
	int sumatoria=0;
	for (a=0;a<tamano;a++){
	sumatoria+=valores[a];
}
int promedio=sumatoria/tamaño;
System.out.println("la madia aritmetica es " + promedio);
sumatoria=0;
for (a=0;a<tamano;a++){
sumatoria+=Math.abs(valores[a]-promedio);
}
int dm = sumatoria/tamano;
System.out.println("la desviacion media es " + dm);
  }
}