package com.company.exhibition;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringJoiner;

public class Exhibition {
    private String exhibitionName;

    private Information Information;

    public Exhibition(String exhibitionName) {
        this.exhibitionName = exhibitionName;
    }
    //вложенный класс и анонимный класс

    public void status(){
        System.out.print("The exhibition is closed!");
    }

    public static class Building{
        private int buildingId;

        private String buildingName;

        public int getBuildingId() {
            return buildingId;
        }

        public void setBuildingId(int buildingId) {
            this.buildingId = buildingId;
        }

        public String getBuildingName() {
            return buildingName;
        }

        public void setBuildingName(String buildingName) {
            this.buildingName = buildingName;
        }

        public Building(int buildingId, String buildingName) {
            this.buildingId = buildingId;
            this.buildingName = buildingName;
        }
    }

    public class Information{

        private String paintName;

        private String authorName;

        private int paintId;

        private Calendar date;

        public String getPaintName() {
            return paintName;
        }


        public void setPaintName(String paintName) {
            this.paintName = paintName;
        }

        public String getAuthorName() {
            return authorName;
        }

        public void setAuthorName(String authorName) {
            this.authorName = authorName;
        }

        public int getPaintId() {
            return paintId;
        }

        public void setPaintId(int paintId) {
            this.paintId = paintId;
        }

        public Calendar getDate() {
            return date;
        }

        public void setDate(Calendar date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return new StringJoiner("")
                    .add("\n\tName of the painting: '" + paintName + "'")
                    .add("\n\tAuthor name: '" + authorName + "'")
                    .add("\n\tId of the painting: " + paintId)
                    .add("\n\tConduction date: " + date.getTime())
                    .toString();
        }
    }
    public void setInformation(String paintName, String authorName, int paintId, Calendar date){
        Information = new Information();
        Information.setPaintName(paintName);
        Information.setAuthorName(authorName);
        Information.setPaintId(paintId);
        Information.setDate(date);
    }

    @Override
    public String toString() {
        return new StringJoiner("")
                .add("Name of the Exhibition: '" + exhibitionName + "'")
                .add("\nInformation about the Exhibition: " + Information.toString())
                .toString();
    }
}
