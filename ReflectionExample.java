package reflectionexample;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) {
    TestClass testClass = new TestClass();
        System.out.println("Поля:");
        for (Field field: testClass.getClass().getDeclaredFields()) {
            System.out.printf("name:%s, type:%s \n", field.getName(), field.getType().getCanonicalName());
        }
        
        System.out.println("Методы:");
        for (Method method : testClass.getClass().getDeclaredMethods()) {
            System.out.printf("name:%s, return type:%s  \n", method.getName(), method.getReturnType().getCanonicalName());
        } 
    }
}
