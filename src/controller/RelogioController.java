package controller;

import java.util.Calendar;

import model.Relogio;

public class RelogioController implements Runnable {
	private Relogio relogio;
	private Calendar time;

	public RelogioController() {
		this.time = Calendar.getInstance();
		this.relogio = new Relogio(time.get(Calendar.HOUR_OF_DAY), time.get(Calendar.MINUTE),
				time.get(Calendar.SECOND));
	}

	public String getCurrentTime() {
		return (getRelogio().getCurrentTime());
	}

	@Override
	public void run() {
		for (;;) {
			try {
				getRelogio().sumSecond();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public Relogio getRelogio() {
		return relogio;
	}

	public void setRelogio(Relogio relogio) {
		this.relogio = relogio;
	}
}