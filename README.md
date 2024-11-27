Instructions
Create a Maven project in Intelij.
In pom.xml, press Alt+Insert and select Dependency
In the dialog that opens, type org.junit.jupiter:junit-jupiter in the search field.
Locate the necessary dependency in the search results and click Add.
When the dependency is added to pom.xml, press CtrlShift0O or click Reimport All Maven Projects in the Maven tool window to import the changes. 
Write a class
To create a test,Place the caret at the YourClass class declaration and press AltEnter. 
From the menu that appears select the class methods that we are going to test.
To each method add the necessary assertions eg assertEquals(4, Calculator.add(2, 2));
