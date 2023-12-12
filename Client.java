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
public class Client {

    @Inject
    private String title;

    @Inject
    @Named("clientreview/.")
    private List<ClientReviewModel> clientReviewModelList;

    public String getTitle() {
        return title;
    }

    public List<ClientReviewModel> getClientReviewModelList() {
        return clientReviewModelList;
    }
}
