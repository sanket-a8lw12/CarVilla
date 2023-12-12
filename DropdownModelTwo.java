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
public class DropdownModelTwo {

    @Inject
    private String dropdownnametwo;

    @Inject
    @Named("optionlisttwo/.")
    private List<OptionListModelTwo> optionsModelTwo;

    public String getDropdownnametwo() {
        return dropdownnametwo;
    }

    public List<OptionListModelTwo> getOptionsModelTwo() {
        return optionsModelTwo;
    }
}
