package models;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder


public class Product {
    private String id;
    private String name;
    private double price;
    private LocalDateTime registrationDate;

    public void setId(long id) {
    }
}
