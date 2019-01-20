package com.service.rober.controller;

import com.service.rober.dto.MovementDTO;
import com.service.rober.exception.InvalidMovementException;
import com.service.rober.service.impl.MovementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/movement")
public class MovementController {

    @Autowired
    private MovementServiceImpl  movementService;

    @PostMapping(value = "/")
    @ResponseBody
    public void move(@RequestBody MovementDTO movementDTO) throws InvalidMovementException {
        movementService.sendMovementToRober(movementDTO);
    }
}
