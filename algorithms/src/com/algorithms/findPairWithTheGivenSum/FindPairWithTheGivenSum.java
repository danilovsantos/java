package com.algorithms.findPairWithTheGivenSum;

import java.util.Arrays;

public class FindPairWithTheGivenSum {

    private static int target = 10;
    private static int[] numbers = new int[]{7, 2, 8, 1, 3, 5};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbers));
        System.out.println("Target Sum: "+target);
        //findUsingBruteForce();
        findUsingSorting();
    }

    public static void findUsingBruteForce(){

        int reset = 0;
        int count = 0;
        int y = 0;

        for(int x = 0; x < numbers.length-1; x++){

            int a = numbers[y];
            int b = numbers[x+1];
            count++;

            if((a+b) == target){
                System.out.println("Pair found: "+a+" + "+b+" = "+target);
            }

            if(x == numbers.length-2){
                y++;
                x = y;
                reset++;
            }

        }

        System.out.println("Loop Iterations: "+count);
        System.out.println("Loop Resets: "+reset);
    }

    public static void findUsingSorting(){

        numbers = sortNumbers(numbers);

        int count = 0;
        int left = 0;
        int right = numbers.length-1;

        for(int x = 0; x < numbers.length; x++){

            int a = numbers[left];
            int b = numbers[right];

            if((a+b) == target){
                System.out.println("Pair Found: "+a+" + " +b+ " = "+target);
                break;
            }else if((a+b) > target){
                right--;
            }else{
                left++;
            }
            count++;
        }

        System.out.println("Loop Iterations: "+count);

    }

    public static int[] sortNumbers(int[] numbers){

        for(int x = 0; x < numbers.length-1; x++) {

            int a = numbers[x];
            int b = numbers[x+1];

            if(a > b){
                numbers[x] = b;
                numbers[x+1] = a;
            }

            if(x > 0){

                for(int y = x; y > 0; y--){

                    int c = numbers[y];
                    int d = numbers[y-1];
                    if(c < d){
                        numbers[y] = d;
                        numbers[y-1] = c;
                    }

                }

            }

        }

        return numbers;

    }

}