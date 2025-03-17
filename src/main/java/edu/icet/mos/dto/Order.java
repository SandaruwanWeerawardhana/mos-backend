package edu.icet.mos.dto;

import edu.icet.mos.entity.OrderDetailsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {
    private Integer orderID;
    private String cusID;
    private Double total;
    private String date;
    private List<OrderDetailsEntity> orderDetail;
}
