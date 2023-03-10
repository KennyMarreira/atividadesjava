package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas: ");
		int n = sc.nextInt();
		Pessoa vect[] = new Pessoa[n];
		
		for (int i = 0; i < vect.length; i++) {
			double altura = sc.nextDouble();
			char sexo = sc.next().toLowerCase().charAt(0);
			vect[i] = new Pessoa(altura, sexo);
		}
		
		double menorAltura = vect[0].getAltura();
		double maiorAltura = vect[0].getAltura();
		for (int i = 1; i < vect.length; i++) {
				if (vect[i].getAltura() < menorAltura) {
					menorAltura = vect[i].getAltura();
				}
				if (vect[i].getAltura() > maiorAltura) {
					maiorAltura = vect[i].getAltura();
				}
		}
		
		double alturaMulheres = 0;
		double contMulheres = 0;
		for(int i = 0; i < vect.length; i++) {
			if (vect[i].getSexo() == 'f') {
				alturaMulheres += vect[i].getAltura();
				contMulheres += 1;
			}
		}
		
		double mediaAlturaMulheres = alturaMulheres / contMulheres;
		
		int contHomens = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getSexo() == 'm') {
				contHomens += 1;
			}
		}
		System.out.printf("Menor altura digitada: %.2f%n", menorAltura);
		System.out.printf("Maior altura digitada: %.2f%n", maiorAltura);
		System.out.printf("Media de altura das mulheres: %.2f%n", mediaAlturaMulheres);
		System.out.printf("Numero de homens: %d%n", contHomens);
		
		
		sc.close();
	}

}
