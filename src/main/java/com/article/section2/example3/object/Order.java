package com.article.section2.example3.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Order {
    private String orderedItem;
    private int quantityOrdered;
    private double itemPrice;
    private double tax;
}
