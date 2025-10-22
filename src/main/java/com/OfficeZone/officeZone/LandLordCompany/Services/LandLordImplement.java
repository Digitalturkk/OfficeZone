package com.OfficeZone.officeZone.LandLordCompany.Services;

import com.OfficeZone.officeZone.LandLordCompany.LandLord;
import com.OfficeZone.officeZone.LandLordCompany.LandLordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LandLordImplement implements LandLordService {

    @Autowired
    private LandLordRepository landLordRepository;

    @Override
    public LandLord createLandLord(LandLord landLord) {
        return landLordRepository.save(landLord);
    }

    @Override
    public LandLord getLandLordById(Long id) {
        return landLordRepository.findById(id).orElse(null);
    }

    @Override
    public List<LandLord> getAllLandLords() {
        return landLordRepository.findAll();
    }

    @Override
    public void deleteLandLord(Long id) {
        landLordRepository.deleteById(id);
    }
}
