package com.diptam.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "city")
@Data
public class City {

    @Id
    @Column(name = "city_id", unique = true)
    private Long id;
    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "country_id")
    private Long c_id;
    @Column(name = "last_update")
    private LocalDateTime lastupdated;
}
