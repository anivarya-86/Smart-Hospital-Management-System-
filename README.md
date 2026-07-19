# 🏥 Smart Hospital Management System

A production-grade Java console application designed to manage hospital patient records efficiently using Object-Oriented Programming (OOP) principles. This project marks the successful completion of **Project 01** in my advanced Java utility and architecture practice roadmap.

---

## 🚀 Core Features & Concepts Implemented

* **Object-Oriented Design (OOPs):** Built a scalable real-world data model by dividing the system into structural layers: `Patient`, `Hospital`, and `Management` modules[cite: 35, 36].
* **Data Encapsulation:** Secured core state fields (Patient ID, Name, Age, Disease) using proper data isolation practices.
* **Compile-Time Polymorphism (Method Overloading):** Implemented a flexible search engine capable of resolving queries using either a unique **Integer ID** or a **String Name**.
* **Dynamic Collections Framework:** Utilized a dynamic `ArrayList` structure to manage records in memory, overcoming the limitations of static array sizes.
* **Scanner Stream Sanitization:** Solved the classic input-skipping bug by properly flushing the scanner carriage returns (`input.nextLine()`) during sequential dynamic inputs.
* **Overridden String Formatters:** Customized the native `.toString()` wrapper to transform internal memory instances into cleanly readable formatted layouts.

---

## 🏗️ Architectural Overview

The application is cleanly organized into three distinct operational layers:

```text
📦 SmartHospitalManagementSystem
 ├── 📄 Patient.java       --> Data Model containing patient states & custom toString()
 ├── 📄 Hospital.java      --> Core Business Logic (List handling & Overloaded Search)[cite: 35]
 └── 📄 Management.java    --> Driver Interface driving the infinite interactive Menu loop
