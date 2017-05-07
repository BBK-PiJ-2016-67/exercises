class Point {
  double x;
  double y;
  def Point(str) {
    def arr = str.split(",")
    this.x = Double.parseDouble(arr[0])
    this.y = Double.parseDouble(arr[1])
  }
}

class Points {
  Point a;
  Point b;
  def distance() {
    return Math.sqrt(((a.x - b.x).power(2) + (a.y - b.y).power(2)))
  }
  def Points(a, b) {
    this.a = a;
    this.b = b;
  }
}

def list = []

int i = 0

while(i < 3) {
  println("Enter coordinates separated by a comma (i.e. 100,20): ")
  String str = System.console().readLine()
  list.push(new Point(str))
  i = i + 1
}

double shortestDistance = -1.0
int shortestIndexA = -1
int shortestIndexB = -1

i = 0

while (i < 3) {
  int x = 0

  while (x < 3) {
    if (i != x) {
      Points points = new Points(list[i], list[x])

      double distance = points.distance()

      if (shortestDistance == -1.0 || distance < shortestDistance) {
        shortestDistance = distance
        shortestIndexA = i
        shortestIndexB = x
      }
    }

    x = x + 1
  }

  i = i + 1
}

print("The shortest distance is: ")

println(shortestDistance)