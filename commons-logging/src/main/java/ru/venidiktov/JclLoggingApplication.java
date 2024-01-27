package ru.venidiktov;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * commons-logging Фасад логироваиня (Ведется слабая разработка).
 * При логировании целесообразно использовать фасад, это позволит легко сменить реализацию логера не меняя код,
 * плюс фасады логирования стабильней самих логеров
 * JCL используется во многих проектах, например в spring есть springJCL это форк JCL с доработками от spring
 *
 * !!! В данном случае используется реализация логера JUL !!!
 */
public class JclLoggingApplication
{
    public static void main( String[] args )
    {
        Log log = LogFactory.getLog(JclLoggingApplication.class);
        log.info("Я логирую через фасад commons-logging (JCL)");
    }
}
