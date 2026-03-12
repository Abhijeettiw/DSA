Hash Table

- Data structure stores data in key value pair. Also known as associative data structure.
- Uses hash function
  - It creates hash value of input
  - Hash function is a pure function ie totally dependent on input.
  - Written is such a manner that chances of collision is very less.
- Internal working
  - Hash value is computed using hash function.
  - An array of size n is created
  - value corresponding is saved on index Hashcode % n(size of array).
- Collision resolution
  - Chaining is used
  - If 2 or more values are to be saved in same index, then a linked list is created & all the data is saved in linked list as LIFO.
- In un-ordered hash table best case has O(1), worst case O(n) complexity.
  Hence, complexity is amortized ie rather taking worst complexity average complexity is considered.
- Types of hash table
  - Un ordered hash table
    - Time complexity 
      - Amortize case(very rare) - O(n)
      - Best case - O(1)
    - Most frequently used
    - Uses array internally
  - Ordered hash table
    - Uses Balanced Binary Search Tree internally
    - Time complexity
        - Worst case - O(Log n)
        - Average case - O(Log n)
    