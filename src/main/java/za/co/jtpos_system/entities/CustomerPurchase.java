/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.jtpos_system.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.Random;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author ayuk
 */
@Entity
@Data
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerPurchase {
    
    @Id
    private long purchaseId;
    private String productName;
    private double productPrice;
    private int quantity;
    @JsonBackReference
    @OneToOne(cascade = CascadeType.ALL)
    private Receipt receipt;

   
    
}
