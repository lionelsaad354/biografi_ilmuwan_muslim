package com.republikgaming.mengenalilmuwanmuslim;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Adapter extends RecyclerView.Adapter<Adapter.RecyclerViewHolder> {

    private final Context context;
    LayoutInflater layoutInflater;
    String[] nama = {"Ibnu Sina", //1
            "Muḥammad bin Mūsā al-Khawārizmī", //2
            "Umar Khayyām", //3
            "Abu Ali Muhammad al-Hasan bin al-Haitsam", //4
            "Abu Raihan Al-Biruni", //5
            "Abu Musa Jabir bin Hayyan", //6
            "Ibnu Khaldun", //7
            "Abbas bin Firnas",//8
            "Abū al-'Iz Ibn Ismā'īl ibn al-Razāz al-Jazarī",//9
            "Abu Qasim Al Zahrawi"//10

    };
    String[] deskripsiArray = {"Seorang filsuf, ilmuwan, dan dokter kelahiran Persia",
            "Seorang ahli dalam bidang matematika, astronomi, astrologi, dan geografi yang berasal dari Persia",
            "Seorang matematikawan dan astronom yang berhasil mengoreksi kalender Persia",
            "Seorang ilmuwan Islam yang ahli dalam bidang sains, falak, matematika, geometri, pengobatan, dan filsafat",
            "Seorang matematikawan Persia, astronom, fisikawan, sarjana, penulis ensiklopedia, filsuf, pengembara, sejarawan, ahli geografi, ahli farmasi dan guru",
            "Seorang polymath terkemuka; kimiawan, alkimiawan, ahli astronomi dan astrologi, insinyur, ahli bumi, ahli filsafat, ahli fisika, apoteker dan dokter",
            "Seorang sejarawan muslim dari Tunisia dan sering disebut sebagai bapak pendiri ilmu historiografi, sosiologi dan ekonomi.",
            "Seorang polimatik Andalusia: seorang penemu, fisikawan, kimiawan, teknisi, musisi Andalusia dan penyair berbahasa Arab.",
            "Seorang Ilmuwan dari Al-Jazira, Mesopotamia, yang hidup pada abad pertengahan.",
            "Seorang dokter, ahli bedah, maupun ilmuan yang menemukan Gips Era Islam."
    };
    String[] deskripsi2Array = {"Dia adalah pengarang dari 450 buku pada beberapa pokok bahasan besar. Banyak di antaranya memusatkan pada filosofi dan kedokteran. \" George Sarton menyebut Ibnu Sina \"ilmuwan paling terkenal dari Islam dan salah satu yang paling terkenal pada semua bidang, tempat dan waktu\". Karyanya yang paling terkenal adalah Kitab Penyembuhan dan Qanun Kedokteran (Al-Qanun fi At Tibb).",
            "Buku pertamanya, al-Jabar, adalah buku pertama yang membahas solusi sistematik dari linear dan notasi kuadrat. Sehingga ia disebut sebagai Bapak Aljabar. Al-Khwārizmī juga berperan penting dalam memperkenalkan angka Arab melalui karya Kitāb al-Jam’a wa-l-tafrīq bi-ḥisāb al-Hind yang kelak diadopsi sebagai angka standar yang dipakai di berbagai bahasa serta kemudian diperkenalkan sebagai Sistem Penomoran Posisi Desimal di dunia Barat pada abad ke 12.",
            "Pada 1073, Malik-Syah, penguasa Isfahan, mengundang Khayyām untuk membangun dan bekerja pada sebuah observatorium, bersama-sama dengan sejumlah ilmuwan terkemuka lainnya. Akhirnya, Khayyām dengan sangat akurat (mengoreksi hingga enam digit di belakang koma) mengukur lamanya satu tahun sebagai 365,24219858156 hari.",
            "Walaupun Haitsam lebih dikenal dalam bidang sains dan pengobatan, tetapi dia juga ahli dalam bidang agama, falsafah, dan astronomi. Salah seorang dari tokoh tersebut ialah Ibnu Haitsam atau Abu Ali Muhammad al-Hasan bin al-Haitsam.",
            "Abu Raihan Al-Biruni merupakan teman filsuf dan ahli obat-obatan Abu Ali Al-Hussain Ibn Abdallah Ibn Sina/Ibnu Sina, sejarawan, filsuf, dan pakar etik Ibnu Miskawaih, di universitas dan pusat sains yang didirikan oleh putera Abu Al Abbas Ma'mun Khawarazmshah. Abu Raihan Al-Biruni juga mengembara ke India dengan Mahmud dari Ghazni dan menemani dia dalam ketenteraannya di sana, mempelajari bahasa, falsafah dan agama mereka dan menulis buku mengenainya. Dia juga menguasai beberapa bahasa diantaranya bahasa Yunani, bahasa Suriah, dan bahasa Berber, bahasa Sanskerta.",
            "Kontribusi terbesar Jabir adalah dalam bidang kimia. Keahliannya ini didapatnya dengan ia berguru pada Barmaki Vizier, pada masa pemerintahan Harun Ar-Rasyid di Baghdad. Ia mengembangkan teknik eksperimentasi sistematis di dalam maupun di luar penelitian kimia, sehingga setiap eksperimen dapat direproduksi kembali. Jabir menekankan bahwa kuantitas zat berhubungan dengan reaksi kimia yang terjadi, sehingga dapat dianggap Jabir telah merintis ditemukannya hukum perbandingan tetap. Kontribusi lainnya antara lain dalam penyempurnaan proses kristalisasi, distilasi, kalsinasi, sublimasi dan penguapan serta pengembangan instrumen untuk melakukan proses-proses tersebut.",
            "Lelaki yang lahir di Tunisia pada 1 Ramadan 732 H./27 Mei 1332 M. adalah dikenal sebagai sejarawan dan bapak sosiologi Islam yang hafal Alquran sejak usia dini. Sebagai ahli politik Islam, ia pun dikenal sebagai bapak Ekonomi Islam, karena pemikiran-pemikirannya tentang teori ekonomi yang logis dan realistis jauh telah dikemukakannya sebelum Adam Smith (1723-1790) dan David Ricardo (1772-1823) mengemukakan teori-teori ekonominya. Bahkan ketika memasuki usia remaja, tulisan-tulisannya sudah menyebar ke mana-mana. Tulisan-tulisan dan pemikiran Ibnu Khaldun terlahir karena studinya yang sangat dalam, pengamatan terhadap berbagai masyarakat yang dikenalnya dengan ilmu dan pengetahuan yang luas, serta ia hidup di tengah-tengah mereka dalam pengembaraannya yang luas pula.",
            "Abbas Abu al-Qasim bin Firnas ibn Wirdas al-Takurini Sering dikatakan keturunan Berber, ia lahir di Izn-Rand Onda, Al-Andalus (sekarang Ronda, Spanyol), tinggal di Kekhalifahan Córdoba, dan dikenal karena perupaya melakukan penerbangan. Kawah Ibn Firnas di Bulan dinamai untuk menghormatinya, serta Bandar Udara Ibn Firnas di Baghdad. Salah satu jembatan di sepanjang sungai Guadalquivir di Córdoba juga dinamai untuk menghormatinya.",
            "Al-Jazari adalah bagian dari tradisi pengrajin sehingga lebih cenderung sebagai praktisi insinyur daripada penemu yang tampaknya lebih tertarik kepada proses pengerjaan yang diperlukan untuk membangun suatu alat daripada teknologi yang berada dibelakangnya dan mesin-mesin ciptaannya biasanya dirakit berdasarkan trial and error daripada perhitungan teoretis. Bukunya 'Pengetahuan Ilmu Mekanik' tampaknya menjadi sangat populer sebagaimana telah banyak terlihat dalam sejumlah besar salinan manuskrip, dan seperti yang berulang kali dijelaskan olehnya, dia hanya menjelaskan peralatan-peralatan yang dibangunnya sendiri. Menurut Mayr, gaya bahasa dalam buku tersebut seperti buku modern do-it-yourself.",
            "Dia merupakan penemu asli dari teknik pengobatan patah tulang dengan menggunakan gips sebagaimana yang dilakukan pada era modern ini. Sebagai seorang dokter era kekalifahan, dia sangat berjasa dalam mewariskan ilmu kedokteran yang penting bagi era modern ini. Al Zahrawi lahir pada tahun 936 di kota Al Zahra yaitu sebuah kota yang terletak di dekat Kordoba di Andalusia yang sekarang dikenal dengan negara modern Spanyol di Eropa. Kota Al Zahra sendiri dibangun pada tahun 936 Masehi oleh Khalifah Abd Al rahman Al Nasir III yang berkuasa antara tahun 912 hingga 961 Masehi. Ayah Al Zahrawi merupakan seorang penguasa kedelapan dari Bani Umayyah di Andalusia yang bernama Abbas."
    };
    String[] tahunArray = {"980 - 1037 M",
            "780 - 850 M",
            "1048 - 1131 M",
            "965 - 1039 M",
            "973 - 1048 M",
            "780 - 803 M",
            "1332 - 1406 M",
            "810 – 887 M",
            "1136 – 1206 M",
            "936 - 1013 M"
    };
    String[] lahirArray = {"Tahun 980 M",
            "Tahun 780 M",
            "18 Mei 1048 M",
            "Tahun 965",
            "4 September 973",
            "Tahun 780 M",
            "27 Mei 1332",
            "Tahun 810 M",
            "Tahun 1136 M",
            "Tahun 936 M"
    };
    String[] wafatArray = {"Juni 1037 M (berusia 56–57)",
            "Tahun 850 M",
            "4 Desember 1131 M",
            "Tahun 1039, umur 74 tahun",
            "13 Desember 1048, umur 75 tahun",
            "Tahun 803 M",
            "19 Maret 1406",
            "Tahun 887 M",
            "Tahun 1206 M",
            "Tahun 1013 M"
    };
    String[] lokasiArray = {"Persia",
            "Persia",
            "Nishapur, Iran",
            "Bashrah",
            "Persia",
            "Kuffah, Irak",
            "Tunisia",
            "Andalusia",
            "Al-Jazira, Mesopotamia",
            "Al Zahra, Andalusia"
    };
    String[] karyaArray = {"Qanun fi Thib (Canon of Medicine) (Terjemahan : Aturan Pengobatan), Asy Syifa (terdiri dari 18 jilid berisi tentang berbagai macam ilmu pengetahuan), An Najat, Mantiq Al Masyriqin (Logika Timur)",
            "Kitab I: Aljabar, Buku 2: Dixit algorizmi, Buku 3: Rekonstruksi Planetarium, Buku 4: Astronomi, Buku 5: Kalender Yahudi",
            "Korektor Kalender Persia, Menghitung akurat lamanya satu tahun sebagai 365,24219858156 hari, Peta Bintang(sudah hilang)",
            "Buku Light dan On Twilight Phenomena, At-Tanbih Ala Ma Fi Ar-Rashdi Min Al-Ghalath, Irtifa' Al-Kawakib, Maqalah Fi Ab'ad Al-Ajram As-Samawiyyah wa Iqdar I'zhamiha wa Ghairiha, Kitab Fi Hai'ati Al-Alam",
            "Penelitian garis lintang bagi Kath, Khwarazm, Buku Kronologi, proyeksi peta Kartografi proyeksi belahan bumi pada bidang datar, Penelitian mengenai jari-jari Bumi senilai 6.339,6 kilometer",
            "Kitab Al-Kimya, Kitab Al-Sab'een, Kitab Al Rahmah, Al Tajmi, Al Zilaq al Sharqi, Book of The Kingdom, Book of Eastern Mercury, Book of Balance",
            "Kitab at-Ta’riif bi Ibn Khaldun, Muqaddimah, Lubab al-Muhassal fi Ushul ad-Diin.",
            "Al-Miqatah, Maket kubah langit, Kapal terbang dengan dua sayap",
            "Kitáb fí ma'rifat al-hiyal al-handasiyya, Lukisan Miniatur Peralatan Mekanik",
            "Gips untuk tulang yang patah, Kitab Al-Tasrif"
    };
    int[] cardColor = {R.drawable.card1, R.drawable.card2, R.drawable.card3,  R.drawable.card5, R.drawable.card6, R.drawable.card7, R.drawable.card8, R.drawable.card4, R.drawable.card9, R.drawable.card2 };
    int[] gambarArray = {R.drawable.ibn_sina,
            R.drawable.khwarizmi,
            R.drawable.omar_khayyam,
            R.drawable.al_haytham,
            R.drawable.biruni,
            R.drawable.geber,
            R.drawable.khaldun,
            R.drawable.abbas,
            R.drawable.al_jazari,
            R.drawable.al_zahrawi
    };

    public Adapter(Context context) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int position) {
        View view = layoutInflater.inflate(R.layout.item_view, parent, false);

        RecyclerViewHolder viewHolder = new RecyclerViewHolder(view);
        return viewHolder;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView nama, deskripsi, deskripsi2, tahun, lokasi, karya, lahir, wafat;
        CircleImageView gambar;
        RelativeLayout relativeLayout;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.nama);
            deskripsi = itemView.findViewById(R.id.deskripsi);
            deskripsi2 = itemView.findViewById(R.id.deskripsi2);
            tahun = itemView.findViewById(R.id.tahun);
            lokasi = itemView.findViewById(R.id.lokasi_lahir);
            karya = itemView.findViewById(R.id.karya);
            gambar = itemView.findViewById(R.id.gambar);
            relativeLayout = itemView.findViewById(R.id.relative_layout);
            lahir = itemView.findViewById(R.id.txt_lahir);
            wafat = itemView.findViewById(R.id.txt_wafat);

            relativeLayout.setClickable(true);
            relativeLayout.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            final Intent intent;
            final Bundle bundle = new Bundle();
            switch (getAdapterPosition()) {
                default:
                    intent = new Intent(context, DetailActivity.class);
                    try {
                        bundle.putString("nama", nama.getText().toString());
                        bundle.putString("deskripsi", deskripsi.getText().toString());
                        bundle.putString("deskripsi2", deskripsi2.getText().toString());
                        bundle.putString("tahun", tahun.getText().toString());
                        bundle.putString("lokasi", lokasi.getText().toString());
                        bundle.putString("karya", karya.getText().toString());
                        bundle.putString("lahir", lahir.getText().toString());
                        bundle.putString("wafat", wafat.getText().toString());
                        gambar.buildDrawingCache();
                        Bitmap bitmap = gambar.getDrawingCache();
                        intent.putExtra("gambar", bitmap);
                        intent.putExtras(bundle);
                        break;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            }
            context.startActivity(intent);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.nama.setText(nama[position]);
        holder.deskripsi.setText(deskripsiArray[position]);
        holder.deskripsi2.setText(deskripsi2Array[position]);
        holder.tahun.setText(tahunArray[position]);
        holder.lokasi.setText(lokasiArray[position]);
        holder.karya.setText(karyaArray[position]);
        holder.lahir.setText(lahirArray[position]);
        holder.wafat.setText(wafatArray[position]);
        holder.gambar.setImageResource(gambarArray[position]);
        holder.relativeLayout.setBackgroundResource(cardColor[position]);
    }

    @Override
    public int getItemCount() {
        return nama.length;
    }
}
