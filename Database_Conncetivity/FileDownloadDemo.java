package d1;

// FileDownloadDemo.java
class FileDownloader extends Thread {
    private String fileName;

    FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        System.out.println("Starting download: " + fileName);
        for (int i = 1; i <= 5; i++) {
            System.out.println(fileName + " downloading... " + (i * 20) + "% completed");
            try {
                Thread.sleep(1000); // Simulate time delay for downloading
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(fileName + " download completed!");
    }
}

class ProgressBar extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("⏳ Checking download progress...");
            try {
                Thread.sleep(1000); // Simulate checking interval
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("✅ All downloads done!");
    }
}

public class FileDownloadDemo {
    public static void main(String[] args) {
        FileDownloader file1 = new FileDownloader("Movie.mp4");
        FileDownloader file2 = new FileDownloader("Song.mp3");
        ProgressBar progress = new ProgressBar();

        // Start threads
        file1.start();
        file2.start();
        progress.start();
    }
}
