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
public class DateLapseNewTest {
	
	DateLapseNew dl, dlInvertido;
	LocalDate fechaTrue, fechaFalse;
	
	@BeforeEach
	void setUp() throws Exception {
		dl = new DateLapseNew(LocalDate.of(2023, 12, 15), 5);
		dlInvertido = new DateLapseNew(LocalDate.of(2019, 12, 15), 1200);
		fechaTrue = LocalDate.of(2023, 12, 19);
		fechaFalse = LocalDate.of(2050, 1, 31);
	}
	
    @Test
    public void testFrom() {
        assertEquals(LocalDate.of(2023, 12, 15), dl.getFrom());
        assertEquals(LocalDate.of(2019, 12, 15), dlInvertido.getFrom());
    }
    
    @Test
    public void testTo() {
        assertEquals(LocalDate.of(2023, 12, 20), dl.getTo());
        assertEquals(LocalDate.of(2023, 03, 29), dlInvertido.getTo());
    }
    
    @Test
    public void testDiffDays() {
        assertEquals(5, dl.sizeInDays());
    }
    
    @Test
    public void testDiffDaysInvertido() {
        assertEquals(1200, dlInvertido.sizeInDays());
    }
    
    @Test
    public void testIncludeDate() {
        assertTrue(dl.includesDate(fechaTrue));
        assertFalse(dl.includesDate(fechaFalse));
    }
}
