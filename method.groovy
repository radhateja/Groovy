class teja{
static void main(String[] args)
{
// Methods allow us to break our code into parts and also
  // allow us to reuse code
 
  sayHello();
 
  // Pass parameters
  println("5 + 4 = " + getSum(5,4));
 
  // Demonstrate pass by value
  def myName = "Derek";
  passByValue(myName);
  println("In Main : " + myName);
 
  // Pass a list for doubling
  def listToDouble = [1,2,3,4];
  listToDouble = doubleList(listToDouble);
  println(listToDouble);
 
  // Pass unknown number of elements to a method
  def nums = sumAll(1,2,3,4);
  println("Sum : " + nums);
 
  // Calculate factorial (Recursion)
  def fact4 = factorial(4);
  println("Factorial 4 : " + fact4);
 
 println(nums)
 }
}
