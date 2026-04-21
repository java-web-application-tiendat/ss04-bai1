package com.restaurant.repository;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    public String getAllOrders(){
        return "Danh danh toan bo don hang";
    }
    public String getOrderById(long id){
        return "thong tin don hang voi ID:" +id;
    }
}
