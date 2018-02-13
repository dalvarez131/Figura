import java.util.Scanner;

public class Figura {
	public static void main(String[] args) {
		int lado;
		StringBuffer figura = new StringBuffer("");
		Scanner in = new Scanner(System.in);
		System.out.println("Que altura desea para sus figuras?");
		lado = in.nextInt();

		figura = cuadrado(lado);
		System.out.print(figura);
		figura = triangulo(lado);
		System.out.print(figura);
		figura = rombo(lado);
		System.out.print(figura);
		
	}
	public static StringBuffer cuadrado(int lado) {
		StringBuffer figura = new StringBuffer("");
		for(int ancho = 0; ancho < lado; ancho ++) {
			for (int alto = 0; alto < lado; alto ++) {
				figura.append("* ");
			}
			figura.append('\n');
		}
		return figura;
	}
	public static StringBuffer triangulo(int lado) {
		StringBuffer figura = new StringBuffer(""); 
		int auxiliar = lado; 

		for (int altura = 1; altura <= lado; altura++) { 
			for (int espacios = auxiliar; espacios >= 1; espacios--){ 
				figura.append(" "); 
			} 
			int k = altura; 
			k = 2*k-1; 
			for (int asteriscos=1; asteriscos <= k; asteriscos++){ 
				figura.append("*"); 
			} 
			figura.append('\n');
			auxiliar --; 
		}	
		return figura;
	} 
	public static StringBuffer rombo(int lado) {
		StringBuffer figura = new StringBuffer(""); 
		int auxiliar = lado; 

		for (int altura = 1; altura <= lado; altura++) { 
			for (int espacios = auxiliar; espacios >= 1; espacios--){ 
				figura.append(" "); 
			} 
			int k = 2 * altura - 1; 
			for (int asteriscos = 1; asteriscos <= k; asteriscos++){ 
				figura.append("*"); 
			} 
			figura.append('\n');
			auxiliar --; 
		}
		auxiliar = 1;
		int k = 2 * lado -3;

		for (int altura = 1; altura <= lado; altura++) { 
			figura.append(" "); 
			for (int espacios = 1; espacios <= auxiliar; espacios++){ 
				figura.append(" "); 
			} 

			for (int asteriscos = k; asteriscos >= 1; asteriscos--){ 
				figura.append("*"); 
			} 
			figura.append('\n');
			auxiliar ++; 
			k = k-2;
		}

	return figura;	
	} 
	
}
