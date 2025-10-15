package com.OfficeZone.officeZone.LandLordCompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LandLordImplement implements LandLordService {

    @Autowired
    private LandLordRepository landLordRepository;

    @Override
    public LandLordCompany createLandLord(LandLordCompany landLordCompany) {
        return landLordRepository.save(landLordCompany);
    }

    @Override
    public LandLordCompany getLandLordById(Long id) {
        return landLordRepository.findById(id).orElse(null);
    }

    @Override
    public List<LandLordCompany> getAllLandLords() {
        return landLordRepository.findAll();
    }

    @Override
    public void deleteLandLord(Long id) {
        landLordRepository.deleteById(id);
    }
}
