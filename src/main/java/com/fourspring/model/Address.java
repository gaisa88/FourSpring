package com.fourspring.model;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table (name = "Address")
public class Address {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Integer katoId;
    @Column
    private String regionName;
    @Column
    private String streetPlace;
    @Column
    private Integer appertment;

    public Address(Integer katoId, String regionName, String streetPlace, Integer appertment) {
        this.id = null;
        this.katoId = katoId;
        this.regionName = regionName;
        this.streetPlace = streetPlace;
        this.appertment = appertment;
    }

    public Address() {

    }
}