package ru.venidiktov;

import org.jboss.logging.Logger;

/**
 * JbossLogging это фасад логирования от JBoss.
 * JbossLogging может использовать в качестве реализаций логеров JbossLogManager, log4j, log4j2, JUL (Исползуется по умолчанию),
 * так же JBossLogging может использовать SLF4J (то есть один фасад использует другой фасад)
 * JbossLogging используется в проектах от JBoss таких как Hibernate, wieldfly
 */
public class JbossLoggingApplication
{
    public static void main( String[] args )
    {
        /**
         * В качестве логeра по умолчанию используется JUL
         */
        Logger logger = Logger.getLogger(JbossLoggingApplication.class);
        logger.info("Я логирую через фасад JBossLogging!");
    }
}
