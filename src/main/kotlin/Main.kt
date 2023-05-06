import main.kotlin.Color.Color
import main.kotlin.Color.Color.*

fun main(args: Array<String>) {
    //println(Color.BLUE.rgb())
    var str = getMnemonic(Color.BLUE)
    println(str)
    println(getWarmth(Color.ORANGE))

    println(mix(BLUE,VIOLET))
    println(mix(VIOLET,BLUE)) //setOf의 순서는 상관 없음

    println(mixOptimized(RED,YELLOW))
}



//각조건이 불리언 결과여야 한다
fun mixOptimized(c1:Color , c2: Color) =
    when{
        (c1 == RED && c2 == YELLOW) ||
                (c1 == YELLOW &&c2 == RED) ->
            ORANGE
        (c1 == YELLOW &&  c2==BLUE) ||
                (c1 == BLUE && c2 == YELLOW)->
        GREEN
        (c1 == BLUE && c2 == VIOLET) ||
        (c1 == VIOLET && c2 == BLUE)->
                    INDIGO
        else -> throw Exception("Dirty color")
    }

fun mix(c1:  Color, c2:Color )=when(setOf(c1,c2)){
    setOf(RED,YELLOW) -> ORANGE
    setOf(YELLOW, BLUE) -> GREEN
    setOf(BLUE, VIOLET) -> INDIGO
    else -> throw Exception("Dirty color")
}

fun getWarmth2(color:Color) = when (color){
    RED,ORANGE,YELLOW ->"warm"
    GREEN ->"neutral"
    BLUE,INDIGO,VIOLET -> "cold"
}



fun getWarmth(color : Color )= when(color){
   Color.RED,Color.ORANGE,Color.YELLOW -> "warm"
   Color.GREEN -> "neutral"
   Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
}



fun getMnemonic(color: Color) =
    when(color){
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }
