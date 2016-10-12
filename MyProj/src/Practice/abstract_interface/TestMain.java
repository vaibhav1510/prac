/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */

package Practice.abstract_interface;

/**
 *
 * @author vaibhav
 */
public class TestMain {
    public static void main(String[] args) {
        AbstractClass a = new AbstractClass() {

            @Override
            public void AbsMeth() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void nonAbsMeth() {
                super.nonAbsMeth(); //To change body of generated methods, choose Tools | Templates.
            }
                        
        };
    }
}
