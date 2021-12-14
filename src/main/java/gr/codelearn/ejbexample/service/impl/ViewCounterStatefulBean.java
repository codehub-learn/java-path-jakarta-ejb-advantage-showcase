package gr.codelearn.ejbexample.service.impl;

import gr.codelearn.ejbexample.service.ViewCounter;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remove;
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

    @PreDestroy
    public void destroy(){
        log.info("Destroyed class {}", getClass().getSimpleName());
    }

    @PostActivate
    public void postActivate(){
        log.info("Post activated class {}", getClass().getSimpleName());
    }

    @PrePassivate
    public void prePassivate(){
        log.info("Pre passivate class {}", getClass().getSimpleName());
    }

    @Override
    @Remove
    public Integer getNumberOfViews() {
        return numberOfViews;
    }

    @Override
    public void incrementNumberOfViews() {
        numberOfViews++;
        log.info("Views {} incremented to total of {}",getClass().getSimpleName(),numberOfViews);
    }
}
