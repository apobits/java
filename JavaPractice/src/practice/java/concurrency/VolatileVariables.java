package practice.java.concurrency;

import java.util.List;

public class VolatileVariables {
    //writes to volatile variables make a happens before relationship to subsequent reads

    //reads and writes to reference variables and to primitive types except long and double are atomic so no need to define them as volatile

    // reads and writes to this variable are atomic
    private volatile long longOne;

    //reads and writes to this variable  are atomic
    private volatile double doubleOne;

    //reads and writes to this variable are NOT atomic
    private long lonTwo;

    //reads and writes to this variable are NOT atomic
    private double doubleTwo;

    // reads and writes to obj reference is atomic
    private Object obj;

    //reads and writes to list reference is atomic
    private List<Integer> list;
}
