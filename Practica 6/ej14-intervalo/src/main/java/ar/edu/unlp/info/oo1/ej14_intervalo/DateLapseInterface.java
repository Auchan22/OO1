package ar.edu.unlp.info.oo1.ej14_intervalo;

import java.time.LocalDate;

public interface DateLapseInterface {
	public LocalDate getFrom();
	public LocalDate getTo();
	public int sizeInDays();
	public boolean includesDate(LocalDate other);
}
