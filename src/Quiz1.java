
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatad6701
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City ();
        Robot denis = new Robot (Kitchener, 4, 0, Direction.EAST);
        
        new Wall (Kitchener, 4, 2, Direction.WEST);
        new Wall (Kitchener, 4, 2, Direction.NORTH);
        new Wall (Kitchener, 3, 3, Direction.WEST);
        new Wall (Kitchener, 3, 3, Direction.NORTH);
        new Wall (Kitchener, 2, 4, Direction.WEST);
        new Wall (Kitchener, 2, 4, Direction.NORTH);
        new Wall (Kitchener, 2, 5, Direction.NORTH);
        new Wall (Kitchener, 2, 5, Direction.EAST);
        new Wall (Kitchener, 3, 6, Direction.NORTH);
        new Wall (Kitchener, 3, 6, Direction.EAST);
        new Wall (Kitchener, 4, 7, Direction.NORTH);
        new Wall (Kitchener, 4, 7, Direction.EAST);
        
        new Thing(Kitchener, 4, 1);
        new Thing(Kitchener, 3, 2);
        new Thing(Kitchener, 2, 3);
        new Thing(Kitchener, 1, 4);
        
        denis.setLabel("D");
        denis.setColor(Color.RED);
        
        denis.move();
        denis.pickThing();
        denis.turnLeft();
        denis.move();
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
        denis.move();
        denis.pickThing();
        denis.turnLeft();
        denis.move();
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
        denis.move();
        denis.pickThing();
        denis.turnLeft();
        denis.move();
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
        denis.move();
        denis.pickThing();
        denis.move();
        denis.putThing();
        denis.move();
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
        denis.move();
        denis.putThing();
        denis.turnLeft();
        denis.move();
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
        denis.move();
        denis.putThing();
        denis.turnLeft();
        denis.move();
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
        denis.move();
        denis.putThing();
        denis.turnLeft();
        denis.move();  
    }
}