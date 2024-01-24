/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.pattern;

/**
 * A class to represent the shape square that implements the Shape interface.
 *
 * @author Jay Shukla
 * @version 1.0
 */
public class Square implements Shape {

    /**
     * Prints out a String to let user know which shape is drawn.
     *
     * @return String that shows which shape is drawn
     */
    @Override
    public String draw() {
        return "Square Drawn";
    }
}
