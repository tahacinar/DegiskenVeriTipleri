package com.tahacinar.degiskenveritipleri

import java.lang.Exception

fun main (){

    /*
     Tür dönüşümü 3 şekilde olur.
     1-Sayısaldan Sayısala Dönüşüm
     2-Sayısaldan Metine Dönüşüm
     3-Metinden Sayısala Dönüşüm

     Ve bunları da toDouble(), toFloat(), toInt(), toString() vb. kullanarak dönüşüm yapabiliriz.
     */

    // Sayısaldan Sayısala Dönüşüm
    var i : Int = 42
    var d : Double = 42.45
    var f : Float = 48.89f

    var sonuc1 : Int = d.toInt()
    var sonuc2 : Double = i.toDouble()
    var sonuc3 : Int = f.toInt()

    println(sonuc1)
    println(sonuc2)
    println(sonuc3)

    // Sayısaldan Metine Dönüşüm

    var str1 = i.toString()
    var str2 = d.toString()
    var str3 = f.toString()

    println(str1)
    println(str2)
    println(str3)


    // Dönüşüm Yöntemi 1

    var yazi1 = "34t"
    try {
        var x = yazi1.toInt()
        println(x)
    }catch (e:Exception){
        println("Dönüşümde hata var")
    }

    // Dönüşüm Yöntemi 2

    var yazi2 = "48"

    var y = yazi2.toDoubleOrNull()

    if (y != null){
        println("y : $y")
    }else{
        println("Dönüşümde hata var")
    }


    var yazi3 = "48r"

    var y2 = yazi3.toDoubleOrNull()

    if (y2 != null){
        println("y2 : $y")
    }else{
        println("Dönüşümde hata var")
    }




}