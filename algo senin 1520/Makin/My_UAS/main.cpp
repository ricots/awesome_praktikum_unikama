#include <iostream>
#include <conio.h>
#include <math.h>
#include <stdlib.h>

using namespace std;

int main()
{
int Pilihan;
double P,ap,Tot,etj,aj,byr,kembali;
char mad;
    do
    {
    system("cls");
    cout<<"Selamat Datang di Waroeng Steak and Shake\n";
    cout<<"-----------------------------------------\n";
    cout<<"    Jl. Soekarno-Hatta No.14 Malang      \n";
    cout<<"-----------------------------------------\n";
    cout<<"\n";
    cout<<"=======================\n";
    cout<<"| Daftar Menu Makanan |\n";
    cout<<"=======================\n";
    cout<<"|  1. Chicken         |\n";
    cout<<"|  2. Sirloin         |\n";
    cout<<"|  3. Tenderloin      |\n";
    cout<<"|  4. Chicken Double  |\n";
    cout<<"|  5. Sirloin Double  |\n";
    cout<<"======================\n";

    cout<<"Masukan Pilihan : ";cin>>Pilihan;
    system("cls");

    switch(Pilihan)
    {
    case 1:
    system("cls");
    cout<<"Anda memilih makanan chicken \n";
    cout<<"-----------------------------------\n";
    cout<<"Harga  : Rp. 15.000,00   \n";
    cout<<"jumlah : ";cin>>P;
    system("cls");

    int Minuman;
    cout<<"=====================\n";
    cout<<"|   Menu Minuman    |\n";
    cout<<"=====================\n";
    cout<<"|     Tersedia      |\n";
    cout<<"---------------------\n";
    cout<<"|  1.Air Putih      |\n";
    cout<<"|  2.Es Teh/Jeruk   |\n";
    cout<<"|  3.Aneka Jus      |\n";
    cout<<"---------------------\n";
    cout<<"Masukan Pilihan : ";cin>>Minuman;
    switch(Minuman)
    {
    case 1:
    system("cls");
    cout<<"   Minuman Anda Adalah :    \n";
    cout<<"----------------------------\n";
    cout<<"        Air Putih           \n";
    cout<<"----------------------------\n";
    cout<<"Harga  : Rp. 2.000,00\n";
    cout<<"Jumlah : ";cin>>ap;
    system("cls");
    break;
    case 2:
    system("cls");
    cout<<"    Minuman Anda Adalah :    \n";
    cout<<"----------------------------\n";
    cout<<"       Es Teh/Jeruk         \n";
    cout<<"----------------------------\n";
    cout<<"Harga  : Rp. 3.000,00\n";
    cout<<"Jumlah : ";cin>>etj;
    system("cls");
    break;
    case 3:
    system("cls");
    cout<<"    Minuman Anda Adalah :  \n";
    cout<<"----------------------------\n";
    cout<<"         Aneka Jus          \n";
    cout<<"----------------------------\n";
    cout<<"Harga  : Rp. 5.000,00\n";
    cout<<"Jumlah : ";cin>>aj;
    system("cls");
    }
    Tot=(15000*P)+((2000*ap)+(3000*etj)+(5000*aj));
    cout<<"Total Pembayaran = Rp."<<Tot<<",00\n";
    cout<<"Uang Bayar       = Rp.";cin>>byr;
    kembali = byr-Tot;
    cout<<"Kembalian        = Rp."<<kembali<<endl;
    cout<<"\n";
    cout<<"Terima Kasih Telah Mengunjungi Waroeng Steak and Shake Kami\n";
    cout<<"___________________________________________________________\n";
    cout<<"Input data lagi Y/T :";
    cin>>mad;
    break;
    case 2:
    system("cls");
    cout<<"Anda memilih makanan sirloin \n";
    cout<<"-----------------------------------\n";
    cout<<"Harga  : Rp. 20.000,00\n";
    cout<<"Jumlah : ";cin>>P;
    system("cls");

    cout<<"=====================\n";
    cout<<"|   Menu Minuman    |\n";
    cout<<"=====================\n";
    cout<<"|     Tersedia      |\n";
    cout<<"---------------------\n";
    cout<<"|  1.Air Putih      |\n";
    cout<<"|  2.Es Teh/Jeruk   |\n";
    cout<<"|  3.Aneka Jus      |\n";
    cout<<"---------------------\n";
    cout<<"Masukan Pilihan : ";cin>>Minuman;
    switch(Minuman)
    {
    case 1:
    system("cls");
    cout<<"    Minuman Anda Adalah :   \n";
    cout<<"----------------------------\n";
    cout<<"        Air Putih           \n";
    cout<<"----------------------------\n";
    cout<<"Harga  : Rp. 2.000,00\n";
    cout<<"Jumlah : ";cin>>ap;
    system("cls");
    break;
    case 2:
    system("cls");
    cout<<"    Minuman Anda Adalah :   \n";
    cout<<"----------------------------\n";
    cout<<"       Es Teh/Jeruk         \n";
    cout<<"----------------------------\n";
    cout<<"Harga  : Rp. 3.000,00\n";
    cout<<"Jumlah : ";cin>>etj;
    system("cls");
    break;
    case 3:
    system("cls");
    cout<<"    Minuman Anda Adalah :   \n";
    cout<<"----------------------------\n";
    cout<<"         Aneka Jus          \n";
    cout<<"----------------------------\n";
    cout<<"Harga  : Rp. 5.000,00\n";
    cout<<"Jumlah : ";cin>>aj;
    system("cls");
    }

    Tot=(20000*P)+((2000*ap)+(3000*etj)+(5000*aj));
    cout<<"Total Pembayaran = Rp."<<Tot<<",00\n";
    cout<<"Uang Bayar       = Rp.";cin>>byr;
    kembali = byr-Tot;
    cout<<"Kembalian        = Rp."<<kembali<<endl;
    cout<<"\n";
    cout<<"Terima Kasih Telah Mengunjungi Waroeng Steak and Shake Kami\n";
    cout<<"___________________________________________________________\n";
    cout<<"Input data lagi Y/T :";
    cin>>mad;
    break;
    case 3:
    system("cls");
    cout<<"Anda memilih makanan tenderloin\n";
    cout<<"-----------------------------------\n";
    cout<<"Harga  : Rp. 25.000,00\n";
    cout<<"Jumlah : ";cin>>P;
    system("cls");

    cout<<"=====================\n";
    cout<<"|   Menu Minuman    |\n";
    cout<<"=====================\n";
    cout<<"|     Tersedia      |\n";
    cout<<"---------------------\n";
    cout<<"|  1.Air Putih      |\n";
    cout<<"|  2.Es Teh/Jeruk   |\n";
    cout<<"|  3.Aneka Jus      |\n";
    cout<<"---------------------\n";

    cout<<"Masukan Pilihan : ";cin>>Minuman;
    switch(Minuman)
    {
    case 1:
    system("cls");
    cout<<"    Minuman Anda Adalah :   \n";
    cout<<"----------------------------\n";
    cout<<"        Air Putih           \n";
    cout<<"----------------------------\n";
    cout<<"Harga  : Rp. 2.000,00\n";
    cout<<"Jumlah : ";cin>>ap;
    system("cls");
    break;
    case 2:
    system("cls");
    cout<<"    Minuman Anda Adalah :   \n";
    cout<<"----------------------------\n";
    cout<<"       Es Teh/Jeruk         \n";
    cout<<"----------------------------\n";
    cout<<"Harga  : Rp. 3.000,00\n";
    cout<<"Jumlah : ";cin>>etj;
    system("cls");
    break;
    case 3:
    system("cls");
    cout<<"    Minuman Anda Adalah :   \n";
    cout<<"----------------------------\n";
    cout<<"         Aneka Jus          \n";
    cout<<"----------------------------\n";
    cout<<"Harga  : Rp. 5.000,00\n";
    cout<<"Jumlah : ";cin>>aj;
    system("cls");
    }
    Tot=(25000*P)+((2000*ap)+(3000*etj)+(5000*aj));
    cout<<"Total Pembayaran = Rp."<<Tot<<",00\n";
    cout<<"Uang Bayar       = Rp.";cin>>byr;
    kembali = byr-Tot;
    cout<<"Kembalian        = Rp."<<kembali<<endl;
    cout<<"\n";
    cout<<"Terima Kasih Telah Mengunjungi Waroeng Steak and Shake Kami\n";
    cout<<"___________________________________________________________\n";
    cout<<"Input data lagi Y/T :";
    cin>>mad;
    break;
    case 4:
    system("cls");
    cout<<"Anda memilih makanan chicken double\n";
    cout<<"-----------------------------------\n";
    cout<<"Harga : Rp. 30.000,00\n";
    cout<<"Jumlah : ";cin>>P;
    system("cls");

    cout<<"=====================\n";
    cout<<"|   Menu Minuman    |\n";
    cout<<"=====================\n";
    cout<<"|     Tersedia      |\n";
    cout<<"---------------------\n";
    cout<<"|  1.Air Putih      |\n";
    cout<<"|  2.Es Teh/Jeruk   |\n";
    cout<<"|  3.Aneka Jus      |\n";
    cout<<"---------------------\n";

    cout<<"Masukan Pilihan : ";cin>>Minuman;
    switch(Minuman)
    {
    case 1:
    system("cls");
    cout<<"    Minuman Anda Adalah :  \n";
    cout<<"----------------------------\n";
    cout<<"        Air Putih           \n";
    cout<<"----------------------------\n";
    cout<<"Harga : Rp. 2.000,00\n";
    cout<<"Jumlah : ";cin>>ap;
    system("cls");
    break;
    case 2:
    system("cls");
    cout<<"     Minuman Anda Adalah :  \n";
    cout<<"----------------------------\n";
    cout<<"       Es Teh/Jeruk         \n";
    cout<<"----------------------------\n";
    cout<<"Harga : Rp. 3.000,00\n";
    cout<<"Jumlah : ";cin>>etj;
    system("cls");
    break;
    case 3:
    system("cls");
    cout<<"     Minuman Anda Adalah :  \n";
    cout<<"----------------------------\n";
    cout<<"         Aneka Jus          \n";
    cout<<"----------------------------\n";
    cout<<"Harga : Rp. 5.000,00\n";
    cout<<"Jumlah : ";cin>>aj;
    system("cls");
    }
    Tot=(30000*P)+((2000*ap)+(3000*etj)+(5000*aj));
    cout<<"Total Pembayaran = Rp."<<Tot<<",00\n";
    cout<<"Uang Bayar       = Rp.";cin>>byr;
    kembali = byr-Tot;
    cout<<"Kembalian        = Rp."<<kembali<<endl;
    cout<<"\n";
    cout<<"Terima Kasih Telah Mengunjungi Waroeng Steak and Shake Kami\n";
    cout<<"___________________________________________________________\n";
    cout<<"Input data lagi Y/T :";
    cin>>mad;
    break;
    case 5:
    system("cls");
    cout<<"Anda memilih makanan sirloin double\n";
    cout<<"-----------------------------------\n";
    cout<<"Harga  : Rp. 40.000,00\n";
    cout<<"Jumlah : ";cin>>P;
    system("cls");

    cout<<"=====================\n";
    cout<<"|   Menu Minuman    |\n";
    cout<<"=====================\n";
    cout<<"|     Tersedia      |\n";
    cout<<"---------------------\n";
    cout<<"|  1.Air Putih      |\n";
    cout<<"|  2.Es Teh/Jeruk   |\n";
    cout<<"|  3.Aneka Jus      |\n";
    cout<<"---------------------\n";

    cout<<"Masukan Pilihan : ";cin>>Minuman;
    switch(Minuman)
    {
    case 1:
    system("cls");
    cout<<"    Minuman Anda Adalah   : \n";
    cout<<"----------------------------\n";
    cout<<"        Air Putih           \n";
    cout<<"----------------------------\n";
    cout<<"Harga  : Rp. 2.000,00\n";
    cout<<"Jumlah : ";cin>>ap;
    system("cls");
    break;
    case 2:
    system("cls");
    cout<<"    Minuman Anda Adalah   : \n";
    cout<<"----------------------------\n";
    cout<<"       Es Teh/Jeruk         \n";
    cout<<"----------------------------\n";
    cout<<"Harga  : Rp. 3.000,00\n";
    cout<<"Jumlah : ";cin>>etj;
    system("cls");
    break;
    case 3:
    system("cls");
    cout<<"    Minuman Anda Adalah   : \n";
    cout<<"----------------------------\n";
    cout<<"         Aneka Jus          \n";
    cout<<"----------------------------\n";
    cout<<"Harga  : Rp. 5.000,00\n";
    cout<<"Jumlah : ";cin>>aj;
    system("cls");
    }
    Tot=(40000*P)+((2000*ap)+(3000*etj)+(5000*aj));
    cout<<"Total Pembayaran = Rp."<<Tot<<",00\n";
    cout<<"Uang Bayar       = Rp.";cin>>byr;
    kembali = byr-Tot;
    cout<<"Kembalian        = Rp."<<kembali<<endl;
    cout<<"\n";
    cout<<"Terima Kasih Telah Mengunjungi Waroeng Steak and Shake Kami\n";
    cout<<"___________________________________________________________\n";
    cout<<"Input data lagi Y/T : ";
    cin>>mad;
    break;
    default :
    cout<<"Anda Hanya Bisa Memilih Menu Makanan Yang Sudah Tersedia. (Pilih 1-5)!!!\n";
    }
    }
    while( mad/='y');
         ( mad/='T');

    return 0;
}

