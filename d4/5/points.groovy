// Write a program in which you create and use a class called Point, with two
// fields of type double (e.g. x, y) and the following methods:
//
// distanceTo(Point): calculates the distance to another point.
// distanceToOrigin(): calculates the distance to the origin. Implement it by
// calling the first method.
// moveTo(double x, double y): changes the coordinates of this point to be the
// given parameters x and y.
// moveTo(Point): changes the coordinates of this point to move where the given
// point is.
// clone(): returns a copy of the current point with the same coordinates.
// opposite(): returns a copy of the current point with the coordinates
// multiplied by −1.
// 
// Two methods in a class can have the same name (identifier) as long as their
// parameters are different. This is called method overloading and we will see
// more of that in the future.

class Point {

	double x = 0
	double y = 0
	
	Point(double x, double y) {
		this.x = x
		this.y = y
	}

	double distanceTo(Point point) {
		return Math.sqrt((point.x - this.x).power(2) + (point.y - this.y).power(2))
	}

	double distanceToOrigin() {
		return this.distanceTo(new Point(0, 0))
	}

	void moveTo(double x, double y) {
		this.x = x
		this.y = y
	}

	Point clone() {
		return new Point(this.x, this.y)
	}

	Point opposite() {
		return new Point(this.x * -1, this.y * -1)
	}

}

point = new Point(5, 5)
secondPoint = new Point(7, 3)

centerPoint = new Point(0, 0)

println("The distance between point one and point two is: " + point.distanceTo(secondPoint))

println(point.clone().x)
println(point.clone().y)

point.moveTo(3, 3)

println(point.clone().x)
println(point.clone().y)

println(point.opposite().x)
println(point.opposite().y)

println(point.distanceToOrigin())

point.moveTo(0, 0)

println(point.distanceToOrigin())
