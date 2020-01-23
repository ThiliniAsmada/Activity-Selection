This is an activity selection problem which gives highest profit among set of activities. Duration of the activities are the same and only the starting date varies.
Then I use greedy algorithms to solve this.
First I create 2D array and inserted given data to the array.
Then print the array using printact function using 2 for loops 
Sort the array by profit column in descending order.
Then print the sorted array
To select best profit activities use sorted array in descending order as input to check function.
In check function check if there are activities start from different dates and select the first occurrence of that date.
