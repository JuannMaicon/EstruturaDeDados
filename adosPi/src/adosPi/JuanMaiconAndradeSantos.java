package adosPi;

import javax.swing.JOptionPane;

public class JuanMaiconAndradeSantos {
	
	public static void main(String[] args) {
		char continuar;
		String ordemMa,valor,res;
		int ordem,somaTotal,maiorNum,menorNum,somaDp,somaDs;
		
		do {
			ordemMa = JOptionPane.showInputDialog("Digite a ordem da matriz");
			ordem = Integer.parseInt(ordemMa);
			int [][] matriz = new int [ordem][ordem];
			
			for(int i = 0; i < ordem; i++) {
				for(int j = 0;j < ordem; j++ ) {
					valor = JOptionPane.showInputDialog(String.format("Digite o valor para matriz [%d][%d]:",i,j));
					matriz[i][j] = Integer.parseInt(valor);
				}
			}
			
			somaTotal = 0;
			maiorNum = Integer.MIN_VALUE;
			menorNum = Integer.MAX_VALUE;
			somaDp = 0;
			somaDs = 0;
			
			for(int i = 0; i < ordem; i++) {
				for(int j = 0; j < ordem; j++) {
					somaTotal += matriz[i][j];
					if(matriz[i][j] > maiorNum) {
						maiorNum = matriz[i][j];
					}
					if(matriz[i][j] < menorNum) {
						menorNum = matriz[i][j];
					}
					if(i == j) {
						somaDp += matriz[i][j];
					}
					if(i + j == ordem - 1) {
						somaDs += matriz[i][j];
					}
				}
			}
			
			res = String.format("Soma de todos os números da matriz: %d\n"+
			"Maior número da matriz: %d\n"+ 
			"Menor número da matriz: %d\n"+
			"Soma da diagonal pricipal: %d\n"+
			"Soma da diagonal secundária: %d",somaTotal,maiorNum,menorNum,somaDp,somaDs);
			JOptionPane.showMessageDialog(null, res);
			
			continuar = (char) JOptionPane.showConfirmDialog(null,"Deseja cadastrar uma nova matriz?","continuar", JOptionPane.YES_NO_OPTION);
		}while(continuar == JOptionPane.YES_NO_OPTION);
 }
}
