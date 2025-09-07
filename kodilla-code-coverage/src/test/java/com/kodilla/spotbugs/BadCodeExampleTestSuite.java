package com.kodilla.spotbugs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadCodeExampleTestSuite {

    @Test
    void testEqualsAndHashCode_sameType_shouldBeEqual() {
        BadCodeExample obj1 = new BadCodeExample();
        BadCodeExample obj2 = new BadCodeExample();

        setType(obj1, "test");
        setType(obj2, "test");

        assertEquals(obj1, obj2);
        assertEquals(obj1.hashCode(), obj2.hashCode());
    }

    @Test
    void testEquals_differentType_shouldNotBeEqual() {
        BadCodeExample obj1 = new BadCodeExample();
        BadCodeExample obj2 = new BadCodeExample();

        setType(obj1, "A");
        setType(obj2, "B");

        assertNotEquals(obj1, obj2);
    }

    @Test
    void testEquals_null_shouldNotBeEqual() {
        BadCodeExample obj = new BadCodeExample();
        setType(obj, "X");

        assertNotEquals(obj, null);
    }

    @Test
    void testEquals_differentClass_shouldNotBeEqual() {
        BadCodeExample obj = new BadCodeExample();
        setType(obj, "X");

        assertNotEquals(obj, "string");
    }

    @Test
    void testGetType() {
        BadCodeExample obj = new BadCodeExample();
        setType(obj, "customType");

        assertEquals("customType", obj.getType());
    }

    @Test
    void testPiConstant() {
        assertEquals(3.141592653589793, BadCodeExample.PI);
    }

    private void setType(BadCodeExample obj, String value) {
        try {
            var field = BadCodeExample.class.getDeclaredField("type");
            field.setAccessible(true);
            field.set(obj, value);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}