/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.jtpos_system.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.jtpos_system.data_transfer.ReceiptDt;
import za.co.jtpos_system.data_transfer.Sales;
import za.co.jtpos_system.data_transfer.SalesDataTransfer;
import za.co.jtpos_system.entities.CustomerPurchase;
import za.co.jtpos_system.entities.Product;
import za.co.jtpos_system.entities.Receipt;
import za.co.jtpos_system.repositories.CustomerPurchaseRepository;
import za.co.jtpos_system.repositories.ProductRepository;
import za.co.jtpos_system.repositories.ReceiptRepository;

/**
 *
 * @author ayuk
 */
@Service
public class CustomerPurchaseService {

    @Autowired
    private CustomerPurchaseRepository purchaseRepo;
    @Autowired
    private ProductRepository productRepo;
    @Autowired
    private ReceiptRepository receiptRepo;
    private List<CustomerPurchase> soldProducts = new ArrayList<>();
    List<Product> products = new ArrayList<>();
    private Receipt receipt;
    private CustomerPurchase purchased;
    private double grandTotal;
    private double subprice[];

    public Long generatedValues() {
        String generateAccountNumber = String.valueOf(new Random().nextInt()).substring(1);
        long value = Long.parseLong(generateAccountNumber);
        return value;
    }

    public Product updateProduct(Product product) {
        Product existingProduct = productRepo.findById(product.getProductBarcode()).get();
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        return productRepo.save(existingProduct);
    }

    public Object sellProducts(List<Sales> sales) {
        Product product = new Product();
        this.receipt = new Receipt();
        products = productRepo.findAll();
        for (int i = 0; i < sales.size(); i++) {
            subprice = new double[sales.size()];
            Sales getSale = sales.get(i);
            Product getProd = productRepo.getOne(getSale.getCode());
            if (getProd.getQuantity() > getSale.getQty()) {
                getProd.setQuantity(getProd.getQuantity() - getSale.getQty());
                subprice[i] = getProd.getPrice() * getSale.getQty();
                grandTotal = +subprice[i];
                purchased = new CustomerPurchase(generatedValues(), getProd.getName(), getProd.getPrice(), getSale.getQty(), receipt);
                this.receipt.setReceiptId(generatedValues());
                receipt.setGrandTotal(grandTotal);
                receipt.setPurchases(soldProducts);
                purchased.setReceipt(receipt);
                soldProducts.add(purchased);
                product = getProd;
            } else {
                return "Products Out Of Stock";
            }
        }

        purchaseRepo.save(purchased);
        receiptRepo.save(receipt);
        productRepo.save(product);

        return receipt;
    }

    public ReceiptDt purchaseProduct(Sales sale) {
        Product product = productRepo.getOne(sale.getCode());
        this.receipt = new Receipt();
        if (product.getQuantity() > sale.getQty()) {
            product.setQuantity(product.getQuantity() - sale.getQty());
            double subprice = product.getPrice() * sale.getQty();
            double grandTotal = subprice;
            this.receipt.setReceiptId(generatedValues());
            purchased = new CustomerPurchase(generatedValues(), product.getName(), product.getPrice(), sale.getQty(), receipt);
            receipt.setGrandTotal(grandTotal);
            receipt.setPurchases(soldProducts);
            purchased.setReceipt(receipt);
            soldProducts.add(purchased);
            this.grandTotal = grandTotal;
        }
        ReceiptDt dt = new ReceiptDt(receipt.getReceiptId(),purchased.getProductName(),purchased.getProductPrice(), sale.getQty(),this.grandTotal);
         purchaseRepo.save(purchased);
        receiptRepo.save(receipt);
        productRepo.save(product);
        return dt;
    }

}
