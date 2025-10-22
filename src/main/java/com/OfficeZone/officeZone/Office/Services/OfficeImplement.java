package com.OfficeZone.officeZone.Office.Services;

import com.OfficeZone.officeZone.LandLordCompany.Services.LandLordService;
import com.OfficeZone.officeZone.Office.Office;
import com.OfficeZone.officeZone.Office.OfficeDTO;
import com.OfficeZone.officeZone.Office.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficeImplement implements OfficeService {

    @Autowired
    private OfficeRepository officeRepository;
    @Autowired
    private LandLordService landLordService;

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

    @Override
    public OfficeDTO createOfficeDTO(Office office) {
        return new OfficeDTO(
                office.getOfficeId(),
                office.getOfficeName(),
                office.getOfficeType().toString(),
                office.getOfficeLocation(),
                office.getOfficeDescription(),
                office.getOfficePrice(),
                office.getOfficeCapacity(),
                office.getAvailable(),
                office.getLandLordCompany().getLandLordName()
        );
    }

    @Override
    public List<OfficeDTO> createOfficeDTOList(List<Office> offices) {
        return offices.stream()
                .map(this::createOfficeDTO)
                .toList();
    }
}
