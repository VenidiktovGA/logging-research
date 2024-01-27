package ru.venidiktov.logging.jbosslogmanager;
/**
 * Напрямую jboss логгер не используется, взаимодействие идет через стандартный логер
 */
import java.util.logging.Logger;

/**
 * Logger от компании jboss
 */
public class JBossLogManagerLoggingApplication
{
    public static void main( String[] args )
    {
        Logger logger = Logger.getLogger(JBossLogManagerLoggingApplication.class.getName());
        logger.info("Я логирую через jboss log manager");
    }
}
