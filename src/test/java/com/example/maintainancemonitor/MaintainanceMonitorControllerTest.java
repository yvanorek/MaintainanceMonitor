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

    @Test
    public void changeTest1(){
        //arrange
        String message="hallo";
        //act
        String result =messageController.change(message);
        //assert
        assertEquals("Message:"+ message, result);
    }

    @Test
    public void changeTest2(){
        //arrange
        String message="1234 ";
        //act
        String result =messageController.change(message);
        //assert
        assertEquals("Message:"+ message, result);
    }

    @Test
    public void resetTest(){
        //arrange
        String message=messageController.defaultMessage;
        //act
        String result =messageController.reset();
        //assert
        assertEquals(message, result);
    }




}