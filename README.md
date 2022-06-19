
# MakeChangeProject

##How This ProgramWorks##

1: A user is prompted to enter in an item(s) price amount.

2: The user is then prompted to enter a tendered amount.

3A:  If the tendered and the price amounts are the same, the console prints out a message saying so, and that there is no change required.

3B: If the tendered amount is less than the price, the console prints out a message saying so. 

3c: if the tendered amount is greater than the price, a method is called passing 
both amounts. In this method, price is subtracted from tendered amounts and then
the remainder is assigned to the double changeTotal. changeTotal is then cast to an integer type and assigned to "dollars"; then dollars are subtracted from changeTotal and multiplied by 100 before being attached to Math.floor for the remainder to assigned to a double called "cents". A count for each currency type is then initialized, and dollars and cents are fed to a series of "if" statements that, starting from the largest denominations, divide and print the count of their division before passing the remainder to the next if statement.
This process properly prints out the exact change for the user's inputs.

##Difficulties##

By far the most difficult part of this project was getting the equations for the if statements proper. At first, changeTotal was used as a double instead of the conversion seen in "dollars" and "cents". This lead to the output for dollars having a decimal ending in the tenths and coin denominations having multiple places past the decimal. This fixed dollars perfectly; however, "cents" remained with multiple points past what was acceptable. The only way found to fix "cents" to multiply "changeTotal - dollars" by 100 and cast each coin value to an integer. This solved all inputs given.

Another difficulty was not realizing that multiply if statements would work; before this, multiple if else if statements were nested in a while loop. This set on an infinite loop that would only seek out the highest fitting denomination, though; therefore, a series of if statements were opted for and the loop was nixed. 

One last issue faced was the if statements not passing the proper remainder to the next if statement. This fix was to find the remainder of dollar = dollars % by the current denomination. This passed what the remainder minus this denomination was.



	
