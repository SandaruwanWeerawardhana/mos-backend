package edu.icet.mos.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.icet.mos.dto.OrderDetails;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderID;
    private String cusID;
    private Double total;
    private String date;

    @OneToMany(mappedBy = "order" ,cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JsonIgnore
    private List<OrderDetailsEntity> orderDetail;

}
