import org.junit.jupiter.api.Test;
import test1.ExperimentalClass;

import static org.junit.jupiter.api.Assertions.*;

class ExperimentalClassTest {
    @Test
    void checkTestRunnerClassName(){
        ExperimentalClass experimentalClass = new ExperimentalClass();
        assertEquals("test1.TestRunner", experimentalClass.getClass().getName());
    }

    @Test
    void checkTestRunnerClassType(){
        ExperimentalClass experimentalClass = new ExperimentalClass();
        assertEquals(ExperimentalClass.class, experimentalClass.getClass());
    }

    @Test
    void checkTestRunnerPackage(){
        ExperimentalClass experimentalClass = new ExperimentalClass();
        assertEquals("test1", experimentalClass.getClass().getPackage().getName());
    }

}