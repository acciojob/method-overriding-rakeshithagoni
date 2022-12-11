package com.driver;

public class Main {

    public static class A {

        public String meth() {
            return "Invoking method from class A"; }
    }
        public static class B extends A {
            public String meth(){
                return "Method is overridden is Extendend in Extendend class B";
            }
        }
        public static void mani(String[]args){
            B b=new B();
            b.meth();
        }
    }

