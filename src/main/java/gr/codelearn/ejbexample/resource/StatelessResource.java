package gr.codelearn.ejbexample.resource;

import gr.codelearn.ejbexample.service.ViewCounter;
import lombok.extern.slf4j.Slf4j;


import javax.ejb.EJB;
import javax.ws.rs.*;

@Path("/stateless")
@Slf4j
public class StatelessResource {

    @EJB(beanName = "ViewCounterStatelessBean")
    private ViewCounter viewCounter;


    @GET
    @Produces("text/plain")
    @Path("/views")
    public String numberOfViews() {
        viewCounter.incrementNumberOfViews();
        return "Total views: "+ viewCounter.getNumberOfViews();
    }
}