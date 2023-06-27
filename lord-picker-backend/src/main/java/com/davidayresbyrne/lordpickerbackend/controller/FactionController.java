package com.davidayresbyrne.lordpickerbackend.controller;

import com.davidayresbyrne.lordpickerbackend.model.Faction;
import com.davidayresbyrne.lordpickerbackend.service.FactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lordpicker1")
@CrossOrigin
public class FactionController {
    private final FactionService factionService;

    private FactionController(FactionService factionService){
        this.factionService = factionService;
    }

    @GetMapping("/home") //not sure if this can be the same as the mapping for getAllLords
    public ResponseEntity<List<Faction>> getAllFactions(){
        List<Faction> factions = factionService.findAllFactions();
        return new ResponseEntity<>(factions, HttpStatus.OK);
    }

    //may or may not need this
    @GetMapping("/find/{id}")
    public ResponseEntity<Faction> getLord(@PathVariable("id") Long id){
        Faction faction = factionService.findFactionById(id);
        return new ResponseEntity<>(faction, HttpStatus.OK);
    }
}
