package com.purchase.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import javax.persistence.*;


@Data

@AllArgsConstructor
@NoArgsConstructor

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

@Component
public class Details extends AbstractModel {


    @NotNull
    private String description;

    @NotNull
    private int quantity;

    @NotNull
    private double price;
}
