package com.car.villa.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(
        adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class ClientReviewModel {

    @Inject
    private String clientimage;

    @Inject
    private String review;

    @Inject
    private String name;

    @Inject
    private String city;

    public String getClientimage() {
        return clientimage;
    }

    public String getReview() {
        return review;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
