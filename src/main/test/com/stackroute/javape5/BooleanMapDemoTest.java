package com.stackroute.javape5;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

    public class BooleanMapDemoTest {

        public static BooleanMapDemo booleanMapDemo;

        @BeforeClass
        public static void setUp()
        {
            booleanMapDemo = new BooleanMapDemo();
        }

        @AfterClass
        public static void tearDown()
        {
            booleanMapDemo = null;
        }

        @Test
        public void givenNullShouldReturnBooleanMap()
        {
            assertNull(booleanMapDemo.getBooleanMap(null));
        }

        @Test
        public void givenEmptyStringShouldReturnBooleanMap()
        {
            Map<String,Boolean> result = new HashMap<>();

            result.put("",false);

            assertEquals(result,booleanMapDemo.getBooleanMap(new String[] {""}));
        }


        @Test
        public void givenStringArrayShouldReturnBooleanMap()
        {
            Map<String,Boolean> result = new HashMap<>();

            result.put("srujana",true);
            result.put("ibm",false);
            result.put("stackroute",false);

            assertEquals(result,booleanMapDemo.getBooleanMap(new String[] {"srujana","srujana","ibm","stackroute"}));
        }

        @Test
        public void givenArrayShouldReturnBooleanMap()
        {
            Map<String,Boolean> result = new HashMap<>();

            result.put("srujana",true);
            result.put("ibm",false);
            result.put("stackroute",false);

            assertEquals(result,booleanMapDemo.getBooleanMap(new String[] {"srujana","srujana","ibm","stackroute"}));
        }

}