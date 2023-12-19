import java.util.Arrays;
import java.util.Iterator;

public class EjercicioEncriptacion {

	public static void main(String[] args) {
//		ejercicioEncriptar();
//		ejercicioFrases();
//		cuentaLetras();
		pruebaCadena();


	}
	private static void ejercicioEncriptar() {
		int opcion;
		System.out.println("Bienvenido para comenzar introduzca una frase");
		String frase=Teclado.pedirCadena();
		do {
			mostrarMenu();
			opcion=Teclado.recogerOpcionMenu(1, 4);
			frase=realizarAccionSeleccionada(opcion,frase);
		}while(opcion!=4);
	}
	/**
	 * Método que muestra una cadena de texto
	 * @param palabra es la cadena de texto a mostrar
	 */
	public static void mostrarPalabra(String palabra) {
		System.out.println(palabra);
	}
	/**
	 * Método que muestra un menú
	 */
	public static void mostrarMenu() {
		System.out.println("1. Mostrar frase");
		System.out.println("2. Encriptar frase");
		System.out.println("3. Desencriptar frase");
		System.out.println("4. Salir");
	}
	/**
	 * Método que encripta o desencripta una palabra en función de la opción escogida
	 * @param palabra es la cadena de texto que se encripta/decripta
	 * @param operacion es la operación que se hace(sumar o restar) 
	 * @return devuelve la cadena de texto encriptada
	 */
	public static String encriptarFrase(String palabra,int operacion) {
		String fraseAux="";
		char letra;
			for (int i = 0; i < palabra.length(); i++) {
				letra=palabra.charAt(i);//almaceno en la variable letra el valor de la posicion de la letra de la palabra
				letra=(char) (letra+operacion);//sumo o resto 1 al caracter
				fraseAux+=letra;//almaceno en la variable la letra codificada/decodificada
			}
		return fraseAux;//devuelvo la frase
	}
	/**
	 * Método que realiza una acción en función de la opcion escogida
	 * @param opcion es la opción escogida
	 * @param palabra es la palabra sobre las que se realizan las acciones
	 * @return devuelve la palabra con las acciones realizadas
	 */
	public static String realizarAccionSeleccionada(int opcion,String palabra) {

		switch (opcion) {
		case 1 ->{
			mostrarPalabra(palabra);
		}
		case 2 ->{
			palabra=encriptarFrase(palabra,+1);
		}
		case 3 ->{
			palabra=encriptarFrase(palabra,-1);
		}
		}
		return palabra;

	}
	
//	Crear un programa, que solicite por teclado dos frases,
//	e indique cuál es la más corta

	private static void ejercicioFrases() {
		System.out.println("Introduce la primera frase");
		String fraseUno=Teclado.pedirCadena();
		System.out.println("Introduce la segunda frase");
		String fraseDos=Teclado.pedirCadena();

		
		if (fraseUno.length()> fraseDos.length()) {//si la longitud de frase uno es mayor que la longitud de frase2
			System.out.println("La palabra más corta es "+fraseDos);//la palabra más corta es fraseDos
		}else if (fraseUno.length()== fraseDos.length()) {//si la longitud de fraseUno y fraseDos es la misma 
			System.out.println("Ambas palabras miden lo mismo");//las palabras miden lo mismo
		}else {//si no coincide con ninguna de las opciones anteriores
			System.out.println("La palabra más corta es "+fraseUno);//la palabra mas corta es fraseUno
		}
		
	}
//	Desarrollar una aplicación que pida al usuario una frase, e indique a
//	continuación cuántas veces contiene la letra ‘t’
	/**
	 * Método que cuenta cuantas veces está presente un carácter dentrod de una cadena
	 */
	public static void cuentaLetras() {
		int contador=0;//declaro un contador
		System.out.println("Introduce la palabra");
		String palabra=Teclado.pedirCadena();
		char letra;
		final char CARACTER='t';//declaro el carácter a buscar
		for (int i = 0; i < palabra.length(); i++) {//recorro la longitud de la palabra
			letra=palabra.charAt(i);//almaceno en la variable letra el valor del carácter de la palabra dentro de la posición 
			if (letra==CARACTER) {//si el carácter de la palabra coincide con el carácter que estoy buscando
				contador++;//aumento el contador
			}
		}
		System.out.println("La palabra "+palabra+ " contiene "+contador+"  letras t");//muestro el mensaje
		
	}
//	Desarrollar un método que se le pase una cadena de carácteres, y la devuelva invertida.
	/**
	 * Método que pide una cadena y llama a otro metodo e imprime la cadena
	 */
	public static void pruebaCadena() {
		System.out.println("Introduce la cadena");
		String cadena=Teclado.pedirCadena();//alamaceno la cadena en la variable
		cadena=cadenaInvertida(cadena);//asigno el valor del metodo a la variable cadena
		System.out.println(cadena);//muestro la cadena
	}
	/**
	 * Método que recibe como párametro una cadena y devuelve la cadena invertida
	 * @param cadena es la cadena que se le pasa como parámetro
	 * @return devuelve la cadena invertida
	 */
//	public static String cadenaInvertida(String cadena) {
//		StringBuilder stringBuilder = new StringBuilder(cadena);//declaro un StringBuilder que es una clase que me permite almacenar cadenas de caracteres mediante la creacion de un objeto y me permite mutar los caracteres de la cadena de texto
//		String invertida = stringBuilder.reverse().toString();//declaro una variable nueva a la que le asigno el valor de la cadena revertida y con toString la paso a cadena de texto.
//		return invertida;//devuelvo la cadena invertida.
//	}
	/**
	 * Método que recibe como párametro una cadena y devuelve la cadena invertida
	 * @param cadena es la cadena que se le pasa como parámetro
	 * @return devuelve la cadena invertida
	 */
	public static String cadenaInvertida(String cadena) {
		String cadenaAux="";
		for (int i = cadena.length()-1; i >=0; i--) {//recorro las posiciones de la palabra empezando por el final
			cadenaAux+=cadena.charAt(i);//añado a la cadena el valor de cada caracter
		}
		return cadenaAux;//devuelvo la cadena invertida.
	}

}
