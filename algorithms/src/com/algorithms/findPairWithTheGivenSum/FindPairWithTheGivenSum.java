package com.algorithms.findPairWithTheGivenSum;

public class FindPairWithTheGivenSum {
    public static void main(String[] args) {

        var reset = 0;
        var count = 0;
        var y = 0;
        var target = 10;
        int[] numbers = new int[]{8, 7, 2, 5, 3, 1};

        for(int x = 0; x < numbers.length-1; x++){

            var a = numbers[y];
            var b = numbers[x+1];
            count++;

            if((a+b) == target){
                System.out.println(a+"+"+b+"="+target);
            }

            if(x == numbers.length-2){
                y++;
                x = y;
                reset++;

            }

        }
        
        System.out.println("iterations: "+count);
        System.out.println("resets: "+reset);


    }
}