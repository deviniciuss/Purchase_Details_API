package com.purchase.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import javax.persistence.*;
import java.util.Date;



@Data
@Entity
@Table(name="purchase")
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Purchase extends AbstractModel{

    @NotNull
    private String productType;

    @NotNull
    private Date expires;

    @OneToOne(cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.EAGER)
    private Details purchaseDetails ;

}
