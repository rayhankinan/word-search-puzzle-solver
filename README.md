# Word Search Puzzle Solver
Disusun untuk mendukung Tugas Kecil 1 IF2211 Strategi Algoritma "Penyelesaian *Word Search Puzzle* dengan Algoritma *Brute Force*"

## Daftar Isi
* [Deskripsi Singkat Program](#deskripsi-singkat-program)
* [Struktur Program](#struktur-program)
* [Requirement Program](#struktur-program)
* [Cara Kompilasi Program](#cara-kompilasi-program)
* [Cara Menjalankan Program](#cara-menjalankan-program)
* [Author](#author)

## Deskripsi Singkat Program

## Struktur Program
```bash
.
│   .gitignore
│   README.md
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
* Java Virtual Machine versi 11 atau lebih baru

## Cara Kompilasi Program
1. Pastikan Java Virtual Machine versi 11 atau lebih baru sudah terpasang pada mesin eksekusi (Anda dapat mengecek versi Java Virtual Machine dengan menjalan command `java -version` pada command prompt).
2. Jalankan command `make all` pada command prompt untuk melakukan kompilasi pada program.
3. Jika berhasil dikompilasi, maka akan terdapat folder `bin` pada directory program.

## Cara Menjalankan Program
1. Pastikan Anda telah berhasil melakukan kompilasi pada program.
2. Tambahkan file teks dalam format `.txt` yang berisi matriks huruf di dalam *puzzle* (antarhuruf dipisahkan oleh spasi), diikuti satu baris kosong, dan daftar kata-kata yang akan dicari di dalam *puzzle* ke dalam folder `test` pada directory program.
3. Jalankan command `./run` atau `./run.bat` pada command prompt jika Anda menggunakan Windows dan jalankan command `./run.sh` pada command prompt jika Anda menggunakan Linux atau macOS.
4. Masukkan nama file teks yang sudah ditambahkan sebelumnya ke dalam input program.
5. Jika sudah selesai, Anda dapat membersihkan kompilasi program dengan menjalankan command `make clean` pada command prompt. Anda harus mengkompilasi ulang bila menjalankan command ini.

## Author
* Nama: Rayhan Kinan Muhannad
* NIM: 13520065
* Jurusan: Teknik Informatika
* Profile Github: [rayhankinan](https://github.com/rayhankinan)