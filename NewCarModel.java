package com.car.villa.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(
        adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class NewCarModel {



    @Inject
    private String image;

    @Inject
    private String carname;

    @Inject
    private String cardescription;

    @Inject
    private String buttontext;


    public String getImage() {
        return image;
    }

    public String getCarname() {
        return carname;
    }

    public String getCardescription() {
        return cardescription;
    }

    public String getButtontext() {
        return buttontext;
    }
}
