package com.hackerrank.challenges;

import java.util.*;

public class Test {

    private static void process (String[] arr){
        int repCount=1;
        boolean repflag = false;
        boolean consflag = false;
        int consCount=1;
        List<String> strarr = new ArrayList<String>();
        strarr.add(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            

            if(arr[i]==arr[i-1])
            {
                consCount++;
            if (consCount>2) consflag=true;
            }


            if(strarr.contains(arr[i])) 
            repCount++;
            if(repCount>4)repflag = true;
            strarr.add(arr[i]);
            
        }
        if(repflag || consflag) System.out.println("Yes");
        else System.out.println("No");
        }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String[] arr = {"9","1","6","7","2","2","1","3","4","1"};
       // String[] arr1 = {"9167121391"};
       process(arr);

    }
    
}
