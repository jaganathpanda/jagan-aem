package com.aem.geeks.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ShoppableVideoModel {

    @ValueMapValue
    private String videoFile;

    @ChildResource
    private List<Map<String, Object>> shoppableMedia;

    public String getVideoFile() {
        return videoFile;
    }

    public List<Map<String, Object>> getShoppableMedia() {
        return shoppableMedia;
    }
}
