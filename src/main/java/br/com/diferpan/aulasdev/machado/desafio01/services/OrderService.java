package br.com.diferpan.aulasdev.machado.desafio01.services;

import br.com.diferpan.aulasdev.machado.desafio01.entities.Order;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@NoArgsConstructor

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order){
        double discountValue = order.getBasic() * (order.getDiscount() / 100);
        double shipment = shippingService.shipment(order);
        return (order.getBasic() - discountValue) + shipment;
    }
}
