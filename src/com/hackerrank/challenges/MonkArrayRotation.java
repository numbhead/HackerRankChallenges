package com.hackerrank.challenges;

import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class MonkArrayRotation {
    public static void main(String args[] ) throws Exception {
        
        List<String> nkList = new ArrayList<String>();
        List<String> arrList = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        String t = s.nextLine();
        Integer T = Integer.parseInt(t);

        for(int i=0; i <T; i++){
            nkList.add(s.nextLine());
            arrList.add(s.nextLine());
            }

        for(int i=0; i <T; i++){
            List<Integer> intArr = new ArrayList<Integer>();
            List<Integer> newArr = new ArrayList<Integer>();
            String[] nk = nkList.get(i).split(" ");
            String[] arr = arrList.get(i).split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            for(int j=0;j<n;j++){
                intArr.add(Integer.parseInt(arr[j]));
            }
            
            for(int j=(k%n)+1;j<n;j++){
                newArr.add(intArr.get(j));
            }

            for(int j=0;j<k+1;j++){
                newArr.add(intArr.get(j));
            }


            for(Integer ch : newArr){
                System.out.print(ch+" ");
            }
        }
    }
    }
