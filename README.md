# SISTEM BOOKING LAPANGAN BADMINTON - Mini Project 2

**Nama: Iqbal Nurriz Ramadhan**

**Nim : 2509116067**


## Latar Belakang & Deskripsi Singkat Program
Program ini merupakan Sistem berbasis Java yang dibuat untuk memenuhi tugas Mini Project 2 Pemrograman Berorientasi Objek (PBO). Sistem ini bermaksud untuk mempermudah pengelolaan jadwal dan pemesanan lapangan badminton secara terstruktur.

Sistem Booking Sewa Lapangan Badminton ini adalah program berbasis CLI (Command Line Interface) yang menangani manajemen pemesanan lapangan secara dinamis. Program ini menerapkan konsep dasar PBO dengan mengelola data pelanggan, ketersediaan lapangan, dan transaksi pemesanan secara real-time dalam memori menggunakan ArrayList.


## Penjelasan Alur Program
1. **Inisialisasi Awal:**
   - Program membuat ArrayList untuk menyimpan data Customer, Lapangan, dan Booking.
   - Sistem memiliki dummy data awal baik dari Customer, lapangan, hingga Booking. Agar data dapat langsung ditampilkan/ditest saat program dijalankan.
   - Tersedia 4 lapangan dengan jenis karpet Vinyl dan Wooden.
   - Customer terdiri dari Member dan Non Member.

2. **Menu Utama:**
   - Menggunakan perulangan while dan percabangan switch-case, program menampilkan menu interaktif (pilihan 1–8) hingga pengguna memilih menu keluar.

     <img width="312" height="207" alt="image" src="https://github.com/user-attachments/assets/0f2af432-8a6b-4a14-9cc2-5fbe82a9357f" />

3. **Operasi Fitur Program & CRUD:**
   - **Tambah Customer (Pilihan 1):** Mengambil input idCustomer, namaCustomer, dan nomorHp, lalu menginstansiasi objek Customer baru ke dalam listCustomer.

      <img width="240" height="242" alt="image" src="https://github.com/user-attachments/assets/b0f400a8-4c67-49eb-8ad1-17ff3346ec42" />


   - **Tampilkan Customer (Pilihan 2):** Menampilkan seluruh data customer mulai dari id, nama, nomor, hingga status member.

     <img width="450" height="158" alt="image" src="https://github.com/user-attachments/assets/c8c12e84-e790-4914-833e-b94e2fbed908" />

     
   - **Tampilkan Lapangan (Pilihan 3):** Menampilkan Seluruh Lapangan yang tersedia serta detail informasinya seperti nomor lapangan, jenis karpet yang digunakan, hingga harga sewanya perjam.

     <img width="390" height="166" alt="image" src="https://github.com/user-attachments/assets/d75bba55-89d2-4bd9-93ac-2f2fbbb94976" />


   - **Tambah Booking Lapangan (Pilihan 4):** Mengambil input kodeBooking, idCustomer (penyewa), nomorLapangan, dan durasiJam, lalu menginstansiasi objek Booking ke dalam listBooking.
     
     <img width="446" height="463" alt="image" src="https://github.com/user-attachments/assets/93ceb8e6-199a-42f3-912c-ca28cb380f87" />


   - **Tampilkan Booking (Pilihan 5):** Menampilan seluruh riwayat data booking, seperti kode booking, id customer yang menyewa, nomor lapangan yagn disewa, durasi main, jam start main, hingga total harga yang sudah dikalkulasi berdasarkan harga sewa lapangan dengan jam mainnya.
  
   - Total harga booking dihitung berdasarkan durasi bermain dan harga sewa lapangan. Customer Member mendapatkan diskon, sedangkan Non Member mendapatkan biaya tambahan.

     <img width="972" height="100" alt="image" src="https://github.com/user-attachments/assets/c23bd8a4-356e-478e-843a-f97c3c77ce43" />


   - **Update Booking (Pilihan 6):** Meminta input kode booking yang ingin diubah, lalu meminta seluruh data sekaligus tanpa menanyakan data mana yang ingin diubah agar menyederhanakan sistem di kode.

     <img width="970" height="310" alt="image" src="https://github.com/user-attachments/assets/bfbf19b8-71d0-4bfe-86fb-3e00efcb9116" />


       Hasil setelah diganti:

       <img width="969" height="99" alt="image" src="https://github.com/user-attachments/assets/6d2803d7-f6a4-416a-a6af-3fae2699776c" />


    - **Hapus Booking (Pilihan 7):** Meminta input kodeBooking yang ingin dihapus, lalu menghapus objek dari listBooking jika ditemukan.
     
      <img width="975" height="131" alt="image" src="https://github.com/user-attachments/assets/e8128ceb-a6c6-42b7-adf6-340332fa7ff2" />

     
       daftar booking setelah dihapus :
     
       <img width="969" height="96" alt="image" src="https://github.com/user-attachments/assets/1cf64724-87f2-485c-95b4-43a61e45e9b8" />


   - **Keluar (Pilihan 8):** Menghentikan perulangan program dan menutup akses Scanner.
  
     <img width="377" height="231" alt="image" src="https://github.com/user-attachments/assets/79f027f3-1912-471b-b47e-c4f67a3d6dac" />



