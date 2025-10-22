package com.OfficeZone.officeZone.Office;

import com.OfficeZone.officeZone.CustomEnums.OfficeTypes;
import com.OfficeZone.officeZone.LandLordCompany.LandLord;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "offices")
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long officeId;
    @NotBlank(message = "Office name is mandatory")
    @Column(nullable = false)
    private String officeName;
    @Enumerated(EnumType.STRING)
    @NotNull(message = "Office type is mandatory")
    @Column(nullable = false)
    private OfficeTypes officeType;
    @NotBlank(message = "Office location is mandatory")
    @Column(nullable = false)
    private String officeLocation;
    @NotBlank(message = "Office description is mandatory")
    @Column(nullable = false)
    private String officeDescription;
    @NotNull(message = "Office price is mandatory")
    @Column(nullable = false)
    private Double officePrice;
    @NotNull(message = "Office capacity is mandatory")
    @Column(nullable = false)
    private Integer officeCapacity;
    @NotNull(message = "Office availability is mandatory")
    @Column(nullable = false)
    private Boolean isAvailable;
    @ManyToOne(optional = false)
    @JoinColumn(name = "company_id", nullable = false)
    private LandLord landLord;

    public Office() {
    }

    public Office(String officeName, OfficeTypes officeType, String officeLocation, String officeDescription, Double officePrice, Integer officeCapacity, Boolean isAvailable) {
        this.officeName = officeName;
        this.officeType = officeType;
        this.officeLocation = officeLocation;
        this.officeDescription = officeDescription;
        this.officePrice = officePrice;
        this.officeCapacity = officeCapacity;
        this.isAvailable = isAvailable;
    }

    public Long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public OfficeTypes getOfficeType() {
        return officeType;
    }

    public void setOfficeType(OfficeTypes officeType) {
        this.officeType = officeType;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public String getOfficeDescription() {
        return officeDescription;
    }

    public void setOfficeDescription(String officeDescription) {
        this.officeDescription = officeDescription;
    }

    public Double getOfficePrice() {
        return officePrice;
    }

    public void setOfficePrice(Double officePrice) {
        this.officePrice = officePrice;
    }

    public Integer getOfficeCapacity() {
        return officeCapacity;
    }

    public void setOfficeCapacity(Integer officeCapacity) {
        this.officeCapacity = officeCapacity;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public LandLord getLandLordCompany() {
        return landLord;
    }

    public void setLandLordCompany(LandLord landLord) {
        this.landLord = landLord;
    }
}
