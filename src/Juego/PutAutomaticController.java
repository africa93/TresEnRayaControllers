package Juego;

import java.util.Scanner;

public class PutAutomaticController implements IPutController {

private String nombre;
	
	public PutAutomaticController(int nombre) {
		this.nombre = Integer.toString(nombre);
	}
	public void put(Tablero tablero) {
		System.out.println("Turno de la máquina");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(!tablero.ocupada(i, j)){
					tablero.rellena(i, j, nombre);
					return;
				}
			}
		}
		
	}

}
