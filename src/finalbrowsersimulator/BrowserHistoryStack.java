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

    public boolean push(String url) {

        if (url == null || url.trim().isEmpty() || isFull()) {
            return false;
        }

        top++;
        pages[top] = url.trim();

        return true;
    }
      public String pop() {

        if (isEmpty()) {
            return null;
        }

        String url = pages[top];

        pages[top] = null;
        top--;

        return url;
    }
 public String peek() {

        if (isEmpty()) {
            return null;
        }

        return pages[top];
    }

    // COMMIT 6: Check if stack is empty
    public boolean isEmpty() {

        return top == -1;
    }
  public boolean isFull() {

        return top == capacity - 1;
    }
      public int size() {

        return top + 1;
    }

    // Retrieve webpage using its index
    public String getPageAt(int index) {

        if (index < 0 || index > top) {
            return null;
        }

        return pages[index];
    }
}
