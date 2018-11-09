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
public class Robotai {

     private String name;
    Color color; 

    private Position p = new Position(0, 0);

    Direction dir;

    public Robotai(String name, Color color, Direction Direction)  {
        this.dir = Direction;           
        this.name = name;
        this.color= color;

    }

    public Direction Rotate() {

        if (dir == Direction.EAST) {
            dir = Direction.SOUTH;
        } else if (dir == Direction.WEST) {
            dir = Direction.NORTH;
        } else if (dir == Direction.NORTH) {
            dir = Direction.EAST;
        } else {
            dir = Direction.WEST;
        }
        return dir;
    }

    public void Moveforward() {

        if (dir == Direction.EAST) {
            p.incrementX();
        } else if (dir == Direction.WEST) {
            p.decrementX();

        } else if (dir == Direction.NORTH) {
            p.incrementY();
        } else {

            p.decrementY();

        }
    }

    public Position getPosition() {
        return p;

    }
   

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }
 public String toString(){
       return "ROBOT: " + name + "."+" Has color "+color+"."+" "+"Roubot is facing " + dir + " " + " at coordinates " +p;
}

}
