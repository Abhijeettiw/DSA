Queue

- It is a FIFO(First In First Out) data structure. Also a ADT(Abstract Data Type).
- Methods associated (Time Complexity should be O(1))
    - add/offer(E e) [insert the element in queue]
      - add throws exception where offer handles silently.
    - peek/element()[To get top of element]
      - element throws exception whereas peek handles silently.
    - poll/remove() [remove first inserted element in queue]
- Types of Queue
    - Deque
        - Insert & remove from both start & end.
    - Priority queue
      - Implemented using heap
      - While insertion of element ite priority is also provided.
      - During pop element is removed having to lowest priority among all element.