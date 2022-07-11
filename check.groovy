package in.at.json 

//import groovy.json.jsonslurper 
class jsonslurper{ 

static main(args){ 

def jsonslurper = new jsonslurper() 

def datatypes = jsonslurper.parsetext(text:'''{"numeric":{"int":"10"}, 

						"float" : "0.0f", 

						"double":"0.0d", 

						"boolean" : true}''') 

println("the integer value is : ${datatypes.numeric.it}") 

} 

} 
