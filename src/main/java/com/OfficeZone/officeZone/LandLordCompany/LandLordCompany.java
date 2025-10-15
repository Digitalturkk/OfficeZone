package com.OfficeZone.officeZone.LandLordCompany;

import com.OfficeZone.officeZone.Office.Office;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
@Table(name="landlord_companies")
public class LandLordCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;
    @NotBlank(message = "Landlord name is mandatory")
    @Column(nullable = false)
    private String landLordName;
    @NotBlank(message = "Landlord email is mandatory")
    @Column(nullable = false, unique = true)
    private String landLordEmail;
    @NotBlank(message = "Landlord phone is mandatory")
    @Column(nullable = false)
    private String landLordPhone;
    @NotBlank(message = "Landlord password is mandatory")
    @Column(nullable = false)
    private String landLordPassword;

    @OneToMany(mappedBy = "landLordCompany", cascade = CascadeType.ALL)
    private List<Office> offices;

    public LandLordCompany(){
    }

    public LandLordCompany(String landLordName, String landLordEmail, String landLordPhone, String landLordPassword, List<Office> offices) {
        this.landLordName = landLordName;
        this.landLordEmail = landLordEmail;
        this.landLordPhone = landLordPhone;
        this.landLordPassword = landLordPassword;
        this.offices = offices;
    }

    public @NotBlank(message = "Landlord password is mandatory") String getLandLordPassword() {
        return landLordPassword;
    }

    public void setLandLordPassword(@NotBlank(message = "Landlord password is mandatory") String landLordPassword) {
        this.landLordPassword = landLordPassword;
    }

    public List<Office> getOffices() {
        return offices;
    }

    public void setOffices(List<Office> offices) {
        this.offices = offices;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getLandLordName() {
        return landLordName;
    }

    public void setLandLordName(String landLordName) {
        this.landLordName = landLordName;
    }

    public String getLandLordEmail() {
        return landLordEmail;
    }

    public void setLandLordEmail(String landLordEmail) {
        this.landLordEmail = landLordEmail;
    }

    public String getLandLordPhone() {
        return landLordPhone;
    }

    public void setLandLordPhone(String landLordPhone) {
        this.landLordPhone = landLordPhone;
    }
}