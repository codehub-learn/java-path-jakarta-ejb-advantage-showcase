package gr.codelearn.ejbexample.service.impl;

import gr.codelearn.ejbexample.service.ViewCounter;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

@Stateless
public class ViewCounterStatelessBean implements ViewCounter {
    private Integer numberOfViews;

    @PostConstruct
    public void init(){
        numberOfViews = 0;
        System.out.println("Created class "+ getClass().getSimpleName());
    }

    @Override
    public Integer getNumberOfViews() {
        return numberOfViews;
    }

    @Override
    public void incrementNumberOfViews() {
        numberOfViews++;
        System.out.println("Views "+getClass().getSimpleName() + " incremented to total of "+ numberOfViews);
    }
}
