package sharafutdinov.artur.iam;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.IgniteException;
import org.apache.ignite.Ignition;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.List;

public class WriterToDB {
    /**
     * Логгирование
     */
    private static final Logger log = Logger.getLogger(WriterToDB.class);

    /**
     * Выгрузка данных в бд
     * @param lgn логин
     * @param prd пароль
     * @param db наименование базы данных
     * @param tbl наименование будущей таблицы
     * @param clmn наименование поля в таблице
     * @param list список для выгрузки
     * @param n количество элементов списка
     */
    public synchronized void setDB(String lgn,
                      String prd,
                      String db,
                      String tbl,
                      String clmn,
                      List<Long> list,
                      long n) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            log.error("драйвера нет");
        }

        try (Ignite ignite = Ignition.start(
                "/home/first/Desktop/apache-ignite-fabric-1.9.0-bin/examples/config/example-ignite.xml")) {

            IgniteCache<Integer, Long> cache = ignite.getOrCreateCache("myCache");

            Connection connection = getConPostgres(lgn, prd, db);
            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INTO " + tbl +
                    "(id, " + clmn + ")" + "VALUES (?, ?) ");
            for (int i = 0; i < n; i++) {;
                cache.put(i, list.get(i));
                preparedStatement.setInt(1, i);
                preparedStatement.setLong(2, list.get(i));
                preparedStatement.executeUpdate();

            }



        }catch (NullPointerException e) {
            log.error("null");
        }catch (IgniteException e) {
            log.error("игнайт");

        } catch (SQLException e) {
            log.error("соединение");
        }
    }

    /**
     * Соединение с бд
     * @param user логин
     * @param password пароль
     * @param database база данных
     * @return соединение
     * @throws SQLException пробрасываем исключение
     */

    public static Connection getConPostgres(String user,
                                            String password, String database)
            throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/"
                + database, user, password);

    }



}
