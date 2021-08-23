# Big-O Values for Array Operations

## Retrieve an Element from an Array O(1) --> Constant Time
1. Multiply the size of the element by its index
2. Get the start address of the array
3. Add the start address to the result of the multiplication

### For an int array , assume element starts at address123. Each int is 4 bytes.
* To get ``` intArray[0] ``` = 12 + 0 * 4 = 12
* To get ``` intArray[1] ``` = 12 + 1 * 4 = 16
* To get ``` intArray[2] ``` = 12 + 2 * 4 = 20
* To get ``` intArray[3] ``` = 12 + 3 * 4 = 24

| Number of Elements | Steps to Retrieve |
| :---- | :---- |
| 1                  | 3                 |
| 1000               | 3                 |
| 100000             | 3                 |
| 100000000          | 3                 |

Retrieving an element in an array  **when you know the element's index** happens in constant time / O(1)
</br>
</br>

## Retrieve a Given Value from an Array **w/o Knowing its Index** O(n) --> Linear Time

```java
int[] intArray = new int[7];

intArray[0] = 20;
intArray[1] = 35;
intArray[2] = -15;
intArray[3] = 7;
intArray[4] = 55;
intArray[5] = 1;
intArray[6] = -22;

int index = -1;
for (int i = 0; i < intArray.length; i++) {
    // if the value 7 is in intArray, return the index of that element
    // else return -1
    if(intArray[i] == 7) {
        index = i;
        break;
    }
} // O(n) --> Linear Time

System.out.println("Index:" + index); // OUTPUT: 3
```


## Big-O Time Complexities of Array Operations

| Operation | Time Complexity |
| :---- | :---- |
| Retrieve with index | O(1) - Constant Time |
| Retrieve without index | O(n) - Linear Time |
| Add an element to a full array | O(n) |
| Add an element to the end of an array (has space) | O(1) |
| Insert or update an element at a specific index | O(1) |
| Delete an element by setting it to null | O(1) |
| Delete an element by shifting elements | O(n) |