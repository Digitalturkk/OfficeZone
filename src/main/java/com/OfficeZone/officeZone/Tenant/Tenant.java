package com.OfficeZone.officeZone.Tenant;

import com.OfficeZone.officeZone.Office.Office;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
@Table(name = "tenants")
public class Tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tenantId;
    @NotBlank(message = "Tenant name is mandatory")
    @Column(nullable = false)
    private String tenantName;
    @NotBlank(message = "Tenant email is mandatory")
    @Column(nullable = false, unique = true)
    private String tenantEmail;
    @NotBlank(message = "Tenant phone is mandatory")
    @Column(nullable = false)
    private String tenantPhone;
    @NotBlank(message = "Tenant password is mandatory")
    @Column(nullable = false)
    private String tenantPassword;

    @ManyToMany(
        fetch = FetchType.LAZY,
        cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
        },
        mappedBy = "tenants"
    )
    private List<Office> offices;

    public Tenant() {
    }

    public Tenant(String tenantName, String tenantEmail, String tenantPhone, String tenantPassword, List<Office> offices) {
        this.tenantName = tenantName;
        this.tenantEmail = tenantEmail;
        this.tenantPhone = tenantPhone;
        this.tenantPassword = tenantPassword;
        this.offices = offices;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public @NotBlank(message = "Tenant name is mandatory") String getTenantName() {
        return tenantName;
    }

    public void setTenantName(@NotBlank(message = "Tenant name is mandatory") String tenantName) {
        this.tenantName = tenantName;
    }

    public @NotBlank(message = "Tenant email is mandatory") String getTenantEmail() {
        return tenantEmail;
    }

    public void setTenantEmail(@NotBlank(message = "Tenant email is mandatory") String tenantEmail) {
        this.tenantEmail = tenantEmail;
    }

    public @NotBlank(message = "Tenant phone is mandatory") String getTenantPhone() {
        return tenantPhone;
    }

    public void setTenantPhone(@NotBlank(message = "Tenant phone is mandatory") String tenantPhone) {
        this.tenantPhone = tenantPhone;
    }

    public @NotBlank(message = "Tenant password is mandatory") String getTenantPassword() {
        return tenantPassword;
    }

    public void setTenantPassword(@NotBlank(message = "Tenant password is mandatory") String tenantPassword) {
        this.tenantPassword = tenantPassword;
    }

    public List<Office> getOffices() {
        return offices;
    }

    public void setOffices(List<Office> offices) {
        this.offices = offices;
    }
}
