package com;
/**
 * 软引用
 * **/
import java.lang.ref.SoftReference;

public class SoftReferenceDemo {
    public static void main(String[] args) {
        Object obj = new Object();
        SoftReference<Object> sf = new SoftReference<>(obj);
        obj = null;
        System.out.println(sf.get());
    }
}
