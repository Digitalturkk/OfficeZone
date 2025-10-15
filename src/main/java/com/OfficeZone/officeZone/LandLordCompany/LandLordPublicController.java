package com.OfficeZone.officeZone.LandLordCompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/landlords/public")
public class LandLordPublicController {

    @Autowired
    private LandLordService landLordService;

    @GetMapping("/get-all-landlords")
    public List<LandLordCompany> getAllLandLords() {
        return landLordService.getAllLandLords();
    }
}
