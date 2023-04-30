fun main() {
    var person = Person("Maria",22,"Female")
    person.persondet()

    var book= Book("Born A Crime","Trevor Noah",2017)
    println(book.title)
    var rectangle = Rectangle(20.0,10.0)
    rectangle.calculateArea()

    var shape = Shape(20.0,100.0)
    var rectangle2 = Rectangle2(2.0,2.0)
    var circle = Circle(10.0,10.0,50.0)
    circle.calculateArea()
    rectangle2.calculateArea()


    var vehicle = Vehicle()
    var car =Car()
    car.startEngine()
    vehicle.startEngine()

    var dog = Dog()
    dog.makeSound()
    var employee =Employee("Ndemo",21,10000.0)
   println( employee.toString())


    var shape2 = Shape2()
    shape2.draw()

    var circle2= Circle2()
    circle2.draw()
}

//Create a class called Person with the following properties:
//name (String)
//age (Int)
//gender (String)
//Create a constructor for the class that initializes these properties.
//Then, create an instance of the class and print out the details of the person.
class Person(var name:String, var age: Int, var gender: String){
    fun  persondet(){
        println(name)
        println(age)
        println(gender)
    }
}
//Create a data class called Book with the following properties:
//title (String)
//author (String)
//year (Int)
//Create an instance of the Book class and print out its properties.
data class  Book (var title:String,var author :String,var year:Int)

//Create a class called Rectangle with the following properties:
//width (Double)
//height (Double)
//Create a method in the Rectangle class called calculateArea() that calculates and returns the area of the rectangle.
//Create an instance of the Rectangle class, set its width and height, and then print out its area.
 class Rectangle (var width: Double,var height: Double){
     fun calculateArea(){
         var area = width *height
         println(area)
     }
 }
//Create an abstract class called Shape with an abstract method called calculateArea().
//Create two derived classes called Circle and Rectangle that inherit from the Shape class.
// Implement the calculateArea() method in each derived class to calculate the area of a circle and rectangle, respectively.
//Create instances of both the Circle and Rectangle classes, set their dimensions, and then print out their areas

 open class  Shape(var width: Double,var height: Double){
     open fun calculateArea(){
        var area = width *height
        println(area)
    }

}
class Circle( width: Double, height: Double ,var radius:Double):Shape(width,height){
    override fun calculateArea() {
        println(Math.PI * radius * radius)
    }
}

class Rectangle2(width: Double,height: Double): Shape(width,height){
    override fun calculateArea() {
        println(width * height)
    }
}

//Create a base class called Vehicle with a method called startEngine() that prints "Engine started."
//Create a derived class called Car that inherits from the Vehicle class.
// Override the startEngine() method in the Car class to print "Car engine started."
//Create an instance of the Car class and call the startEngine() method.
 open class Vehicle (){
     open fun startEngine(){
        println("Engine started")
    }
}
class Car():Vehicle(){
    override fun startEngine() {
        println("Car Engine started")
    }

}

//Create a base class called Animal with a method called makeSound() that prints "Animal makes a sound."
//Create a derived class called Dog that inherits from the Animal class.
// Override the makeSound() method in the Dog class to print "Dog barks."
//Create an instance of the Dog class and call the makeSound() method

 open class Animal (){
   open fun makeSound(){
        println("Animal makes a sound")
    }
}
class Dog():Animal(){
    override fun makeSound() {
        println("Dog barks")
    }
}


//Create a base class called Employee with properties:
//name (String)
//age (Int)
//salary (Double)
//Create a derived class called Manager that inherits from the Employee class.
// Add an additional property called bonus (Double) to the Manager class.
//Override the toString() method in both the Employee and Manager classes
// to provide custom string representations that include all the properties.
//Create instances of both the Employee and Manager classes,
// set their properties, and then print them using the toString() method.

open class Employee( var name:String,var age: Int,var salary: Double){
    override fun toString(): String {
        return  "$name, $age,$salary"
    }
}
class Manager(name: String,age: Int,salary: Double,var bonus:Double):Employee(name,age,salary){
    override fun toString(): String {
        return "$name,$age,$salary,$bonus"
    }
}

//Create a base class called Shape with a method called draw() that prints "Drawing a shape."
//Create a derived class called Circle that inherits from the Shape class.
// Override the draw() method in the Circle class to print "Drawing a circle."
//Create an instance of the Circle class and call the draw() method.
 open class Shape2(){
    open fun draw(){
        println("Drawing a shape")
    }
}
class Circle2() :Shape2(){
    override fun draw() {
         println("Drawing a circle")
    }

}




