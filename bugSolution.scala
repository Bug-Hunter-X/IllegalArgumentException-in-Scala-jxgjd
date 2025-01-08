```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    if (x > 0) x + y 
    else throw new IllegalArgumentException("x must be positive")
  }
}

try {
  val myInstance = new MyClass(-1) 
  val result = myInstance.myMethod(5) 
  println(result) 
} catch {
  case e: IllegalArgumentException => println("Exception caught: " + e.getMessage)
}
```