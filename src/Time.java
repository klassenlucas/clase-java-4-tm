public class Time {
    long initTime;
    long endTime;

    public Time() {
        this.endTime = 0;
        this.initTime = 0;
    }

    public void start() {
        this.initTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long timeElapsed() {
        return endTime - initTime;
    }
}
