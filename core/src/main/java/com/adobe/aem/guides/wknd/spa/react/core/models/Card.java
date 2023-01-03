package com.adobe.aem.guides.wknd.spa.react.core.models;

import com.adobe.cq.export.json.ComponentExporter;

public interface Card extends ComponentExporter {
    String getImageURL();
    String getTitle();
    String getBody();
}
