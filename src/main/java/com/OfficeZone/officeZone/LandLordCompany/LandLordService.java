package com.OfficeZone.officeZone.LandLordCompany;

import java.util.List;

public interface LandLordService {
    List<LandLordCompany> getAllLandLords();
    LandLordCompany getLandLordById(Long id);
    LandLordCompany createLandLord(LandLordCompany landLordCompany);
    void deleteLandLord(Long id);
}
