#include <stdio.h>
#include <conio.h>
#include <iostream>
#include <iomanip>
#include <windows.h>

using namespace std;
//panggil
    header() {
    cout<<endl;
    cout<<  "=====================================================\n"
            "                       P A M                         \n"
            "                  Pesan Antar Makan                  \n"
            "-----------------------------------------------------\n"
            "        Anda Lapar tinggal pesan, Makanan datang     \n"
            "=====================================================\n";}


    garis() {
    cout<<  "-----------------------------------------------------\n";}

    main(){

//Deklarasi Variable
   int i,j;
   int byk_bel[30],harga[30];
   char lagi,lanjut,paket,plh;
   string Norek,Nopin,almt,nama,pengaduan,email;
   char kode_ma[30],*makan[30];
   long int jml_hrg=0,sub_hrg[30];

   system("cls");

//awal
   awal:
   system("cls");
   header();
   cout<<endl;
   cout<<"1. Menu\n";
   cout<<"2. Paket\n";
   cout<<"3. Hot Promo\n";
   cout<<"4. Lokasi Outlet\n";
   cout<<"5. Informasi\n";
   cout<<"6. Layanan Pengaduan\n";
   cout<<"7. Keluar\n";
   garis();

   cout<<"Masukan pilihan anda : ";cin>>plh;
   if(plh=='1'||plh=='1')
    goto menu;
   else if(plh=='2'||plh=='2')
    goto paket;
   else if(plh=='3'||plh=='3')
    goto hotpromo;
   else if(plh=='4'||plh=='4')
    goto lokasi;
   else if(plh=='5'||plh=='5')
    goto informasi;
   else if(plh=='6'||plh=='6')
    goto layanan;
   else if(plh=='7'||plh=='7')
    goto keluar;
   else
    goto awal;
//1. Makanan
   menu:
   system("cls");
   header();
   cout<<endl;
   cout<<"               MENU MAKANAN DAN MINUMAN      \n";
   garis();
   cout<<"   KODE MAKANAN           ||     KODE MINUMAN   \n"<<endl;
   cout<<"A. PIZZA                  ||   H. MILK SHAKE    \n";
   cout<<"B. HOTDOG                 ||   I. ROOT BEER     \n";
   cout<<"C. BURGER                 ||   J. COCA-COLA     \n";
   cout<<"D. KEBAB                  ||   K. PEPSI         \n";
   cout<<"E. PASTA                  ||   L. VANILA FLOAT  \n";
   cout<<"F. SPAGETI                ||   M. BLUEBERY FLOAT\n";
   cout<<"G. FRIENCH FRICE          ||   N. MINT TEA      \n";

   garis();
   cout<<"Banyak Item               : ";cin>>j;
   garis();
   {
    for(i=1;i<=j;i++)
   {
   cout<<"  Item Ke"<<i<<endl;
   cout<<"Kode Makanan/Minuman      : ";cin>>kode_ma[i];
   cout<<"Banyaknya                 : ";cin>>byk_bel[i];
    garis();
   }
   for(i=1;i<=j;i++)
   {

    if(kode_ma[i]=='A'|| kode_ma[i]=='a'){
       makan[i]="Pizza          ";
       harga[i]=99000;}
    else if(kode_ma[i]=='B'||kode_ma[i]=='b'){
       makan[i]="Hotdog         ";
       harga[i]=15000;}
    else if(kode_ma[i]=='C'||kode_ma[i]=='c'){
       makan[i]="Burger         ";
       harga[i]=20000;}
    else if(kode_ma[i]=='D'||kode_ma[i]=='d'){
       makan[i]="Kebab          ";
       harga[i]=25000;}
    else if(kode_ma[i]=='E'||kode_ma[i]=='e'){
       makan[i]="Pasta          ";
       harga[i]=20000;}
    else if(kode_ma[i]=='F'||kode_ma[i]=='f'){
       makan[i]="Spageti        ";
       harga[i]=21000;}
    else if(kode_ma[i]=='G'||kode_ma[i]=='g'){
       makan[i]="French Fries   ";
       harga[i]=15000;}
    else if(kode_ma[i]=='H'||kode_ma[i]=='h'){
       makan[i]="Milk Shake     ";
       harga[i]=12500;}
    else if(kode_ma[i]=='I'||kode_ma[i]=='i'){
       makan[i]="Root Beer      ";
       harga[i]=15000;}
    else if(kode_ma[i]=='J'||kode_ma[i]=='j'){
       makan[i]="Coca-Cola      ";
       harga[i]=10000;}
    else if(kode_ma[i]=='K'||kode_ma[i]=='k'){
       makan[i]="Pepsi          ";
       harga[i]=10000;}
    else if(kode_ma[i]=='L'||kode_ma[i]=='l'){
       makan[i]="Vanila Float   ";
       harga[i]=10000;}
    else if(kode_ma[i]=='M'||kode_ma[i]=='m'){
       makan[i]="Blueberry Float";
       harga[i]=10000;}
    else if(kode_ma[i]=='N'||kode_ma[i]=='n'){
       makan[i]="Mint Tea       ";
       harga[i]=10000;}
    else{
       makan[i]="Kode Salah";
       harga[i]=0;}
   }
   garis();
}
   system("cls");

//1.b Jumlah
   header();
   cout<<"No.| Makanan       |  Harga  | Jumlah |    Sub       \n";
   cout<<"   | Minuman       |  Porsi  | Beli   |    Harga     \n";
   garis();

for(i=1;i<=j;i++)
   {
      sub_hrg[i]= byk_bel[i]*harga[i];
      cout<<setiosflags(ios::left)<<setw(0)<<i<<". ";
      cout<<setiosflags(ios::left)<<setw(2)<<makan[i];
      cout<<setiosflags(ios::right)<<setw(8)<<harga[i];
      cout<<setiosflags(ios::right)<<setw(8)<<byk_bel[i];
      cout<<setiosflags(ios::right)<<setw(15)<<sub_hrg[i]<<endl;
      jml_hrg=jml_hrg+sub_hrg[i];
   }
   garis();
   cout<<"                          Jumlah Harga  Rp. "<<jml_hrg<<endl;
   garis();
   cout<<"NB : isi Nama dan Alamat terlebih dahulu selanjutnya\n";
   cout<<"silahkan kirim uang muka 20% dari total biaya belanja\n";
   cout<<"sebesar Rp." <<jml_hrg*20/100;
   cout<<", pada nomor rekening 041189654202331\n";
   garis();
   cout<<"Masukan Nama           : "; cin>>nama;
   cout<<"Masukan Alamat         : "; cin>>almt;
   system("cls");

   header();
   cout<<endl;
   cout<<"Nama               : "<<nama;
   cout<<"\nAlamat tujuan      : "<<almt;
   cout<<"\nJumlah biaya       : Rp."<<jml_hrg;
   cout<<"\nUang muka          : Rp."<<jml_hrg*20/100;
   cout<<"  (telah dibayar)";
   cout<<"\nBiaya belum bayar  : Rp."<<jml_hrg-jml_hrg*20/100;
   cout<<"\nBiaya kirim        : PROMO GRATIS ONGKIR\n";
   garis();
   cout<<"           Terima kasih telah memesan\n";
   cout<<"         pesanan anda sedang dalam proses\n";
   garis();
   cout<<"Kembali ke awal "; cin>>lanjut;
        if(lanjut=='Y'||lanjut=='y')
            goto awal;
        else
            goto awal;
        system("cls");

//2. Paket
    paket:
    system("cls");
    header();
{
    cout<<endl;
    cout<<" Pilihan paket         \n"
          "1. Keluarga (hingga untuk 5  orang) \n"
          "2. Pesta    (hingga untuk 15 orang) \n";
    garis();
    cout<<"Pilih Paket :"; cin>>paket;
        if(paket=='1'||paket=='1'){
    system("cls");
    header();
    cout<<endl;
            cout<<"Anda membeli paket Keluarga dapat dinikmati\n"
                  "3 hingga 5 orang, dengan harga Rp.180.000\n"
                  "isi paket ; Pizza        1\n"
                  "            Spageti      1\n"
                  "            Fiench Frice 3\n"
                  "            Pepsi        5\n";
    garis();
            cout<<"\nNB : isi Nama dan Alamat terlebih dahulu selanjutnya\n";
            cout<<"silahkan kirim uang muka 20% dari total biaya belanja\n";
            cout<<"sebesar Rp.36000, pada nomor rekening 041189654202331\n";
            cout<<"pada nomor rekening 041189654202331\n";
            garis();
            cout<<"Masukan Nama           : "; cin>>nama;
            cout<<"Masukan Alamat         : "; cin>>almt;
            system("cls");

                header();
                cout<<endl;
                cout<<"Nama               : "<<nama;
                cout<<"\nAlamat tujuan      : "<<almt;
                cout<<"\nJumlah biaya       : Rp.180000";
                cout<<"\nUang muka          : Rp.36000";
                cout<<"  (telah dibayar)";
                cout<<"\nBiaya belum bayar  : Rp.144000";
                cout<<"\nBiaya kirim        : PROMO GRATIS ONGKIR\n";
                garis();
                cout<<"           Terima kasih telah memesan\n";
                cout<<"         pesanan anda sedang dalam proses\n";
                garis();

            cout<<"Kembali ke awal "; cin>>lanjut;
        if(lanjut=='Y'||lanjut=='y')
            goto awal;
        else
            goto awal;
        system("cls");
}

        else if (paket=='2'||paket=='2'){
    system("cls");
    header();
    cout<<endl;
            cout<<"Anda membeli paket Pesta dapat dinikmati\n"
                  "10 hingga 15 orang, dengan harga Rp.500.000\n"
                  "isi paket ; Pizza        2\n"
                  "            Hotdog       3\n"
                  "            Burger       3\n"
                  "            Spageti      3\n"
                  "            Fiench frice 5\n"
                  "            Pepsi        15\n";
    garis();
            cout<<"\nNB : isi Nama dan Alamat terlebih dahulu selanjutnya\n";
            cout<<"silahkan kirim uang muka 20% dari total biaya belanja\n";
            cout<<"sebesar Rp.100000, pada nomor rekening 041189654202331\n";
            cout<<"pada nomor rekening 041189654202331\n";
            garis();
            cout<<"Masukan Nama           : "; cin>>nama;
            cout<<"Masukan Alamat         : "; cin>>almt;
            system("cls");

                header();
                cout<<endl;
                cout<<"Nama               : "<<nama;
                cout<<"\nAlamat tujuan      : "<<almt;
                cout<<"\nJumlah biaya       : Rp.500000";
                cout<<"\nUang muka          : Rp.100000";
                cout<<"  (telah dibayar)";
                cout<<"\nBiaya belum bayar  : Rp.400000";
                cout<<"\nBiaya kirim        : PROMO GRATIS ONGKIR\n";
                garis();
                cout<<"           Terima kasih telah memesan\n";
                cout<<"         pesanan anda sedang dalam proses\n";
                garis();

            cout<<"Kembali ke awal "; cin>>lanjut;
        if(lanjut=='Y'||lanjut=='y')
            goto awal;
        else
            goto awal;
        system("cls");
}
        else {
            goto awal;}
    }
        system("cls");

//3. Hot Promo
    hotpromo:
    system("cls");
    header();
    cout<<endl;
    cout<<"Anda membeli Hot promo dapat dinikmati bersama pasangan\n"
                  "hanya dengan harga Rp.130.000\n"
                  "isi ; Pizza         1\n"
                  "      Friench Frice 2\n"
                  "      Coca-cola     2\n";
    cout<<endl;
    cout<<"Apakah anda ingin membeli [Y/T] : "; cin>>lanjut;
        if(lanjut=='Y'||lanjut=='y')
            goto lanjut;
        else
            goto awal;
        system("cls");
    lanjut:
    garis();
            cout<<"\nNB : isi Nama dan Alamat terlebih dahulu selanjutnya\n";
            cout<<"silahkan kirim uang muka 20% dari total biaya belanja\n";
            cout<<"sebesar Rp.26000, pada nomor rekening 041189654202331\n";
            cout<<"pada nomor rekening 041189654202331\n";
            garis();
            cout<<"Masukan Nama           : "; cin>>nama;
            cout<<"Masukan Alamat         : "; cin>>almt;
            system("cls");

                header();
                cout<<endl;
                cout<<"Nama               : "<<nama;
                cout<<"\nAlamat tujuan      : "<<almt;
                cout<<"\nJumlah biaya       : Rp.130000";
                cout<<"\nUang muka          : Rp.26000";
                cout<<"  (telah dibayar)";
                cout<<"\nBiaya belum bayar  : Rp.104000";
                cout<<"\nBiaya kirim        : PROMO GRATIS ONGKIR\n";
                garis();
                cout<<"           Terima kasih telah memesan\n";
                cout<<"         pesanan anda sedang dalam proses\n";
                garis();
        cout<<"Kembali ke awal "; cin>>lanjut;
        if(lanjut=='Y'||lanjut=='y')
            goto awal;
        else
            goto awal;
        system("cls");

//4. Lokasi Outlet
    lokasi:
    system("cls");
    header();
    cout<<endl;
    cout<<  "                   outlet cabang 1                   \n"
            "                Jl.S.Supriadi no.0896                \n"
            "                                                     \n"
            "                   outlet cabang 2                   \n"
            "               JL.SukarnoHatta no.5420               \n"
            "                                                     \n"
            "                   outlet cabang 3                   \n"
            "                  Jl.Sutoyo no.2331                  \n";
    garis();
    cout<<"Kembali ke awal "; cin>>lanjut;
        if(lanjut=='Y'||lanjut=='y')
            goto awal;
        else
            goto awal;
        system("cls");


//5. Informasi
    informasi:
    system("cls");
    header();
    cout<<endl;
    cout<<"1. Pembayaran uang muka sebesar 20% dari total biaya     \n"
          "   belanja,   dan    silahkan   kirim   pada   nomor     \n"
          "   rekening kami.                                        \n"
          "2. Masukan nama dan alamat dengan  tepat  dan  jelas.    \n"
          "3. Pesanan  tiba  dalam    30  menit  setelah  staff     \n"
          "   mengkonfirmasi    pesanan   Anda   atau    sesuai     \n"
          "   waktu yang ditentukan.\n"
          "4. Jika 30 menit,pesanan anda belum diteima silahkan     \n"
          "   melakukan   laporan    pada    layanan  pengaduan     \n"
          "5. Jika staff kami telah mengantar silahkan mengecek     \n"
          "   bukti     pembayaran     dan     menandatanginnya,    \n"
          "   jika tidak sesuai anda  dapat  mengadu pada  pada     \n"
          "   layanan pengaduan.\n";
    garis();
    cout<<"Kembali ke awal "; cin>>lanjut;
        if(lanjut=='Y'||lanjut=='y')
            goto awal;
        else
            goto awal;
        system("cls");
//6. layanan penganduan
    layanan:
    system("cls");
    header();
    cout<<endl;
    cout<<"Nama              : ";cin>>nama;
    cout<<"Email             : ";cin>>email;
    cout<<"Layanan Pengaduan : ";cin>>pengaduan;
    garis();
    cout<<"Terima kasih, pengaduan anda sedang kami proses\n"
          "kami akan memberi tanggapan pada email anda.\n";
    garis();
    cout<<"Kembali ke awal "; cin>>lanjut;
        if(lanjut=='Y'||lanjut=='y')
            goto awal;
        else
            goto awal;
        system("cls");

//7. konfirmasi keluar program
   keluar:
   system("cls");
   header();
   cout<<endl;
   cout<<"Apakah anda ingin keluar [Y/T] : "; cin>>lagi;
        if(lagi=='Y'||lagi=='y')
            goto selesai;
        else if(lagi=='T'||lagi=='t')
            goto awal;
        else
            goto keluar;

   selesai:
   system("cls");
   header();
   cout<<endl;
   cout<<"terima kasih telah berkunjung";

   getch();
}
