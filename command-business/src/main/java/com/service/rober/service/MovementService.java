package com.service.rober.service;

import com.service.rober.dto.MovementDTO;
import com.service.rober.exception.InvalidMovementException;

public interface MovementService {

    void sendMovementToRober(MovementDTO movementDTO) throws InvalidMovementException;

}
