package com.company;

import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;

public class TestMain {
    public static void main(String[] args) {
        int [] list = {1,2,3,4,4,6,5,5};
//        int [][] list2 ={{3, 2, 1}, {4, 6, 5}, {}, {9, 7, 8}} ;
//        System.out.println(find_average(list));
//        int five = 5 ;
//        System.out.println(add(five).applyAsInt(4));
//        flattenAndSort(list2);
//        minValue(list);
//        System.out.println(minValue(list));

        pendulum(list);
    }
    public static double find_average(int[] array){
        double sum = 0  ;
        for (int i = 0; i <array.length ; i++) {
            sum+= array[i] ;
        }
        double average = sum/array.length ;
        return  average;
    }
    public static IntUnaryOperator add(int n) {
      IntUnaryOperator number = s->s+n ;
        return number ;
        // Your code here
    }
    public static int[] flattenAndSort(int[][] array) {
        List<Integer> list = new ArrayList<>() ;

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                list.add(array[i][j]) ;
            }
        }
        List<Integer> sortedList = list.stream()
                .sorted(((o1, o2) -> o1.compareTo(o2)))
                .collect(Collectors.toList());
        int [][] newArray = new int[1][sortedList.size()];
        sortedList.forEach(System.out::println);
        for (int i = 0; i <sortedList.size() ; i++) {
            newArray[0][i] = sortedList.get(i);
        }
        for (int i = 0; i < sortedList.size(); i++) {
            System.out.println(newArray[0][i]);
        }
        return new int[0];
    }
    public static int minValue(int[] values){
        Set<Integer> set = new HashSet<>() ;
        for (int i = 0; i <values.length ; i++) {
            set.add(values[i]) ;
        }
        List <Integer> sortedList = set.stream()
                .sorted(((o1, o2) -> o1.compareTo(o2)))
                .collect(Collectors.toList());
        StringBuilder sb = new StringBuilder() ;
        for (int i = 0; i <sortedList.size() ; i++) {
            sb.append(sortedList.get(i));
        }
        String s = String.valueOf(sb);
        int number = Integer.parseInt(s) ;
        return number;
    }
    public float[] getVector1(boolean[] wasd)
    {
        float diagonal= (float) (1 / Math.sqrt(2));
        float[] vector =new float[]{0,0};
        if(wasd[0]){vector[1]+=1f;}
        if(wasd[1]){vector[0]-=1f;}
        if(wasd[2]){vector[1]-=1f;}
        if(wasd[3]){vector[0]+=1f;}
        if (vector[0] != 0f && vector[1] != 0f) {
            vector[0] *= diagonal;
            vector[1] *= diagonal;
        }

            return vector;
    }
    public static int[] pendulum(final int[] values) {
        int elements = 0  ;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <values.length ; i++) {
            list.add(values[i]) ;
        }
        list.sort(Integer::compareTo);
        List<Integer> magicList = new LinkedList<Integer>();
        for (int i = 0; i <list.size() ; i++) {
            if(elements%2==0){
                magicList.add(0,list.get(i)) ;
            }else {
                magicList.add(elements,list.get(i));
            }
            elements+=1 ;
        }
        int [] simpleTab = new int[magicList.size()] ;
        for (int i = 0; i <magicList.size() ; i++) {
            simpleTab[i] = magicList.get(i);
        }
        return simpleTab; // Do your magic!
    }
    public static int cubeOdd(int arr[]) {
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = arr[i]^2 ;
        }
        int sumOfOdds= 0 ;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2==1){
                sumOfOdds+=arr[1] ;
            }
        }
        return sumOfOdds;
    }

    float[] getVector(final boolean[] wasd) {
        float[] vector = new float[2];
        float diagonal= (float) (1 / Math.sqrt(2));

        if (wasd[0]) vector[1] += 1f;
        if (wasd[1]) vector[0] -= 1f;
        if (wasd[2]) vector[1] -= 1f;
        if (wasd[3]) vector[0] += 1f;

        if (vector[0] != 0f && vector[1] != 0f) {
            vector[0] *= diagonal;
            vector[1] *= diagonal;
        }

        return vector;
    }
}
