package com.example.store.controller;

import com.example.store.entities.StoreProduct;
import com.example.store.servis.ServiceStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ControllerStore {

//@Autowired
    private static ServiceStore serviceStore;

    public ControllerStore(ServiceStore serviceStore) {
        this.serviceStore = serviceStore;
    }
    @GetMapping("/add")
    public List<Integer> addProductToCart(@RequestParam List<Integer> id){
        return serviceStore.addProduct(id);
    }
    @GetMapping("/get")
    public static List<Integer> getProductToCart(){
        return serviceStore.getProductList();
    }


}
