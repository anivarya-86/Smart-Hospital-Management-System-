🏥 Smart Hospital Management SystemA core Java console application designed to manage hospital patient records efficiently using Object-Oriented Programming (OOP) principles. This is Project 01 in my advanced Java practice journey.🚀 Key Features & Concepts ImplementedObject-Oriented Design (OOPs): Modeled the real-world ecosystem into distinct entities (Patient, Hospital, and Management classes).  Encapsulation: Secured sensitive data fields such as Patient ID, Age, and Disease using strict private access modifiers and safe access via standardized structures.  Method Overloading: Implemented compile-time polymorphism by overloading the search utility to retrieve patient records either by unique Integer ID or by String Name.  Dynamic Collections Framework: Leveraged ArrayList to build a dynamic, resizable in-memory database for tracking active records without fixed-size array constraints.  Clean String Formatting: Overrode the standard .toString() method in the domain model to seamlessly display beautifully structured textual representations of objects.  🏗️ Architecture BlueprintThe system is structured across three primary modules:Patient.java: The core data model containing patient properties, constructors, and overridden formatting methods.  Hospital.java: The operational business logic engine managing addition, collection traversal, and polymorphic search utilities.  Management.java: The client interface layer driving an interactive command-line menu loop utilizing Scanner and switch-case state machines.  💻 How to Run & TestClone this repository to your local system.Compile all source files inside the terminal:Bashjavac SmartHospitalManagementSystem/*.java
Run the main driver management file:Bashjava SmartHospitalManagementSystem.Management
📊 Sample Interactive Menu OutputPlaintextWelcome to Smart Hospital Management System
-------------------------------------------
1. Add New Patient
2. Display All Patients
3. Search Patient by ID
4. Search Patient by Name
5. Exit
-------------------------------------------
Please enter your choice: 
