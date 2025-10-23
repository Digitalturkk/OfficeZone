package com.OfficeZone.officeZone.Tenant.Controllers;

import com.OfficeZone.officeZone.Tenant.Services.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/tenants")
public class TenantPublicController {

    @Autowired
    private TenantService tenantService;

    @GetMapping("/get-all-tenants")
    public Object getAllTenants() {
        return tenantService.getAllTenants();
    }

    @GetMapping("/get-tenant-by-id")
    public Object getTenantById(Long id) {
        return tenantService.getTenantById(id);
    }
}
