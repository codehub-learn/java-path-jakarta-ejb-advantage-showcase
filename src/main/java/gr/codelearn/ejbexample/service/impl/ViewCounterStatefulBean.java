package gr.codelearn.ejbexample.service.impl;

import gr.codelearn.ejbexample.service.ViewCounter;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;

@Stateful
@Slf4j
public class ViewCounterStatefulBean implements ViewCounter {
    private Integer numberOfViews;

    @PostConstruct
    public void init(){
        numberOfViews = 0;
        log.info("Created class {}", getClass().getSimpleName());
    }

    @Override
    public Integer getNumberOfViews() {
        return numberOfViews;
    }

    @Override
    public void incrementNumberOfViews() {
        numberOfViews++;
        log.info("Views {} incremented to total of {}",getClass().getSimpleName(),numberOfViews);
    }
}
