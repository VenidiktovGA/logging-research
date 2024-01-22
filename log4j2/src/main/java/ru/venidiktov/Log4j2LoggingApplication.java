package ru.venidiktov;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Log4j2 не совместим с Log4j
 * Log4j2 продолжение развития Log4j после того как из команды Log4j ушел главный разработчик и начал делать Logback
 * Log4j2 имеет все те-же преимущества что и Log4j
 */
public class Log4j2LoggingApplication
{
    public static void main( String[] args )
    {
        Logger logger = LogManager.getLogger(Log4j2LoggingApplication.class); // LogManager ни как не связан с LogManager из JUL
        logger.info("Привет, я логирую через Log4j2!");
    }
}
