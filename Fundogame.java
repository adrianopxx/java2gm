import java.io.File;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class Fundogame {
    // onde a string é o endereço da música e o int é quantas vezes ela repete ;
    Sequencer player;
    public void tocarMusica(String nome, int repetir){
		try{
			player = MidiSystem.getSequencer();		//INICIA O TOCADOR
			Sequence musica = MidiSystem.getSequence(new File(nome));//CARREGA A MÚSICA A SER TOCADA
			player.open();	//ABRE O TOCADOR
			player.setSequence(musica);	//PASSA A MÚSICA QUE VAI SER TOCADA PARA O TOCADOR
			player.setLoopCount(repetir); //DEFINE QUANTAS VEZES VAI TOCAR A MÚSICA OBS: 0 = 1 vez; 1 = 2 vezes; 2 = 3 vezes...
			player.start();	//COMEÇA A TOCAR.... CASO QUEIRA PARAR DE TOCAR A MÚSICA BASTA: player.stop();
		}catch(Exception e){
			System.out.println("Erro ao tocar: "+nome);
		}
	}
    
}
