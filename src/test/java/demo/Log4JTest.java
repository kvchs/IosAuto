package demo;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import java.util.Objects;

public class Log4JTest {

    final static Logger log = Logger.getLogger(Log4JTest.class);

    @Test
    public void test(){
//        PropertyConfigurator.configure(System.getProperty("user.dir") + File.separator + "/src/main/resources/"  + "log4j.properties");
        PropertyConfigurator.configure(Objects.requireNonNull(Log4JTest.class.getResource("/log4j.properties")).getPath());

//        log.setLevel(Level.ERROR);
        log.debug("hhh");
        log.info("hhh");
        log.warn("hhh");
        log.error("hhh");
        log.fatal("hhh");

    }

}
