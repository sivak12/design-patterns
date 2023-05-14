package com.phone;

public class Shop {
    public static void main(String[] args) {
        //Phone p = new Phone("Android", 2, "Qualcomm", 5.5, 3100);
        
        Phone p = new PhoneBuilder().setOs("Android").setRam(2).setBattery(3000).getPhone();
        
        System.out.println(p);
  
    }
}
