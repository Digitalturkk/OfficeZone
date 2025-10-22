package com.OfficeZone.officeZone.LandLordCompany.Services;

import com.OfficeZone.officeZone.LandLordCompany.LandLord;

import java.util.List;

public interface LandLordService {
    List<LandLord> getAllLandLords();
    LandLord getLandLordById(Long id);
    LandLord createLandLord(LandLord landLord);
    void deleteLandLord(Long id);
}
