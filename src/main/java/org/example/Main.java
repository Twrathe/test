package org.example;
import rect.rect;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> cl = Class.forName("rect.rect");
            Constructor<?> cs = cl.getDeclaredConstructor();
            rect rect1 = (rect)cs.newInstance();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hello!");
        System.out.println("Hello1!");
    }
}