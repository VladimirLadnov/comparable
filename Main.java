package dz.module4;

import java.util.Arrays;

/**
 * Created by Володимир on 25.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        Figure[] list ={
                new Circle(5), new Rectangle(5, 2), new Triangle(5,8)
        };
        Arrays.sort(list);
        for(Figure f : list){
            System.out.println(f.square());
        }
    }
}
