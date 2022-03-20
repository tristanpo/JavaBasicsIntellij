package Class21;

import java.sql.SQLOutput;

public class userClass {
    String name;
    String mobileNumber;

    public userClass(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

        public static class userInfo {
            String address;

            public userInfo(String name, String mobileNumber, String address) {
                this.address = address;
                System.out.println(name + " " + mobileNumber + " " + address);
            }
        }


    public static void main(String[] args) {
        userInfo user=new userInfo("Tristan","720-357-6214","123 main street");
        System.out.println();
    }
}
