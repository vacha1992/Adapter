/*
 * Contiene el programa principal (main method) donde se ejemplifica el uso del patrón Adapter. 
   Se crea un reproductor de audio y se reproducen diferentes tipos de archivos utilizando el adaptador.
 */
package principal;

/**
 *
 * @author Chava
 */
public class MainAdapterExample {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "musica.mp3");
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("avi", "video.avi");
    }
}
