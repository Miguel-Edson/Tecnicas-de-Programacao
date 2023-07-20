package Lista_1P;

public class Lista_1N5 {
	
	public static void main (String[] args) {
		double A = Math.floor(Math.random() * 20);
		double B = Math.floor(Math.random() * 20);

		
		
		System.out.println("Valor de A:" +A);
		System.out.println("Valor de B:" +B);
		
		
		if (A == 10 || A+B == 20) {
			System.out.println("numero valido");
				}else{
					System.out.println("numero nao valido");
				} 		
		}
}

