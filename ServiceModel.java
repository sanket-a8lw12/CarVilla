package com.car.villa.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(
        adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class ServiceModel {

    // dealership

    @Inject
    private String servicelogo;

    @Inject
    private String serviceheading;

    @Inject
    private String servicedescription;

    public String getServicelogo() {
        return servicelogo;
    }

    public String getServiceheading() {
        return serviceheading;
    }

    public String getServicedescription() {
        return servicedescription;
    }
}
