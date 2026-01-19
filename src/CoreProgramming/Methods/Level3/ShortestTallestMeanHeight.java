package CoreProgramming.Methods.Level3;

import java.util.*;

class ShortestTallestMeanHeight{

    public static int[] generateHeights(){
        int[] heights=new int[11];
        for(int i=0;i<heights.length;i++){
            heights[i]=(int)(Math.random()*101)+150;
        }
        return heights;
    }

    public static int findSum(int[] heights){
        int sum=0;
        for(int i=0;i<heights.length;i++){
            sum+=heights[i];
        }
        return sum;
    }

    public static double findMean(int[] heights){
        int sum=findSum(heights);
        return (double)sum/heights.length;
    }

    public static int findShortest(int[] heights){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<heights.length;i++){
            if(heights[i]<min){
                min=heights[i];
            }
        }
        return min;
    }

    public static int findTallest(int[] heights){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            if(heights[i]>max){
                max=heights[i];
            }
        }
        return max;
    }

    public static void display(int[] heights,double mean,int shortest,int tallest){
        System.out.println("Player Heights:");
        for(int i=0;i<heights.length;i++){
            System.out.print(heights[i]+" ");
        }
        System.out.println();
        System.out.println("Shortest Height:"+shortest);
        System.out.println("Tallest Height:"+tallest);
        System.out.println("Mean Height:"+Math.round(mean*100.0)/100.0);
    }

    public static void main(String[] args){
        int[] heights=generateHeights();
        double mean=findMean(heights);
        int shortest=findShortest(heights);
        int tallest=findTallest(heights);
        display(heights,mean,shortest,tallest);
    }
}
