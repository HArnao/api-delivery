package com.delivery.apidelivery.controller;

import com.delivery.apidelivery.entities.Food;
import com.delivery.apidelivery.entities.OrderRequest;
import com.delivery.apidelivery.services.OrderService;

import com.delivery.apidelivery.entities.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private List<Food> menu = new ArrayList<>();

    public OrderController(){
        //Mi menú
        menu.add(new Food("Chaufa", "Arroz y pollo", 9.99));
        menu.add(new Food("Arroz con pato", "Arroz y pato", 15.00));
        menu.add(new Food("Arroz con cabrito", "Arroz y cabrito", 15.99));
    }

    @Autowired
    private OrderService orderService;

    @GetMapping("/menu")
    public List<Food> getMenu(){
        return menu;
    }

    //URL para crear un nuevo pedido
    @PostMapping("/create")
    public Order createOrder(@RequestBody OrderRequest orderRequest) {
        return orderService.createOrder(orderRequest);
    }

    //URL para obtener el estado de un pedido para su ID
    @GetMapping("/{id}/status")
    public String getOrderStatus(@PathVariable String id) {
        return orderService.getOrderStatus(id);
    }

    //URL para ver el estado de todos los pedidos
    @GetMapping("/all")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    //URL cambiar el estado del pedido por el id
    @PutMapping("/{id}/actualEs")
    public ResponseEntity<Order> updateOrder(@PathVariable String id, @RequestBody Order order){
        Order order1 = orderService.buscarId(id);
        if(order1 == null){
            return ResponseEntity.notFound().build();
        } else{
            order1.setStatus(order.getStatus());
            return ResponseEntity.ok().body(order1);
        }
    }
}
