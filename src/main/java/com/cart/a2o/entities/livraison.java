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
public class livraison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String addresse_liv;
    private Date date_de_liv;
    @OneToMany(mappedBy = "livraison", fetch = FetchType.LAZY)
    private List<commands> commands = new ArrayList<>();

}
