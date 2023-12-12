package com.car.villa.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Model(
        adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class Service {

    @Inject
    private String menuitem;

    public String getMenuitem() {
        return menuitem;
    }

    @Inject
    @Named("service/.")
    private List<ServiceModel> serviceModelList;


    public List<ServiceModel> getServiceModelList() {
        return serviceModelList;
    }
}
