package com.davidayresbyrne.lordpickerbackend.controller;

import com.davidayresbyrne.lordpickerbackend.model.Lord;
import com.davidayresbyrne.lordpickerbackend.service.LordService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lordpicker")
@CrossOrigin
public class LordController {
    private final LordService lordService;

    private LordController(LordService lordService){
        this.lordService = lordService;
    }

    @GetMapping("/home")
    public ResponseEntity<List<Lord>> getAllLords(){
        List<Lord> lords = lordService.findAllLords();
        return new ResponseEntity<>(lords, HttpStatus.OK);
    }

    //may or may not need this
    @GetMapping("/find/{id}")
    public ResponseEntity<Lord> getLord(@PathVariable("id") Long id){
        Lord lord = lordService.findLordById(id);
        return new ResponseEntity<>(lord, HttpStatus.OK);
    }
}