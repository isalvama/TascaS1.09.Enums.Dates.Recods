# Tasca S1: Enums, Dates & Records

## Description

This project was created for academic purposes as part of the IT ACADEMY Java & Spring specialization. The goal is to master modern Java features including advanced **Enums** with state and behavior, the **Java Time API** (`java.time`), and the usage of **Records** for concise data representation and validation.

The project demonstrates how to handle dates, business logic via Enums, and compact data structures while maintaining robust input validation.


## Techonologies

- **Java 17+**
- **Gradle**


## Project Structure

```
TascaS1/
├── build.gradle
├── src/
└── main/
     └── java/
         └── first_level/
             ├── Day.java (Enum)
             ├── Level.java (Enum)   
             ├── Task.java
             └── FirstLevelMain.java
         └── second_level/
             ├── Agenda.java
             ├── Appointment.java
             └── SecondLevelMain.java
         └── third_level/
             ├── AgeLabel.java (Enum)
             ├── Person.java (Record)
             ├── Event.java
             └── ThirdLevelMain.java
```

## Installation & Execution

1. **Clone the repository**:
   ```bash
   git clone https://github.com/isalvama/tascaS1.git
   ```
2. **Build the project**
    ```bash
    ./gradlew build
    ```
3. **Run the exercises**:
   You can run the main classes using Gradle:
   code
   ```bash
   ./gradlew run --args="first_level.FirstLevelMain"
   ./gradlew run --args="second_level.SecondLevelMain"
   ./gradlew run --args="third_level.ThirdLevelMain"
   ```

## Concepts covered

- **Advanced Enums**: Using constructors, fields, and custom methods inside Enums.
- **Java Time API**: Manipulation of `LocalDate`, `LocalTime`, and `LocalDateTime`.
- Calculating differences with `Period` (dates) and `Duration` (time).
- Parsing and formatting with `DateTimeFormatter`.
- **Java Records**: Implementing compact data classes with built-in validation and custom constructors.
- **Modern Switch Expressions**: Using the arrow `->` syntax for concise logic.
- **Varargs**: Implementing methods that accept a variable number of arguments.
- **Input Validation**: Handling `RuntimeException` and `IllegalArgumentException` for data integrity.

### First Level: Enums and Logic

#### Advanced Enum Usage

- **`Day` Enum**: Includes a boolean state to distinguish between working days and weekends, demonstrating how Enums can encapsulate basic business rules.
- **`Level` Enum**: Stores multiple attributes (color and expected duration). It includes a static helper method `getLevelFromString` to safely map user input to Enum constants with custom error handling.

#### Task Management

The `Task` class utilizes the `Level` enum to initialize its state. It features a modern switch expression in `warningString()` to return specific messages based on the task's difficulty, highlighting the readability of modern Java syntax.


### Second Level: Java Time API & Agenda

This level focuses on the comprehensive management of dates and times.

#### Date Manipulation

The `SecondLevelMain` class showcases various operations with `java.time`:
- **Arithmetic**: Reducing months, days, and hours using `minus` methods.
- **Formatting**: Applying different `DateTimeFormatter` patterns, including ISO standards and custom layouts.
- **Measurement**: Calculating exact differences using `Period.between()` for calendar units and `Duration.between()` for clock units.

#### Agenda System

The `Agenda` class manages a collection of `Appointment` objects:
- **Validation**: It prevents adding appointments with past dates.
- **Functional Filtering**: Uses Java Streams to retrieve "Next Appointments," specifically filtering those occurring within the next 8 days from the current execution time.


### Third Level: Records and Event Management

#### Java Records (`Person`)

This level introduces the Record type to represent an attendee:
- **Concise Data**: Automatically generates getters, `toString`, `equals`, and `hashCode`.
- **Custom Canonical Constructor**: Includes validation logic to prevent invalid ages (negative or over 140) and automatically determines the correct `AgeLabel` based on the age provided.
- **Domain Logic**: Implements methods like `getSurname()` using Stream parsing and `getFinalPrice()` to apply discounts defined in an Enum.

#### Event and Attendee Management

- **`AgeLabel` Enum**: Defines age ranges and associated discounts (Young, Adult, Senior).
- **`Event` Class**:
  - Uses Varargs `(Person... people)` to allow adding multiple attendees in a single call. 
  - Implements Streams to extract specific subsets of attendees, such as adults or those whose names start with a specific character. 
  - **Uniqueness**: The system ensures no duplicate attendees are added to the event using collection checks.