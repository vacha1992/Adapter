/*
 * Implementa la interfaz MediaPlayer y utiliza MediaAdapter para reproducir diferentes tipos de archivos de audio.
 */
package principal;

/**
 *
 * @author Chava
 */
public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Reproduciendo archivo MP3: " + fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Formato de audio no compatible");
        }
    }
    
}
