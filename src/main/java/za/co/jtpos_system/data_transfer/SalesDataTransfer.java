/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.jtpos_system.data_transfer;

/**
 *
 * @author ayuk
 */

public class SalesDataTransfer {
    private Long barcode;
    private int qty;

    public SalesDataTransfer(Long barcode, int qty) {
        this.barcode = barcode;
        this.qty = qty;
    }

    public SalesDataTransfer() {
    }

    
    
    public Long getBarcode() {
        return barcode;
    }

    public void setBarcode(Long barcode) {
        this.barcode = barcode;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "SalesDataTransfer{" + "barcode=" + barcode + ", qty=" + qty + '}';
    }
    
    
}
