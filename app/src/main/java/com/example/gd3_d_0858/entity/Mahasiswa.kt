package com.example.gd3_d_0858.entity

class Mahasiswa (var name: String , var IPK : Double , var tahunMasuk : Int) {
    companion object{
        var listofMahasiswa = arrayOf(
            Mahasiswa("Wendy Winata", 3.5,2018),
            Mahasiswa("Eras Timothy", 3.7,2018),
            Mahasiswa("Jonathan", 3.8,2018),
            Mahasiswa("Yosia", 3.9,2018),
            Mahasiswa("Jotam", 4.0,2019)
        )
    }
}