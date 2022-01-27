package com.example.ApiTEST.Repository;

import com.example.ApiTEST.Entity.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public  interface RepositorySite extends JpaRepository<Site,Integer> {
    List<Site> findByName(String namesite);
}
