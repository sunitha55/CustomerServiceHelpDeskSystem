# CustomerServiceHelpDeskSystem
📖 Project Overview

The Customer Service Help Desk System is a Java console-based application developed to manage customer support tickets efficiently.
The system allows users to create normal and emergency tickets, serve customers based on priority, and view pending support requests.

This project demonstrates the practical usage of Deque (Double Ended Queue) using LinkedList in Java to implement a priority-based ticket handling system.

🎯 Features

--> Add Normal Customer Tickets (FIFO order)

--> Add Emergency Tickets (High Priority)

--> Serve Next Customer

--> Display All Pending Tickets

--> Automatic Ticket ID generation

--> Menu-driven console interface

🏗️ Project Structure
CustomerServiceHelpDeskSystem
│
├── BussinessLogic
│   ├── TicketClass.java
│   └── HelpDeskClass.java
│
└── MainClass
    └── Main.java

🧠 Concept Used

Object-Oriented Programming (OOP)

 • Encapsulation

 • Deque Interface

 • LinkedList Implementation

 • Queue & Priority Handling

 • Menu Driven Programming

⚙️ How It Works

 • Normal Ticket

 • Added to the end of the queue using addLast().

 • Served after earlier tickets.

 • Emergency Ticket

 • Added to the front of the queue using addFirst().

 • Gets higher priority.

 • Serving Customer

 • The system removes the first ticket using removeFirst().

Pending Tickets

Displays all waiting tickets in order.

🧾 Classes Description
✅ TicketClass

Represents a customer ticket containing:

-> Ticket ID

-> Customer Name

-> Issue Type

-> Includes getters, setters, and toString() method.

✅ HelpDeskClass

Handles business logic:

Stores tickets using Deque<TicketClass>

Adds normal and emergency tickets

Serves customers

Displays pending tickets

✅ Main Class

Provides:

User interaction

Menu-driven operations

Input handling using Scanner

▶️ How to Run

Open project in Eclipse / IntelliJ / VS Code.

Compile all Java files.

Run Main.java.

Select options from the menu.

🖥️ Sample Menu
Welcome to Customer Service Help Desk System

1. Add Normal Ticket
2. Add Emergency Ticket
3. Serve Next Customer
4. Show all Pending Tasks
5. Exit

💡 Example Flow

Add normal tickets → added at queue end.

Add emergency ticket → moves to queue front.

Serve customer → highest priority served first.

🚀 Technologies Used

Java

Collections Framework

Deque & LinkedList

Console Application

📈 Learning Outcomes

 • Understanding Queue vs Priority handling

 • Real-world use of Deque

 • Clean separation of logic using packages

 • Implementation of OOP principles
