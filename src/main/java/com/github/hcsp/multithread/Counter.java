package com.github.hcsp.multithread;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger VALUE = new AtomicInteger(0);

    public int getVALUE() {
        return VALUE.intValue();
    }

    // 加上一个整数i，并返回加之后的结果
    public int addAndGet(int i) {
        return VALUE.addAndGet(i);
    }

    // 减去一个整数i，并返回减之后的结果
    public int minusAndGet(int i) {
        return VALUE.addAndGet(-i);
    }
}
