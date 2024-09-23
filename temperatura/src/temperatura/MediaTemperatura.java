package temperatura;

import java.util.Scanner;

public class MediaTemperatura {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		double[] temperatura = new double[7];
		double soma = 0, media;
		int contador, diasAcima, diasAbaixo;
		for (int i = 0; i < 7; i++) {
			System.out.println("Digite a" + i + "Temperatura");
			temperatura[i] = Scan.nextDouble();

		}
		media = soma / 7;
		diasAcima = 0;
		diasAbaixo = 0;
		for (int i = 1; i <= 7; i++) {
			if (temperatura[1] > media) {
				diasAcima += 1;
}
			if(temperatura [i]< media) {
				diasAbaixo += 1;
			}
			System.out.println("Total de dias que a temperatura ficou acima da média"+ diasAcima);
System.out.println("Total de dias que a temperatura ficou abaixo da média"+ diasAbaixo);
		}
	}

}
