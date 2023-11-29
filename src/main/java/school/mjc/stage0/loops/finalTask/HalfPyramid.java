package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {


        for (int x = 1; x < cathetusLength+1; x++) {

            for (int y = 0; y < cathetusLength*2+1; y++) {
                if(y>=cathetusLength-x&&cathetusLength-y>0){

                    System.out.print("*");}


                else{
                    if(y>cathetusLength-x){continue;}
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
