package com.crostarosa.spring5app.bootstrap;

import com.crostarosa.spring5app.model.Customer;
import com.crostarosa.spring5app.model.Order;
import com.crostarosa.spring5app.repositories.CustomerRepository;
import com.crostarosa.spring5app.repositories.OrderRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private CustomerRepository customerRepository;
    private OrderRepository orderRepository;

    public DevBootstrap(CustomerRepository customerRepository, OrderRepository orderRepository) {
        this.customerRepository = customerRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData(){
        Customer joe = new Customer();
        joe.setCreated(new Date());
        joe.setName("Joe");

        Order customerOrder = new Order();
        customerOrder.setName("Joes Order");
        customerOrder.setCustomer(joe);

        joe.getOrders().add(customerOrder);

        customerRepository.save(joe);
        orderRepository.save(customerOrder);

    }

}
