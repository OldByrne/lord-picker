package com.davidayresbyrne.lordpickerbackend.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "faction")
public class Faction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "faction_id", nullable = false, updatable = false)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="image_url")
    private String imageUrl;
    @Column(name="strength")
    private String strength;

//    public Faction() {
//    }

    public Faction(int id, String name, String imageUrl, String strength) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.strength = strength;
    }

    public long getFactionId() {
        return id;
    }

    public void setFactionId(int factionId) {
        this.id = factionId;
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
