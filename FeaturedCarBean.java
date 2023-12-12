package com.car.villa.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(
        adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class FeaturedCarBean {

    @Inject
    private String carimage;

    @Inject
    private String carmodel;

    @Inject
    private String carpower;

    @Inject
    private String cartranmission;

    @Inject
    private String carname;

    @Inject
    private String carprice;

    @Inject
    private String cardescription;


    public String getCarimage() {
        return carimage;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public String getCarpower() {
        return carpower;
    }

    public String getCartranmission() {
        return cartranmission;
    }

    public String getCarname() {
        return carname;
    }

    public String getCarprice() {
        return carprice;
    }

    public String getCardescription() {
        return cardescription;
    }
}
