package pl.bluesoft.testowanie.testowanie;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import pl.bluesoft.testowanie.testowanie.config.Config;
import pl.bluesoft.testowanie.testowanie.controller.Controller;
import pl.bluesoft.testowanie.testowanie.obiektTestowy.ObiektTestowy;
import pl.bluesoft.testowanie.testowanie.aspekt.Aspekt;
import pl.bluesoft.testowanie.testowanie.aspekt.LogSth;

//@RunWith(SpringJUnit4ClassRunner.class)
//@WebMvcTest(Controller.class)
@ContextConfiguration(classes = Config.class, loader = AnnotationConfigContextLoader.class)
public class TestController extends AbstractJUnit4SpringContextTests {

	@Autowired
	Aspekt aspekt;
	
	@Autowired
	Controller controller;
	
	@Autowired
	private ObiektTestowy obiekt;
	
	@Test
	@LogSth
	public void testController() throws Exception {
	//	mvc.perform(get("/test/a").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
		/*
		 *  ApplicationContext ctx = new AnnotationConfigApplicationContext(TestMongoConfigurationMain.class);
        MongoTemplate mongoTemplate = ctx.getBean(MongoTemplate.class);
		 * 
		 */
	
		controller.testController();
		Logger log = Logger.getLogger(ObiektTestowy.class);
		log.info("CHUJ");
	}

}
