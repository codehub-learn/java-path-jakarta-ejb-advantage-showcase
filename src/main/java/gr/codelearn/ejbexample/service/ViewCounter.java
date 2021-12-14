package gr.codelearn.ejbexample.service;

import javax.ejb.Remote;

@Remote
public interface ViewCounter {
    Integer getNumberOfViews();
    void incrementNumberOfViews();
}
