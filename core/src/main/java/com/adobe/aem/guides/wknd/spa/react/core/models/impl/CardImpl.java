package com.adobe.aem.guides.wknd.spa.react.core.models.impl;

import com.adobe.aem.guides.wknd.spa.react.core.models.Card;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
        adaptables = SlingHttpServletRequest.class,
        adapters = Card.class,
        resourceType = CardImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class CardImpl implements Card {

    public static final String RESOURCE_TYPE = "wknd-spa-react/components/card";

    @ValueMapValue
    private String imageURL;

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String body;

    @Override
    public String getExportedType() {
        return RESOURCE_TYPE;
    }

    @Override
    public String getImageURL() {
        return !StringUtils.isBlank(imageURL) ? imageURL : "IMAGE URL is EMPTY!";
    }

    @Override
    public String getTitle() {
        return !StringUtils.isBlank(title) ? title : "TITLE is EMPTY!";
    }

    @Override
    public String getBody() {
        return !StringUtils.isBlank(body) ? body : "BODY is EMPTY!";
    }
}
