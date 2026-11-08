/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalbrowsersimulator;

/**
 *
 * @author USER
 */
public class BrowserSearch {
   
}  public int linearSearch(
        BrowserHistoryStack history,
        String keyword
    ) {
    if (history == null || keyword == null) {
            return -1;
        }

        String key = keyword.trim();

        if (key.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < history.size(); i++) {

            String page = history.getPageAt(i);

            if (page != null && containsIgnoreCase(page, key)) {
                return i;
            }
        }

        // Return -1 if no matching webpage exists
        return -1;
    }

}
}
