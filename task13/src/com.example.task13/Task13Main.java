package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {9, 1100, 7, 8};
        int[] result = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(result));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        //считаем количество элементов, которые меньше или равны 1000
        int count = 0;
        for (int num : arr){
            if (num <= 1000){
                count++;
            }
        }
        //Создаем новый массив для записи элементов меньше или равных 1000
        int[] result = new int[count];
        int index = 0;
        for (int num : arr){
            if (num <= 1000){
                result[index++] = num;
            }
        }
        return result;
    }

}