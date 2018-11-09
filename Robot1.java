/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot1;

/**
 *
 * @author alexhord_workdesk
 */
public class Robot1 {

    public static void main(String[] args) {

        Robotai Robot = new Robotai("My babe robot", Color.GOLD, Direction.NORTH);

        Robot.Rotate();
        Robot.Moveforward();
        Robot.Moveforward();
        Robot.Moveforward();
        
        Robotai Robot2 = new Robotai("Robocop", Color.WHITE, Direction.WEST);
        
        Robot2.Rotate();
        Robot2.Moveforward();
        Robot2.Moveforward();
        Robot2.Moveforward();
        Robot2.Moveforward();
        
        System.out.println(Robot);
        System.out.println(Robot2);

    }

}
