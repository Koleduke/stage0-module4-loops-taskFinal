package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength)
    {for (int x = 1; x < cathetusLength+1; x++) {

        for (int y = 0; y < cathetusLength*2+1; y++) {
            if(y>=cathetusLength-x&&cathetusLength-y+x-1>0){

                if(cathetusLength-y>0){System.out.print(cathetusLength-y);}
                else{System.out.print(y-cathetusLength+2);}
                }
            else{
                if(y>cathetusLength-x){continue;}
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
