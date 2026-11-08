Browser Navigation Simulator

Institute for Computer Studies
IT20: Data Structures and Algorithms
Midterm Mini-Project | S.Y. 2026–2027

1. About the Project

The Browser Navigation Simulator is a simple Java desktop application that acts like a basic web browser. It allows users to visit webpages, go back to previously visited pages, view their browsing history, and search for a specific webpage.

This project uses a manually coded Stack and Linear Search to show how Data Structures and Algorithms work in a real application.

2. Project Objectives
To create a working Java desktop application.
To understand and use the Stack data structure.
To apply PUSH, POP, and PEEK operations.
To create a manual Linear Search algorithm.
To connect the code to a Java Swing GUI.
To practice working together using GitHub.
3. Tools Used
Java
Java Swing
NetBeans IDE
GitHub
Array-Based Stack
Linear Search
4. Application Features
Visit: Allows users to enter a URL and add it to the browsing history.
Back: Removes the current webpage and returns to the previous one.
Current Webpage: Shows the webpage currently on top of the Stack.
Browsing History: Shows the webpages that have been visited.
Search: Allows users to search for a webpage using a keyword.
Input Validation: Shows warning messages when the user enters empty information or when the Stack is full.
5. Data Structure Used
Stack

Our project uses an array-based Stack to store visited webpages.

A Stack follows the LIFO principle, which means Last In, First Out.

We use the following operations:

Operation	What it does
PUSH	Adds a new webpage.
POP	Removes the current webpage.
PEEK	Shows the current webpage without removing it.
isEmpty	Checks if the Stack is empty.
isFull	Checks if the Stack is full.
size	Counts the webpages in the Stack.

The Stack can store up to 100 webpages.

6. Searching Algorithm

We use Linear Search to find webpages in the browsing records.

The program checks each stored webpage one by one until it finds a match.

The search is not case-sensitive, so users can type uppercase or lowercase letters.

The program displays:

FOUND if a matching webpage exists.
NOT FOUND if there is no matching webpage.
7. Project Files
File Name	Description
BrowserHistoryStack.java	Contains our Stack implementation.
BrowserSearch.java	Contains our Linear Search code.
BrowserSim21.java	Contains the main application and GUI.
8. How to Run the Project
Download or clone the project from GitHub.
Open NetBeans IDE.
Click File, then Open Project.
Select the downloaded project.
Make sure all Java files are included.
Build and run BrowserSim21.java.
9. How to Use the Application
Open the Browser Navigation Simulator.
Enter a website URL.
Click Visit to add the webpage.
Click Back to return to the previous webpage.
Check the Current Webpage section to see the active page.
Check Browsing History to see visited webpages.
Enter a keyword in the search field.
Click Search to find the webpage.
10. Team Responsibilities

Member 1: Jefferson Toribio

Worked on the Stack implementation.
Added and tested Stack operations.
Helped with the application development.
Contributed to the GitHub repository.

Member 2: Lorenz Ormichigos

Worked on the Linear Search algorithm.
Helped develop the browser GUI.
Connected the search and navigation features.
Contributed to the GitHub repository.

Both members helped develop, test, and improve the project.

11. GitHub Repository

Our project was developed together using GitHub. We used commits and pull requests to share our work and track our progress.

Repository Link: https://bidamm.github.io/IT20-FBrowserNaviSimulator/

12. Limitations
The application only simulates browser navigation.
It does not open or connect to actual websites.
Browsing records are stored temporarily.
The Stack can only hold 100 webpages.
There is no forward navigation.
Browsing history disappears when the program is closed.
13. Conclusion

Through this project, we learned how to use a Stack and Linear Search in a Java application. We also gained experience in creating a GUI, connecting buttons to program operations, and working together using GitHub.

This project helped us understand how the topics we studied in Data Structures and Algorithms can be used in an actual application.
