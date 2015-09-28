package Juego;

public class TresEnRaya {
	private Tablero tablero;
	private StartController start;
	private Turno turno;
	
	public TresEnRaya(){
		tablero = new Tablero();
		turno = new Turno();
		start = new StartController();
	}
	public void jugar(){
		start.control();
		do{
			//muestra el tablero tal y como está
			tablero.mostrar();
			//Comprueba cuántas fichas hay. Si hay de cada jugador tres está completo
			if(!tablero.completo()){
				//Pide lugar de la ficha y pone
				start.getPutMoveControllers()[turno.toca()].put(tablero);
			}else{
				//Pide la ficha antigua y dónde va la nueva
				start.getMoveControllers()[turno.toca()].move(tablero);
			}
			//tablero.mostrar();
			//Cambia el turno del jugador
			turno.cambiar();
			//Comprueba si hay tres en raya
		}while(!tablero.hayTresEnRaya());
		turno.cambiar();
		System.out.println("Enhorabuena jugador "+turno.toca()+" ¡HAS GANADO!");
		tablero.mostrar();
	}
	
	public static void main(String [] args){
		new TresEnRaya().jugar();
	}
	
	
}
