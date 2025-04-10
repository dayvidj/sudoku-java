package main;
import java.util.Scanner;

import model.JogoSudoku;

public class Main {

	public static void main(String[] args) {
		JogoSudoku sudoku = new JogoSudoku(args);
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("\nMenu Sudoku:");
			System.out.println("1. Iniciar um novo jogo");
			System.out.println("2. Colocar um novo número");
			System.out.println("3. Remover um número");
			System.out.println("4. Verificar jogo");
			System.out.println("5. Verificar status do jogo");
			System.out.println("6. Limpar");
			System.out.println("7. Finalizar o jogo");
			System.out.println("8. Sair");
			System.out.print("Escolha uma opção: ");
			
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				sudoku.iniciarNovoJogo();
				break;
			case 2:
				sudoku.colocarNumero(sc);
				break;
			case 3:
				sudoku.removerNumero(sc);
				break;
			case 4:
				sudoku.visualizarTabuleiro();
				break;
			case 5:
				sudoku.verificarStatus();
				break;
			case 6:
				sudoku.limparNumeros();
				break;
			case 7:
				sudoku.finalizarJogo();
				break;
			case 8:
				System.out.println("Saindo do jogo...");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		} while (opcao != 8);

		sc.close();
	}
}
