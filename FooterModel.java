package com.car.villa.core.models;

import com.adobe.granite.jmx.annotation.Name;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import javax.inject.Named;
import java.lang.ref.PhantomReference;
import java.util.List;

@Model(
        adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class FooterModel {


    // section 1
    @Inject
    private String companyname; // we have to give the same name what we given in crx/de with name prop

    @Inject
    private String companydescription;

    @Inject
    private String companyemail;

    @Inject
    private String companyphonenumber;


    // now create getter to display the value on html code


    public String getCompanyname() {
        return companyname;
    }

    public String getCompanydescription() {
        return companydescription;
    }

    public String getCompanyemail() {
        return companyemail;
    }

    public String getCompanyphonenumber() {
        return companyphonenumber;
    }


    // section 2

    @Inject
    private String companyabout;

    @Inject
    @Named("aboutmenu/.")
    private List<AboutMenuModel> aboutMenuList;

    public String getCompanyabout() {
        return companyabout;
    }

    public List<AboutMenuModel> getAboutMenuList() {
        return aboutMenuList;
    }


    // section 3

    @Inject
    private String topbrand;

    @Inject
    @Named("carbrands/.")
    private List<CarTopBrand> topBrandList;

    public String getTopbrand() {
        return topbrand;
    }

    public List<CarTopBrand> getTopBrandList() {
        return topBrandList;
    }

    //section 4

    @Inject
    private String newsletter;

    @Inject
    private String subscribe;

    @Inject
    private String addemail;

    public String getNewsletter() {
        return newsletter;
    }

    public String getSubscribe() {
        return subscribe;
    }

    public String getAddemail() {
        return addemail;
    }


    //section 5

    @Inject
    private String companycopyright;

    @Inject
    @Named("socialmedia/.")
    private List<SocialMediaModel> socialMediaModelList;

    public String getCompanycopyright() {
        return companycopyright;
    }

    public List<SocialMediaModel> getSocialMediaModelList() {
        return socialMediaModelList;
    }
}