## Penerapan Encapsulation

Encapsulation diterapkan dengan menggunakan access modifier private pada atribut di dalam class.

Contohnya:

```java
private String idCustomer;
private String namaCustomer;
private String noHp;
```

Data diakses menggunakan getter dan diubah/disesuaikan menggunakan setter.

Contoh:

```java
public String getNamaCustomer() {
    return namaCustomer;
}

public void setNamaCustomer(String namaCustomer) {
    this.namaCustomer = namaCustomer;
}
```

Atribut yang digunakan sebagai identitas utama seperti idCustomer dan kodeBooking tidak diberikan setter agar tidak dapat diubah secara sembarangan.


## Penerapan Inheritance

Inheritance diterapkan pada class Customer sebagai superclass dengan dua subclass, yaitu Member dan NonMember.

```text
Customer (SuperClass)
|__ Member (SubClass)
|__ NonMember (SubClass)
```

Class Customer menyimpan atribut umum seperti ID, nama, dan nomor HP.

Class Memberi memiliki atribut tambahan berupa diskon, sedangkan NonMember memiliki atribut tambahan berupa biayaTambahan.

Contoh:

```java
public class Member extends Customer
```

```java
public class NonMember extends Customer
```

## Penjelasan Letak Penerapan Nilai Tambah

Pada program ini juga diimplementasikan beberapa kode/fitur untuk nilai tambah sebagai berikut:

### 1. **Penerapan MVC :**
   Strukturnya sebagai berikut:

  ```text
   SourcePackage
   |
   |__mycompany.sistemBookingLapanganBadminton (ini main nya)
   |  |__SistemBookingLapanganBadmintonDua
   |
   |__controller
   |  |__BookingController
   |
   |__view
   |  |__BookingView
   |
   |__model
      |__Customer
      |__Member
      |__NonMember
      |__Lapangan
      |__Booking
  ```

  - **Model:** Menyimpan struktur data dan class/object program.
  - **View:** Menampilkan menu, menerima input, dan menampilkan output.
  - **Controller:** Mengelola proses CRUD, validasi data, pencarian data, dan perhitungan total harga.
  - **Main:** Menjalankan Controller dan View.

### 2. **Polymorphism**
   Polymorphism diterapkan melalui method overriding pada class Customer dan Member.

  Pada class Customer:
  
  ```java
  public double hitungDiskon() {
      return 0;
  }
  ```
  
  Pada class Member:
  
  ```java
  @Override
  public double hitungDiskon() {
      return diskon;
  }
  ```
  
  Jadi satu tipe referensi hitung diskon Customer dapat digunakan untuk menangani object dari subclass yang berbeda.
