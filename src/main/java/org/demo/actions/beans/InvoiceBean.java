package org.demo.actions.beans;

import java.util.Date;

public class InvoiceBean {

    private String subject;
    private Date dateFrom;
    private Date dateTo;
    private String price;

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getSubject() {
        return subject;
    }

    public String getPrice() {
        return price;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    //vamos a calcular el iva
    public Double calculateIva(){

        if(price != null && !price.isEmpty()){
            try{
                Double priceValue = Double.parseDouble(price);
                return priceValue * 0.21;
            } catch (NumberFormatException e) {
                return 0.0;
            }
        }
        return 0.0;
    }

    public Double calculateTotal(){

        double ivaValue = calculateIva();
        double priceValue = 0.0;

        if(price != null && !price.isEmpty()){
            try{
                priceValue = Double.parseDouble(price);
            } catch (Exception e) {
                priceValue = 0.0;
            }
        }
        return priceValue + ivaValue;
    }



}
