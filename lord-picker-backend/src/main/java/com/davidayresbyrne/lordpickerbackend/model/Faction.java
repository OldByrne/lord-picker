package com.davidayresbyrne.lordpickerbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Faction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private long factionId;
    private String name;
    private String imageUrl;
    private String strength;

    public Faction() {
    }

    public Faction(long factionId, String name, String imageUrl, String strength) {
        this.factionId = factionId;
        this.name = name;
        this.imageUrl = imageUrl;
        this.strength = strength;
    }

    public long getFactionId() {
        return factionId;
    }

    public void setFactionId(long factionId) {
        this.factionId = factionId;
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

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }
}
