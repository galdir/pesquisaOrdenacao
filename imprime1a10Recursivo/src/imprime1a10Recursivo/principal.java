package imprime1a10Recursivo;

public class principal {

	public static void main(String[] args) {
		
		imprime(1,20);
		
	}
	
	static void imprime(int valor, int limite){
		if(valor>limite)
			return;
		else {
			System.out.println("valor atual: "+valor);
			imprime(valor+1,limite);
		}
		
	}
}
