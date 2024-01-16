package com.example.pampam.orders.model.response;

import com.example.pampam.orders.model.entity.OrderedProduct;
import lombok.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrdersCreateRes {
    Long idx;
    LocalDate orderDate;
    List<OrderedProduct> orderProductsList = new ArrayList<>();
}
