package com.cart.a2o.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String FirstName;
    private String LastName;
    private String email;
    private String address;
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<commands> commands = new ArrayList<>();
    @ManyToOne
    private compte compte;

}
