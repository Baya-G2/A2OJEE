package com.cart.a2o.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("CASH")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class cash extends payment{
    private Double cashTendered;
}
