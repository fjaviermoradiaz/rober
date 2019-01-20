package com.service.rober.service.impl;

import com.service.rober.client.RoberBusCommunicationService;
import com.service.rober.dto.MovementDTO;
import com.service.rober.enums.MovementType;
import com.service.rober.exception.InvalidMovementException;
import com.service.rober.service.MovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovementServiceImpl implements MovementService {

    @Autowired
    private RoberBusCommunicationService busCommunicationService;

    @Override
    public void sendMovementToRober(MovementDTO movementDTO) throws InvalidMovementException {
        if(!MovementType.valid(movementDTO.getDirection()))
            throw new InvalidMovementException("Movement " + movementDTO.getDirection() + " not valid.");

        busCommunicationService.move(movementDTO.getDirection(),movementDTO.getDistance());
    }
}
