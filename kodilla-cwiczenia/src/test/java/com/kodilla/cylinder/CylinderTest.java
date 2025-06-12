package com.kodilla.cylinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    public void getVolume(){
        Cylinder cylinder = new Cylinder(3.0,"blue", 2.0);
        double result = cylinder.getVolume();
        double expectedResult = Math.PI*3.0*3.0*2.0;
        assertEquals(expectedResult, result);
    }

    @Test
    public void getVolumeDefault(){
        Cylinder cylinder = new Cylinder();
        double result = cylinder.getVolume();
        double expectedResult = Math.PI*1.0*1.0*1.0;
        assertEquals(expectedResult, result);
    }


}