package com.epam.rd.autotasks.max;
import java.util.Optional;

import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {

        int max = 0;
        if(values != null) {
            for (int num : values) {
                if (num > max) {
                    max = num;
                }
            }
        }
return maxOpt(values);
    }
    public static OptionalInt maxOpt(int[] values){
        OptionalInt result;
        if(values == null) {
            return OptionalInt.empty();
        }
        if(values != null && values.length > 0) {
            int max = values[0];
            for (int num : values) {
                if(num > max) {
                    max = num;
                }
            }
         result = OptionalInt.of(max);
        }
        else {
            result = OptionalInt.empty();
        }
return result;
    }
}

