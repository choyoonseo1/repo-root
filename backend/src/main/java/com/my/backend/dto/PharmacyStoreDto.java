package com.my.backend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PharmacyStoreDto {
    private String name;
    private Double distanceKm;
    private Double latitude;
    private Double longitude;
}
