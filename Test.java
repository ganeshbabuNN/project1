package Module6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

class Rectangle{
    @Deprecated
    public void showOfNameClass(){
        System.out.println("Rect");
    }
    public void printNameOfClass(){
        System.out.println("Rectangle");
    }

}

class Square extends Rectangle{
    @Override
    public void printNameOfClass(){
        System.out.println("Square");
    }

}

public class Test {
    public static void main(String[] args) {
        Rectangle s = new Rectangle();
        s.printNameOfClass();
        s.showOfNameClass();
    }
}