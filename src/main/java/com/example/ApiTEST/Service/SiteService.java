package com.example.ApiTEST.Service;

import com.example.ApiTEST.Entity.Site;
import com.example.ApiTEST.Repository.RepositorySite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Service
public class SiteService {
    @Autowired
    private RepositorySite repository ;


    public  Site saveSite(Site site)
    {
        return   repository.save(site);
    }

    public List<Site> saveSites(List <Site> sites)
    {
        return   repository.saveAll(sites);
    }


    public List<Site> getsites()
    {
        return   repository.findAll();
    }
    public Site getSiteById(int id)
    {
        return repository.findById(id).orElse(null);
    }
    public List<Site> getSiteByName(String namesite)
    {
        return repository.findByName(namesite);
    }

    public  String deleteSite (int id){
        repository.deleteById(id);
        return  "site removed ||" +id;
    }
    public  Site updateSite (Site site){
        Site existing =repository.findById(site.getIdsite()).orElse(null);
        existing.setIdsite(site.getIdsite());
        existing.setNamesite(site.getNamesite());
        existing.setQuantite(site.getQuantite());
        return repository.save(existing);
    }
}
