#include <iostream>
#include <conio.h>
#include <stdlib.h>
#include <string.h>

using namespace std;

int main()
{
char nma_pen[50],waktu,maskapai[50],pil,waktu2[50],rute[50],jawab,kode,ch,jr;
int i,harga,bayar,total,u_byr,u_kmb,beli;
string us1,us2,pss1,pss2,nm,em,ttl;

system("cls");
cout << "============================\n";
cout << "Selamat Datang di Registrasi\n";
cout << "============================\n";

nm  ="";
cout<<"Nama Lengkap     : ";
cin >> nm ;

//em  ="";
//cout<<"Email Anda       : ";
//cin >>em;

ttl ="";
cout<<"Tempat tgl lahir : ";
cin >>ttl;

us2   ="";
cout <<"User Name        : ";
cin  >>us2;

pss2  ="";
cout <<"Password         : ";

    ch = _getch();
    while(ch != 13)
    {
        pss2.push_back(ch);
        cout << '*';
        ch = _getch();
    }

system("cls");
login:

cout << "============================\n";
cout << "Selamat Datang di Form Login \n";
cout << "============================\n";
    for (i=1; i<=3; i++)
    {
       us1  = "";
       pss1 = "";
       cout << "Username : ";
       cin  >> us1;
       cout << "Password : ";

        ch = _getch();
            while(ch != 13)
            {
            pss1.push_back(ch);
            cout << '*';
            ch = _getch();
            }

        if (us2==us1 && pss2==pss1)
      {
         cout<<"\n\nAnda berhasil login. \n" << endl;
         goto rute;
      }
        else
      {
        cout <<"\n\nMaaf Username & Password anda masukan salah.\n\n";
        goto login;
      }
    }
rute:
system("cls");
cout<<"\n ============Travel============ "<<endl;
cout<<"\n ___________________________________ ";
cout<<"\n|            Penerbangan           |" ;
cout<<"\n| 1.MLG-JKT | Malang  - Jakarta    |";
cout<<"\n| 2.JKT-MLG | Jakarta - Malang     |";
cout<<"\n| 3.MLG-PPA | Malang  - Papua      |";
cout<<"\n| 4.MLG-PDG | Malang  - Padang     |";
cout<<"\n| 5.MLG-KMN | Malang  - Kalimantan |";
cout<<"\n|___________________________________";
cout<<"\n  masukan piliha anda :  ";
cin>>jawab;
if(jawab=='1' || jawab=='1')
    strcpy(rute,"MLG-JKT");
    if (jawab=='1'){
    goto jp;
    }
else if (jawab=='2'|| jawab=='2')
    strcpy(rute,"JKT-MLG");
    if (jawab=='2'){
    goto jp;
    }
else if (jawab=='3'|| jawab=='3')
    strcpy(rute,"MLG-PPA");
    if (jawab=='3'){
    goto jp;
    }
else if (jawab=='4'|| jawab=='4')
    strcpy(rute,"MLG-PDG");
    if (jawab=='4'){
    goto jp;
    }
else if (jawab=='5'|| jawab=='5')
    strcpy(rute,"MLG-KMN");
    if (jawab=='5'){
    goto jp;
    }
else{
    system("cls");
    cout<<   "Inputan Salah,Tekan Sembarang untuk kembali";
    getch();
    goto rute;
    }
jp:
system("cls");
cout<<"\n Jadwal Penerbangan "<<endl;
cout<<"\n ___________________________________________________ ";
cout<<"\n|Maskapai           |Jam Keberangkatan | Harga       |";
cout<<"\n|1.Garuda Indonesia |     Pagi         |Rp 4.000.000 |";
cout<<"\n|                   |     Siang        |Rp 5.000.000 |";
cout<<"\n|2.Sriwijaya Air    |     Pagi         |Rp 3.000.000 |";
cout<<"\n|                   |     Siang        |Rp 3.500.000 |";
cout<<"\n|3.Lion Air         |     Pagi         |RP 2.000.000 |";
cout<<"\n|                   |     Siang        |Rp 2.500.000 |";
cout<<"\n|___________________________________________________ |";

cout<<"\n Nama anda               :  ";
cin>>nma_pen;
cout<<"\n Maskapai[1/2/3]         :  ";
cin>>kode;
cout<<"\n Waktu berangkat[P/S]    :  ";
cin>>waktu;

if(kode=='1')
{
  strcpy(maskapai,"Garuda Indonesia");
if(waktu=='p' ||waktu=='P' ){
    strcpy(waktu2,"pagi <07:00-12:00>");
    harga=4000000;}
else if(waktu=='s' ||waktu=='S'){
    strcpy(waktu2,"Siang <13:00-17:00>");
    harga=5000000;}
else{
    system("cls");
    cout<<"\a\n";
    cout<<"Inputan Waktu Berangkat Tidak Sesuai,Tekan Sembarang untu kembali";
    getch();
    goto jp;
}
}

else if(kode=='2')
{
    strcpy(maskapai,"Sriwijaya Air");
if(waktu=='p' ||waktu=='P' ){
    strcpy(waktu2,"pagi <07:00-12:00>");
    harga=3000000;}
else if(waktu=='s' ||waktu=='S'){
    strcpy(waktu2,"Siang <13:00-17:00>");
    harga=3500000;}
else{
    system("cls");
    cout<<"\a\n";
    cout<<"Inputan Waktu Berangkat Tidak Sesuai,Tekan Sembarang untu kembali";
    getch();
    goto jp;
}
}

else if(kode=='3')
{
    strcpy(maskapai,"Lion Air");
if(waktu=='p' ||waktu=='P' ){
    strcpy(waktu2,"pagi <07:00-12:00>");
    harga=2000000;}
else if(waktu=='s' ||waktu=='S'){
    strcpy(waktu2,"Siang <13:00-17:00>");
    harga=2500000;}
}

else{
    system("cls");
    cout<<"\a\n";
    cout<<"Inputan Waktu Berangkat Tidak Sesuai,Tekan Sembarang untu kembali";
    getch();
    goto jp;
}
system("cls");
lagi:
cout<<"\n\n";
cout<<"                               Travel Ok!!                         \n";
cout<<"\n";
cout<<"        ===========================================================\n";
cout<<"        Nama               : "<<nma_pen<<"\n";
cout<<"        Maskapai           : "<<maskapai<<"\n";
cout<<"        Tujuan             : "<<rute<<"\n";
cout<<"        Waktu              : "<<waktu2<<"\n";
cout<<"        Harga  Tiket       : "<<harga<<"\n";
cout<<"        Jumlah Tiket       : ";cin>>beli;

cout<<"        ===========================================================\n";


total=harga*beli;

cout<<"\n      ===========================================================\n";
cout<<"          Total Bayar         : Rp."<<total<<"\n";
cout<<"        ===========================================================\n";
cout<<"          Uang Bayar          : Rp.";cin>>u_byr;

    if (u_byr<total)
    {goto lagi;
    u_byr=0 ;
    cout<<u_byr;
    }
    else
    u_kmb=u_byr-total;
cout<<"          Uang Kembali        : Rp. "<<u_kmb<<"\n";
cout<<"        ==========================================================\n";
cout<<"\n";
cout<<"\n";
cout<<"        ==========================================================\n";
cout<<"            Silakan melakukan transaksi ke no rekening kami       \n";
cout<<"                             019456798334                         \n";
cout<<"         Jika terlambat data pembelian dan akun anda akan terhapus\n";
cout<<"        ===========TERIMA KASIH ATAS KUNJUNGAN ANDA===============\n";
cout<<"\n";
cout<<"          Input Data Lagi [Y/T] :";
cin>>jawab;
    if(jawab=='Y'||jawab=='y')
    goto jp;
    else if(jawab=='T'||jawab=='t')
    goto end;

    end:
return 0;
}







