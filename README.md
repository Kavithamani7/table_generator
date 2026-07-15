# Table Generator

## Problem Approach

When i first read the problem, i divided it into smaller parts instead of trying to solve everything at once.
Firstly i took the array size P as input from the user and created a PxP integer array.
Then i generated random even numbers between 2 and 16 and filled the entire array.
After generating the numbers i converted the integer array into a string array. 
I chose this approach because later i had to highlight the selected number by enclosing it in square brackets (i.e `[14]`),using a string array made this easier.
Next i displayed the generated table and asked the user to enter an even number to highlight.
I traversed the entire table and compared each element with the user input, whenever i found a match i replaced it with the highlighted format and incremented a counter to keep track of the number of occurrences.
Finally i displayed the updated table and printed how many times the selected number appeared.

## Error Handling

I handled invalid user inputs using exception handling.
The program handles:
- Non-numeric values for array size.
- Invalid array sizes (zero or negative values).
- Non-numeric values for the highlight number.
- Numbers outside the allowed range (2–16).
- Odd numbers.

If an invalid input is entered the program displays an error message and terminates.

## Time Complexity

- Generating and filling the array: O(n^2)
- Converting integer array to string array: O(n^2)
- Searching, highlighting, and counting occurrences: O(n^2)

Overall Time Complexity: O(n^2)

## Space Complexity

- Integer array: O(n^2)
- String array used for displaying and highlighting: O(n^2)

Overall Space Complexity: O(n^2)

No further optimization is possible for this question.
