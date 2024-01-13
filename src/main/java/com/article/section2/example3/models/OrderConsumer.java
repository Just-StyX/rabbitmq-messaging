package com.article.section2.example3.models;

import com.article.section2.example3.object.InvoiceService;
import com.article.section2.example3.object.Order;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {
    private final InvoiceService invoiceService;

    public OrderConsumer(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @RabbitListener(queues = {"orderQueue"})
    public void receiveOrder(Order order) {
        invoiceService.produceInvoice(order);
    }
}
