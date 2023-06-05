package com.example.maintainancemonitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintainanceMonitorControllerTest {

    private MaintainanceMonitorController messageController =new MaintainanceMonitorController();

    @Test
    public void defaultTest(){
        //arrange
        String message=messageController.message;
        //act
        String result =messageController.defaultwebseite();
        //assert
        assertEquals(message, result);
    }


}