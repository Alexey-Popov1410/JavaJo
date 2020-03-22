package Lesson09;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassAnalyzer {
    public static void analyze(Class cls) {
        getClassInformation(cls);
        getMethodInformation(cls);
        getConstructorInformation(cls);
        getFieldInformation(cls);
    }

    public static void analyze(Object obj) {
        getClassInformation(obj.getClass());
        getMethodInformation(obj.getClass());
        getConstructorInformation(obj.getClass());
        getFieldInformation(obj.getClass());
    }

    private static void getClassInformation(Class cls) {
        System.out.println("Имя класса: " + cls.getName());
        getAnnotationInformation(cls.getAnnotations());
        Class[] interfaces = cls.getInterfaces();
        if (interfaces.length > 0) {
            System.out.println("Интерфейсы: ");
            for (Class clazz : interfaces) {
                System.out.print(clazz + " ");
            }
        }
        System.out.println();
    }

    private static void getFieldInformation(Class cls) {
        Field[] fields = cls.getDeclaredFields();
        if (fields.length > 0) {
            System.out.println("Поля: ");
            for (Field f : fields) {
                System.out.println("\t" + f.getType() + " " + f.getName() + ", ");
                getAnnotationInformation(f.getAnnotations());
            }
        }
        System.out.println();
    }

    private static void getMethodInformation(Class cls) {
        Method[] methods = cls.getDeclaredMethods();
        System.out.println("Доступные методы: ");
        for (Method method : methods) {
            System.out.println("\t" + method.toString());
            getAnnotationInformation(method.getAnnotations());
        }
        System.out.println();
    }

    private static void getConstructorInformation(Class cls) {
        Constructor[] constructors = cls.getDeclaredConstructors();
        if (constructors.length > 0) {
            System.out.println("Конструктор(ы) :");
            for (Constructor constructor : constructors) {
                System.out.println("\t" + constructor.toString());
            }
        }
    }

    private static void getAnnotationInformation(Annotation[] annotations) {
        if (annotations.length > 0) {
            System.out.println("\tАннотация:");
            for (Annotation a : annotations) {
                System.out.println("\t\t" + a);
            }
        }
    }
}
