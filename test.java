import java.io.*;

class test {
    test() throws IOException {
        File newFile = new File("C:\\Users\\sansk\\Desktop\\test.txt");
        File des1 = new File("C:\\Users\\sansk\\Desktop\\des1.txt");
        File des2 = new File("C:\\Users\\sansk\\Desktop\\des2.txt");
        BufferedWriter bw1 = new BufferedWriter(new FileWriter(des1));
        BufferedWriter bw2 = new BufferedWriter(new FileWriter(des2));
        BufferedReader br1 = new BufferedReader(new FileReader(newFile));
        String line;
        while ((line = br1.readLine()) != null ) {
            String[] w = line.split(" ");
            for(int i = 0; i < w.length / 2; i++) {
                bw1.write(w[0] + "\n");
                bw2.write(w[1] + "\n");
            }
        }
        br1.close();
        bw1.close();
        bw2.close();
    }
    public static void main(String[] args) throws IOException {
        new test();
    }
}