package Cont;

import java.util.ArrayList;

import unitins.ArrayTins;

class PlantaPredio {
	String endereco;
	String cor;
}

public class LaboratorioDeEstudo {
	
	public static void main(String[] args) {
		
		ArrayList<PlantaPredio>listaJava = new ArrayList<PlantaPredio>();
		ArrayTins<PlantaPredio>listaTins = new ArrayTins<PlantaPredio>();
		
		/*System.out.println(listaJava.isEmpty());
		System.out.println(listaTins.isEmpty());
		
		System.out.println(listaJava.size());
		System.out.println(listaTins.size());
		*/
		
		//listaJava.add(new PlantaPredio()); //inserido na posição 0
		//listaJava.add(new PlantaPredio()); //inserido na posição 1
		//listaJava.add(0, new PlantaPredio()); //inserido na posição 0, empurra os outros para frente
		//listaJava.add(8, new PlantaPredio()); // não pode, pois adiciona de 1 por 1 posição.
											// adiciona elementos até chegar na posição 8
		
		
		
		
		/* listaJava.remove(2);
		Object referencia = listaJava.remove(2);
		referencia = null; */
		
		
		// cenários de sucesso
		listaTins.add(new PlantaPredio());
		listaTins.add(new PlantaPredio());
		listaTins.add(new PlantaPredio());
		listaTins.add(3, new PlantaPredio());
		System.out.println(listaTins);
		listaTins.remove(1);
		
		System.out.println("--------------------");
		
		
		// cenários de erro
		//listaTins.add(-1, new PlantaPredio());
		//listaTins.add(20, new PlantaPredio());
		//  listaTins.remove(-2);
		//	listaTins.remove(4);
		//  listaTins.remove(55);
		
		/*for( int i=0; i<100; i++) {
			listaTins.add(new PlantaPredio());
		}*/
		
		/*System.out.println(listaJava.isEmpty());
		System.out.println(listaTins.isEmpty());
		
		System.out.println(listaJava.size());
		System.out.println(listaTins.size());
		*/
		//System.out.println(listaJava);
		System.out.println(listaTins);
		
		//System.out.println(listaJava.get(0));
		//System.out.println(listaTins.get(1));
		//System.out.println(listaTins.get(2));
		
	}
}
