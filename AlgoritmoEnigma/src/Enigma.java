/*Por: IGNACIO FERRER, JOSE ANTONIO ROMERO, ANDREA TORRES*/
import java.util.Scanner;

public class Enigma {
	static Cesar cesar = new Cesar();//Convocamos la clase Cesar
	static int v1;
	static int v2 = -1;
	static String palabra;
	static String palabraEncriptada;
	static String palabraDesencriptada;
	static Scanner sc;
	static int opcion;
	
	public static void main(String[] args) {
		
		introducirValores();
		eligeOpcion();
		palabra=getPalabra().toUpperCase();
		if(opcion==1){
			
			palabraEncriptada = cesar.encriptador(v1, v2, palabra);
			System.out.println("La palabra encriptada es: "+palabraEncriptada);
			
		}else{
			
			palabraDesencriptada = cesar.desencriptador(v1, v2, palabra);
			System.out.println("La palabra desencriptada es: "+palabraDesencriptada);
		}
		

	}
	
	//Le pedimos al usuario que elija lo que va a hacer
	public static void eligeOpcion(){
		sc = new Scanner(System.in);
		
		while(opcion!=1 && opcion !=2){
		System.out.println("Introduce '1' para encriptar o '2' para desencriptar ");
		opcion = sc.nextInt();
		}
		
		
	}
	
	
	/*Método que introduce los 2 números y comprueban si son primos y está comprendidos entre
	 * los valores 0 y 26 respectivamente*/
	public static void introducirValores(){
		
		sc = new Scanner(System.in);
		
		System.out.println("Introduce un número comprendido entre 0 y 26 y primo relativo de 27");	
		v1 = sc.nextInt();
		
		while(v1<0 || v1>26 || cesar.comprobarPrimo(v1)!=true){
			System.out.println("Introduce un número comprendido entre 0 y 26 y primo relativo de 27");	
			v1 = sc.nextInt();
		}
		

		
		while(v2<0 || v2>26){
			System.out.println("Introduce un número comprendido entre 0 y 26");	
			v2 = sc.nextInt();
		}
		
		
	}


//Le pedimos al usuario que introduzca la palabra que quiere encriptar o desencriptar
	public static String getPalabra(){
		
		sc = new Scanner(System.in);
		
		if(opcion==1){
			System.out.println("Introduce mensaje a encriptar");
			palabra = sc.nextLine();
		}else{
			System.out.println("Introduce mensaje a desencriptar");
			palabra = sc.nextLine();
			
		}
		sc.close();
		return palabra;
	}
	}
	
