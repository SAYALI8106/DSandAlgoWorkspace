| **Approach / Technique** | **Short Recall**                                  |
| ------------------------ | ------------------------------------------------- |
| Brute Force              | Try every possible solution                       |
| Two Pointers             | Two indices move through the array                |
| Sliding Window           | Maintain a continuous window efficiently          |
| HashMap                  | Fast lookup and frequency counting                |
| HashSet                  | Store unique elements, fast existence check       |
| Prefix Sum               | Cumulative sum for range/subarray queries         |
| Prefix Sum + HashMap     | Longest/count subarrays with given sum            |
| XOR                      | Duplicate cancellation, unique element            |
| Bit Manipulation         | Use binary operations (`&, \|, ^, ~, <<, >>`)     |
| Modulo (%)               | Remainder, circular indexing, divisibility        |
| Recursion                | Solve smaller version of the same problem         |
| Divide & Conquer         | Split → Solve → Combine                           |
| Reverse Technique        | Reverse parts of array/string                     |
| Sorting                  | Arrange elements to simplify problems             |
| Bubble Sort              | Repeated adjacent swaps                           |
| Selection Sort           | Select minimum repeatedly                         |
| Insertion Sort           | Insert element in correct position                |
| Merge Sort               | Stable divide-and-conquer sorting                 |
| Quick Sort               | Partition around a pivot                          |
| Binary Search            | Search efficiently in sorted data                 |
| Frequency Counting       | Count occurrences using array/HashMap             |
| Mathematical Approach    | Use formulas or mathematical properties           |
| Greedy                   | Choose the best local option                      |
| Simulation               | Follow the process exactly as described           |
| Swap Technique           | Exchange elements efficiently                     |
| Partitioning             | Divide array around a pivot                       |
| In-place Algorithm       | Modify data without extra space                   |
| Ordered Collections      | Elements stored in sorted order (TreeMap/TreeSet) |
| Unordered Collections    | Hash-based storage (HashMap/HashSet)              |
| Time Complexity          | Analyze running time (Big-O)                      |
| Space Complexity         | Analyze extra memory used                         |
| Dry Run                  | Trace algorithm step by step                      |
|Dutch National Flag algorithm.|an in-place sorting technique designed to categorize an array of three distinct values (commonly 0s, 1s, and 2s) in a single pass.|
|Moore's Voting algorithm | The Boyer-Moore Majority Voting Algorithm is an optimal, highly efficient method for finding the "majority element" in an array (an element that appears more than \(\frac{N}{2}\) times). It does this in \(\mathcal{O}(N)\) time complexity and \(\mathcal{O}(1)\) space complexity by using a smart candidate-cancellation logic|
|Kadane's algorithm | A dynamic programming technique used to find the maximum sum of a contiguous subarray within a one-dimensional array of numbers. It solves this problem in a single pass, resulting in an optimal O(n) time complexity and O(1) space complexity. For every element, you make a greedy choice: either extend the existing subarray by adding the current element to current_max, or start a brand new subarray at the current element (if the previous current_max dragged the sum below zero).
