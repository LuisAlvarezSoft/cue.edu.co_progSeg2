package application;

import models.Product;
import repository.Repository;
import repository.impl.ProductRepositoryImpl;

import java.sql.Connection;
import java.sql.SQLException;

public class Main2 {
    public static void main(String[] args) {
        try (Connection conn = DatabaseConnection.getInstance()) {
            Repository<Product> repository = new ProductRepositoryImpl();
            System.out.println("*** List products from database");
            repository.list().forEach(System.out::println);
            System.out.println("*** Get by Id: 3");
            System.out.println(repository.byId(3L).toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
