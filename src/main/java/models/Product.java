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
    private Long idproduct;
    private String name;
    private double price;
    private LocalDateTime registrationDate;
}
