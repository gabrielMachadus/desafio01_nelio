package br.com.diferpan.aulasdev.machado.desafio01.services;

import br.com.diferpan.aulasdev.machado.desafio01.entities.Order;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class OrderService {

    ShippingService entrega;

   public double total(Order order){
        double discountValue = order.getBasic() * (order.getDiscount() / 100);
        double shipment = entrega.shipment(order);
        return (order.getBasic() - discountValue) + shipment;
    }
}
