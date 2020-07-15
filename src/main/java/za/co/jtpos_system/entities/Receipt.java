/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.jtpos_system.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;
import java.util.Random;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class Receipt {
   
    @Id
    private long receiptId;
    @JsonManagedReference
    @OneToMany(cascade=CascadeType.MERGE)
    private List<CustomerPurchase> purchases;
    private double grandTotal;

  
    
}
