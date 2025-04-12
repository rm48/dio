## Basic List Operations
#### 1. To-Do List
Create a class called "TaskList" that has a list of tasks as an attribute. Each task is represented by a class called "Task" that has a description attribute. Implement the following methods:

  -  `addTask(String description)`: 	Adds a new task to the list with the provided description.
  -  `removeTask(String description)`: 	Removes a task from the list based on its description.
  -  `getTaskQuantity()`: 	Returns the total number of tasks in the list.
  -  `getTaskDescriptions()`: 	Returns a list containing the description of all tasks in the list.

  ![(tasklist.png)](https://github.com/rm48/dio/blob/main/java/bra/collections/src/list/task/tasklist.png)
  
#### 2. Shopping CartList Search
Create a class called "ShoppingCart" that represents an online shopping cart. The cart should be implemented as a list of items. Each item is represented by a class called "Item" that has attributes such as name, price, and quantity. Implement the following methods:

  -  `addItem(String name, double price, int quantity)`: 	Adds an item to the cart with the specified name, price, and quantity.
  -  `removeItem(String name)`: 	Removes an item from the cart based on its name.
  -  `calculateTotalValue()`: 	Calculates and returns the total value of the cart, taking into account the price and quantity of each item.
  -  `displayItems()`: 	Displays all items in the cart, showing their names, prices and quantities.
  
  ![(shoppingcart.png)](https://github.com/rm48/dio/blob/main/java/bra/collections/src/list/cart/shoppingcart.png)
  
## List Search
#### 1. Book Catalog
Create a class called "BookCatalog" that has a list of objects of type "Book" as attributes. Each book has attributes such as title, author and year of publication. Implement the following methods:

  -  `addBook(String title, String author, int publicationYear)`: Adds a book to the catalog.
  -  `searchByAuthor(String author)`: Searches for books by author and returns a list of the books found.
  -  `searchByYearsRange(int startYear, int endYear)`: Searches for books published in a given range of years and returns a list of the books found.
  -  `searchByTitle(String title)`: Searches for books by title and returns the first book found.

**Saída:**

```
a.1) [
'Clean Code' - Robert C. Martin - 2009, 
'The Clean Encoder' - Robert C. Martin - 2012]

a.2) []

b.1) [
'Production-Ready Microservices' - Susan J. Fowler - 2017, 
'Java Programmer's Guide' - Peter Jandl Junior - 2021, 
'The Clean Encoder' - Robert C. Martin - 2012]

b.2) []

c.1) 
'Java Programmer's Guide' - Peter Jandl Junior - 2021

c.2) null
```

#### 2. Sum of Numbers
Create a class called "SumNumbers" that has a list of integers as an attribute. Implement the following methods:

  -  `addNumber(int number)`: Adds a number to the list of numbers.
  -  `calculateSum()`: Calculates the sum of all numbers in the list and returns the result.
  -  `findLargestNumber()`: Finds the largest number in the list and returns the value.
  -  `findSmallestNumber()`: Finds the smallest number in the list and returns the value.
  -  `displayNumbers()`: Returns a list containing all numbers present in the list.
  
  ![(sumNum.png)](https://github.com/rm48/dio/blob/main/java/bra/collections/src/list/search/sumNum.png)