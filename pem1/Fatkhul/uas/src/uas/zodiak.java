package uas;

import javax.swing.JOptionPane;

	public class zodiak {
		
		public void ramal (){
			method call = new method();
			 JOptionPane.showMessageDialog(null, "ramalan \n program ramalan ini hanya untuk tahun kelahiran 1980 - 2016 \n kami tidak bertanggung jawab atas hasil ramalan!! "); 
			 call.thn=JOptionPane.showInputDialog(" masukkan tahun  ");
			 int a = Integer.parseInt(call.thn);
			 if (a >= 1980 && a <= 2016 ) {
		          JOptionPane.showMessageDialog(null, "tahun lahir sesuai");
			 }
			 else  {
					JOptionPane.showMessageDialog(null, "tahun kelahiran tidak sesuai ");
					System.exit(0);
				}
			   
		     }
		
		public void ramal2(){
			method call = new method();
		
			call.tgl1= JOptionPane.showInputDialog("masukkan tanggal lahir ");
			int tanggal= Integer.parseInt(call.tgl1);
			
			call.bln = JOptionPane.showInputDialog("masukkan bulan ");
			int bulan = Integer.parseInt(call.bln);
			
			if ((tanggal >=22 && bulan==12) ||(tanggal <=20 && bulan == 1))  {
				JOptionPane.showMessageDialog(null, "Ramalan Zodiak Capricon (22 Desember - 20 Januari)");
				System.out.println("Nama : " + call.nm1);
		        System.out.println("Tanggal lahir : " + call.tgl1);
		        System.out.println("Bulan Lahir : " + call.bln);
		        System.out.println("Tahun kelahiran: "+ call.thn);
		        System.out.println("\n");
		        System.out.println("Zodiak : CAPRICON");
		        System.out.println();
		        System.out.println("Keunggulanmu terletak pada kemampuanmu tetap tampil baik sekalipun kamu sedang merasa ");
		        System.out.println("tertekan. Karena itu, jika hari ini kamu menemukan ada seorang yang sengaja ");
		        System.out.println("menjatuhkanmu agar kamu jadi ngga bisa prima, jangan pedulikan dan tetap tunjukkan yang terbaik.");
		        System.out.println("Kesehatan  : Jangan sampai kurang tidur.");
		        System.out.println("Keuangan   : Akan ada penambahan.");
		        System.out.println("Asmara     : Diam-diam ada yang mengagumimu.");
		        System.out.println("Kepribadian: Walau tampak luar kamu sering kali terlihat seperti anak-anak, ternyata dalam");
		        System.out.println("bersikap pemikiranmu cukup dewasa.");
		        System.out.println();
			}
			
			
			else if ((tanggal >=21 && bulan==1) ||(tanggal <=19 && bulan == 2)  ) {
				JOptionPane.showMessageDialog(null, "RAMALAN Zodiak Aquarius (21 Januari - 19 Februari)");
				System.out.println("Nama : " + call.nm1);
		        System.out.println("Tanggal lahir : " + call.tgl1);
		        System.out.println("Bulan Lahir : " + call.bln);
		        System.out.println("Tahun kelahiran: "+ call.thn);
		        System.out.println("Zodiak : AQUARIUS");
		        System.out.println("\n");
		        System.out.println("Hati-hati dengan perasaanmu hari ini yang cenderung lagi super sensitif. Kalau kamu ngga");
		        System.out.println("bisa sedikit cuek, bakal ada orang yang benar-benar menyinggungmu dan sulit kamu  ");
		        System.out.println("maafkan. Tapi ngapain juga sih ngurusin orang usil kayak gitu? Lebih baik masuk kuping ");
		        System.out.println("kanan dan keluar kuping kiri");
		        System.out.println("Kesehatan  : Jangan lupa minum vitamin");
		        System.out.println("Keuangan   : Jangan suka boros donk");
		        System.out.println("Asmara     : Kalau perasaan memang sulit dibohongi");
		        System.out.println("Kepribadian: Sesekali waktu boleh kok memanjakan diri dan ngga harus selalu tenggelam dengan kesibukan.");
		        System.out.println();
			}
			else if((tanggal >=20 && tanggal <=28 && bulan==2) ||(tanggal <=20 && bulan == 3)) {
				JOptionPane.showMessageDialog(null, "Ramalan Zodiak Pisces  (20 Februari - 20 Maret)");
				System.out.println("Nama : " + call.nm1);
		        System.out.println("Tanggal lahir : " + call.tgl1);
		        System.out.println("Bulan Lahir : " + call.bln);
		        System.out.println("Tahun kelahiran: "+ call.thn);
		        System.out.println("\n");
		        System.out.println("Zodiak : PISCES");
		        System.out.println();
		        System.out.println("Prestasi yang gemilang bisa kamu dapatkan kalau kamu lebih menekuni apa yang sudah ");
		        System.out.println("kamu jalankan. Jangan sekedar keinginan belaka yang ngga diikuti sama tindakan   ");
		        System.out.println("donk! Coba deh lebih sepenuh hati kalau kamu benar-benar ingin mendapatkannya.");
		        System.out.println("Kesehatan  : Sedikit flu.");
		        System.out.println("Keuangan   : Dompet mulai menipis.");
		        System.out.println("Asmara     : Lagi terasa indah.");
		        System.out.println("Kepribadian: Berikan yang terbaik buat orang-orang yang sudah berjasa padamu. Jangan ");
		        System.out.println("bagai kacang lupa kulitnya.");
		        System.out.println();
			}
		    
		     else if((tanggal >=21 && bulan==3) ||(tanggal <=19 && bulan == 4)){
				JOptionPane.showMessageDialog(null, "(Ramalan Zodiak Aries (21 Maret - 19 April)");
				System.out.println("Nama : " + call.nm1);
		        System.out.println("Tanggal lahir : " + call.tgl1);
		        System.out.println("Bulan Lahir : " + call.bln);
		        System.out.println("Tahun kelahiran: "+ call.thn);
			    System.out.println("Zodiak : ARIES");
			    System.out.println();
			    System.out.println("Walaupun banyak berita yang kamu dengar dari orang-orang di sekelilingmu tentang orang  ");
			    System.out.println("yang lagi dekat denganmu, tapi jangan langsung percaya begitu saja. Boleh menjadi lebih    ");
			    System.out.println("waspada, tapi jangan sampai langsung punya anggapan berlebihan terhadapnya. Lebih baik ");
			    System.out.println("kamu cari tahu saja dulu.");
			    System.out.println("Kesehatan: Kalau memang ngga enak badan, coba periksa ke dokter.");
			    System.out.println("Keuangan: Ngga banyak perubahan.");
			    System.out.println("Asmara: Malam minggu sudah ada rencana nih? ");
			    System.out.println("Kepribadian: Bersikap obyektif bukan berarti langsung percaya begitu saja lho.. tapi ");
			    System.out.println("sebaiknya ngga punya praduga apa-apa dulu.");
			    System.out.println();
				}
			else if((tanggal >=21 && bulan==4) ||(tanggal <=20 && bulan == 5)  ){
				JOptionPane.showMessageDialog(null, "(RAMALAN ZODIAK TAURUS (21 April - 20 Mei)");
				System.out.println("Nama : " + call.nm1);
		        System.out.println("Tanggal lahir : " + call.tgl1);
		        System.out.println("Bulan Lahir : " + call.bln);
		        System.out.println("Tahun kelahiran: "+ call.thn);
		        System.out.println("Zodiak : TAURUS");
		        System.out.println();
		        System.out.println("Walaupun banyak berita yang kamu dengar dari orang-orang di sekelilingmu tentang orang  ");
		        System.out.println("yang lagi dekat denganmu, tapi jangan langsung percaya begitu saja. Boleh menjadi lebih    ");
		        System.out.println("waspada, tapi jangan sampai langsung punya anggapan berlebihan terhadapnya. Lebih baik ");
		        System.out.println("kamu cari tahu saja dulu.");
		        System.out.println("Kesehatan: Kalau memang ngga enak badan, coba periksa ke dokter.");
		        System.out.println("Keuangan: Ngga banyak perubahan.");
		        System.out.println("Asmara: Malam minggu sudah ada rencana nih? ");
		        System.out.println("Kepribadian: Bersikap obyektif bukan berarti langsung percaya begitu saja lho.. tapi ");
		        System.out.println("sebaiknya ngga punya praduga apa-apa dulu.");
		        System.out.println();
			}
				
			else if((tanggal >=21 && bulan==5) ||(tanggal <=21 && bulan == 6) ){
				JOptionPane.showMessageDialog(null, "RAMALAN ZODIAK GEMINI (21 Mei - 21 Juni)");
				System.out.println("Nama : " + call.nm1);
		        System.out.println("Tanggal lahir : " + call.tgl1);
		        System.out.println("Bulan Lahir : " + call.bln);
		        System.out.println("Tahun kelahiran: "+ call.thn);
		        System.out.println("Zodiak : GEMINI");
		        System.out.println();
		        System.out.println("Tanpa diduga, kamu akan mendapat pertolongan dari seorang teman lama. Wah, hal ini    ");
		        System.out.println("benar-benar di luar rencanamu. Dimana kamu kira pertolongan tersebut akan datang dari     ");
		        System.out.println("orang terdekat, ternyata ngga tuh. Itulah yang dinmkan “rejeki”, kamu ngga pernah tau  ");
		        System.out.println("akan datang darimana dan kapan.");
		        System.out.println("Kesehatan: Badan agak lemas.");
		        System.out.println("Keuangan: Dari sedikit demi sedikit menabung, pasti akan membanyak kok.");
		        System.out.println("Asmara: Saling mencoba untuk pengertian.  ");
		        System.out.println("Kepribadian: Kok kamu cepat marah? Jangan donk.. Cobalah untuk mengerti apa yang orang ");
		        System.out.println("lain juga rasakan.");
		        System.out.println();
			}
			else if((tanggal >=22 && bulan==6) ||(tanggal <=22 && bulan == 7)  ){
				JOptionPane.showMessageDialog(null, "RAMALAN ZODIAK CANCER (22 Juni) - 22 Juli) ");
				System.out.println("Nama : " + call.nm1);
		        System.out.println("Tanggal lahir : " + call.tgl1);
		        System.out.println("Bulan Lahir : " + call.bln);
		        System.out.println("Tahun kelahiran: "+ call.thn);
		        System.out.println("Zodiak : CANCER");
		        System.out.println();
		        System.out.println("Kamu sebaiknya lebih peka dengan sekeliling. Berbagai pertanyaan yang kamu ajukan untuk    ");
		        System.out.println("memuaskan rasa penasaranmu sering kali mengusik kenyamanan orang lain. Semestinya    ");
		        System.out.println("kamu tahu batasan mana yang baik dan kurang baik untuk dilontarkan. Jangan sampai mereka   ");
		        System.out.println("jadi menjauhimu karena sikapmu itu.");
		        System.out.println("Kesehatan: Sebaiknya jangan minum es kebanyakan.");
		        System.out.println("Keuangan: Tetap stabil.");
		        System.out.println("Asmara: Tak kenal maka tak sayang  ");
		        System.out.println("Kepribadian: Selalu merasa paling benar, memang sudah jadi karekteristikmu, tapi bisa kok  ");
		        System.out.println("kamu minimalisir.");
		        System.out.println();
			}
			else if((tanggal >=23 && bulan==7) ||(tanggal <=23 && bulan == 8)){
				JOptionPane.showMessageDialog(null, "RAMALAN ZODIAK LEO (23 Juli - 23 Agustus)");
				System.out.println("Nama : " + call.nm1);
		        System.out.println("Tanggal lahir : " + call.tgl1);
		        System.out.println("Bulan Lahir : " + call.bln);
		        System.out.println("Tahun kelahiran: "+ call.thn);
		        System.out.println("Zodiak : LEO");
		        System.out.println();
		        System.out.println("Menjelang akhir pekan, sebaiknya persiapkan diri dengan matang untuk mengikuti sebuah     ");
		        System.out.println("acara besar yang membutuhkan cukup energi. Jangan beraktivitas terlalu berlebihan hari ini ");
		        System.out.println("agar esok saat bangun pagi kamu bisa benar-benar fresh dan ngga kelupaan membawa hal-hal    ");
		        System.out.println("penting.");
		        System.out.println("Kesehatan: Jangan tidur terlalu malam.");
		        System.out.println("Keuangan: Banyaknya potongan harga membuatmu tergoda, namun bertahanlah");
		        System.out.println("Asmara: Menghabiskan waktu berdua ngga harus selalu menghabiskan kocek kok.  ");
		        System.out.println("Kepribadian: Cobalah berpikir lebih kreatif dalam memecahkan masalah. Jangan pakai cara   ");
		        System.out.println("yang itu-itu saja.");
		        System.out.println();
			}
			
			else if((tanggal >=24 && bulan==8) ||(tanggal <=22 && bulan == 9)){
				JOptionPane.showMessageDialog(null, "RAMALAN ZODIAK VIRGO (24 Agustus - 22 September)");
				System.out.println("Nama : " + call.nm1);
		        System.out.println("Tanggal lahir : " + call.tgl1);
		        System.out.println("Bulan Lahir : " + call.bln);
		        System.out.println("Tahun kelahiran: "+ call.thn);
		        System.out.println("Zodiak : VIRGO");
		        System.out.println();
		        System.out.println("Kok kamu serius sekali sih dalam menanggapi berbagai hal? Coba deh kembangkan rasa   ");
		        System.out.println("humor dalam dirimu, agar saat melihat permasalahan yang menurutmu ngga beres, bisa  ");
		        System.out.println("tanggapi dengan tersenyum. Buat apa dibawa stress kalau ternyata masih bisa kamu pecahkan     ");
		        System.out.println("pada akhirnya?");
		        System.out.println("Kesehatan: Stamina tubuh dapat dipertahankan dengan berolahraga.");
		        System.out.println("Keuangan: Kamu bisa mengaturnya dengan baik.");
		        System.out.println("Asmara: Komunikasi harus tetap dipertahankan.");
		        System.out.println("Kepribadian: Cobalah lebih rileks mengahadapi berbagai situasi. Jangan cepat panik dan    ");
		        System.out.println("tetaplah berpikir positif.");
		        System.out.println();
			}
			else if((tanggal >=23 && bulan==9) ||(tanggal <=23 && bulan == 10)){
				JOptionPane.showMessageDialog(null, "RAMALAN ZODIAK LIBRA (23 September - 23 Oktober)");
				System.out.println("Nama : " + call.nm1);
		        System.out.println("Tanggal lahir : " + call.tgl1);
		        System.out.println("Bulan Lahir : " + call.bln);
		        System.out.println("Tahun kelahiran: "+ call.thn);
		        System.out.println("Zodiak : VIRGO");
		        System.out.println();
		        System.out.println("Hidup itu memang naik dan turun. Kadang di atas dan kadang di bawah. Jikalau kamu    ");
		        System.out.println("menemukan hal yang ngga mengenakkan, jangan berkecil hati, pasti akan segera berlalu dan   ");
		        System.out.println("kamu akan berada di atas lagi. Jangan sampai aktivitasmu yang lain menjadi terganggu gara-     ");
		        System.out.println("gara masalah pribadi yang sedang kamu hadapi.");
		        System.out.println("Kesehatan: Minum vitamin yang teratur.");
		        System.out.println("Keuangan: Banyak pengeluaran, jadi harus lebih selektif.");
		        System.out.println("Asmara: Dia mau berada di sisimu saat kamu sedang sedih.");
		        System.out.println("Kepribadian: Kamu bisa bersabar menghadapi berbagai tantangan yang datang. Apalagi     ");
		        System.out.println("kamu pun didukung sama orang terdekatmu.");
		        System.out.println();
			}
			
			else if((tanggal >=24 && bulan==10) ||(tanggal <=22 && bulan == 11)) {
				JOptionPane.showMessageDialog(null, "RAMALAN ZODIAK SCORPIO (24 Oktober - 22 November)");
				System.out.println("Nama : " + call.nm1);
		        System.out.println("Tanggal lahir : " + call.tgl1);
		        System.out.println("Bulan Lahir : " + call.bln);
		        System.out.println("Tahun kelahiran: "+ call.thn);
		        System.out.println("Zodiak : SCORPIO");
		        System.out.println();
		        System.out.println("Pekerjaanmu yang menumpuk hampir membuatmu terbenam dengannya. Jangan lupa bahwa ");
		        System.out.println("akhir pekan telah tiba dan ini saatnya refreshing sejenak. ingatlah janji yang sudah kamu buat ");
		        System.out.println("dengan seorang teman, dan jangan sampai kamu membatalkannya.");
		        System.out.println("Kesehatan: Coba perhatikan kesehatan lebih seksama.");
		        System.out.println("Keuangan: Ngga kekurangan.");
		        System.out.println("Asmara: Sesekali buatlah kejutan manis untuknya.");
		        System.out.println("Kepribadian: Kamu sering kali bersikap kaku, apalagi saat berada dalam situasi baru, ");
		        System.out.println("sehingga kurang luwes dalam bergaul.     ");
		        System.out.println("kamu pun didukung sama orang terdekatmu.");
		        System.out.println();
			}
		
			else if ((tanggal >=23 && bulan==11) ||(tanggal <=21 && bulan == 12)){
				JOptionPane.showMessageDialog(null, "RAMALAN ZODIAK SEGITARIUS (23 November - 21 Desember)");
				System.out.println("Nama : " + call.nm1);
		        System.out.println("Tanggal lahir : " + call.tgl1);
		        System.out.println("Bulan Lahir : " + call.bln);
		        System.out.println("Tahun kelahiran: "+ call.thn);
				System.out.println("Zodiak : SEGITARIUS");
				System.out.println();
				System.out.println("Kalau selama ini kamu merasa cukup mahir dalam mengerjakan suatu bidang yang sudah  ");
		        System.out.println("menjadi bagian dari dirimu, ternyata belum tentu lho.. cobalah memperluas wawasan agar  ");
		        System.out.println("kemahiranmu ngga sampai di situ aja. Dengan merasa terus kekurangan, justru di situlah ");
		        System.out.println("kesempatan untuk berkembang.");
		        System.out.println("Kesehatan: Rawatlah kebersihan tubuh dengan teliti.");
		        System.out.println("Keuangan: Coba periksa lagi berapa yang tersisa.");
		        System.out.println("Asmara: Memiliki ketertarikan yang sama memang suatu keuntungan. ");
		        System.out.println("Kepribadian: Keaktifanmu sebaiknya disalurkan pada kegiatan positif dan untuk mengukir prestasi");
		        System.out.println();
			}
		    else{
		        JOptionPane.showMessageDialog(null,"Masukan tgl yang benar");
		        zodiak panggil = new zodiak();;
		        panggil.ramal2();
				System.exit(0);
		   }
	}


	}



