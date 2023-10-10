package ar.edu.unlp.info.oo1.ej15_alquiler;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate from, to;
	
	public DateLapse(LocalDate from, LocalDate to) {
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
	
	// [ fecha From, ...
	private boolean cumpleInicio(LocalDate other) {
		return other.isAfter(this.getFrom()) || other.isEqual(this.getFrom());
	}
	
	// ... , fecha To]
	private boolean cumpleFin(LocalDate other) {
		return other.isBefore(this.getTo()) || other.isEqual(this.getTo());
	}
	
	//Devuelve si el intervalo esta dentro del periodo
	public boolean overlaps(DateLapse anotherDateLapse) {
		return this.cumpleInicio(anotherDateLapse.getFrom()) && this.cumpleFin(anotherDateLapse.getTo());
	}
}
