package conParaUI;


public class Game {
	// lo unico que quiero saber es la posicion de cada jugador
		private int jugador[] = { 0, 0 };
		final int casillaFinal = 15;
		private int turno = 0;

		public boolean juega() {
			//TODO es un simulacro
			jugador[turno]+=5;
			return true;
		};

		public boolean comprobarGanador() {
			return true;
		};
		
		public int getPosicionJugadorActual(){
			return jugador[turno];
		}
}
