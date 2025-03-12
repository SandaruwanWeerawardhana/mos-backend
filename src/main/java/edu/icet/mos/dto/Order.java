package edu.icet.mos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {
    private Integer orderID;
    private String customerName;
    private String contact;
    private Integer itemID;
    private Integer qty;
    private Double price;
    private Integer discount;
    private Double totPrice;
}
