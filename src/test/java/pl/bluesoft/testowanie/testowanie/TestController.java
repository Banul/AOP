package pl.bluesoft.testowanie.testowanie;

import java.util.List;

import org.apache.log4j.Appender;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggingEvent;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import pl.bluesoft.testowanie.testowanie.config.Config;
import pl.bluesoft.testowanie.testowanie.controller.Controller;
import pl.bluesoft.testowanie.testowanie.obiektTestowy.ObiektTestowy;
import pl.bluesoft.testowanie.testowanie.appender.MyAppender;
import pl.bluesoft.testowanie.testowanie.aspekt.Aspekt;

@ContextConfiguration(classes = Config.class, loader = AnnotationConfigContextLoader.class)
public class TestController extends AbstractJUnit4SpringContextTests {
	private Logger log = Logger.getLogger(ObiektTestowy.class);

	@Autowired
	Aspekt aspekt;

	@Autowired
	Controller controller;

	@Autowired
	private ObiektTestowy obiekt;

	@Autowired
	private MyAppender appender;

	@Before
	public void setUp() {
		Logger.getLogger(ObiektTestowy.class).addAppender(appender);
	}

	@After
	public void tearDown() {
		Logger.getLogger(ObiektTestowy.class).removeAllAppenders();
	}

	@Test
	public void testMethod() throws Exception {
//		Logger.getLogger(ObiektTestowy.class).addAppender(appender);
//        Logger log = Logger.getLogger(ObiektTestowy.class);
//        log.info("chuj");
        obiekt.obiektTestowyPrint();
        List<LoggingEvent> log1 = appender.getLog();
		System.out.println(log1.get(0).getMessage());
	}

}
