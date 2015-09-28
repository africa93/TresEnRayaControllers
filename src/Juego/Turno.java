package Juego;

public class Turno {
	private int toca = 0;
	public int toca() {
		return toca;
	}

	public void cambiar() {
		if(toca==0){
			this.toca=1;
		}else{
			toca=0;
		}
	}

}
