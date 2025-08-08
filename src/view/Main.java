package view;

import java.util.Random;
import java.util.Scanner;

import controller.OperationsController;

public class Main {
	public static void main(String args[]) {
		OperationsController op = new OperationsController();
		Random gen = new Random();
		int tamanho = 8;
		int[] sequencia = new int[tamanho];
		int opt = 0;

		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("1 - Modo Teste (8 indices do vetor e valores aleatórios). \n"
							 + "2 - Digitar o tamanho do vetor e seus valores. \n"
							 + "9 - Sair.");
			opt = in.nextInt();

			switch (opt) {
				case 1:
					// Usa o tamanho padrao e gera numeros aleatorios de 1 a 1000
					for (int i = 0; i < tamanho; i++) {
						sequencia[i] = gen.nextInt(1001)+1;
					}
					op.manipulaVetor(sequencia);
					break;
				case 2:
					System.out.println("Digite o tamanho do vetor: ");

					do {
						tamanho = in.nextInt();
						if (tamanho >= 100) {
							System.out.println("Limite de 100 indices. Digite novamente: ");
						}
					} while (tamanho >= 101);

					sequencia = new int[tamanho]; // altera o tamanho do vetor
					sequencia = op.preencherVetor(sequencia, tamanho, in);
					op.manipulaVetor(sequencia);
					break;
				case 9:
					System.out.println("Finalizando...");
					break;
				default:
					System.out.println("ERRO! valor digitado inválido, digite novamente... \n");
				}
		} while (opt != 9);
		in.close();
	}
}
