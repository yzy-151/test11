package com.example.aclass

class student(val sno:String ,val grade:Int,name:String,age:Int) :person(name,age){
    //调用person时要在student里提前声明变量
    constructor(name: String,age: Int):this("nononono",0,name,age){
    //这是一个次构造函数，第一个括号内为接受的数据，第二个括号为赋初值和未赋初值的数据
        // this是调用的上一个函数，依据传入参数的类型确定调用的谁
    }


    init {
        println("son is "+sno)
        println("name is "+name)
        println("age is "+age)
        println("grade is "+grade)
    }
}