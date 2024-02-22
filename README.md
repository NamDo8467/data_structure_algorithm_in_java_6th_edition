# Solutions to exercises in Data Structures & Algorithms in Java 6th edition
All solutions will be inside the src folder above with each package corresponding to each chapter in the book. Please make a pull request if you have any questions about the solutions.
# Errors/Bugs when solving the questions
### *No enclosing instance of type is accessible*
Refer to this link: [source](https://stackoverflow.com/questions/9560600/what-causes-error-no-enclosing-instance-of-type-foo-is-accessible-and-how-do-i)  
This error says that you can't have a nested class inside another class without making the nested class **static**.  
You can have 2 solutions:  
- Make it static
- Move it outside of the class but the visibility modifier will not be declared making it private by default and that leads to the below error.
### *The public type <classname> must be defined on its own file*
Refer to this link: [source](https://stackoverflow.com/questions/19814713/the-public-type-classname-must-be-defined-in-its-own-file-error-in-eclipse)  
This error says that when a file has 2 classes or more, only one class can be declared with a visibility modifier (public/private/protected), other classes will not have any visibility modifier making them all private
