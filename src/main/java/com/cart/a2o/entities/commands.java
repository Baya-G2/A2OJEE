package com.cart.a2o.entities;

import com.cart.a2o.enums.OrderState;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class commands {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "commands", fetch = FetchType.LAZY)
    private List<orderDetail> orderDetails = new ArrayList<>();
    @OneToMany(mappedBy = "commands", fetch = FetchType.LAZY)
    private List<payment> payments = new ArrayList<>();
    @ManyToOne
    private customer customer;
    @ManyToOne
    private livraison livraison;


}
