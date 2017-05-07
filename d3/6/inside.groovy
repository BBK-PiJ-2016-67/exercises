class Point {
  double x;
  double y;
  def Point(str) {
    def arr = str.split(",")
    this.x = Double.parseDouble(arr[0])
    this.y = Double.parseDouble(arr[1])
  }
}

class Rectangle {
  Point upLeft;
  Point downRight;
  def Rectangle(upLeft, downRight) {
    this.upLeft = upLeft;
    this.downRight = downRight;
  }
  def area() {
    return this.height() * this.width()
  }
  def height() {
    return Math.abs(upLeft.y - downRight.y)
  }
  def perimeter() {
    return (this.height() + this.width()) * 2
  }
  def width() {
    return Math.abs(downRight.x - upLeft.x)
  }
  def within(point) {
    return (point.x <= downRight.x) && (point.x >= upLeft.x) && (point.y <= upLeft.y) && (point.y >= downRight.y)
  }
}

println("Enter coordinates separated by a comma (i.e. 100,20): ")
String str = System.console().readLine()
Point upLeft = new Point(str)

println("Enter coordinates separated by a comma (i.e. 100,20): ")
str = System.console().readLine()
Point downRight = new Point(str)

Rectangle rectangle = new Rectangle(upLeft, downRight)

println("Enter coordinates separated by a comma (i.e. 100,20): ")
str = System.console().readLine()
Point query = new Point(str)

boolean inside = rectangle.within(query)

print(inside)