package com.OfficeZone.officeZone.Office;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficeImplement implements OfficeService {

    @Autowired
    private OfficeRepository officeRepository;

    @Override
    public List<Office> getAllOffices() {
        return officeRepository.findAll();
    }

    @Override
    public Office getOfficeById(Long id) {
        return officeRepository.findById(id).orElse(null);
    }

    @Override
    public Office createOffice(Office office) {
        return officeRepository.save(office);
    }

    @Override
    public void deleteOffice(Long id) {
        officeRepository.deleteById(id);
    }
}
