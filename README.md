# String-Triangle-Pattern
<p>Accept an integer <strong>N</strong> and a string <strong>S</strong> as input. The program must print the last <strong>N</strong> characters of each word of <strong>S</strong> in the desired pattern as shown in the Example Input/Output section.<br>
<strong>Note:&nbsp;</strong><br>
Each word in <strong>S</strong> contains more than <strong>N</strong> characters.<br>
If there is no word to fill the pattern then use <strong>*</strong>.</p>

<p><strong>Boundary Condition(s):</strong><br>
2 &lt;= N &lt;= 10<br>
Length of the string <strong>S</strong> is between 1 and 1000.</p>

<p><strong>Input Format:</strong><br>
The first line contains the integer <strong>N</strong>.<br>
The second line contains the string <strong>S</strong>.</p>

<p><strong>Output Format:</strong><br>
The list of lines contain the last <strong>N</strong> characters in the desired pattern.</p>

<p><strong>Example Input/Output 1:</strong><br>
Input:<br>
3<br>
apple mango orange</p>

<p>Output:<br>
ple&nbsp;<br>
ngo nge&nbsp;</p>

<p><strong>Example Input/Output 2:</strong><br>
Input:<br>
2<br>
ask happy word letter king</p>

<p>Output:<br>
sk&nbsp;<br>
py&nbsp;rd&nbsp;<br>
er&nbsp;ng&nbsp;**&nbsp; &nbsp;</p>

<p><strong>Explanation:</strong><br>
The last 2 characters of the first word in S is "sk".<br>
The first line of the output must contain one word. So, "sk" is printed.<br>
The last 2 characters of the second and third word are "py" and "rd".&nbsp;<br>
The second line of the output must contain two words separated by space(s). So, "py" and "rd" printed.<br>
The last 2 characters of the fourth and fifth word are "er" and "ng".<br>
The third line of the output must contain three words separated by space(s). But here, there are two words only. So, "er" and "ng" is printed. Then, for the third word "**" is printed.</p>
