package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        double[] names = {12, 15, 5, 27, -13, 11, 14, -10, -15, 16, 3, 4, 6, 8, 7};
        double sum = 0;
        int cool = 0;
        boolean result = false;
        for (double content : names )
            if (content< 0 ){
                result= true;
            }

        else {
            if (result){
                cool++;
                sum+=content;

            }
            }
        System.out.println("средное арифметическое "+ sum/cool);
    }
    }