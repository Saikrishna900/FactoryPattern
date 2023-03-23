package com.factory;

import Phone.Android;
import Phone.OS;
import Phone.Windows;
import Phone.ios;

public class factorypattern {
    public OS getObject(String str) {
        if (str.equals("Android")) {
            return new Android();
        } else if (str.equals("ios")) {
            return new ios();
        } else {
            return new Windows();
        }
    }
}
