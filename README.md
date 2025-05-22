# Dart Game Simulation

This Java program simulates a dart game where darts are randomly thrown onto a square dartboard divided into 6 regions (A to F) and an "Undecided" area (on the borders). The user specifies how many darts to throw, and the program generates random coordinates, identifies the region hit, and reports statistics.

---

## Game Description

Each dart lands randomly at a coordinate (x, y) where:
- x and y ∈ [-1.0, 1.0]
- Values are rounded to one decimal place

The board is divided into regions as follows:

- **Region A**: x > 0, y > 0, and x + y < 1  
- **Region B**: x > 0, y > 0, and x + y > 1  
- **Region C**: x < 0, y > 0  
- **Region D**: x < 0, y < 0, and x < y  
- **Region E**: x < 0, y < 0, and x > y  
- **Region F**: x > 0, y < 0  
- **Undecided**: On the borders (x + y == 1 or x == y, etc.)

---

## Sample Input

```text
Enter the number of darts to be thrown: 5

