package ru.venidiktov.logging.jdk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Стандартные механизмы JDK для вывода информации в источники
 * System.out и System.err это системные потоки вывода, которые можно использовать для логирования (Не для этого)
 * System.out и System.err используют многие реализации логирования под капотом
 * System.out и System.err имеют очень ограниченный функционал по сравнению с реальными логерами,
 * оправдано применять для взаимодействия с пользователем в консольном приложении или если нужен высокоскоростной логер (5-6 мс на вывод 1000 сообщений в лог)
 */
public class SystemOutAndErrLoggingApplication {

    public static void main(String[] args) {
        /**
         * Можно заменить место вывода системного потока,
         * например заменить место вывода на файл
         */
        try {
            System.setOut(new PrintStream(new FileOutputStream("out.log")));
            System.out.println("I'm write to file out.log!"); // Запишется в файл
            System.err.println("Hello!"); // Запишется в консоль
        } catch (FileNotFoundException e) {
            System.err.println("Нет файла out.log");
            throw new RuntimeException(e);
        }
    }
}
