package com.solomon.javaorders.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//CUSTOMERS
//
//    CUSTCODE primary key, not null Long
//    CUSTNAME String, not null
//    CUSTCITY String
//    WORKINGAREA String
//    CUSTCOUNTRY String
//    GRADE String
//    OPENINGAMT double
//    RECEIVEAMT double
//    PAYMENTAMT double
//    OUTSTANDINGAMT double
//    PHONE String
//    AGENTCODE Long foreign key (one agent to many customers) not null

@Entity
@Table(name = "customers")
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long custcode;

    @Column(nullable = false)
    private String custname;

    private String custcity;
    private String workingarea;
    private String custcountry;
    private String grade;

    private double openingamt;
    private double recieveamt;
    private double paymentamt;
    private double outstandinggamt;

    private String phone;

    @ManyToOne
    @JoinColumn(name = "agentcode", nullable = false)
    private Agent agent;

    public Customer()
    {
    }

    public Customer(
            String custname,
            String custcity,
            String workingarea,
            String custcountry,
            String grade,
            double openingamt,
            double recieveamt,
            double paymentamt,
            double outstandinggamt,
            String phone,
            Agent agent)
    {
        this.custname = custname;
        this.custcity = custcity;
        this.workingarea = workingarea;
        this.custcountry = custcountry;
        this.grade = grade;
        this.openingamt = openingamt;
        this.recieveamt = recieveamt;
        this.paymentamt = paymentamt;
        this.outstandinggamt = outstandinggamt;
        this.phone = phone;
        this.agent = agent;
    }

    public long getCustcode()
    {
        return custcode;
    }

    public void setCustcode(long custcode)
    {
        this.custcode = custcode;
    }

    public String getCustname()
    {
        return custname;
    }

    public void setCustname(String custname)
    {
        this.custname = custname;
    }

    public String getCustcity()
    {
        return custcity;
    }

    public void setCustcity(String custcity)
    {
        this.custcity = custcity;
    }

    public String getWorkingarea()
    {
        return workingarea;
    }

    public void setWorkingarea(String workingarea)
    {
        this.workingarea = workingarea;
    }

    public String getCustcountry()
    {
        return custcountry;
    }

    public void setCustcountry(String custcountry)
    {
        this.custcountry = custcountry;
    }

    public String getGrade()
    {
        return grade;
    }

    public void setGrade(String grade)
    {
        this.grade = grade;
    }

    public double getOpeningamt()
    {
        return openingamt;
    }

    public void setOpeningamt(double openingamt)
    {
        this.openingamt = openingamt;
    }

    public double getRecieveamt()
    {
        return recieveamt;
    }

    public void setRecieveamt(double recieveamt)
    {
        this.recieveamt = recieveamt;
    }

    public double getPaymentamt()
    {
        return paymentamt;
    }

    public void setPaymentamt(double paymentamt)
    {
        this.paymentamt = paymentamt;
    }

    public double getOutstandinggamt()
    {
        return outstandinggamt;
    }

    public void setOutstandinggamt(double outstandinggamt)
    {
        this.outstandinggamt = outstandinggamt;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public Agent getAgent()
    {
        return agent;
    }

    public void setAgent(Agent agent)
    {
        this.agent = agent;
    }
}
