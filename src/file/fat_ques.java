package file;

public class fat_ques {
    public static void main(String args[]) {
        String[] array = {"Dr.Ani", "Prof.Sam", "Mr.Joe","Dr.aniruddha","Ms.R"};
        int doctorcount = 0;
        int profcount = 0;
        int femalecount = 0;
        int malecount = 0;
        for (int i = 0; i < array.length; i++) {
            String s = array[i];
            int index = s.indexOf(".");
            String substring = null;
            if (index != -1) {
                substring = s.substring(0, index);
            } else {
                continue;
            }
            if (substring == "Dr") {
                doctorcount++;
            } else if (substring == "Prof") {
                profcount++;
            } else if (substring == "Ms") {
                femalecount++;
            } else {
                malecount++;
            }
        }
        System.out.println("doctors: " + doctorcount + "professors: " + profcount + "female student: " + femalecount + "male student: " + malecount);
    }
}
