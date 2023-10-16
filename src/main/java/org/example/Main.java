package org.example;

import javax.annotation.processing.SupportedSourceVersion;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter path first file: ");
//        String path1 = scanner.nextLine();
//        System.out.print("Enter path second file: ");
//        String path2 = scanner.nextLine();
//       try(BufferedReader reader = new BufferedReader(new FileReader(path1)) ; BufferedReader reader2 = new BufferedReader(new FileReader(path2))){
//        String line;
//           List<String> text1 = new ArrayList<>();
//        while ((line=reader.readLine())!=null){
//            text1.add(line);
//        }
//        reader.close();
//        List<String> text2 = new ArrayList<>();
//        while ((line = reader2.readLine())!=null){
//            text2.add(line);
//        }
//        reader2.close();
//        Boolean isIdentical = true;
//        if(text1.size() != text2.size()){
//            System.out.println("Number of rows are not equal");
//            isIdentical = false;
//        }else{
//            for (int i = 0; i < text1.size();i++){
//                if(!text1.get(i).equals(text2.get(i))){
//                    System.out.println(i + " row does not match " + i + "row");
//                    isIdentical=false;
//                }
//            }
//        }
//        if (isIdentical)
//            System.out.println("Indentical");
//        else
//            System.out.println("Not indentical");
//       } catch (IOException e) {
//           System.out.println(e.getMessage());
//       }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter file path: ");
//        String path = scanner.nextLine();
//        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
//            String line;
//            String longLine="";
//            int maxLength=0;
//            while ((line = reader.readLine())!=null){
//                if(line.length()>maxLength){
//                    maxLength = line.length();
//                    longLine = line;
//                }
//            }
//            reader.close();
//            System.out.println("Max length: " + maxLength);
//            System.out.println("Long line: " + longLine);
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter file path: ");
//        String path = scanner.nextLine();
//        try(BufferedReader reader = new BufferedReader(new FileReader(path)))
//        {
//            String line;
//            while ((line = reader.readLine())!=null){
//                String[]numbers = line.split(" ");
//                int[]arr = new int[numbers.length];
//                for (int i = 0; i<arr.length;i++){
//                    arr[i] = Integer.parseInt(numbers[i]);
//                }
//
//                int arraySum = 0;
//                int arrayMax = Integer.MIN_VALUE;
//                int arrayMin = Integer.MAX_VALUE;
//
//                for (int num : arr) {
//                    arraySum += num;
//                    if (num > arrayMax) {
//                        arrayMax = num;
//                    }
//                    if (num < arrayMin) {
//                        arrayMin = num;
//                    }
//                }
//
//                System.out.println("Arr: " + line);
//                System.out.println("Max: " + arrayMax);
//                System.out.println("Min: " + arrayMin);
//                System.out.println("Sum: " + arraySum);
//                System.out.println();
//            }
//
//        }
//        catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }


    }
}