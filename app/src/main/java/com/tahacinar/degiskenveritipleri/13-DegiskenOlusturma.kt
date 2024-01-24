package com.tahacinar.degiskenveritipleri

fun main() {


    // String ifadeleri " " içerisinde kullanırız
    var ogrenciAdi = "Taha"

    // Rakamlar ve sayıları direkt olarak yazabiliriz. Özel bir durum olmadığında
    var ogrenciYas = 23
    var ogrenciBoy =1.98
    var ogrenciBasHarf = "t"

    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasHarf)


    // Burada ise yaptığımız tanımlamaları hangi değişken türü ile kullandığımızı belirtip o şekilde yazıyoruz.
    var urun_id : Int = 3416
    var urun_adi : String = "Kol Saati"
    var urun_adet : Int = 100
    var urun_fiyat : Double = 149.99
    var urun_tedarikci : String = "Rolex"


    println(urun_id)
    println(urun_adi)
    println(urun_adet)
    println(urun_fiyat)
    println(urun_tedarikci)


    // String ifade içerisine $ ifadesi kullanılarak çıktıya değişken eklenebilir.

    println("$urun_tedarikci marka $urun_adi $urun_fiyat fiyatla satılmaktadır. Stokta $urun_adet adet kalmıştır.")

    // Değişkenleri çıktı alırken println içerisinde $ kullanarak tekli şekilde kullanabiliriz

    println("Ürün Adı: $urun_adi")

    // String ifade içerisine ${ } kullanarak işlem de yapabiliriz.

    var sayi1 : Int = 10
    var sayi2 : Int = 20

    println("$sayi1 ve $sayi2'nin toplamı : ${sayi1 + sayi2} dur.")

}