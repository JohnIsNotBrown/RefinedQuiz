# RefinedQuiz
👨🏾‍💻 A true/false quiz that tests your Computer Science knowledge using Java and MongoDB to store data. No GUI implementation yet.

📝 Questions include information about Object Oriented Programming, Data Structures and Algorithms, Data types, and many more questions to get you prepared for a major in Computer Science or even as a review session!

### Tech Stack Implemented
Built with
* Java
* MongoDB

Using MongoDB, the group was able to connect to MongoDB Compass and input data such as a users name, age, and final score

`MongoClient mongo = new MongoClient("localhost", 27017);`

### Code Style
Using Object Oriented Programming, we were able to create different classes for different purposes
* Question Class [Class contains the question and the answer]
* Questions Class [Collection of the question class using an Arraylist]
* Person Class [Class contains the person taking the quiz's information]
* Database Class [Class contains connection to the DB and it's methods that will be used in the main menu]
