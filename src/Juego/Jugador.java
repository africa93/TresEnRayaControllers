package Juego;

import java.util.Scanner;

public class Jugador {

	private String nombre;
	public Jugador(String i) {
		this.nombre = i;
	}

	public void poner(Tablero tablero, Scanner entradaEscaner) {
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

	public void mover(Tablero tablero, Scanner entradaEscaner) {
		boolean ocupada = false;
		while(!ocupada){
			System.out.println("Introduce columna y fila de la ficha que quieres mover jugador "+nombre);
			System.out.println("Fila: ");
	        int columnaVieja = entradaEscaner.nextInt();
	        System.out.println("Columna: ");
			int filaVieja = entradaEscaner.nextInt();
			//tablero.borra devuelve true si habia una ficha del jugador en la casilla, sino devuelve false
			if(tablero.borra(columnaVieja, filaVieja, nombre)){
				poner(tablero, entradaEscaner);
				ocupada=true;
			}else{
				System.out.println("La casilla seleccionada no contiene una ficha del jugador "+nombre);
			}
		}
	}

}
