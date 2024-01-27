package ru.venidiktov;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Slf4j это фасад логирования разработанный в 2006 году все тем же Ceki Gülcü создавшем log4j, log4j2, logback
 * !!! Slf4j сам не имеет готовых интеграций с логерами это делается за счет библиотек адаптеров коих великое множество !!!
 * В 2013 году был на 2 месте по популярности после JUnit
 */
public class Slf4jLoggingApplication
{
    public static void main( String[] args )
    {
        /**
         * Сообщения выведется через библиотеку адаптер slf4j-simple используя стандартный логер java с error уровнем (не использует JUL)
         */
        Logger logger = LoggerFactory.getLogger(Slf4jLoggingApplication.class);
        logger.info("Я логирую через фасад логирования Slf4j");
    }
}
