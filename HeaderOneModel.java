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
public class HeaderOneModel {

    @Inject
    private String companyname;

    @Inject
    @Named("menudetailswithmap/.")
    private List<MenuModel> menuList;

    public List<MenuModel> getMenuList() {
        return menuList;
    }

    public String getCompanyname() {
        return companyname;
    }
}
