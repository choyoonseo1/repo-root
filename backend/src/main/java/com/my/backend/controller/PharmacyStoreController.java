package com.my.backend.controller;

import com.my.backend.dto.PharmacyStoreDto;
import com.my.backend.entity.PharmacyStore;
import com.my.backend.service.PharmacyStoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pharmacies")
@RequiredArgsConstructor
public class PharmacyStoreController {

    private final PharmacyStoreService service;

    // 약국 데이터 일괄 저장
    @PostMapping
    public List<PharmacyStore> save(@RequestBody List<PharmacyStoreDto> payload) {
        var list = payload.stream().map(d ->
                PharmacyStore.builder()
                        .name(d.getName())
                        .distanceKm(d.getDistanceKm())
                        .latitude(d.getLatitude())
                        .longitude(d.getLongitude())
                        .build()
        ).toList();
        return service.saveAll(list);
    }

    // 저장 데이터 조회
    @GetMapping
    public List<PharmacyStore> list() {
        return service.findAll();
    }
}
