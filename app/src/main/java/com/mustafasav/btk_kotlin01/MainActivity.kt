package com.mustafasav.btk_kotlin01

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        println("Merhaba Dünya")
        println("Loglara 2 yazılacak.")
        //Açıklama satırı....
        println(5 * 2)
        println(10 / 5)
        println(5 / 2)

        //Kotlin Veri Tipleri ve Değişkenler

        //integer - Tam Sayı
        println("----Integer----")
        var sayi = 10

        println(sayi)
        println(sayi * 25)

        sayi = 25
        println("Sayının Yeni Değeri: " + sayi)

        var sayi2 = 3
        println(sayi2 + sayi);
        //implicit
        val sayi3 = 20; // val: sabit değerli değişkenler

        // Sonradan değer değişecekse var ile
        // Sonradan değer değişmeyecekse val ile tanımlanır.

        println(sayi3 * 50)

        //explicit
        var ornekSayi: Long = 25
        val ornekShort: Short = 35
        val ornekByte: Byte = 12
        val ornekInt: Int = 23

        println(ornekByte + ornekShort)

        val kullaniciyasi = 35
        val kullanici_yasi = 35  //snake_case
        val kullaniciYasi = 35    //camelCase

        val m = 10
        val n = 20
        println(m + n)

        val sonuc = m + n

        println(sonuc)
//Double - Float - Kesirli Sayılar
        println("---- Double & Float ----")
        val pi = 3.14
        println(pi * 2)
        println(5 / 2.0)

        val ornekDouble: Double = 3.0
        val sonucDouble = pi * ornekDouble
        println(sonucDouble)

        val ornekFloat = 2.25f

        // val ornekFloat1:Float=2.25 olmuyor. sonuna f koymak gerekiyor
        val ornekFloat1: Float = 2.25f


        println(ornekFloat * 2)

        //Unsigned Integer (sonuna u konur)
        //Eksi değer almayan tanımlamalar için.
        val unsignedByte: UByte=10u
        val unsignedShort: UShort=10u
        val unsignedInt: UInt=10u
        val unsignedLong : ULong=10u

        //String ->> metinler
        println("------String------")

        val benimString ="Benim Stringim"
        println(benimString)

        val ornekString:String ="Ornek"
        val name = "Mustafa"
        println(name.uppercase()) //Büyük harfe çevirme

        val surname="Sav"

        println(name+" "+surname)

        val age = "15"
        println(age+2)

        val benimStr:String
        // benimStr.uppercase()
        benimStr="Mustafa SAV" //initalize, init, initialization

        val benimInt:Int

        // Conversion -> Tür dönüşümleri
        println( age.toInt()*2)

        val xLong = kullaniciyasi.toLong();


        //Boolean
        println("----Boolean----")

        var benimBool: Boolean=true
        benimBool=false

        println(3>5)
        println(3<5)
        println(4==4)
        println(4!=4)

        val kullaniciYas = "35"
        println(kullaniciYas.toInt()>18)

        /*
             <   küçüktür
             >   büyüktür
             <=  küçük eşit
             >=  büyük eşit
             ==  eşittir
             !=  eşit değildir
             &&  ve
             ||  veya
         */

        println("Mustafa"=="mustafa")

        println(4>3 && 5>6)
        println(4>3 || 5>6)


//Veri Yapıları
        //Diziler - Array
        println("------ Array---------")

        val stringOrnegi ="Mustafa"
        val benimDizim = arrayOf(stringOrnegi,"sav","deniz","emine","serkan")

        println(benimDizim[0])
        println(benimDizim[1]);
        println(benimDizim.last())

        //benimDizim.shuffle() //Elemanları rastgele karıştırmak

        println(benimDizim.get(3))

        benimDizim[1]="göktürk"

        println(benimDizim[1])
        benimDizim.get(3) //İndex numarasına göre getir.

        /*
        benimDizim[5]="Yeni eleman"
        benimDizim[5]
        bu şekilde yeni eleman eklenemiyor.
         */

        val numaraDizisi = arrayOf(12,55,65,1,5,6,8,0)
        println(numaraDizisi[2]*10)
        val karisikDizi = arrayOf(10,30,"Mustafa","Sav",true,false)

        println(karisikDizi[4])

    }
}