package ru.venidiktov.logging.logback;

/**
 * Сразу можно обратить внимание что нет специфичных классов для logback,
 * используются классы для slf4j
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Большой плюс что logback реализует API slf4j
 */
public class LogbackLoggingApplication
{
    public static void main( String[] args )
    {
        Logger logger = LoggerFactory.getLogger(LogbackLoggingApplication.class);
        logger.info("Логирую через logback!!");
    }
}
