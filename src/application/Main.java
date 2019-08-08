package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static BorderPane root;
	
	public static void main(String args[]) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		root = FXMLLoader.load(getClass().getResource("/view/Menu.fxml"));

		Scene scene = new Scene(root, 600, 400);

		primaryStage.setTitle("Centralizador");
		primaryStage.setScene(scene);
		
//		primaryStage.setFullScreen(true);
		primaryStage.setHeight(Screen.getPrimary().getVisualBounds().getHeight());
		primaryStage.setWidth(Screen.getPrimary().getVisualBounds().getWidth());
		
		primaryStage.show();
	}
	
//	public static void main(String args[]) throws IOException, URISyntaxException, InterruptedException {
////Desktop.getDesktop().browse(new URI("<endereco>"));
////Runtime.getRuntime().exec("cmd.exe /C start <programa>.exe");
//
//Calendar teste = Calendar.getInstance();
//System.out.println("Hora atual: " + teste.get(Calendar.HOUR_OF_DAY) + ":" + teste.get(Calendar.MINUTE) + ":"
//		+ teste.get(Calendar.SECOND));
//System.out.println("Chrome Iniciado");
//
//for(int i = 0; i < 25; i++) {
//	teste = Calendar.getInstance();
//	System.out.println("Hora atual: " + teste.get(Calendar.HOUR_OF_DAY) + ":" + teste.get(Calendar.MINUTE) + ":"
//			+ teste.get(Calendar.SECOND));
//	Thread.sleep(1000);
//}
//}
}