package com.my.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pharmacy_store")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class PharmacyStore {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, length=200)
    private String name;

    @Column(name="distance_km", nullable=false, precision=10, scale=3)
    private Double distanceKm;

    @Column(nullable=false, precision=10, scale=7)
    private Double latitude;

    @Column(nullable=false, precision=10, scale=7)
    private Double longitude;
}
