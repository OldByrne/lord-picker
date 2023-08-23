package com.davidayresbyrne.lordpickerbackend.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "lord")
public class Lord implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private long lordId;
    private String name;
    private String imageUrl;
    private long factionID;

    public Lord() {
    }

    public Lord(long lordId, String name, String imageUrl, long factionID) {
        this.lordId = lordId;
        this.name = name;
        this.imageUrl = imageUrl;
        this.factionID = factionID;
    }

    public long getLordId() {
        return lordId;
    }

    public void setLordId(long lordId) {
        this.lordId = lordId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public long getFactionID() {
        return factionID;
    }

    public void setFactionID(long factionID) {
        this.factionID = factionID;
    }
}
