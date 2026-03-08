Arrays

- Arrays are continous data structure in which we cann determinethe location of a value stored in RAM.

- Drawbacks
    - Traditional static arrays has a fixed size ie size should be known at compile time. [Rectification in vector & arraylist]
        - ArrayList
            - When arraylist is created it has a size which is by default 0 & a capacity is N.
            - Eg:
                - ArrayList created , size is 0 & capacity is 2
                - At time of insertion of 3rd element size will be 2 & capacity is 2.
                  Hence a new array of extended capacity will be created & previous elements are copied.
                - Old memory will be deallocated.
            - Methods
                - Creating array
                    - ArrayList<Integer> list = Arrays.asList(1,2,3,4,5);
                - Sort
                    - Arrays.sort(array);
                    - Arrays.sort(array,startIndex,endIndex);
                        - startIndex is included & endIndex is excluded
                - To string
                    - Arrays.toString(array);
                - Binary Search
                    - int index = Arrays.binarySearch(array, target);
                    - int index = Arrays.binarySearch(array, startIndex, endIndex,target);
                    - If result is found index will be returned or else it will return negative value.
                - Fill
                    - Filling value in an array at all index
                    - Array.fill(array,5);
                    - Array.fill(array,startIndex,endIndex,val);
    - Since size of arrays is fixed & is continous addinf element in begining & in mid is inefficient. [Rectification in linklist]

