package ru.venidiktov.logging.jdk;

import java.lang.System.Logger; // Интерфейс

/**
 * Стандартное API из JDK являющееся фасадом для логирования, появилось в java 9
 *
 * По умолчанию в качестве реализации используется JUL (java.util.logging.Logger),
 * есть адаптеры для использования с другими логерами такими как log4j и так далее
 *
 * В java.lang.System.Logger и java.util.logging.Logger уровни логирования распределены по разному (есть в комментах в java.lang.System.Logger)
 */
public class PlatformLoggingApiApplication {
    public static void main(String[] args) {
        Logger logger = System.getLogger(PlatformLoggingApiApplication.class.getName());
        logger.log(Logger.Level.INFO, "Привет, логирую через {0}", Logger.class.getName()); // Есть подстановка параметров в лог
    }
}
