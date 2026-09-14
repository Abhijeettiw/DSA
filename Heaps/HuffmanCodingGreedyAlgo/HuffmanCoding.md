Huffman Coding
- Lossless data compression (No data loss)

- Steps to compress
  - Pass the data aka feeder.
  - Making frequency map of feeder.
  - For every key in map create a node and insert node in min heap.
  - Node has data as key of frequency map and cost as value of frequency map. As well as have left & right node.
  - Remove 2 smallest element and combine them. Combined node has data as null & data as summation of value of 2 nodes.
    - ie. new node will be added in min heap whose left & right will be removed 2 element.
  - Continue above step until you have only 1 node left in min heap.
  - Mark left in every node as 0 and right as 1.