package com.tahacinar.degiskenveritipleri

fun main () {

    // Örnek olarak Daire alanı bulmaya çalışalım

    val pi = 3.14

    var yaricap = 2.0

    var alan = pi * yaricap * yaricap

    println("Daire Alanı : $alan")

    // Bölme gibi işlemlerin nasıl yapıldığını aşağıda görebiliriz.

    // Ax
    var v = 12.7
    var v0 = 23.56
    var t = 3.5

    var x1 = ((v+v0)/2)*t
    println("x1: $x1")

    // Kısaltma işlemleri

    var y = 20

    y = y + 2
    println(y)

    y+=2 // y değerine 2 ekle
    y-=3 // y değerinden 3 çıkar
    y*=2 // y değerini 2 ile çarp
    y/=2 // y değerini 2ye böl

    println(y)



}