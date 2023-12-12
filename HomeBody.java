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
public class HomeBody {

    @Inject
    private String homeheading;

    @Inject
    private String homedescription;

    @Inject
    private String homecontactus;

    public String getHomeheading() {
        return homeheading;
    }

    public String getHomedescription() {
        return homedescription;
    }

    public String getHomecontactus() {
        return homecontactus;
    }


    // dropdown section

    @Inject
    @Named("dropdownmenuone/.")
    private List<DropdownModel> dropdownModelListOne;

    public List<DropdownModel> getDropdownModelListOne() {
        return dropdownModelListOne;
    }


    @Inject
    @Named("dropdownmenutwo/.")
    private List<DropdownModelTwo> dropdownModelListTwo;

    public List<DropdownModelTwo> getDropdownModelListTwo() {
        return dropdownModelListTwo;
    }

    @Inject
    @Named("dropdownmenuthree/.")
    private List<DropdownModelThree> dropdownModelListThree;

    public List<DropdownModelThree> getDropdownModelListThree() {
        return dropdownModelListThree;
    }



    // search button text code

    @Inject
    private String buttontext;

    public String getButtontext() {
        return buttontext;
    }
}
