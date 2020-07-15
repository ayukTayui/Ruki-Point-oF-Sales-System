/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.jtpos_system.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.co.jtpos_system.data_transfer.ReceiptDt;
import za.co.jtpos_system.data_transfer.Sales;
import za.co.jtpos_system.service.CustomerPurchaseService;

/**
 *
 * @author ayuk
 */
@RestController
public class SalesController {
    
    @Autowired
    private CustomerPurchaseService purchaseService;
    
    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.PUT, value = "sale/sellProduct")
    public ReceiptDt purchaseProduct(@RequestBody Sales sale){
        return purchaseService.purchaseProduct(sale);
    }
   
   @CrossOrigin(origins = "*")
   @RequestMapping(method = RequestMethod.POST, value = "sales/getCodes")
    public Object purchase(@RequestBody List<Sales> sales){
        return purchaseService.sellProducts(sales);
    } 
    
}
