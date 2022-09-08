package com.example.gd3_c_0796.entity

class Dosen (var name: String, var pengajar: String){

    companion object{
        @JvmField
        var listOfDosen = arrayOf(
            Dosen("Fedelis Brian","Pengajar Kelas A, B, dam D"),
            Dosen("Thomas Adi", "Pengajar Kelas C"),
        )
    }
}