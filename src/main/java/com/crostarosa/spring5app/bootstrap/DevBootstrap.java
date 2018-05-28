package com.crostarosa.spring5app.bootstrap;

import com.crostarosa.spring5app.model.Customer;
import com.crostarosa.spring5app.model.Order;
import com.crostarosa.spring5app.model.Product;
import com.crostarosa.spring5app.repositories.CustomerRepository;
import com.crostarosa.spring5app.repositories.OrderRepository;
import com.crostarosa.spring5app.repositories.ProductRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private CustomerRepository customerRepository;
    private OrderRepository orderRepository;
    private ProductRepository productRepository;

    public DevBootstrap(CustomerRepository customerRepository, OrderRepository orderRepository, ProductRepository productRepository) {
        this.customerRepository = customerRepository;
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData(){
        Product phone = new Product();
        phone.setCost(699.99);
        phone.setName("iPhone 32 gb");

        productRepository.save(phone);

        Customer joe = new Customer();
        joe.setCreated(new Date());
        joe.setName("Joe");

        Order customerOrder = new Order();
        customerOrder.setName("Joes Order");
        customerOrder.setCustomer(joe);
        customerOrder.getProducts().add(phone);

        joe.getOrders().add(customerOrder);

        customerRepository.save(joe);
        orderRepository.save(customerOrder);

    }

}
