
public class principal {

	public static void main(String[] args) {
		for (int n = 1; n <= 4; ++n) {  
			int valor = fibonacci(n);  
			System.out.println(valor);  
		}  
	}

	public static int fibonacci(int num) {  
		if (num == 1 || num == 2)  
			return 1;  
		else  
			return fibonacci(num - 1) + fibonacci(num - 2);  
	}  

}
