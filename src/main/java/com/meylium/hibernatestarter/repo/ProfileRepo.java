package com.meylium.hibernatestarter.repo;

import com.meylium.hibernatestarter.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepo extends JpaRepository<Profile, Long> {
    Profile findByName(String name);
}
