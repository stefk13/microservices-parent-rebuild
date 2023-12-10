package ca.gbc.orderservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="t_order")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
// can also use @Data for getter/setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String orderNumber;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<OrderLineItem> orderLineItemList;

}
