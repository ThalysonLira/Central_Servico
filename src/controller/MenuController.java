package controller;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import model.Relogio;

public class MenuController implements Initializable, Runnable {
	@FXML
	private Button btnAtendimento;

	@FXML
	private Button btnFrequencia;

	@FXML
	private Label txtHora;

	@FXML
	private ImageView imgSeta;

	private Relogio watch;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// Definir elementos da inicializacao
		this.watch = new Relogio(23, 52, 15);
//		getCurrentTime();
	}

	private void getCurrentTime() {
//		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		
		Platform.runLater(new Runnable() {
			public void run() {
				for (;;) {
					txtHora.setText(watch.getCurrentTime());
					watch.sumSecond();
				}
			}
		});
		
//		scheduler.scheduleAtFixedRate(run, 1, 1, TimeUnit.SECONDS);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (;;) {
			txtHora.setText(watch.getCurrentTime());
			watch.sumSecond();
		}
	}
}