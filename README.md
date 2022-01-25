# Word Search Puzzle Solver
Disusun untuk memenuhi Tugas Kecil 1 IF2211 Strategi Algoritma "Penyelesaian *Word Search Puzzle* dengan Algoritma *Brute Force*".

## Daftar Isi
* [Deskripsi Singkat Program](#deskripsi-singkat-program)
* [Struktur Program](#struktur-program)
* [Requirement Program](#struktur-program)
* [Cara Kompilasi Program](#cara-kompilasi-program)
* [Cara Menjalankan Program](#cara-menjalankan-program)
* [Author](#author)

## Deskripsi Singkat Program
Program untuk mencari semua solusi kata pada *word search puzzle* dengan menggunakan algoritma *brute force* serta ADT Matriks dan ADT Trie. Program menerima masukan dalam bentuk file teks dalam format `.txt` yang berisi grid karakter serta kumpulan kata yang hendak dicari (dipisahkan dengan baris kosong). Kemudian, program akan mengeluarkan hasil pencarian tersebut dalam bentuk command prompt dengan kata yang ditemukan akan diberi warna. Program dibangun dengan menggunakan bahasa Java.

## Struktur Program
```bash
C:.
│   .gitignore
│   extract.bat
│   extract.sh
│   README.md
│   run.bat
│   run.sh
│   word-search-puzzle-solver.jar
│   
├───doc
│       Tugas Kecil 1 IF2211 Strategi Algoritma Penyelesaian Word Search Puzzle dengan Algoritma Brute Force.pdf
│       
├───src
│   │   App.java
│   │
│   ├───ConsoleWriter
│   │       ConsoleWriter.java
│   │
│   ├───DataStructure
│   │   ├───Trie
│   │   │       Trie.java
│   │   │       TrieNode.java
│   │   │
│   │   └───WordGrid
│   │           Vector.java
│   │           WordGrid.java
│   │           WordGridStruct.java
│   │
│   └───FileReader
│           FileReader.java
│
└───test
        large_1.txt
        large_2.txt
        large_3.txt
        medium_1.txt
        medium_2.txt
        medium_3.txt
        small_1.txt
        small_2.txt
        small_3.txt
```

## Requirement Program
* Java Virtual Machine versi 11 atau lebih baru.

## Cara Kompilasi Program
1. Pastikan Java Virtual Machine versi 11 atau lebih baru sudah terpasang pada mesin eksekusi (Anda dapat mengecek versi Java Virtual Machine dengan menjalan command `java -version` pada command prompt).
2. Jalankan command `./extract` atau `./extract.bat` pada command prompt jika Anda menggunakan Windows dan jalankan command `./extract.sh` pada command prompt jika Anda menggunakan Linux atau macOS.
3. Jika berhasil dikompilasi, maka akan terdapat folder `bin` pada directory program.

## Cara Menjalankan Program
1. Pastikan Anda telah berhasil melakukan kompilasi pada program.
2. Tambahkan file teks dalam format `.txt` yang berisi matriks huruf di dalam *puzzle* (antarhuruf dipisahkan oleh spasi), diikuti satu baris kosong, dan daftar kata-kata yang akan dicari di dalam *puzzle* ke dalam folder `test` pada directory program.
3. Jalankan command `./run` atau `./run.bat` pada command prompt jika Anda menggunakan Windows dan jalankan command `./run.sh` pada command prompt jika Anda menggunakan Linux atau macOS.
4. Masukkan nama file teks yang sudah ditambahkan sebelumnya ke dalam input program.

## Author
* Nama: Rayhan Kinan Muhannad
* NIM: 13520065
* Prodi/Jurusan: STEI/Teknik Informatika
* Profile Github: [rayhankinan](https://github.com/rayhankinan)