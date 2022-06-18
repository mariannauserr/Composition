package ru.netology.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PurchaseFilm {
    private int id;
    private int productId;
    private String productName;
    private int ticketPrice;
    private int duration;
}
