import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestRunner {
    public static <T> void start(Class<T> testClass)
            throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Method beforeSuiteMethod = null;
        List<Method> testMethods = new ArrayList<>();
        Method afterSuiteMethod = null;

        for (Method method : testClass.getDeclaredMethods()){
            if (method.isAnnotationPresent(BeforeSuite.class)){
                if (beforeSuiteMethod != null)
                    throw new RuntimeException("Only one method can have BeforeSuite annotation!");
                beforeSuiteMethod = method;
            }
            else if (method.isAnnotationPresent(Test.class))
                testMethods.add(method);
            else if (method.isAnnotationPresent(AfterSuite.class)) {
                if (afterSuiteMethod != null)
                    throw new RuntimeException("Only one method can have AfterSuite annotation!");
                afterSuiteMethod = method;
            }
        }

        Constructor<T> testConstructor = testClass.getConstructor();
        Object test = testConstructor.newInstance();

        if (beforeSuiteMethod != null)
            beforeSuiteMethod.invoke(test);

        Comparator<Method> comparator = (Comparator.comparingInt(
                method -> method.getDeclaredAnnotation(Test.class).priority()));
        testMethods.sort(comparator.reversed());

        for (Method method : testMethods)
            method.invoke(test);

        if (afterSuiteMethod != null)
            afterSuiteMethod.invoke(test);
    }
}
