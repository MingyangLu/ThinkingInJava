package com.cywri.main;

import java.util.ArrayList;
import java.util.List;

public class LoanCaculate {

    public List<Payment> equalRepaymentOfPrincipal(Integer princple, Integer term, Integer rate){
        List<Payment> paymentDetail = new ArrayList<>();
        for (int i = 0; i < term; i++){
            Payment payment = new Payment();
            payment.setPeriod(i);
            payment.setCost(princple/term);
            payment.setInterest((1-i/term)*princple*rate);
            paymentDetail.add(payment);
        }
        return paymentDetail;
     }
}

class Payment{
    private Integer period;
    private Integer interest;
    private Integer cost;

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getInterest() {
        return interest;
    }

    public void setInterest(Integer interest) {
        this.interest = interest;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}