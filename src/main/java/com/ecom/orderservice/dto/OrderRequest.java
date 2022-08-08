package com.ecom.orderservice.dto;

import com.ecom.orderservice.entity.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {
    private List<OrderLineItemsDTO> orderLineItemsDTOList;
}
