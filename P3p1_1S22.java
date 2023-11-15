import java.util.Scanner;

public class P3p1_1S22{
	static Scanner teclado= new Scanner(System.in);
    
    public static void suma(){
    	System.out.println("Suma de 2 numeros");
    	System.out.println("ingresa el primer numero");
    	int a= teclado.nextint();
    	Sistem.out.println("ingresa el segundo numero");
    	int b = teclado.nextInt();
    	int c = a+b;
    	System.out.println("la suma fue" +c);
    }
     public static void suma(){
    	System.out.println("Resta de 2 numeros");
    	System.out.println("ingresa el primer numero");
    	int a= teclado.nextint();
    	Sistem.out.println("ingresa el segundo numero");
    	int b = teclado.nextInt();
    	int c = a+b;
    	System.out.println("la resta fue" +c);
    }



     public static void menu(){
     	System.out.println("Menu de operaciones basico");
     	System.out.println("\n A) Suma");
     	System.out.println("B) Resta");
     	System.out.println("C) Division");
     	System.out.println("D) Multiplicacion")
     	System.out.println("Que opcion deseas :");
 
	public static void main(String[] args) {
		String opc;

		menu();
		opc=teclado.nextLine();
		if (opc.equals("A")) Suma();
		if (opc.equals("B")) Resta();
		if (opc.equals("C")) Division();
		if (opc.equals("D")) Multiplicacion();
	}

	}