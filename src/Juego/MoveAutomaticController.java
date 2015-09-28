package Juego;

public class MoveAutomaticController implements IMoveController{
	
	private String nombre;
	
	public MoveAutomaticController(int nombre) {
		this.nombre = Integer.toString(nombre);
	}
	public void move(Tablero tablero) {
		boolean acaba = false;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(tablero.ocupada(i, j)&& tablero.getFicha(i, j).equals(nombre)){
					tablero.borra(i, j, nombre);
				}
			}
		}
		for(int i=2; i<0;i++){
			for(int j=2; j<0; j++){
				if(!tablero.ocupada(i, j)){
					tablero.rellena(i, j, nombre);
				}
			}
		}
	}

}
