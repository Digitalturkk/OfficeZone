package com.OfficeZone.officeZone.LandLordCompany.Controllers;

import com.OfficeZone.officeZone.LandLordCompany.LandLord;
import com.OfficeZone.officeZone.LandLordCompany.Services.LandLordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/public/landlords")
public class LandLordPublicController {

    @Autowired
    private LandLordService landLordService;

    @GetMapping("/get-all-landlords")
    public List<LandLord> getAllLandLords() {
        return landLordService.getAllLandLords();
    }
}