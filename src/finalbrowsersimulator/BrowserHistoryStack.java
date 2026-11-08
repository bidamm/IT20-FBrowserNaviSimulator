/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalbrowsersimulator;

/**
 *
 * @author USER
 */
public class BrowserHistoryStack {
    private String[] pages;
    private int top;
    private int capacity;
    
    public BrowserHistoryStack(int capacity) {

        if (capacity <= 0) {
            throw new IllegalArgumentException(
                "Capacity must be greater than zero."
            );
        }

        this.capacity = capacity;
        this.pages = new String[capacity];
        this.top = -1;
    }


}
