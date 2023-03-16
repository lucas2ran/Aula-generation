package Exercicios03;

import java.util.Scanner;

public class LacoFor1 {

	public static void main(String[] args) {
		
		int n1,n2,x;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		n2 = leia.nextInt();
		
		if(n1 < n2) {
			for(x=n1; x<=n2; x++ ) {
				if(x % 3 ==0 && x % 5 ==0){
					System.out.println("\nO número "+x+" é divisível por 3 e 5");
				}
			}
		}else {
			System.out.println("\nO intervalo não é válido!");
		}
			
			

	}

}
