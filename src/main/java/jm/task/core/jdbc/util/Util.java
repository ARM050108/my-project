package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/first_db";
    private static final String USERNAME = "root"; // или другое имя пользователя
    private static final String PASSWORD = "root1";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Соединение успешно установлено!");
        } catch (SQLException e) {
            System.out.println("Не удалось установить соединение: " + e.getMessage());
        }
        return connection;
    }
}

