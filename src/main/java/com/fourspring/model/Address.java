package com.fourspring.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "address")
    @JsonBackReference
    List<Client> clientList;

    public Address(Integer katoId, String regionName, String streetPlace, Integer appertment) {
        this.id = null;
        this.katoId = katoId;
        this.regionName = regionName;
        this.streetPlace = streetPlace;
        this.appertment = appertment;
    }

    public Address() {

    }
    @Override
    public String toString() {// переопределение метода toString для вывода данных в json
        return String.format(
                "Address[id=%d, katoId=%d, regionName='%s', streetPlace='%s', appertment=%d]",
                id, katoId, regionName, streetPlace, appertment);
    }
}