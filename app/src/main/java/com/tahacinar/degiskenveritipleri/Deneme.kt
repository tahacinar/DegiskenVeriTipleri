package com.tahacinar.degiskenveritipleri

class Deneme {

    var x = 10 // Global Değişkenler
    var y = 20

    fun topla(){
        // Bu şekilde olan kodlamalarda içerisinde verilen x değeri local olarak toplama alınır
        // Y değeri ise globa olarak toplamaya katılır ve yeni toplam 60 şeklinde olur

        // Local değişken Global değişkene karşı baskındır. Önce Lokal değer çalışır.

        var x = 40

        var z = x + y

        println(z)

    }
}