package ru.venidiktov.logging.log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Log4j вышел в 1999 году так как стандартные логеры JDK на тот момент были слабы
 * !!! В данный момент не развивается (с 2012г, с 2015г закрыт!) версия 1.2.17 последняя и имеет 5 Критических уязвимостей безопасности,
 * поэтому использовать Log4j не рекомендуется !!!
 */
public class Log4jLoggingApplication {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(Log4jLoggingApplication.class); // Данный LogManager ни как не связан с LogManager из JUL!
        logger.info("Привет, логирую через log4j!");
    }
}
