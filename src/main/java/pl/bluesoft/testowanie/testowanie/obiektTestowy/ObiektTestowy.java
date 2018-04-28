package pl.bluesoft.testowanie.testowanie.obiektTestowy;
import org.apache.log4j.Logger;
import pl.bluesoft.testowanie.testowanie.aspekt.LogSth;

public class ObiektTestowy {

	public ObiektTestowy() {
		System.out.println("Konstruktor obiektu testowego");
	}
	private Logger log = Logger.getLogger(ObiektTestowy.class);


	@LogSth
	public void obiektTestowyPrint() throws Exception {
		System.out.println("printowanie obiekt testowy!!");
		log.info("LOGUJE SIE!");

	
	}
}
