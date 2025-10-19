package com.OfficeZone.officeZone.Office;

public class OfficeDTO {
    private Long officeId;
    private String officeName;
    private String officeType;
    private String officeLocation;
    private String officeDescription;
    private Double officePrice;
    private Integer officeCapacity;
    private Boolean isAvailable;

    private String landLordCompanyName;

    public OfficeDTO() {
    }

    public OfficeDTO(Long officeId, String officeName, String officeType, String officeLocation, String officeDescription, Double officePrice, Integer officeCapacity, Boolean isAvailable, String landLordCompanyName) {
        this.officeId = officeId;
        this.officeName = officeName;
        this.officeType = officeType;
        this.officeLocation = officeLocation;
        this.officeDescription = officeDescription;
        this.officePrice = officePrice;
        this.officeCapacity = officeCapacity;
        this.isAvailable = isAvailable;
        this.landLordCompanyName = landLordCompanyName;
    }

    public Long getOfficeId() {
        return officeId;
    }

    public String getOfficeName() {
        return officeName;
    }

    public String getOfficeType() {
        return officeType;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public String getOfficeDescription() {
        return officeDescription;
    }

    public Double getOfficePrice() {
        return officePrice;
    }

    public Integer getOfficeCapacity() {
        return officeCapacity;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public String getLandLordCompanyName() {
        return landLordCompanyName;
    }
}
