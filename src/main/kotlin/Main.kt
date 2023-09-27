fun main(){
    rectangleCalculator(5.0,10.0)
    lineBreak()

    parallelogramCalculator(2.0,3.0,5.3)
    lineBreak()

    triangleCalculator(3.0, 5.4)
    lineBreak()

    trapeziumCalculator(4.0, 5.0, 2.3)
    lineBreak()

    squareCalculator(4.0)
    lineBreak()
}

fun lineBreak(){
    repeat(60){
        print("_")
    }
    println()
}

fun rectangleCalculator(length: Double, breadth: Double){
    print("Rectangle Mensuration:")
    println("\nLength: $length \nBreadth: $breadth")

    print("\t1. Perimeter: ")
    val perimeter = 2 * (length + breadth)
    println("2($length + $breadth) = $perimeter")

    print("\t2. Area: ")
    val area  = length * breadth
    println("$length x $breadth = $area ")
}

fun parallelogramCalculator(a: Double, b: Double, h: Double){
    print("\nParallelogram Mensuration: ")
    println("\na: $a \nb: $b \nh: $h") //a: length of left or right side | b: length of top or bottom side | h: vertical height of parallelogram

    print("\t1. Perimeter: ")
    val perimeter = 2 * (a + b)
    println("2 * ($a + $b) = $perimeter")

    print("\t2. Area: ")
    val area  = b * h
    println("$b x $h = $area ")
}

fun triangleCalculator(b: Double, h: Double){
    print("\nTriangle Mensuration: ")
    println("\nb: $b \nh: $h") //b: base length | h: vertical height

    print("\tArea: ")
    val area  = 0.5 * b * h
    println("1/2 x $b x $h = $area ")
}

fun trapeziumCalculator(a: Double, b: Double, h: Double){
    print("\nTrapezium Mensuration: ")
    println("\na: $a \nb: $b \nh: $h") //b: base length | h: vertical height

    print("\tArea: ")
    val area  = 0.5 * (a + b) * h
    println("1/2 * ($a + $b) * $h = $area ")
}

fun squareCalculator(d: Double){
    print("\nSquare Mensuration: ")
    println("\nd: $d") //d: length of side

    print("\t1. Perimeter: ")
    val perimeter = 4 * d
    println(" 4 x $d = $perimeter")

    print("\t2. Area: ")
    val area  = d * d
    println("$d x $d = $area ")
}
