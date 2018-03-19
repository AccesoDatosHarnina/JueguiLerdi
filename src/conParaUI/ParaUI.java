package conParaUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class ParaUI extends UI {
	boolean alternativa=false;
	private Game game;
	public ParaUI() {
		super();
		game=new Game();
		btnJuega.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO queda lo de representar la situacion del juego
				if(game.juega()) {
					//Alguna forma de identificar etiquetas
					alternativa=!alternativa;
					int nuevaPosicion=game.getPosicionJugadorActual();
				//debo encontrar la label con la posicion correcta
					if(dameCasilla().getName().equals(String.valueOf(nuevaPosicion))){}
					dameCasilla().setText(String.valueOf(nuevaPosicion));
					if(game.comprobarGanador()){
						System.out.println("Ya esta");
					}
				}
			}
		});
	}
public JLabel dameCasilla(){
	if(alternativa) return label;
	else return label_3;
}
}
