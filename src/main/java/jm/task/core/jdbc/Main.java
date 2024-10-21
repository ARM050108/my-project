package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Ivan", "Ivanov", (byte) 25);
        userDao.saveUser("Petr", "Petrov", (byte) 30);
        userDao.saveUser("Sidor", "Sidorov", (byte) 35);
        userDao.saveUser("Anna", "Ivanova", (byte) 28);

        List<User> users = userDao.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        userDao.cleanUsersTable();

        userDao.dropUsersTable();
    }
}
