package com.OfficeZone.officeZone.LandLordCompany;

public class LandLordDTO {
    private Long companyId;
    private String landLordName;
    private String landLordEmail;
    private String landLordPhone;

    public LandLordDTO() {
    }

    public LandLordDTO(Long companyId, String landLordName, String landLordEmail, String landLordPhone) {
        this.companyId = companyId;
        this.landLordName = landLordName;
        this.landLordEmail = landLordEmail;
        this.landLordPhone = landLordPhone;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public String getLandLordName() {
        return landLordName;
    }

    public String getLandLordEmail() {
        return landLordEmail;
    }

    public String getLandLordPhone() {
        return landLordPhone;
    }
}
