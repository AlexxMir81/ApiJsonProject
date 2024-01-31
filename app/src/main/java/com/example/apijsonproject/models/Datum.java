package com.example.apijsonproject.models;

import java.io.Serializable;

public class Datum implements Serializable {

        public long id;
        public boolean readable;
        public String title;
        public String title_short ;
        public String title_version ;
        public String link ;
        public int duration ;
        public int rank ;
        public boolean explicit_lyrics ;
        public int explicit_content_lyrics ;
        public int explicit_content_cover ;
        public String preview ;
        public String md5_image ;
        public Artist artist ;
        public Album album ;
        public String type ;

}
