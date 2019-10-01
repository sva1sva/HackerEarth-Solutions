# Micro and Array Update
[https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/micro-and-array-update/](https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/micro-and-array-update/)
## This is a solution to HackerEarth problem. Following steps are followed:
###### For each test case
-   First, we take the size of the array as input (N).

-   Then,  we take value of K as input.

-   The array is declared to be of integer type.

-   The space separated array elements are taken as input from user.

-   After that, we find the minimum element in the array.

-   If minimum element is greater than K, we print 0 else we print value of 
	(K - minimum element) as the answer.
	
### Logic
    We are supposed to find out the minimum time it takes to for each array element's value to become greater than or equal to K. 
    For this, we find the minimum element from the array and compare it with K. 
    If value is greater than or equal to K , it means all elements are already greater than or equal to K. Hence, we get 0 as answer. 
    If value is lesser than K, performing (K-minimum element) gives us least amount of time required.
