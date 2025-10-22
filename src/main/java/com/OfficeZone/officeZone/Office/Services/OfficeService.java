package com.OfficeZone.officeZone.Office.Services;

import com.OfficeZone.officeZone.Office.Office;
import com.OfficeZone.officeZone.Office.OfficeDTO;

import java.util.List;

public interface OfficeService {
    List<Office> getAllOffices();
    Office createOffice(Office office);
    Office getOfficeById(Long id);
    void deleteOffice(Long id);

    OfficeDTO createOfficeDTO(Office office);
    List<OfficeDTO> createOfficeDTOList(List<Office> offices);
}
