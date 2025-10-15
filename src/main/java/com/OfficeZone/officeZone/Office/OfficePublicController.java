package com.OfficeZone.officeZone.Office;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/offices/public")
public class OfficePublicController {

    @Autowired
    private OfficeService officeService;

    @GetMapping("/get-all-offices")
    public List<Office> getAllOffices() {
        return officeService.getAllOffices();
    }
}
