package BOJ

fun main() = println(
    """|\_/|
|q p|   /}
( 0 )${"\"\"\""}\
|"^"`    |
||_/=\\__|
""")


/*
코틀린에서 이스케이프 문자들
        - 백슬래시(\) 사용
        - 중괄호(${}) 사용
        - 삼중따옴표(""") 사용

"Hello" $World

# 백슬래시 사용
-> println("\"Hello\" \$World")

# 중괄호 사용 ("따옴표 안에 넣어준다 통째로")
-> println("${'"'}Hello${'"'} ${'$'}World")

# 삼중따옴표 사용 (이스케이프 문자 바로 사용 못함, $는 변수 취급하기 때문에 ${'$} 로 출력해야한다)
-> println(""""Hello" ${'$'}World""")

# ERROR
섞어서 사용할 수는 없다
-> println("\"Hello\" ${"$World"}")
*/