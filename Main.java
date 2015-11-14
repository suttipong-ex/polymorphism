/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Suttipong
 */
public class Main {
    public static void main(String[] args) {
        Vehicle v = new Truck();
        v = new Train();
        v.move();
    }
}
