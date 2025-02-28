package br.com.diferpan.aulasdev.machado.desafio01.services;

import br.com.diferpan.aulasdev.machado.desafio01.entities.Order;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;


@NoArgsConstructor
@Service
public class ShippingService {

    private double shippingValue;


    public double shipment(Order order){
        this.shippingValue = 0;
        if(order.getBasic() <100){
            this.shippingValue =+ 20;
        }else if (order.getBasic() >= 100.00 && order.getBasic() <=200.00){
            this.shippingValue=+12;
        }
        return this.shippingValue;
    }
}
