package ar.edu.unlp.info.oo1.ej14_intervalo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class DateLapseTest {
	
	DateLapse dl, dlInvertido;
	LocalDate fechaTrue, fechaFalse;
	
	@BeforeEach
	void setUp() throws Exception {
		dl = new DateLapse(LocalDate.of(1972, 12, 15), LocalDate.of(2032, 12, 15));
		dlInvertido = new DateLapse(LocalDate.of(2032, 12, 15), LocalDate.of(1972, 12, 15));
		fechaTrue = LocalDate.of(2023, 9, 12);
		fechaFalse = LocalDate.of(2050, 1, 31);
	}
	
    @Test
    public void testFrom() {
        assertEquals(LocalDate.of(1972, 12, 15), dl.getFrom());
        assertEquals(LocalDate.of(2032, 12, 15), dlInvertido.getFrom());
    }
    
    @Test
    public void testTo() {
        assertEquals(LocalDate.of(2032, 12, 15), dl.getTo());
        assertEquals(LocalDate.of(1972, 12, 15), dlInvertido.getTo());
    }
    
    @Test
    public void testDiffDays() {
        assertEquals(21915, dl.sizeInDays());
    }
    
    @Test
    public void testDiffDaysInvertido() {
        assertEquals(21915, dlInvertido.sizeInDays());
    }
    
    @Test
    public void testIncludeDate() {
        assertTrue(dl.includesDate(fechaTrue));
        assertFalse(dl.includesDate(fechaFalse));
    }
}
