package com.kotlinbasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kotlinbasics.ui.theme.KotlinBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinBasicsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        //week02Variables()
        //week02Functions()

    }
        private fun week03Classes(){
            class Student{
                var name : String = " "
                var age : Int = 0

                fun introduce(){
                    println("Hi, I`m $name and i`m $age years old")
                }

            }

            val student = Student()
            student.name="sen"
            student.age = 23
            student.introduce()

            data class Person(val name:String,val age:Int)

            val person1 = Person(name = "lee", age = 23)
            val person2 = Person(name = "lee", age = 23)

            println("Person1: $person1")
            println("Equal?: ${person1 == person2}")
        }
    }

private fun week02Functions() {
    println("week02 Functions")

    //fun greet (name: String) = "Hello, $name!"

    //println(greet("Android Developer"))

    println(" == Kotlin Functions == ")

    fun greet(name: String): String { // 위 greet 함수와 같지만 다르게 쓸 수 있음
        return "Hello, $name"
    }

    fun add(a:Int, b:Int) = a+b

    fun introduce(name: String,age:Int=19){ // name 지정 안해주면 19로 고정
        println("My name is $name and I`m $age years old")
    }

    println(greet("kotlin"))
    println("sum : ${add(5,-71)}")
    introduce("park")
    introduce("kim",29)
}
private fun week02Variables(){
//    println("week02 Variables")

//    val courseName = "Mobile Programming"
//    //courseName = "IoT Programming"
//    var week = 1
//    week = 2

//    println("course : $courseName")
//    println("week : $week")

    println(" == Kotlin Variables == ")

    val name="Android"
    var version=8.1
    println("Hello $name $version")

    val age : Int = 23
    val height : Double = 150.1
    val isStudent : Boolean = true

    println("Age : $age, height : $height, Student: $isStudent")
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinBasicsTheme {
        Greeting("Android")
    }
}