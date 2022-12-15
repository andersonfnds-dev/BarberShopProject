package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Barbearia {
	
	Scanner scanner = new Scanner(System.in);
	
	public List<String> barbeiros = new ArrayList<String>();
	public List<Integer> cortes = new ArrayList<Integer>();
	public List<Integer> faturamento = new ArrayList<Integer>();
	
	public Barbearia(int nmBarbeiros,int precoCorte,double pctgLucro) {
		
		for (Integer i = 1; i < nmBarbeiros + 1; i++) {
			System.out.print("qual o nome do barbeiro "+i);
			String barbeiro = scanner.nextLine();
			barbeiros.add(barbeiro);
			
			System.out.println("quantos cortes o barbeiro "+i+" fez no dia?");
			int cortesDia = scanner.nextInt(); 
			scanner.nextLine();
			cortes.add(cortesDia);
			}

		int fatura = 0;
		for (int indice = 0; indice < barbeiros.size(); indice++) {
			System.out.println("\nBarbeiro: " + barbeiros.get(indice));
			System.out.println("Cortes: " + cortes.get(indice));
			fatura = cortes.get(indice) * precoCorte;
			faturamento.add(fatura);
			System.out.println("Fatura do dia: " + faturamento.get(indice));
		}
		
		int total = 0;
		for(int i = 0; i < faturamento.size(); i++) {
			total += faturamento.get(i);
		}
		System.out.println("\nO faturamento total foi de: "+total);
		System.out.println("O lucro da barbearia foi de: " + Math.round(total * (pctgLucro - 1)));
		
		scanner.close();
	}
	
		
	}

