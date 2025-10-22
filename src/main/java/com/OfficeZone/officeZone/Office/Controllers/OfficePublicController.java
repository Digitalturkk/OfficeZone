package com.OfficeZone.officeZone.Office.Controllers;

import com.OfficeZone.officeZone.Office.Office;
import com.OfficeZone.officeZone.Office.OfficeDTO;
import com.OfficeZone.officeZone.Office.Services.OfficeService;
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

    // Working with DTO
    @GetMapping("/get-all-offices-dto")
    public List<OfficeDTO> getAllOfficesDTO() {
        List<Office> offices = officeService.getAllOffices();
        return officeService.createOfficeDTOList(offices);
    }

    @GetMapping("/get-office-by-id-dto")
    public OfficeDTO getOfficeByIdDTO(Long id) {
        Office office = officeService.getOfficeById(id);
        return officeService.createOfficeDTO(office);
    }

    // Working with Entity Directly
    @GetMapping("/get-all-offices")
    public List<Office> getAllOffices() {
        return officeService.getAllOffices();
    }

}
