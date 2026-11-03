import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        for (int x : arr){

        System.out.print(x);}
        }



    }






/*
str.length(); // возвращает длину строки str (количество символов, включая пробелы)

int max = Integer.MIN_VALUE;

String word = "Java is strong";
int x = word.length();
System.out.println(x); // 14


String word1 = "Java";
String word2 = "Python";
System.out.println(word1.equals(word2)); // false

String word3 = "Ja";
String word4 = "va";
boolean result = word1.equals(word3 + word4);
System.out.println(result); // true */