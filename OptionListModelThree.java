package com.car.villa.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(
        adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class OptionListModelThree {

    @Inject
    private String optionsthree;

    public String getOptionsthree() {
        return optionsthree;
    }
}
