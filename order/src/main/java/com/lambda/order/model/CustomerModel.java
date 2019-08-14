package com.lambda.order.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customers")

public class CustomerModel {
    private String custid;
    private String custname;
    private String custcity;
    private String workingarea;
    private String custcountry;
    private String grade;
    private double openingamt;
    private double receiveamt;
    private double paymentamt;
    private double outstandingamt;
}
