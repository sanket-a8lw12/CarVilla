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
public class FeaturedCarModel {

    @Inject
    @Named("featuredcarbean/.")
    private List<FeaturedCarBean> featuredCarBeanList;


    public List<FeaturedCarBean> getFeaturedCarBeanList() {
        return featuredCarBeanList;
    }
}
