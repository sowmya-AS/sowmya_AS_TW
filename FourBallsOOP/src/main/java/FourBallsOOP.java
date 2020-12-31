import processing.core.PApplet;

public class FourBallsOOP extends PApplet {

    public static final int DIAMETER = 10;
    public class fourBalls{
        int heightOfBall;
        int speedOfBall;
        int xPositionOfBalls=0;

        fourBalls(int xPositionOfBalls,int heightOfBall,int speedOfBall)
        {
            this.xPositionOfBalls=xPositionOfBalls;
            this.heightOfBall=heightOfBall;
            this.speedOfBall=speedOfBall;
        }

        public void setSpeed (){
            xPositionOfBalls+=speedOfBall;
        }

        public void generateMovingBalls()

        {
            ellipse(xPositionOfBalls,heightOfBall, DIAMETER, DIAMETER);
            setSpeed();
        }

    }

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static void main(String[] args) {
        PApplet.main("FourBallsOOP", args);
    }
    fourBalls ballOne=new fourBalls(0,HEIGHT/5,1);
    fourBalls ballTwo=new fourBalls(0,2*HEIGHT/5,2);
    fourBalls ballThree=new fourBalls(0,3*HEIGHT/5,3);
    fourBalls ballFour=new fourBalls(0,4*HEIGHT/5,4);

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
        ballOne.generateMovingBalls();
        ballTwo.generateMovingBalls();
        ballThree.generateMovingBalls();
        ballFour.generateMovingBalls();
    }
}
