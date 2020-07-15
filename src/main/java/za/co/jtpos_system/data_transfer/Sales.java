/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.jtpos_system.data_transfer;

import java.util.List;

/**
 *
 * @author ayuk
 */
public class Sales {
    
    private Long code;
    private int qty;

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }
    
    
}
