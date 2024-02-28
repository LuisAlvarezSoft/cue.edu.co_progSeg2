package service;

import models.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;

public class Service {
    private Product createProduct(ResultSet resultSet) throws SQLException {
        Product product = new Product();
        product.setId(resultSet.getLong("idproduct"));
        product.setName(resultSet.getString("name"));
        product.setPrice(resultSet.getDouble("price"));
        product.setRegistrationDate(resultSet.getDate("register_date") != null ?
                resultSet.getDate("register_date")
                        .toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDateTime():
                null);
        return product;
    }

    }

