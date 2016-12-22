#include <stdio.h>
#include <conio.h>
#include <iostream>
using namespace std;
int main ()
{
 char LG,np[20],bl[20],al[20],pt[20],kd,bnk,*bnks,*jns,*nb,bk,yes,hp[12],hri[15],tgl[2],thn[4],bln[20];
 long int hrg,jb,kembalian,tot,bayar,onr;



cout<<"\n  Sihlakan anda melakukan Register terlebih dahulu..!!!\n"<<endl;
cout<<" Masukan Nama anda     : ";cin>>np>>bl;
cout<<" Masukan Alamat anda   : ";cin>>al;
cout<<" Masukan No Hp anda    : ";cin>>hp;
atas :
cout<<"\n________\" WELCOME Tn."<<np<<" "<<bl<<"\"__________\n"<<endl;
cout<<"        TOKO BUKU \"ILMU CAHAYA\""<<endl;
cout<<" Jl. Perusahaan Karanglo no 16 – Losawi"<<endl;
cout<<"      No. Telp 081233435263"<<endl;
cout<<"       SINGOSARI - MALANG"<<endl;
cout<<"--------------------------------------------"<<endl;
cout<<endl;
cout<<"--------------[ PILIHAN BUKU ]--------------\n"<<endl;
cout<<" A. Cerita Anak"<<endl;
cout<<"         a. Comic        Rp. 90000"<<endl;
cout<<"         b. Dongeng      Rp. 40000"<<endl;
cout<<" B. Novel"<<endl;
cout<<"         a. Cinta        Rp. 150000"<<endl;
cout<<"         b. Misteri      Rp. 120000"<<endl;
cout<<" C. Komputer "<<endl;
cout<<"         a. C++          Rp. 125000"<<endl;
cout<<"         b. Delphi       Rp. 130000"<<endl;
cout<<"-------------------------------------------"<<endl;
cout<<"\n Pilih Jenis Buku  [ A | B | C ]  : " ;cin>>kd;
cout<<"\n Pilih judul buku  [ a | b ]      : " ;cin>>bk;
cout<<"-------------------------------------------"<<endl;
if (kd=='A'||kd=='a')
{
      jns="Cerita Anak";
       if (bk=='a')
{

           nb="Comic";
        hrg=90000;
      }
       else
        {
            nb="dongeng";
            hrg=40000;
        }
}
else if (kd=='B'||kd=='b')
{
   jns="Novel";
        if (bk=='a')
          {
              nb="Cinta";
               hrg=150000;
            }
                else
              {
                   nb="Misteri";
                   hrg=120000;
               }
}
else
  {
        jns="Komputer";
           if (bk=='a')
              {
                      nb="C++";
                      hrg=125000;
                       }
                           else
                        {
                         nb="Delphi";
                         hrg=130000;
                        }
            }
cout<<""<<endl;
bayar:
cout<<""<<endl;
cout<<" Nama                : Tn. "<<np<<" "<<bl<<endl;
cout<<" Alamat              : "<<al<<endl;
cout<<" No Hp               : "<<hp<<endl;
cout<<" Jenis buku          : "<<jns<<endl;
cout<<" Judul buku          : "<<nb<<endl;
cout<<" Harga               : Rp. "<<hrg<<endl;
cout<<" Jumlah Beli         : ";cin>>jb;
onr = jb*15000;
cout<<" Ongkir              : Rp. "<<onr<<endl;
tot=hrg*jb + onr;
cout<<" Total Bayar         : Rp. "<<tot<<endl;
cout<<" Transfer ke BNI      "<<endl;
cout<<" Atas nama           : Mukidi \n No Rekening         : 0178305704" <<endl;
cout<<" Hari/Tgl pengiriman : " ;cin>>hri>>tgl>>bln>>thn;
cout<<""<<endl;
cout<<"\n \" Kami akan melakukan pengiriman 2 hari stelah pembelian berdasarkan data\n                 yang telah anda inputkan \"\n"<<endl;
cout<<"\n-------------------------------------------------\n"<<endl;
cout<<"\n--Terima Kasih telah berbelanja di toko \"ILMU CAHAYA\"--\n"<<endl;
cout<<"          Anda Ingin beli Buku lagi...????"<<endl;
cout<< "             Ketik Y Jika ingin."<<endl;
cout<< "             Ketik N Jika Tidak."<<endl;
cout<<" "<<endl;
cout<<"                Ketik Y atau N : "; cin>>yes;

if(yes=='Y'||yes=='y')
{

goto atas;
}
else if(yes=='N'||yes=='n')
{

cout<<"\n THANK YOU :D";
}
else{

cout<<"\n THANK YOU :D";


}

getch();
}

