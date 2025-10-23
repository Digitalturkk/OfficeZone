package com.OfficeZone.officeZone.Tenant.Services;

import com.OfficeZone.officeZone.Tenant.Tenant;
import com.OfficeZone.officeZone.Tenant.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenantImplement implements TenantService {

    @Autowired
    private TenantRepository tenantRepository;

    @Override
    public Tenant getTenantById(Long id) {
        return tenantRepository.findById(id).orElse(null);
    }

    @Override
    public List<Tenant> getAllTenants() {
        return tenantRepository.findAll();
    }

    @Override
    public void saveTenant(Tenant tenant) {
        tenantRepository.save(tenant);
    }

    @Override
    public void deleteTenant(Long id) {
        tenantRepository.deleteById(id);
    }
}
