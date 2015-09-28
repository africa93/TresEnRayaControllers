package Juego;

import java.util.Scanner;

public class PutManualController implements IPutController {

private String nombre;
	
	public PutManualController(int nombre) {
		this.nombre = Integer.toString(nombre);
	}
	public void put(Tablero tablero) {
		Scanner entradaEscaner = new Scanner (System.in);
		boolean ocupada = false;
		while(!ocupada){
			System.out.println("Introduce columna y fila para tu ficha jugador "+nombre);
			System.out.println("Fila: ");
	        int columna = entradaEscaner.nextInt(); 
			System.out.println("Columna: ");
			int fila = entradaEscaner.nextInt();
			if(tablero.ocupada(fila, columna)){
				System.out.println("La casilla ya está ocupada");
			}else{
				ocupada = true;
				tablero.rellena(columna, fila, nombre);
			}
		}
	}

}
