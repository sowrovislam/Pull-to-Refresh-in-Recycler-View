package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    SwipeRefreshLayout swipeRefreshLayout;

    RecyclerView recyclerView;

    ArrayList<HashMap<String,String>>arrayList=new ArrayList<>();

    HashMap<String,String>hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycilerView);

        swipeRefreshLayout=findViewById(R.id.swipe);






        hashMap=new HashMap<>();
        hashMap.put("itemtype","BOOK");
        hashMap.put("bookname","গল্পের শেষ পাতা");
        hashMap.put("bookwriter","সৌরভ ইসলাম");
        hashMap.put("book_image","https://kinsta.com/wp-content/uploads/2019/08/jpg-vs-jpeg.jpg");
        arrayList.add(hashMap);



        hashMap=new HashMap<>();
        hashMap.put("itemtype","VIDEO");
        hashMap.put("videoname","tumi mor jibon");
        hashMap.put("videoriter","সৌরভ ইসলাম");
        hashMap.put("video_image"," https://www.saga.co.uk/contentlibrary/saga/publishing/verticals/technology/internet/communications/youtube-1.png");
        arrayList.add(hashMap);

 hashMap=new HashMap<>();
        hashMap.put("itemtype","BOOK");
        hashMap.put("bookname","গল্পের শেষ পাতা");
        hashMap.put("bookwriter","সৌরভ ইসলাম");
        hashMap.put("book_image","https://kinsta.com/wp-content/uploads/2019/08/jpg-vs-jpeg.jpg");
        arrayList.add(hashMap);



        hashMap=new HashMap<>();
        hashMap.put("itemtype","VIDEO");
        hashMap.put("videoname","tumi mor jibon");
        hashMap.put("videoriter","সৌরভ ইসলাম");
        hashMap.put("video_image"," https://www.saga.co.uk/contentlibrary/saga/publishing/verticals/technology/internet/communications/youtube-1.png");
        arrayList.add(hashMap);

 hashMap=new HashMap<>();
        hashMap.put("itemtype","BOOK");
        hashMap.put("bookname","গল্পের শেষ পাতা");
        hashMap.put("bookwriter","সৌরভ ইসলাম");
        hashMap.put("book_image","https://kinsta.com/wp-content/uploads/2019/08/jpg-vs-jpeg.jpg");
        arrayList.add(hashMap);



        hashMap=new HashMap<>();
        hashMap.put("itemtype","VIDEO");
        hashMap.put("videoname","tumi mor jibon");
        hashMap.put("videoriter","সৌরভ ইসলাম");
        hashMap.put("video_image"," https://www.saga.co.uk/contentlibrary/saga/publishing/verticals/technology/internet/communications/youtube-1.png");
        arrayList.add(hashMap);

 hashMap=new HashMap<>();
        hashMap.put("itemtype","BOOK");
        hashMap.put("bookname","গল্পের শেষ পাতা");
        hashMap.put("bookwriter","সৌরভ ইসলাম");
        hashMap.put("book_image","https://kinsta.com/wp-content/uploads/2019/08/jpg-vs-jpeg.jpg");
        arrayList.add(hashMap);




        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                hashMap=new HashMap<>();
                hashMap.put("itemtype","VIDEO");
                hashMap.put("videoname","tumi mor jibon");
                hashMap.put("videoriter","সৌরভ ইসলাম");
                hashMap.put("video_image"," https://www.saga.co.uk/contentlibrary/saga/publishing/verticals/technology/internet/communications/youtube-1.png");
                arrayList.add(hashMap);




                swipeRefreshLayout.setRefreshing(false);

            }
        });

        Myadapter myadapter=new Myadapter();
        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));





    }


    private class Myadapter extends RecyclerView.Adapter{

        int BOOK_ITEM=0;
        int VIDEO_ITEM=1;


        public class BookViewHOldere extends RecyclerView.ViewHolder{

            ImageView book_image;
            TextView booknames ,bookwrter;


            public BookViewHOldere(@NonNull View itemView) {
                super(itemView);

                book_image=itemView.findViewById(R.id.book_image);

                booknames=itemView.findViewById(R.id.booknames);
                bookwrter=itemView.findViewById(R.id.bookwrter);



            }
        }



        public class VideoViewHolder extends RecyclerView.ViewHolder{

            ImageView videoimage;
            TextView videoname ,videowiter;


            public VideoViewHolder(@NonNull View itemView) {
                super(itemView);


                videoimage=itemView.findViewById(R.id.videoimage);

                videoname=itemView.findViewById(R.id.videoname);
                videowiter=itemView.findViewById(R.id.videowiter);

            }
        }




        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater layoutInflater=getLayoutInflater();

            if (viewType==BOOK_ITEM){


             View Myview=   layoutInflater.inflate(R.layout.book,parent,false);

                return new BookViewHOldere(Myview);



            }else {


               View Myvide1= layoutInflater.inflate(R.layout.video,parent,false);

               return new VideoViewHolder(Myvide1);




            }






        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {


            if (getItemViewType(position)==BOOK_ITEM){


         BookViewHOldere bookViewHOldere= (BookViewHOldere) holder;

               hashMap=arrayList.get(position);

               String bookname=hashMap.get("bookname");

               String bookwriter=hashMap.get("bookwriter");

               bookViewHOldere.booknames.setText(bookname);

               bookViewHOldere.bookwrter.setText(bookwriter);




            } else if (getItemViewType(position)==VIDEO_ITEM) {


                VideoViewHolder videoViewHolder= (VideoViewHolder) holder;

                hashMap=arrayList.get(position);

                String videoname=hashMap.get("videoname");

                String videoriter=hashMap.get("videoriter");

                videoViewHolder.videoname.setText(videoname);
                videoViewHolder.videowiter.setText(videoriter);





            }


        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        @Override
        public int getItemViewType(int position) {

         hashMap=arrayList.get(position);

         String itemtype=hashMap.get("itemtype");

         if (itemtype.contains("BOOK")){

             return BOOK_ITEM;


         }else {

          return VIDEO_ITEM;

         }






        }
    }
}