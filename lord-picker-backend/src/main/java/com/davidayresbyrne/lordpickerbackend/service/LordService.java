package com.davidayresbyrne.lordpickerbackend.service;

import com.davidayresbyrne.lordpickerbackend.exception.UserNotFoundException;
import com.davidayresbyrne.lordpickerbackend.model.Lord;
import com.davidayresbyrne.lordpickerbackend.repo.LordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LordService {
    private final LordRepo lordRepo;

    @Autowired
    public LordService(LordRepo lordRepo){
        this.lordRepo = lordRepo;
    }

    public List<Lord> findAllLords(){
        return lordRepo.findAll();
    }

    public Lord findLordById(Long id){
        return lordRepo.findLordById(id)
                .orElseThrow(() -> new UserNotFoundException("Lord " + id + " not found."));
    }
}

