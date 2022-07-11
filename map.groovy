class teja{
static void main(String[] args)
{
  def paulMap = [
    'name' : 'Teja',
    'age' : 24,
    'address' : 'vijayawada',
    'list' : [1,2,3]
  ];
 
  // Access with key
  println("Name " + paulMap['name']);
  println("Age " + paulMap.get('age'));
  println("List Item " + paulMap['list'][1]);
 
  // Add key value
  paulMap.put('city', 'Pittsburgh');
 
  // Check for key
  println("Has City " + paulMap.containsKey('city'));
 
  // Size
  println("Size " + paulMap.size());
 }
}
