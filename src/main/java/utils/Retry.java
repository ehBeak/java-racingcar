package utils;

import java.util.function.Supplier;

public class Retry {
    public static <T> T retryOnException(Supplier<T> supplier){
        try{
            return supplier.get();
        }catch (IllegalArgumentException e){
            System.out.println("[ERROR] " + e.getMessage());
            return retryOnException(supplier);
        }
    }
}
