package module3.Q11;

public class TestStopThread {
    public static void main(String[] args) throws InterruptedException {
        FileDownloader downloader = new FileDownloader();
        Thread thread = new Thread(downloader);

        thread.start();
        Thread.sleep(2000);

        System.out.println("Stopping the download...");
        downloader.stopDownload();
    }
}
