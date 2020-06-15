package com.paysera.sdk.wallet.entities.locations;

import com.squareup.moshi.Json;

public class LocationCategory {
    private Long id;
    private String title;
    @Json(name = "parent_id")
    private Integer parentId;
    private LocationCategoryImages images;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public LocationCategoryImages getImages() {
        return images;
    }

    public void setImages(LocationCategoryImages images) {
        this.images = images;
    }
}
