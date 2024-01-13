package com.article.section2.example3.object;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
public class InvoiceService {
    public void produceInvoice(Order order) {
        var item = order.getOrderedItem();
        var quantity = order.getQuantityOrdered();
        var price = order.getItemPrice();
        var tax = order.getTax();
        var totalAmount = (1 + tax) * quantity * price;
        var message = "Item : " + item + "\n" + "quantity : " + quantity + "\n" + "price per unit : " + price + "\n"
                 + "tax : " + tax + "\n" + "total due : " + totalAmount;

        System.out.println(message);
    }
}
