package com.quang.dp.singleton;

import java.util.Objects;

public class LazyInit {
    private static LazyInit instance;

    private LazyInit() {
    }

    public static LazyInit getInstance() {
        if (Objects.isNull(instance)) {
            instance = new LazyInit();
        }
        return instance;
    }
}
