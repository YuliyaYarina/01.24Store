package com.example.store.repository;

import com.example.store.entities.StoreProduct;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Repository
@SessionScope
public class StoreCart {

//    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private final List<Integer> products;
    public StoreCart() {
        this.products = new ArrayList<>();
//        LOGGER.info("Store card is created.");
    }

    @NonNull
    public List<Integer> addProduct(List<Integer> id) {
//        Arrays.stream(id)
//                .forEach((producttId -> {
//                    if (products.containsKey(producttId)) {
//                        return;
//                    }
//                    products.put(producttId, new StoreProduct(producttId));
//                }));
        this.products.addAll(id);
        return  this.products;
//        LOGGER.info("Product(s) added in cart.");
    }

        public List<Integer> getProducts() {
//        LOGGER.info("Product list is got");
        return products;
    }
}
