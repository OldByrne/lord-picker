package com.davidayresbyrne.lordpickerbackend.service;

import com.davidayresbyrne.lordpickerbackend.exception.UserNotFoundException;
import com.davidayresbyrne.lordpickerbackend.model.Faction;
import com.davidayresbyrne.lordpickerbackend.repo.FactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactionService {
    private final FactionRepo factionRepo;

    @Autowired
    public FactionService(FactionRepo factionRepo){
        this.factionRepo = factionRepo;
    }

    public List<Faction> findAllFactions(){
        return factionRepo.findAll();
    }

    public Faction findFactionById(Long id){
        return factionRepo.findFactionById(id)
                .orElseThrow(() -> new UserNotFoundException("Faction " + id + " not found."));
    }
}
