package Lesson09;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TransactionAnalyzer {
    public static void analyzerTransaction(Object obj) {
        for (Method method : obj.getClass().getMethods()) {
            if (method.isAnnotationPresent(Transaction.class)) {
                Class cls[] = method.getParameterTypes();
                System.out.println("Transaction is started");
                try {
                    System.out.println(method.invoke(obj, new Integer[]{new Integer(1), new Integer(2)}));
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
                System.out.println("Transaction is ended");
            } else {
                try {
                    System.out.println(method.invoke(obj, new Integer[]{new Integer(1), new Integer(2)}));
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
