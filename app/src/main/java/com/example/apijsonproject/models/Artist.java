package com.example.apijsonproject.models;

import java.io.Serializable;

public class Artist implements Serializable {
        public int id ;
        public String name ;
        public String link ;
        public String picture ;
        public String picture_small ;
        public String picture_medium ;
        public String picture_big ;
        public String picture_xl ;
        public String tracklist ;
        public String type ;

        public int getId() {
                return id;
        }

        public String getName() {
                return name;
        }

        public String getLink() {
                return link;
        }

        public String getPicture() {
                return picture;
        }

        public String getPicture_small() {
                return picture_small;
        }

        public String getPicture_medium() {
                return picture_medium;
        }

        public String getPicture_big() {
                return picture_big;
        }

        public String getPicture_xl() {
                return picture_xl;
        }

        public String getTracklist() {
                return tracklist;
        }

        public String getType() {
                return type;
        }

        public void setId(int id) {
                this.id = id;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setLink(String link) {
                this.link = link;
        }

        public void setPicture(String picture) {
                this.picture = picture;
        }

        public void setPicture_small(String picture_small) {
                this.picture_small = picture_small;
        }

        public void setPicture_medium(String picture_medium) {
                this.picture_medium = picture_medium;
        }

        public void setPicture_big(String picture_big) {
                this.picture_big = picture_big;
        }

        public void setPicture_xl(String picture_xl) {
                this.picture_xl = picture_xl;
        }

        public void setTracklist(String tracklist) {
                this.tracklist = tracklist;
        }

        public void setType(String type) {
                this.type = type;
        }
}
