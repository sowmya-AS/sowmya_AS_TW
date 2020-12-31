import processing.core.PApplet;
public class FourBallsProcedural extends PApplet {


    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int heightOfBallFour = 4 * HEIGHT / 5;
    public static final int heightOfBallThree = 3 * HEIGHT / 5;
    public static final int heightOfBallTwo = 2 * HEIGHT / 5;
    public static final int heightOfBallOne = HEIGHT / 5;
    public static final int DIAMETER = 10;
    int xOfBallOne=0;
    int xOfBallTwo=0;
    int xOfBallThree=0;
    int xOfBallFour=0;
    int speedOfBallOne=1;
    int speedOfBallTwo=2;
    int speedOfBallThree=3;
    int speedOfBallFour=4;


    public static void main(String[] args) {
        PApplet.main("FourBallsProcedural", args);
    }


    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        sketchBallOne();
        sketchBallTwo();
        sketchBallThree();
        sketchBallFour();
    }

    private void sketchBallFour() {
        ellipse(xOfBallFour, heightOfBallFour, DIAMETER, DIAMETER);
        xOfBallFour+=speedOfBallFour;
    }


    private void sketchBallThree() {
        ellipse(xOfBallThree, heightOfBallThree,DIAMETER,DIAMETER);
        xOfBallThree+=speedOfBallThree;
    }

    private void sketchBallTwo() {
        ellipse(xOfBallTwo, heightOfBallTwo,DIAMETER,DIAMETER);
        xOfBallTwo+=speedOfBallTwo;
    }

    private void sketchBallOne() {
        ellipse(xOfBallOne, heightOfBallOne, DIAMETER, DIAMETER);
        xOfBallOne+=speedOfBallOne;
    }
}
