package Phone;

import com.factory.factorypattern;

public class operatingsystem {

    public static void main(String[] args) {

        //OS o = new Android();
        factorypattern f = new factorypattern();
        OS o = f.getObject("ios");
        o.operatingSystemSpec();
    }
}