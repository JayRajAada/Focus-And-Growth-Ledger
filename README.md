# Growth Journal

A console-based Java application designed to help readers track their personal library and catalog meaningful insights, quotes, and philosophical takeaways from their reading. 

Built as a capstone project (Bring Your Own Project) to solve the real-world problem of forgetting profound concepts shortly after finishing a book. This tool acts as a digital ledger for personal development, allowing users to categorize and permanently store their favorite ideas.

## Features
* **Library Tracking:** Add and store books you are currently reading or have finished.
* **Insight Logging:** Save specific quotes or lessons and assign them searchable tags (e.g., "philosophy", "habit", "mental-model").
* **Interactive Dashboard:** View your entire library and cataloged insights through a clean console menu.
* **Persistent Data Storage:** Safely freeze-dries (serializes) your data into binary files so your journal entries are saved between sessions.

## Core Java Concepts Applied
* **Object-Oriented Programming:** Custom `Book` and `Insight` classes utilizing encapsulation.
* **Java Collections:** Dynamic memory management using `List` and `ArrayList`.
* **File I/O & Serialization:** Advanced data persistence utilizing `ObjectOutputStream` and `ObjectInputStream` to save object states directly to `.dat` files.
* **Exception Handling:** Try-catch blocks to prevent crashes during file operations and user inputs.

## Prerequisites
To run this application, you must have the **Java Development Kit (JDK)** installed on your machine. 

## How to Run the Project
1. **Clone the repository** to your local machine:
   ```bash
   git clone https://github.com/JayRajAada/Focus-And-Growth-Ledger.git
   ```
