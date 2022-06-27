package Player;


	
import java.io.File;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
		String path = "C:\\Users\\pablo\\Videos\\iVCam\teste.mp4";//diretorio do video de teste.
		Media media = new Media(new File(path).toURI().toString());//para criar a execução atravez da mídia passada no diretório.
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		MediaView mv = new MediaView(mediaPlayer);
		mediaPlayer.setAutoPlay(true);
		
		  Group root = new Group();  
	      root.getChildren().add(mv);  
	      Scene scene = new Scene(root,1080,720);//para resolução maior
	      primaryStage.setScene(scene);  
	      primaryStage.setTitle("Skytef MP4  video player ");  
	      primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
