package ru.strebkov.dz_Spring_Jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import ru.strebkov.dz_Spring_Jdbc.model.Customers;
import ru.strebkov.dz_Spring_Jdbc.model.Orders;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@SpringBootApplication
public class RunnerApplication implements CommandLineRunner {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    public static void main(String[] args) {
        SpringApplication.run(RunnerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // DataSource dataSource
//        List<Customers> customers = jdbcTemplate.query(
//                "select* from netology4.customers",
//                // new RowMapper<Customers>(){  @Override public Customers mapRow(.......)
//                (resultSet, rowNam) -> {
//                    System.out.println("Номер строчки на которой находиться курсор: " + rowNam);
//                    int id = resultSet.getInt("id");
//                    String name = resultSet.getString("name");
//                    String surname = resultSet.getString("surname");
//                    int age = resultSet.getInt("age");
//                    String phone_namber = resultSet.getString(5) ;//"phone_namber");
//                    return  new Customers(id,name, surname, age, phone_namber);
//                });
//        customers.forEach(System.out :: println);

        //NamedParameterJdbcTemplate namedParameterJdbcTemplate;
        Map<String, Object> params = new HashMap<>();
       // params.put("name", "Oly");
       // params.put("age", 20);
        params.put("product_name", "DVD");

        List<Customers> customers1 = namedParameterJdbcTemplate.query(
            //   "select* from netology.customers where name=:name", //and age=:age",
                "select *\n" +
                        "from netology.customers c join netology.orders o\n" +
                        "on c.id = o.order_id where product_name=:product_name;",
                params,
                (resultSet, rowNam) -> {
                    System.out.println("Номер строчки на которой находиться курсор: " + rowNam);
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String surname = resultSet.getString("surname");
                    int age = resultSet.getInt("age");
                    String phone_namber = resultSet.getString(5);   //"phone_namber");
                    return new Customers(id, name, surname, age, phone_namber);
                });
        customers1.forEach(System.out::println);

//NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//        Map<String, Object> params = new HashMap<>();
//        params.put("name", "alexey");
//
//        List<Orders> customers2 = namedParameterJdbcTemplate.query(
////               "select product_name from netology.orders\n" +
////                       " join netology.customers on orders.customer_id = customers.id\n" +
////                       "where lower(customers.name)=:name;",
//               "select * from netology.orders; ",
//                params,
//                (resultSet, rowNam) -> {
//                    System.out.println("Номер строчки на которой находиться курсор: " + rowNam);
//                    int id = resultSet.getInt(1);       //"order_id");
//                    String order_date = resultSet.getString("order_date");
//                    String product_name = resultSet.getString("product_name");
//                    int amount = resultSet.getInt("amount");
//                    int customer_id = resultSet.getInt("customer_id");
//                    return new Orders(id, order_date, product_name, amount, customer_id);
//                });
//        customers2.forEach(System.out::println);


        System.out.println("schema start");

    }
}































