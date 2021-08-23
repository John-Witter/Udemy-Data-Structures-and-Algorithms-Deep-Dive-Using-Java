# Arrays in Java

* Stored as one contiguous block in memory
    * each element's memory addresses are stored contiguosly 
    * this is why the size of the array is static => to guarantee that each memory address is connected
* Every element in the array occupies the same amount of space in memory
    * array elements in Java are all of the same data type
* If an array starts at memory address x, and the size of each element in the array is y, 
we can calculate the memory address of the ith element by using the following expression:
``` x + i * y ```
    * This is why arrays are zero-indexed
* If we know the index of an element, the time to retrieve the element will be the same,
no matter where it is in the array

## Array of Objects
* When you create an array of objects, what's stored in the array elements is a reference to the objects
    * Object references are always the same size
* An array of Strings creates an array of object references to the String instances

## Array access time complexity: O(1)  