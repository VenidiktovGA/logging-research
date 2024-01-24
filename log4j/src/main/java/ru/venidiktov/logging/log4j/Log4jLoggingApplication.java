package ru.venidiktov.logging.log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Log4j вышел в 1999 году так как стандартные логеры JDK на тот момент были слабы
 * !!! В данный момент не развивается (с 2012г, с 2015г закрыт!) версия 1.2.17 последняя и имеет 5 Критических уязвимостей безопасности,
 * поэтому использовать Log4j не рекомендуется !!!
 *
 * В 2022 году Ceki Gülcü для того чтобы закрыть проблемы безопасности Log4j и его не нужно было срочно заменять с большими
 * затратами в проектах где он использовался, выпустил форк Log4j это Reload4j.
 * Reload4j создан исключительно для того чтобы заменить jar Log4j в проектах где он использовался напрямую без фасада на Reload4j где
 * закрыты основные проблемы безопасности Log4j, проект дальше развиваться не будет
 */
public class Log4jLoggingApplication {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(Log4jLoggingApplication.class); // Данный LogManager ни как не связан с LogManager из JUL!
        logger.info("Привет, логирую через log4j!");
    }
}
