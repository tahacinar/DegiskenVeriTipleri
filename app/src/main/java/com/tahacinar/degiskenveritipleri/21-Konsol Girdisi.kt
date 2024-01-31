package com.tahacinar.degiskenveritipleri

import java.util.Scanner

fun main () {

    // Genel olarak programlamada işimizi çok görmese de öğrenmek fayda sağlar

    println("Adınızı Giriniz : ")

    val girdi = Scanner(System.`in`)

    // next girdikten sonra isterseniz tipinide belirtebilirsiniz. nextInt vs. gibi

    val ad = girdi.next()
    println("Adınız: $ad ")

}