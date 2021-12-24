package com.gfg.securitydb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AppRepository extends JpaRepository<AppUser, Integer> {

    AppUser findByUsername(String user);
}