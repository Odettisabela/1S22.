import java.util.Scanner;
Class P5_1S22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String temp;
		int num1, num2;
		int resultado;

		System.out.println("ingtesa el primer numero");
		temp = teclado.nextLine();
		num1 = Integer.parseInt(temp);
		System.out.println("ingresa el segundo numero");
		temp = teclado.netxLine();
		num2 = Integer.parseInt(temp);
		resultado = num1-num2;
		System.out.println("La resta es" + resultado);
	}
	}