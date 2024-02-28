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
    private String idproduct;
    private String name;
    private double price;
    private LocalDateTime registrationDate;

    public void setIdproduct(long idproduct) {
    }   
}
