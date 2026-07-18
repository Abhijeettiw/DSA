- General Tree
    - A node can have any number of children.
         A
       / | \
      B  C  D
        / \
       E   F

- Binary Tree
    - Each node can have at most two children.
        A
       / \
      B   C
         / \
        D   E
      
- Full Binary Tree (Strict Binary Tree)
    - Every node has either 0 children or 2 children
         A
        / \
       B   C
      / \
     D   E

- Perfect/Full Binary Tree
    - Every internal node has exactly 2 children.
    - All leaf nodes are at the same level.
           A
         /   \
        B     C
       / \   / \
      D   E F   G
    - If leafs nodes are n, internal node will be 2n, total nodes will be 2n-1.

- Complete Binary Tree
    - All levels are completely filled except possibly the last.
    - The last level is filled from left to right.
          A
        /   \
       B     C
      / \   /
     D   E F

- Balanced Binary Tree
    - The height difference between the left and right subtree of every node is small (typically ≤ 1).
          10
         /  \
        5    20
       /       \
      2         30

- Degenerate (Skewed) Tree
    - Every node has only one child.
      - Left skewed tree
            A
           /
          B
         /
        C
      - Right skewed tree
        A
         \
          B
           \
            C

- Binary Search Tree (BST)
   - Properties:
     - Left subtree contains smaller values.
     - Right subtree contains larger values.
            50
           /  \
         30    70
        / \    / \
       20 40  60 80

- AVL Tree
   - A self-balancing BST.
   - Balance Factor: Height(Left) - Height(Right) Must always be: -1, 0, or +1
          30
        /    \
       20     40
      /
     10
     - If unbalanced, rotations are performed:
        - Left Rotation
        - Right Rotation
        - Left-Right Rotation
        - Right-Left Rotation
     - Complexity:
       - Search: O(log n)
       - Insert: O(log n)
       - Delete: O(log n)

- Segment Tree
   - Binary tree data structure used to efficiently answer range queries and perform updates on an array.
   - Segment tree node has information of operation performed & intervals. 
   - Instead of scanning the array every time (which takes O(n)), a Segment Tree allows:
     - Range Query: O(log n)
     - Point Update: O(log n)
     - Build Tree: O(n)