package com.mywork.exceptionWorld.runner;
import com.mywork.exceptionWorld.service.DivisionService;
import java.util.Scanner;

public class DivisionRunner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DivisionService service = new DivisionService();
        System.out.print("Enter numerator: ");
        int a = sc.nextInt();
        System.out.print("Enter denominator: ");
        int b = sc.nextInt();
        System.out.println("Result: " + service.divide(a, b));
    }
}
