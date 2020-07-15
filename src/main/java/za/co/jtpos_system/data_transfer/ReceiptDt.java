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
public class ReceiptDt {
    private long reciptId;
    private String productName;
    private double price;
    private int quantity;
    private double grandPrice;

    public ReceiptDt(long reciptId, String productName, double price, int quantity,double grandPrice) {
        this.reciptId = reciptId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.grandPrice = grandPrice;
    }

    public ReceiptDt() {
    }

    public long getReciptId() {
        return reciptId;
    }

    public void setReciptId(long reciptId) {
        this.reciptId = reciptId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getGrandPrice() {
        return grandPrice;
    }

    public void setGrandPrice(double grandPrice) {
        this.grandPrice = grandPrice;
    }

    @Override
    public String toString() {
        return "ReceiptDt{" + "reciptId=" + reciptId + ", productName=" + productName + ", price=" + price + ", quantity=" + quantity + ", grandPrice=" + grandPrice + '}';
    }
 
}
