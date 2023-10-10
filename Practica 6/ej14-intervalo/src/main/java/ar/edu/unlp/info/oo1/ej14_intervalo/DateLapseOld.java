package ar.edu.unlp.info.oo1.ej14_intervalo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapseOld implements DateLapseInterface {
	private LocalDate from, to;
	
	public DateLapseOld(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}

	public LocalDate getFrom() {
		return from;
	}

	public LocalDate getTo() {
		return to;
	}
	
	public int sizeInDays() {
		return Math.abs((int)ChronoUnit.DAYS.between(this.from, this.to));
	}
	
	public boolean includesDate(LocalDate other) {
		return other.isAfter(this.from) && other.isBefore(this.to);
	}
}
