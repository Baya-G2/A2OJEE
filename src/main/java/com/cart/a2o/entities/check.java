package com.cart.a2o.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("CHECK")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class check extends payment{
    private String BankName;
    private String BankId;
}
