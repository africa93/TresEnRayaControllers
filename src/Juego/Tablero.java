package Juego;

public class Tablero {
	//culumnas * filas
	private String [][] fichas;
	
	public Tablero(){
		fichas = new String[3][3];
		for(int i=0; i<3; i++ ){
			for(int j=0; j<3; j++){
				fichas[i][j]= "_";
			}
		}
	}
	public void mostrar() {
		for(int i=0; i<3; i++ ){
			for(int j=0; j<3; j++){
				
					System.out.print(fichas[i][j]+" ");
			}
			System.out.println("\n ");
		}
	}

	public boolean completo(){
		int contador = 0;
		for(int i=0; i<3; i++ ){
			for(int j=0; j<3; j++){
				if(fichas[i][j] != "_"){
					contador++;
				}
			}
		}
		if(contador >= 6){
			return true;
		}else{
			return false;
		}
	}

	public boolean hayTresEnRaya() {
		if(fichas[0][0].equals(fichas[1][0]) && fichas[1][0].equals(fichas[2][0])&&!fichas[1][0].equals("_") ){
			return true;
		}
		if(fichas[0][1].equals(fichas[1][1]) && fichas[1][1].equals(fichas[2][1])&& !fichas[1][1].equals("_")){
			return true;
		}
		if(fichas[0][2].equals(fichas[1][2]) && fichas[1][2].equals(fichas[2][2])&& !fichas[1][2].equals("_")){
			return true;
		}
		if(fichas[0][0].equals(fichas[0][1]) && fichas[0][1].equals(fichas[0][2])&&!fichas[0][1].equals("_")){
			return true;
		}
		if(fichas[1][0].equals(fichas[1][1]) && fichas[1][1].equals(fichas[1][2])&& !fichas[1][1].equals("_")){
			return true;
		}
		if(fichas[2][0].equals(fichas[2][1]) && fichas[2][1].equals(fichas[2][2]) && !fichas[2][1].equals("_")){
			return true;
		}
		if(fichas[0][0].equals(fichas[1][1]) && fichas[1][1].equals(fichas[2][2])&& !fichas[1][1].equals("_")){
			return true;
		}
		if(fichas[0][2].equals(fichas[1][1]) && fichas[1][1].equals(fichas[2][0]) && !fichas[1][1].equals("_")){
			return true;
		}
		return false;
	}

	public boolean ocupada(int columna, int fila){
		if(fichas[fila][columna].equals(("_"))){
			return false;
		}
		return true;
	}
	public void rellena(int columna, int fila, String nombre){
		fichas[columna][fila] = nombre;
	}
	public String getFicha(int c, int f){
		return fichas[c][f];
	}
	public boolean borra(int c, int f, String nombre){
		if(getFicha(c,f).equals(nombre)){
			fichas[c][f] = "_";
			return true;
		}
		return false;
	}
}
