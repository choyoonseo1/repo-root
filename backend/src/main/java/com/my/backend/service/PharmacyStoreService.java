package com.my.backend.service;

import com.my.backend.entity.PharmacyStore;
import com.my.backend.repository.PharmacyStoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PharmacyStoreService {

    private final PharmacyStoreRepository repository;

    @Transactional
    public List<PharmacyStore> saveAll(List<PharmacyStore> list) {
        return repository.saveAll(list);
    }

    @Transactional(readOnly = true)
    public List<PharmacyStore> findAll() {
        return repository.findAll();
    }
}
