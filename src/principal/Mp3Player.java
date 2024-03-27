/*
 * Implementa la interfaz AdvancedMediaPlayer para reproducir archivos MP3.
 */
package principal;

/**
 *
 * @author Chava
 */
public class Mp3Player  implements AdvancedMediaPlayer{

    @Override
    public void playMp3(String fileName) {
        System.out.println("Reproduciendo archivo MP3: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
         // No implementado para archivos MP3
    }
    
}
