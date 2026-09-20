package module3.Q11;

public class FileDownloader implements Runnable {
    private boolean running = true;

  
    public void stopDownload() {
        this.running = false;
    }

    @Override
    public void run() {
        int chunk = 1;

    
        while (running && chunk <= 10) {
            System.out.println("Downloading chunk " + chunk);
            chunk++;

            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Download thread interrupted.");
                break;
            }
        }

        if (!running) {
            System.out.println("Download stopped gracefully by user!");
        } else {
            System.out.println("Download completed successfully!");
        }
    }
} 
