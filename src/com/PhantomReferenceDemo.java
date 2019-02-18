package com;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/***
 * 虚引用
 */
public class PhantomReferenceDemo {
    public static void main(String[] args) {
        Object object = new Object();
        PhantomReference<Object> pf = new PhantomReference<Object>(object,new ReferenceQueue<>());
        object = null;
        System.out.println(pf.get());
    }
}
