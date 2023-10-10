package ar.edu.unlp.info.oo1.ej14_intervalo;

import java.time.LocalDate;

public class DateLapseNew implements DateLapseInterface {
	
	private LocalDate from;
	private int sizeInDays;
	
	public DateLapseNew(LocalDate from, int sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays;
	}

	@Override
	public LocalDate getFrom() {
		return this.from;
	}

	@Override
	public LocalDate getTo() {
		return this.from.plusDays(this.sizeInDays);
	}

	@Override
	public int sizeInDays() {
		return this.sizeInDays;
	}

	@Override
	public boolean includesDate(LocalDate other) {
		return other.isAfter(this.from) && other.isBefore(this.getTo());
	}

}
