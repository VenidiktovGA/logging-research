package ru.venidiktov.logging.jdk;

import java.util.logging.Logger;

/**
 * Стандартный логер появившийся в JDK 1.4 в пакете java.util.logging
 * java.util.logging == JUL
 * Данный логер имеет низкую производительность поэтому использовать его не рекомендуется (70-80 мс на вывод 1000 сообщений в лог)
 * низкая производительность связана с не оптимальными алгоритмами сбора информации, например место где происходит логирование,
 * так же в jul нет асинхронного логирования (Можно реализовать асинхронное логирование самому расширев jul), еще минус это
 * слабая документация
 * В JBossLogManager jul становится фасадом, следовательно производительность логирования через jul
 * в таком случае равна производительности через JBossLogManager (22-23 мс на вывод 1000 сообщений в лог)
 * Плюсы:
 * гибкая и расширяемая архитектура, полноценный функционал для логирования, для использования не нужны сторонние зависимости в код (чистая архитектура)
 * JUL можно использовать как фасад!
 */
public class JulLoggingApplication {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(JulLoggingApplication.class.getName()); // Получаем логер
        logger.info("Лог через стандартный логгер!");
    }
}
