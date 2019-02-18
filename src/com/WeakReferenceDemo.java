package com;

import java.lang.ref.WeakReference;

/**
 * 弱引用
 **/
public class WeakReferenceDemo {
    public static void main(String[] args) {
        Object object = new Object();
        WeakReference<Object> wf = new WeakReference<>(object);
        object = null;
        wf.get();
        wf.isEnqueued();
        System.out.println(wf.isEnqueued());
    }
}
