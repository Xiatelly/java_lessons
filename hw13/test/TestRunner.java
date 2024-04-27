import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.platform.console.ConsoleLauncher;

public final class TestRunner {

    public static Result runTestByClasses(Class<?>... classes){
        return JUnitCore.runClasses(classes);
    }

    public static Result runTestByClass(Class<?> c){
        return runTestByClasses(c);
    }
}
