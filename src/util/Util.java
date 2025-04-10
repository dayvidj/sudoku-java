package util;

public class Util {
	// Verifica se um número é válido (entre 1 e 9)
	public static boolean validarNumero(int numero) {
		return numero >= 1 && numero <= 9;
	}

	// Verifica se há conflitos no tabuleiro
	public static boolean verificarConflitos(int[][] tabuleiro) {
		return verificarLinhas(tabuleiro) || verificarColunas(tabuleiro) || verificarSubGrades(tabuleiro);
	}

	// Verifica conflitos nas linhas
	private static boolean verificarLinhas(int[][] tabuleiro) {
		for (int[] linha : tabuleiro) {
			boolean[] numeros = new boolean[10]; // Índices de 1 a 9

			for (int numero : linha) {
				if (numero != 0) {
					if (numeros[numero]) {
						return true; // Conflito encontrado
					}
					numeros[numero] = true;
				}
			}
		}
		return false; // Sem conflitos
	}

	// Verifica conflitos nas colunas
	private static boolean verificarColunas(int[][] tabuleiro) {
		for (int coluna = 0; coluna < 9; coluna++) {
			boolean[] numeros = new boolean[10]; // Índices de 1 a 9

			for (int linha = 0; linha < 9; linha++) {
				int numero = tabuleiro[linha][coluna];
				if (numero != 0) {
					if (numeros[numero]) {
						return true; // Conflito encontrado
					}
					numeros[numero] = true;
				}
			}
		}
		return false; // Sem conflitos
	}

	// Verifica conflitos nas sub-grades 3x3
	private static boolean verificarSubGrades(int[][] tabuleiro) {
		for (int inicioLinha = 0; inicioLinha < 9; inicioLinha += 3) {
			for (int inicioColuna = 0; inicioColuna < 9; inicioColuna += 3) {
				if (verificarConflitoSubGrade(tabuleiro, inicioLinha, inicioColuna)) {
					return true; // Conflito encontrado
				}
			}
		}
		return false; // Sem conflitos
	}

	// Verifica uma sub-grade 3x3 específica
	private static boolean verificarConflitoSubGrade(int[][] tabuleiro, int inicioLinha, int inicioColuna) {
		boolean[] numeros = new boolean[10]; // Índices de 1 a 9

		for (int linha = inicioLinha; linha < inicioLinha + 3; linha++) {
			for (int coluna = inicioColuna; coluna < inicioColuna + 3; coluna++) {
				int numero = tabuleiro[linha][coluna];
				if (numero != 0) {
					if (numeros[numero]) {
						return true; // Conflito encontrado
					}
					numeros[numero] = true;
				}
			}
		}
		return false; // Sem conflitos
	}
}
