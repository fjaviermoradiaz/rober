package com.service.rober.test.service;


import com.service.rober.client.RoberBusCommunicationService;
import com.service.rober.enums.MovementType;
import com.service.rober.exception.InvalidMovementException;
import com.service.rober.service.MovementService;
import com.service.rober.service.impl.MovementServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;


@SpringBootTest(classes = {
        MovementServiceImpl.class,
        RoberBusCommunicationService.class})

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class MovementServiceTest {

    private static final String LEFT = "left";
    private static final String RIGHT = "right";
    private static final String FORWARD = "forward";
    private static final String BACKWARD = "backward";

    @Autowired
    private RoberBusCommunicationService busCommunicationService;

    @Before
    public void connection() {
        busCommunicationService.connect();
    }

    @After
    public void disconnect() {
        busCommunicationService.disconnect();
    }

    @Test
    public void a_left() throws InvalidMovementException {
        validDirection(LEFT);
        boolean confirmMovement = busCommunicationService.move(LEFT,1.2f);
        assertTrue(confirmMovement);
    }

    @Test
    public void b_right() throws InvalidMovementException {
        validDirection(RIGHT);
        boolean confirmMovement = busCommunicationService.move(RIGHT,2f);
        assertTrue(confirmMovement);
    }

    @Test
    public void c_forward() throws InvalidMovementException {
        validDirection(FORWARD);
        boolean confirmMovement = busCommunicationService.move(FORWARD,1f);
        assertTrue(confirmMovement);
    }

    @Test
    public void d_backward() throws InvalidMovementException {
        validDirection(BACKWARD);
        boolean confirmMovement = busCommunicationService.move(BACKWARD,1f);
        assertTrue(confirmMovement);
    }

    @Test(expected = InvalidMovementException.class)
    public void e_invalidMove() throws InvalidMovementException {
        validDirection("xxx");
        boolean confirmMovement = busCommunicationService.move(BACKWARD,1f);
        assertTrue(confirmMovement);
    }

    private void validDirection(String direction) throws InvalidMovementException {
        if(!MovementType.valid(direction))
            throw new InvalidMovementException("Movement " + direction + " not valid.");
    }


}
