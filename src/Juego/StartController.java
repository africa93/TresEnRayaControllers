package Juego;

import java.util.Scanner;

public class StartController {
	private IMoveController moveControllers [];
	private IPutController putControllers [];
	public StartController(){
		moveControllers = new IMoveController[2];
		putControllers = new IPutController[2];
	}
	public void control(){
		Scanner ent = new Scanner(System.in);
		System.out.println("Introduce el número de jugadores");
		int numJugadores = ent.nextInt();
		if(numJugadores==0){
			for(int i=0; i<2;i++){
				moveControllers[i] = new MoveAutomaticController(i);
				putControllers[i] = new PutAutomaticController(i);
			}
		}else if(numJugadores ==1){
			moveControllers[0] = new MoveAutomaticController(0);
			moveControllers[1] = new MoveManualController(1);
			putControllers[0] = new PutAutomaticController(0);
			putControllers[1] = new PutManualController(1);
		}else{
			for(int i=0; i<2;i++){
				moveControllers[i] = new MoveManualController(i);
				putControllers[i] = new PutManualController(i);
			}
		}
	}
	public IMoveController[] getMoveControllers(){
		return moveControllers;
	}
	public IPutController[] getPutMoveControllers(){
		return putControllers;
	}
}
