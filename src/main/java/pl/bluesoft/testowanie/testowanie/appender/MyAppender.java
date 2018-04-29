package pl.bluesoft.testowanie.testowanie.appender;


import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

public class MyAppender extends AppenderSkeleton {

    private final List<LoggingEvent> log = new ArrayList<LoggingEvent>();

    @Override
    protected void append(LoggingEvent event) {
        log.add(event);
    }

    public void close() {

    }

    public boolean requiresLayout() {
        return false;
    }

    public List<LoggingEvent> getLog() {
        return new ArrayList<LoggingEvent>(log);
    }
}