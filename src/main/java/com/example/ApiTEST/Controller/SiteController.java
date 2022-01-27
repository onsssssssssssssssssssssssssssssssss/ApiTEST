package com.example.ApiTEST.Controller;

import java.util.List;

import com.example.ApiTEST.Entity.Site;
import com.example.ApiTEST.Service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class SiteController {
        @Autowired
        private SiteService service ;
        @PostMapping("/addsite")
        public Site addSite ( @RequestBody Site site){
            return  service.saveSite(site);
        }
        @PostMapping("/addSites")
        public List<Site> addsites(@RequestBody List<Site> sites){
            return service.saveSites(sites) ;
        }
        @GetMapping("/site")
        public  List<Site> findAllSite(){
            return  (List<Site>)service.getsites();}
        @GetMapping("/site/{id}")
        public Site findSiteById(@PathVariable int id){
            return  service.getSiteById(id);
        }
        @GetMapping("/site/{name}")
        public Site findSiteByName(@PathVariable String namesite){
            return (Site) service.getSiteByName(namesite);
        }

        @PutMapping("/update")
        public Site UpdateSite (@RequestBody Site site){
            return  service.updateSite(site);
        }
        @DeleteMapping("/delete/{id}")
        public  String deletesite (@PathVariable int id){
            return service.deleteSite(id);
        }
    }

