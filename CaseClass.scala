object CaseClass extends App{

  val p1 = new Point(1,2)
  val p2 = new Point(3,4)

  println(p1) // Point(1,2)
  println(p1==p2) // false

  val p3 = p1.move(1,1)

  println("(1,2)->1 : "+p3) // (1,2)->1 : (2,3)

  val p4 = p1.copy()

  println(p4) // Point(1,2)
  println(p1==p4) // true
  println("Addition of two points : p1+p2 = " + (p1+p2)) // Addition of two points : p1+p2 = Point(4,5)
  println(p1.distance(p2)) ;
  println("Invert coordinates of the point" +p2.invert) // Point(4,3)
}

case class Point (a:Int , b:Int ) {
  def x:Int = a
  def y:Int = b

  //(no need in case class)override def toString ="("+x+","+y+")"

  //add(+) should add two given points
  def +(that:Point) = Point(this.x+that.x , this.x+that.y)

  //move should move a point by a given distance dx and dy
  def move (dx:Int,dy:Int) = Point (this.x+dx , this.y+dy)

  //distance should return the distance between two given points
  def distance(that:Point): Unit = {
      val dis = Math.sqrt(Math.pow(this.x - that.x,2) + Math.pow(this.y - that.y,2))
      println("Distance between two points = "+dis) ;
  }

  //invert should switch the x and y coordinates.
  def invert= Point(this.y , this.x)

}