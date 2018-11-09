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
public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void incrementX() {
        x += 1;
    }

    public void incrementY() {
        y += 1;
    }

    public void decrementX() {
        x -= 1;

    }

    public void decrementY() {
        y -= 1;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public String toString(){
        return "Position: (" + x + ", " + y + ")";
    }

}
