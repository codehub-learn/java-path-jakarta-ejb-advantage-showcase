package gr.codelearn.ejbexample.resource;

import gr.codelearn.ejbexample.service.ViewCounter;
import gr.codelearn.ejbexample.service.impl.ViewCounterStatefulBean;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/stateful")
public class StatefulResource {

    @EJB(beanName = "ViewCounterStatefulBean")
    private ViewCounter viewCounter;


    @GET
    @Produces("text/plain")
    @Path("/views")
    public String numberOfViews() {
        viewCounter.incrementNumberOfViews();
        return "Total views: "+ viewCounter.getNumberOfViews();
    }
}