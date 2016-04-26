package dz.module4;

/**
 * Created by Володимир on 25.04.2016.
 */
public class Figure implements Comparable {
    public double square(){
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        Figure f = (Figure) o;

        if(square() < f.square()){
            return -1;
        }
        else if(square() == f.square()){
            return 0;
        }
        else if(square() > f.square()){
            return 1;
        }else
            return 0;
    }
}
