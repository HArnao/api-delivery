package com.delivery.apidelivery.services;

import com.delivery.apidelivery.entities.Order;
import com.delivery.apidelivery.entities.OrderRequest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OrderService {
    private List<Order> orders = new ArrayList<>();

    //Constructor para crear un pedido
    public Order createOrder(OrderRequest orderRequest){
        Order order = new Order();
        //Asignamos los valores del pedido del cliente
        order.setId(UUID.randomUUID().toString());
        order.setCustomerName(orderRequest.getCustomerName());
        order.setCustomerEmail(orderRequest.getGetCustomerEmail());
        order.setStatus("En proceso");
        order.setCreationTime(LocalDateTime.now());
        order.setEstimatedDeliveryTime(LocalDateTime.now().plusMinutes(30));
        order.setItems(orderRequest.getItems());
        orders.add(order);
        return order;
    }

    //Metodo para ver el estado por el ID
    public String getOrderStatus(String id){
        Order order = buscarId(id);
        if (order!= null){
            return order.getStatus();
        } else{
            throw new RuntimeException("Pedido no encontrado");
        }
    }

    //Metodo para ver las ordenes
    public List<Order> getAllOrders(){
        return orders;
    }

    //Método para buscar la orden por su id
    public Order buscarId(String id){
        return orders.stream().filter(order -> id.equals(order.getId())).findFirst().orElse(null);
    }
}
