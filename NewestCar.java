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
public class NewestCar {

    @Inject
    private String title;

    @Inject
    private String heading;

    @Inject
    @Named("newcarlist/.")
    private List<NewCarModel> newCarModelList;

    public String getTitle() {
        return title;
    }

    public String getHeading() {
        return heading;
    }

    public List<NewCarModel> getNewCarModelList() {
        return newCarModelList;
    }
}
