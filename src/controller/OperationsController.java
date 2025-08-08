package controller;

import java.util.Scanner;

public class OperationsController {
	public OperationsController() {
		super();
	}

	public void manipulaVetor(int[] seq) {
		for (int pointer: seq) {
			if ((pointer % 2) != 0) {
				System.out.printf("%n %d é um número impar... %n", pointer);
			} else if((pointer % 10 == 0)) {
				System.out.printf("%n %d é um número par dívisivel por 10... %n", pointer);
			} else {

			}
		}
		System.out.print("\n");
	}
	
	public int[] preencherVetor(int[] seq, int tamanho, Scanner in) {
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Digite o valor do indice " + i);
			seq[i] = in.nextInt();
		}
		return seq;
	}

}
