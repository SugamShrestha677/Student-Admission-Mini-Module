package singleton.good;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import singleton.good.CollegeConfig;

public class CollegeConfigTest {

    // Test 1: Verify only one instance exists
    @Test
    void testSingletonInstance() {

        CollegeConfig config1 = CollegeConfig.getInstance();
        CollegeConfig config2 = CollegeConfig.getInstance();

        assertSame(config1, config2);
    }

    // Test 2: Verify college name
    @Test
    void testCollegeName() {

        CollegeConfig config = CollegeConfig.getInstance();

        assertEquals("ABC College", config.getCollegeName());
    }

    // Test 3: Verify system version
    @Test
    void testSystemVersion() {

        CollegeConfig config = CollegeConfig.getInstance();

        assertEquals("1.0", config.getSystemVersion());
    }

    // Test 4: Verify instance is not null
    @Test
    void testInstanceNotNull() {

        CollegeConfig config = CollegeConfig.getInstance();

        assertNotNull(config);
    }

}