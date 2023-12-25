package com.jsb.amd.sales.salesforce.api.controllers;

import com.jsb.amd.sales.salesforce.api.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/purgeCache")
    public ResponseEntity<String> purgeCache(@RequestHeader("Authorization") String tokenString,
                                             @RequestParam(value = "sfUser", required = false) String requestingKerberos) {
        adminService.purgeCache(requestingKerberos);
        return new ResponseEntity<>("Cleared impersonation cache for " + requestingKerberos, HttpStatus.ACCEPTED);
    }

    @GetMapping("/impersonate")
    public ResponseEntity<ConcurrentMap<String, String>> impersonate(@RequestHeader("Authorization") String tokenString,
                                                                     @RequestParam(value = "targetKerberos") String targetKerberos,
                                                                     @RequestParam(value = "sfUser", required = false) String requestingKerberos) {
        return new ResponseEntity<>(adminService.impersonate(requestingKerberos, targetKerberos), HttpStatus.ACCEPTED);

    }

}
