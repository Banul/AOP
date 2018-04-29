package pl.bluesoft.testowanie.testowanie.obiektTestowy;
import org.apache.log4j.Logger;
import pl.bluesoft.testowanie.testowanie.aspekt.LogSth;

public class ObiektTestowy {

	public ObiektTestowy() {
		System.out.println("Konstruktor obiektu testowego");
	}


	@LogSth
	public void obiektTestowyPrint() throws Exception {
		Logger log = Logger.getLogger(ObiektTestowy.class);
		log.info("LOGUJE SIE!");

	
	}
}
