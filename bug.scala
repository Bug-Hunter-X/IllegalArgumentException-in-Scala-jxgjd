```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    if (x > 0) x + y 
    else throw new IllegalArgumentException("x must be positive")
  }
}

val myInstance = new MyClass(-1) // x is negative
val result = myInstance.myMethod(5) // This will throw an exception
```