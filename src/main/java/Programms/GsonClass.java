package Programms;

import com.google.gson.Gson;
import com.sun.java.accessibility.util.internal.TextComponentTranslator;

public class GsonClass {

    public static void main(String[] args) {

        Pojo p = new Pojo();

        p.setName("Sai Chand");
        p.setAddres("Warangal");

        System.out.println(p);

        Gson g = new Gson();

        String payLoad = g.toJson(p);

        System.out.println(payLoad);
    }
}
//changes