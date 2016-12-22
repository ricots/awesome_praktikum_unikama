#include <conio.h>
#include <stdio.h>
#include <windows.h>
#include <iostream>
#include <iomanip>

using namespace std;

    void gotoxy(int x, int y){
    COORD coord;
    coord.X = x;
    coord.Y = y;
    SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE),coord);}

    int main()
    {
    char nama [20],lagi;
    string jenis[10];
    int a,menu,harga[10],porsi[10],bayar,kode;
    float totalharga,total,uang,kembalian;

    atas:
    system("cls");
            cout<<"                      Kantin UNIKAMA"<<endl;
            cout<<"=*********************************************************************="<<endl;
                cout<<">> MAKANAN :                       >> MINUMAN :                  ||\n";
              cout<<"|| 1. Nasi Goreng Gila  Rp.10000,- || 4. Jus Apel        Rp.5000,- || \n";
              cout<<"|| 2. Bakso             Rp.12000,- || 5. Jus Mangga      Rp.6000,- || \n";
              cout<<"|| 3. Mie Ayam          Rp. 9000,- || 6. Capucino        Rp.5000,- || \n";

    cout<<"\nNama Pemesan          :";
    cin.getline(nama,sizeof(nama));
    cout<<"\nBanyak Pesanan           : ";cin>>menu;
        for(a=1;a<=menu;++a)
        {
                    cout<<"\n=******************="<<endl;
                    cout<<"Pesanan Ke "<<a<<endl;
                    cout<<"=******************=\n"<<endl;
                    cout<<"Masukkan Nomor Makanan/Minuman : ";cin>>kode;
                    cout<<"Jumlah Pesan                   : ";cin>>porsi[a];

                    if (kode==1){
                        jenis[a]="Nasi goreng gila";
                        harga[a]=10000;}

                    else if (kode==2){
                        jenis[a]="Bakso";
                        harga[a]=12000;}

                    else if (kode==3){
                        jenis[a]="Mie Ayam";
                        harga[a]=9000;}

                    else if (kode==4){
                        jenis[a]="Jus Apel";
                        harga[a]=5000;}

                    else if (kode==5){
                        jenis[a]="Jus Mangga";
                        harga[a]=6000;}

                    else if (kode==6){
                        jenis[a]="Cappucino";
                        harga[a]=5000;}

                        else
                        {cout<<"Salah!!,Input Kode Lagi!!"<<endl;
                         goto atas;}

                    }

                system("cls");
                cout<<"                     Bukti Pemesanan Makanan                         "<<endl;
                cout<<"                         Kantin UNIKAMA                          "<<endl;
                cout<<"=*********************************************************************="<<endl;
                cout<<"Nama Pemesan  : "<<nama<<endl;
                cout<<"======================================================================="<<endl;
                cout<<"No.       Nama          Harga        Jumlah      Subtotal             "<<endl;
                cout<<"          Makanan       Makanan      Pesan                            "<<endl;
                cout<<"======================================================================="<<endl;

                totalharga=0;
                for(a=1;a<=menu;++a)
                    {
                    gotoxy(1,a+10);  cout<<a;
                    gotoxy(5,a+10);  cout<<jenis[a];
                    gotoxy(25,a+10); cout<<harga[a];
                    gotoxy(39,a+10); cout<<porsi[a];
                    total=porsi[a]*harga[a];
                    gotoxy(51,a+10); cout<<total;
                    cout<<endl;
                    totalharga=totalharga+total;
                    }
                cout<<"\n====================================================================\n"<<endl;
                cout<<"                                Total Bayar     :Rp. "<<totalharga<<endl;
                cout<<"                                Uang Bayar      :Rp. ";cin>>uang;
                kembalian=uang-totalharga;
                cout<<"                                Uang Kembali    :Rp. "<<kembalian<<endl;


                    cout<<"Ingin Pesan lagi [Y]/[T]? :";cin>>lagi;
                    if(lagi=='Y'||lagi=='y')
                    goto atas;
                    else
                    system("cls");
                    }
