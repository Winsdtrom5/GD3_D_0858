package com.example.gd3_d_0858.entity

class Dosen(var name:String ,var pengajar:String) {
    companion object{
        @JvmField
        var listofDosen = arrayOf(
            Dosen("Fedelis Brian","Pengajar Kelas A, B, dan D"),
            Dosen("Thomas Adi","Pengajar Kelas C")
        )
    }
}