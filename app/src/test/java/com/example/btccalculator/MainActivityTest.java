package com.example.btccalculator;

import static org.junit.Assert.*;
import com.example.btccalculator.mnozene;

import org.junit.Assert;
import org.junit.Test;

public class MainActivityTest {

    private MainActivity mnozene;

    @Test
    public void onCreate() {
        int a =2;
        int b =2;
        int result = mnozene.add(a,b);

        Assert.assertEquals(4,result);
    }
}