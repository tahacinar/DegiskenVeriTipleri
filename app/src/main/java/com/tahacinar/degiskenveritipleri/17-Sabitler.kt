package com.tahacinar.degiskenveritipleri

fun main (){

    // var ile belirttiğimiz değişkenler sonradan bir değişime uğrayabilir.

    var sayi = 20
    sayi = 40
    sayi = 80

    println(sayi)

    // Val ile belirttiğimizden dolayı değişkenimiz bir değişime uğrayamaz hafızada bu şekilde tutulur.
    // Değeri belli olan değişkenlerde val kullanmak her zaman için çok daha pratik olacaktır.

    val sayi2 = 100

    // Örnek olarak pi sayısının değeri bellidir ve global olarakta bu değer kabul edilir.

    val pi = 3.14




}