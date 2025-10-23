package com.OfficeZone.officeZone.Tenant.Services;

import com.OfficeZone.officeZone.Tenant.Tenant;

import java.util.List;

public interface TenantService {
    Tenant getTenantById(Long id);
    List<Tenant> getAllTenants();
    void saveTenant(Tenant tenant);
    void deleteTenant(Long id);
}
