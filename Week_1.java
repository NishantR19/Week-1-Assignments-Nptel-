//  Q1- Complete the code segment to find the perimeter and area of a circle given a value of radius.
// You should use Math.PI constant in your program. If radius is zero or less than zero then print " please enter non zero positive number ".


//Calculate the perimeter 
  //Calculate the area
 perimeter =2 * Math.PI * radius;
area=Math.PI *radius*radius;
        System.out.println(perimeter);
        System.out.print(area);



// Q2-Complete the code segment to find the largest among three numbers x,y, and z. You should use if-then-else construct in Java.


//Use if...else ladder to find the largest among 3 numbers and store the largest number in a variable called result.

if(x>y&&x>z){
            result=x;
        };
        if(y>z
        }
System.out.print(result);&&y>x){
            result=y;
        }
        if(z>y&&z>x){
            result=z



//  Q3- Consider First n even numbers starting from zero(0).Complete the code segment to calculate sum of  all the numbers divisible by 3 from 0 to n. Print the sum.

//Use for or while loop do the operation.

for(int y=0;y<=n;y=y+2){
    if(y%3==0){

       sum=sum+y;
    }
 }
        System.out.print(sum);


// Q4 - Complete the code segment to check whether the number is an Armstrong number or not.


//Use while loop check the number is Armstrong or not.
//store the output(1 or 0) in result variable.
double c=0;
int tem=n;
    while(n!=0) {
      int k=n%10;
        c=c+Math.pow(k,3);
        n=n/10;
    }
      if(c==tem){
          System.out.print(1);
      }
      else{
          System.out.print(0);
      }





//Q5 - Complete the code segment to help Ragav , find the highest mark and average mark secured by him in "s" number of subjects.

//Initialize maximum element as first element of the array. 
int max=arr[0];
           double sum=arr[0];  
   //Traverse array elements to get the current max.
for(int y=1;y<arr.length;y++)
	  { 
         sum=sum+arr[y]; 
         if(arr[y]>max)
            max =arr[y];
	  }
   //Store the highest mark in the variable result.

result=max;	
    mark_avg=sum/(arr.length); 
   //Store average mark in avgMarks.

   System.out.println(result);
    System.out.print(mark_avg);
