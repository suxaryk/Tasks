# Tasks
tasks and examples in Java SE

Task1
Write a function Calculate that simulates simple calculator. It takes as a parametr string 
of characters taken from calculator keyboard and returns the calculated number/
The calculator should calculate the value meeting the standart sequence of mathematical operators.

Parametr should consist only of natural numbers and mathematical base operator '+', '-', '*', '/'.
Example:
"122-3/6+4"
output: 125,5

Tasks 2
There is [N][M] matrix and a square with the side D, where N and M are bigger than D.
Write a program which displays the coordinates of the top left vertex of the square for which
the sum of the digits, includes in the square, is the greatest.

For example: Program should return the coordinates of the top left vertex of the square [1,1]
for the folowing matrix:
       N=4
     _ _ _ _
    |2 2_2 2|
M=3 |2|7 5|2|
    |1|7_7|1|     
       D=2


       
       
Task 3 
The file ip_addresses.txt contains ip addresses and sites names inside. Please write
the program which will read from file ip_addresses.txt and save only valid adresses
and number of valid addresses to new file valid_ip.txt/
(Please use: System.Text.RegularExpressions, StreamReader)

Example:
File ip_addresses.txt
192.16.1.1 "gata"
10.123.123.123 "google.pl"
9.1.22.34 "wp.pl"
1777.254.122.133 "anat.pl"
206.192.155.177 "a"

Exit file valid_ip.txt
192.16.1.1
10.123.123.123
9.1.22.34
File ip_addresses.txt contains 3 valid addresses.

Task 4
Given a text and a pattern. Write a function that returns a position of the last occurrence
pattern in the text. If there is no such a pettern return -1.

Example:
You are given the text "Interminable" and pattern "in". The position of the last occurrence
"in" is 6.

Task 5
Write a Java program named "LargerAverage.java", which reads a sequence of positive integers
from terminal, and terminates when a negative valus is typed in/ Right before ot terminates,
it should print out top 2 largest numbers (in descending order) ever seen in the sequence
and the arithmetic mean of all numbers.

For example:
$java LargerAverage
3
4
9
4
-1
The top 2 largest numbers are: 9, 4.
Arithmetic mean: 5.

Task 6 
Write the class EmailQueue, which shall act as a typical Queue and support adding,
removing, checking elements consisting of information

- Message Sender,
- Messege Recipient,
- Messege Subject and
- Messege Text

at the end of the queue. It shall implement the following methods: EnqueueTail, DequeueTail,
PeekTail. Additionally, the class shall provide a function Find Message(Sender) which
will list all messages (only Message Text) sent from Message Sender in the order 
were added to the queue.

Task 7
You have a database with tables: artists , songs and albums. Please prepare proper queries to get:

1) List of artists from USA.
2) List of artists who are still performing (did not break up yet). As a result show names 
of artists (in alphabetical order) and country of origin.
3) List of songs from album "Legend". As a result show titles of songs (in alphabetical order)
and their length.
4) List of songs from the albums with the highhest rating/ As a result show names of songs,
titles of albums and their rating.
5) Number of songs performed by each artist. As a result show names of artists and number 
of their songs in the database. Sort results by number of songs(from highest to lowest)
6)List of songs. As a result, show names of artists, titles of albums, titles of songs 
and their length.
Sort results in alphabetical order by name of artists, title of album and title of song.
7) List of songs from the albums created after 1976 and before 1986. As a result show names
of artists, titles of albums and titles of songs.














 









